package interpretation;

import java.util.List;
import java.util.ArrayList;

public class AttributeSetup {
	
	private List<List<String>> listOfLists;
	
	/**
	 * Creates permutations for attributes. Attribute can be short ones i.e. a sequence for an parameter
	 * or a long one, i.e. specifying an further clssifier. In this case a classifierSetup is instanciated
	 * which in turn handles the attributes for the nested classifier.
	 * @param attribute		Element representing the attribute of an classifier
	 * @throws Exception	Error for semantical errors
	 */
	public AttributeSetup(Element attribute) throws Exception  {
		listOfLists = new ArrayList<List<String>>();
		KeyValue name = null;
		List<String> list;
		List<List<String>> localListOfLists = new ArrayList<List<String>>();
		
		if((name = attribute.getAttributeList().getKeyValue("name")) == null)
			throw new Exception("Classifier tag MUST contain name attribute");
		
		if(attribute.getEnd() instanceof Longend) {
			ClassifierSetup setup;
			String sw = null;
			
			// There are two options in weka to set an sub-classifier. One is the -W options, the others
			// are -B and -M options which look the same (used for stacking classifier)
			switch(name.getValue().toString()) {
			case "W":
				setup = new ClassifierSetup(attribute.getEnd().getElements().get(0));
				localListOfLists = setup.getList();
				for(List<String> l : localListOfLists) {
					list = new ArrayList<>();
					list.add("-W");
					list.add(setup.getClassifierName()); // Add first element i.e. sub-classifier name. Then overwrite
					l.add("--");		// name with -- indicating all subsequent options should be 
					list.addAll(l);		// passed to the sub classifier
					listOfLists.add(list);
				}
				break;
			case "M": 
				sw = "-M";
			case "B":
				if(sw == null) sw = "-B";
				setup = new ClassifierSetup(attribute.getEnd().getElements().get(0));
				for(String s : setup.toStringList()) {
					list = new ArrayList<String>();
					list.add(sw);
					list.add("\"" + setup.getClassifierName() + s + "\"");
					listOfLists.add(list);
				}
				break;
			}
		}
		else if(attribute.getEnd() instanceof ShortEnd) {
			list = new ArrayList<String>();
			//list.add(name.getValue().toString());
			listOfLists.add(list);
			
			// Go through all Lists in the listOfLists and updated them with additional attribute
			for(List<String> oldList : listOfLists) {
				// Go through all key value paris and retrieve all combinations of one
				// attribute with getKeyValueSpace. Build Permutation of permutations
				for(KeyValue kv1 : attribute.getAttributeList().getPairs()) {
					List<String> tmp = null;
					for(KeyValue kv2 : kv1.getKeyValueSpace()) {
						localListOfLists.remove(oldList);
						tmp = new ArrayList<String>();
						tmp.addAll(oldList);
						// If it is the name of the attribute it has to be the switch. Therefore
						// insert a dash before the switch
						if(kv2.getKey().toString().equalsIgnoreCase("name"))
							tmp.add("-" + kv2.getValue().toString());
						else
							tmp.add(kv2.getValue().toString());
						localListOfLists.add(tmp);
					}
					oldList = tmp;
				}
			}
			listOfLists = localListOfLists;
		} else {
			throw new Exception ("Unknown EndType encountered in AttributeSetup on interpreting element"
					+ attribute.getName().toString());
		}
	}
	
	public List<List<String>> getListOfLists() {
		return listOfLists;
	}
}