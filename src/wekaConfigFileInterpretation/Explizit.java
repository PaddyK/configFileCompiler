package wekaConfigFileInterpretation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Explizit extends Sequence {
	private List<MyNumber> values;
	public Explizit() {
		super();
		values = new ArrayList<MyNumber>();
	}
	
	public void addNumber(MyNumber num) {
		values.add(num);
	}
	
	public List<Value> getValueSpace() {
		values.add(firstNumber);
		values.add(nextNumber);
		Collections.sort(values);
		List<Value> list = new ArrayList<Value>();
		for(Value v : values)
			list.add(v);
		return list;
	}
	
	@Override
	public List<KeyValue> getKeyValuePairs(MyString key) {
		List<Value> values = getValueSpace();
		List<KeyValue> list = new ArrayList<KeyValue>();
		for(Value val : values)
			list.addAll(val.getKeyValuePairs(key));
		return list;
	}
	
	@Override
	public Object getValue() {
		List<Object> ret = new ArrayList<Object>();
		List<Value> values = getValueSpace();
		
		for(Value val : values)
			ret.add(val.getValue());
		
		return ret;
	}
	
	@Override
	public String toString() {
		String str = "";
		List<Object> list = (List<Object>)getValue();
		for(Object o : list)
			str += o.toString() + ",";
		str = str.substring(0, str.length() - 1);
		return str;
	}
}