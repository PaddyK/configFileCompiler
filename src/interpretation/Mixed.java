package interpretation;

import java.util.ArrayList;
import java.util.List;

public class Mixed extends Value {
	private String value;
	
	public Mixed() {
		super();
		value = null;
	}
	
	public void add(String addition) {
		if(value==null)
			value = "";
		value += addition;
	}
	
	public String toString() {
		return value;
	}
	
	@Override
	public List<interpretation.KeyValue> getKeyValuePairs(MyString key) {
		List<interpretation.KeyValue> list = new ArrayList<interpretation.KeyValue>();
		list.add(new interpretation.KeyValue(key, this));
		return list;
	}

	@Override
	public List<Value> getValueSpace() {
		List<Value> list = new ArrayList<Value>();
		list.add(this);
		return null;
	}
}