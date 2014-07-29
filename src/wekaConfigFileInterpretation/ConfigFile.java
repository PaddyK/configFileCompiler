package wekaConfigFileInterpretation;

import java.util.ArrayList;
import java.util.List;

public class ConfigFile {
	
	private List<Element> elements;
	
	public ConfigFile() {
		elements = new ArrayList<Element>();
	}
	
	public void addElement(Element element) {
		elements.add(element);
	}
	
	public List<ExperimentSetup> interpret() throws Exception{
		List<ExperimentSetup> setups;
		setups = new ArrayList<ExperimentSetup>();
		
		for(Element element : elements) {
			if(element.getName().toString().equals("experiment")) {
				setups.add(new ExperimentSetup(element));
			}
			else {
				throw new Exception("Unknown top-level element encountered. Element was : " +
						element.getName().toString() + "/nMaybe you have an typo?");
			}
				
		}
		return setups;
	}
}