package wekaConfigFileInterpretation;

import java.util.ArrayList;
import java.util.List;

public class MyFloat extends MyNumber {
	private double myFloat;
	
	public MyFloat() {
		super();
	}
	
	public MyFloat(double f) {
		super();
		myFloat = f;
	}
	
	public void setNumber(String number, String mantissa) throws NumberFormatException {
		myFloat = Double.parseDouble(number + "." + mantissa);		
	}
	
	public double getDoubleValue() {
		if(sign) {
			return myFloat *(-1);			
		}
		return myFloat;
	}
	
	@Override
	public String toString() {
		if(sign) {
			return "" + (myFloat*(-1));			
		}
		return "" + myFloat;
	}
	
	@Override
	public int compareTo(MyNumber o) {
		if(o instanceof MyInteger) {
			int num = ((MyInteger)o).getIntegerValue();
			if(myFloat > num) 
				return 1;
			else if(myFloat == num)
				return 0;
			else
				return -1;
		} else if(o instanceof MyFloat) {
			double num = ((MyFloat)o).getDoubleValue();
			if(myFloat > num)
				return 1;
			else if(myFloat == num)
				return 0;
			else
				return -1;
		} else
			return 0;			
	}
	
	@Override
	public List<Value> getValueSpace() {
		List<Value> list = new ArrayList<Value>();
		list.add(this);
		return list;
	}	

	@Override
	public List<KeyValue> getKeyValuePairs(MyString key) {
		List<KeyValue> list = new ArrayList<KeyValue>();
		list.add(new KeyValue(key, this));
		return list;
	}
	
	@Override
	public Object getValue() {
		Double d;
		if(sign)
			d = new Double(myFloat*(-1));
		else
			d = new Double(myFloat);
		return d;
	}
}