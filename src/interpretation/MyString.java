package interpretation;

import java.util.ArrayList;
import java.util.List;

public class MyString extends Value {
	private String value;
	public MyString() {
		super();
		value = null;
	}
	
	public void add(String addition) {
		if(value == null)
			value = "";
		value += addition;
	}
	
	@Override
	public String toString() {
		return value;
	}

	@Override
	public List<interpretation.KeyValue> getKeyValuePairs(MyString key) {
		List<interpretation.KeyValue> list = new ArrayList<interpretation.KeyValue>();
		list.add(new interpretation.KeyValue(key, this));
		return list;
	}
}