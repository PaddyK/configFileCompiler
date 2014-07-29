package wekaConfigFileInterpretation;

import java.util.List;

public class Element {
	private ElementEnd end;
	private MyString name;
	private AttributeList list;
	
	public void setElementEnd(ElementEnd end) {
		this.end = end;
	}
	
	public ElementEnd getEnd() {
		return end;
	}
	
	public void setElementName(MyString name) {
		this.name = name;
	}
	
	public void setAttributeList(AttributeList list) {
		this.list = list;
	}
	
	public boolean isSyntaxCorrect(int level) {
		boolean error = false;
		if(!(error = end.matchTagName(name)))
			System.err.println("Incorrect Syntax on Element " + name + " in level " + level);
		List<Element> elements = end.getElements();
		if(elements != null)	// makes sure error is set to false should syntax be incorrect at any point
			for(Element e : elements)
				if(!e.isSyntaxCorrect(level++))
					error = false;
		return error;
	}
	
	public MyString getName() {
		return name;
	}
	
	public AttributeList getAttributeList() {
		return list;
	}
}