package wekaConfigFileInterpretation;

import java.util.ArrayList;
import java.util.List;

public class ExperimentSetup {
	List<Resource> resources;
	List<ClassifierSetup> setups;
	
	public ExperimentSetup(Element toplevel) throws Exception {
		resources = new ArrayList<Resource>();
		setups = new ArrayList<ClassifierSetup>();
		
		if(!(toplevel.getEnd() instanceof Longend)) {
			throw new Exception("Experiment does not contain any child nodes!\n"
					+ "<resources> and <classifier> are expected");
		}
		else {
			for(Element el : toplevel.getEnd().getElements()) {
				switch(el.getName().toString()) {
				case "classifier"	: 
					ClassifierSetup csetup = new ClassifierSetup(el);
					setups.add(csetup);
					break;
				case "resources"		:
					Resource res = new Resource(el);
					resources.add(res);
					break;
				default:
					throw new Exception("Unknown element encountered. Element was: " + el.getName().toString());
				}
			}
		}
	}
	
	public String resourcesToString() {
		String ret = "";
		for(Resource r : resources)
			ret += r.toString() + ", ";
		if(ret.length()>2)ret = ret.substring(0,ret.length() - 2);
		return ret;
	}
	
	public List<Object[]> getClassifierForCmd() {
		List<Object[]> list = new ArrayList<Object[]>();
		for(ClassifierSetup cs : setups) {
			List<List<String>> tmp = cs.getList();
			for(List<String> l : tmp)
				list.add(l.toArray());
		}
		return list;	
	}
	
	
	/**
	 * Prints the settings for the classifier to std.out
	 */
	public void printClassifier() {
		for(ClassifierSetup cs : setups) {
			List<List<String>> tmp = cs.getList();
			System.out.println("\n\nNEW CLASSIFIER\n====================");
			for(List<String> l : tmp) {
			System.out.print(cs.getClassifierName() + " ");
				for(String s : l) {
					System.out.print(s + " ");
				}
				System.out.println();
			}
		}	
	}
	
	/** Returns setups of classifiers.
	 * @return	List of classifier setups
	 */
	public List<ClassifierSetup> getClassifierSetups() {
		return setups;
	}
}