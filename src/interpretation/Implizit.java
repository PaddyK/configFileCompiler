package interpretation;

import java.util.ArrayList;
import java.util.List;

public class Implizit extends Sequence {
	
	private MyNumber end;
	
	public Implizit(MyNumber end) {
		super();
	}
	
	public List<Value> explodeValues() {
		List<Value> values = new ArrayList<Value>();
		double start = getValueFromMyNumber(firstNumber)
			,next = getValueFromMyNumber(nextNumber)
			,e = getValueFromMyNumber(end)
			,iterations = (e - start) / (next - start) + 1
			,val;
		boolean isDoubleVal = false;
		if(firstNumber instanceof MyFloat || nextNumber instanceof MyFloat || end instanceof MyFloat) {
			isDoubleVal = true;
		}
		for(int i = 0; i < iterations; i++) {
			val = start + i * (next - start);
			if(isDoubleVal)
				values.add(new MyFloat(val));
			else
				values.add(new MyInteger((int)val));
		}
		return values;
	}
	
	private double getValueFromMyNumber(MyNumber num) {
		if(num instanceof MyFloat)
			return ((MyFloat)num).getDoubleValue();
		else if(num instanceof MyInteger)
			return ((MyInteger)num).getIntegerValue();
		else
			return -1; //TODO: error handling
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