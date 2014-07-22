package interpretation;

import java.util.List;

public class ShortEnd implements ElementEnd {
	
	public ShortEnd() {}

	@Override
	public boolean matchTagName(MyString startName) {
		return true;
	}
	
	public List<Element> getElements() {
		return null;
	}
}