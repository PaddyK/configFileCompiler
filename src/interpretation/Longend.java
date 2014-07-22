package interpretation;

import java.util.ArrayList;
import java.util.List;

public class Longend implements ElementEnd {
	private MyString name;
	private List<interpretation.Element> elements;
	public Longend() {
		elements = new ArrayList<Element>();
	}

	@Override
	public boolean matchTagName(MyString startName) {
		if(startName.toString().equals(name.toString()))
			return true;
		else
			return false;
	};
	
	public void addElement(Element element) {
		elements.add(element);
	}
	
	public void setEndName(MyString ename) {
		name = ename;
	}
	
	@Override
	public List<Element> getElements() {
		return elements;
	}
}