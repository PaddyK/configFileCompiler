package wekaConfigFileInterpretation;

import java.util.HashMap;

public class Resource {
	private HashMap<String, Object> resourcen;
	
	public Resource(Element secondlevel) throws Exception{
		resourcen = new HashMap<String, Object>();
		
		// There must be at least one childnode (the path to arff files) in resource node
		if(!(secondlevel.getEnd() instanceof Longend)) {
			throw new Exception("No resources are given. Specify at least path to .arff files");
		}
		else {
			for(Element el : secondlevel.getEnd().getElements()) {
				// A resource definition must be of type shortend, i.e. <resource ... />
				if(!(el.getEnd() instanceof ShortEnd)) {
					throw new Exception("Resource must be a short element");
				}
				else {
					// A resource MUST have exactly a name="" and value=""
					if(el.getAttributeList().getPairs().size() != 2)
						throw new Exception("Exactly two attributes, name and value must be given");
					else {
						KeyValue key = el.getAttributeList().getKeyValue("name");
						KeyValue value = el.getAttributeList().getKeyValue("value");
						// Resource must have a name
						if(key == null) {
							throw new Exception("A name was not specified for a resource!");
						}
						//resource must have a value
						if(value == null) {
							throw new Exception("A value was not specified for a resource!");
						}
						//resource name must be a string
						if(!(key.getValue() instanceof MyString)) {
							throw new Exception("Resource name must be a string!");
						}
						resourcen.put(key.getValue().toString(), value.getValue().getValue());
					}
				}
			}
		}			
	}
	public Object getValues(String key) {
		return resourcen.get(key);
	}
	
	@Override
	public String toString() {
		String ret = "";
		for(String s : resourcen.keySet())
			ret += s + "=\"" + resourcen.get(s) + "\", ";
		if(ret.length()>2)ret = ret.substring(0,ret.length() - 2);
		return ret;
	}
}