package interpretation;

import java.util.List;

public interface ElementEnd {
	public abstract boolean matchTagName(MyString startName);
	public abstract List<Element> getElements();
}