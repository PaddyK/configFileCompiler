package wekaConfigFileInterpretation;

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
	public List<KeyValue> getKeyValuePairs(MyString key) {
		List<KeyValue> list = new ArrayList<KeyValue>();
		list.add(new KeyValue(key, this));
		return list;
	}
	
	@Override
	public List<Value> getValueSpace() {
		List<Value> list = new ArrayList<Value>();
		list.add(this);
		return list;
	}
	
	@Override public Object getValue() {
		return value;
	}
}