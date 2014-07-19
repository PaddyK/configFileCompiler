package interpretation;

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
	
	public List<Value> explodeValues() {
		values.add(firstNumber);
		values.add(nextNumber);
		Collections.sort(values);
		List<Value> list = new ArrayList<Value>();
		for(int i=0; i<list.size(); i++)
			list.add(values.get(i));
		return list;
	}
	
	@Override
	public List<KeyValue> getKeyValuePairs(MyString key) {
		List<Value> values = explodeValues();
		List<KeyValue> list = new ArrayList<KeyValue>();
		for(Value val : values)
			list.add(val.getKeyValuePairs(key).get(0));
		return list;
	}
}