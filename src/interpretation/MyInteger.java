package interpretation;

import java.util.ArrayList;
import java.util.List;

public class MyInteger extends MyNumber {
	private int myInt;
	
	public MyInteger() {
		super();
	}
	
	public MyInteger(int i) {
		super();
		myInt = i;
	}
	
	public void setNumber(String text) throws NumberFormatException {
		myInt = Integer.parseInt(text);		
	}
	
	public int getIntegerValue() {
		return myInt;
	}
	
	@Override
	public String toString() {
		if(sign) {
			myInt *= -1;			
		}
		return "" + myInt;
	}

	@Override
	public int compareTo(MyNumber o) {
		if(o instanceof MyInteger) {
			int num = ((MyInteger)o).getIntegerValue();
			if(myInt > num) 
				return 1;
			else if(myInt == num)
				return 0;
			else
				return -1;
		} else if(o instanceof MyFloat) {
			double num = ((MyFloat)o).getDoubleValue();
			if(myInt > num)
				return 1;
			else if(myInt == num)
				return 0;
			else
				return -1;
		} else
			return 0;			
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