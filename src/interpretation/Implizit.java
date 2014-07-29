package interpretation;

import java.util.ArrayList;
import java.util.List;

public class Implizit extends Sequence {
	
	private MyNumber end;
	
	public Implizit(MyNumber end) {
		super();
		this.end = end;
	}
	
	public List<Value> getValueSpace() {
		List<Value> values = new ArrayList<Value>();
		if(firstNumber instanceof MyPower) {
			double 	start 		= ((MyPower)firstNumber).getExponent(),
					e			= ((MyPower)end).getExponent(),
					next		= ((MyPower)nextNumber).getExponent(),
					iterations	= (e - start) / (next - start) + 1,
					val;
			for(int i = 0; i < iterations; i++) {
				val = Math.pow(((MyPower)firstNumber).getBase(), start + i * (next - start));
				if(val % 1 == 0)
					values.add(new MyInteger((int)val));
				else
					values.add(new MyFloat(val));
			}
		}
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
		List<Value> values = getValueSpace();
		List<KeyValue> list = new ArrayList<KeyValue>();
		for(Value val : values)
			list.add(val.getKeyValuePairs(key).get(0));
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