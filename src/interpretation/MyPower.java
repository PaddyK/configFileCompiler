package interpretation;

import java.util.ArrayList;
import java.util.List;

public class MyPower extends MyNumber {
	private MyNumber base;
	private MyNumber exponent;
	
	public void setBase(MyNumber base) {
		this.base = base;
	}
	
	public void setExponent(MyNumber exponent) {
		this.exponent = exponent;
	}
	
	public double getBase() {
		return getDoubleFromMyNumber(base);
	}
	
	public double getExponent() {
		return getDoubleFromMyNumber(exponent);
	}
	
	/** Converts MyNumber to a double
	 * 
	 * @param number
	 * @return
	 */
	private double getDoubleFromMyNumber(MyNumber number) {
		double a;
		if(number instanceof MyInteger)
			a = ((MyInteger)number).getIntegerValue();
		else if(number instanceof MyFloat)
			a = ((MyFloat)number).getDoubleValue();
		else
			a = 0;
		return a;
	}

	@Override
	public int compareTo(MyNumber o) {
		double a = getDoubleFromMyNumber(base);
		double b = getDoubleFromMyNumber(exponent);
		double power = Math.pow(a, b);
		
		if(o instanceof MyInteger) {
			int num = ((MyInteger)o).getIntegerValue();
			if(power > num) 
				return 1;
			else if(power == num)
				return 0;
			else
				return -1;
		} else if(o instanceof MyFloat) {
			double num = ((MyFloat)o).getDoubleValue();
			if(power > num)
				return 1;
			else if(power == num)
				return 0;
			else
				return -1;
		} else
			return 0;
	}

	@Override
	public List<KeyValue> getKeyValuePairs(MyString key) {
		List<interpretation.KeyValue> list = new ArrayList<interpretation.KeyValue>();
		list.add(new interpretation.KeyValue(key, this));
		return list;
	}

	@Override
	public List<Value> getValueSpace() {
		List<Value> list = new ArrayList<Value>();
		list.add(this);
		return list;
	}

	@Override
	public Object getValue() {
		double a = getDoubleFromMyNumber(base);
		double b = getDoubleFromMyNumber(exponent);
		double power = Math.pow(a, b);
		
		if(power % 1 == 0)
			return new Integer((int)power);
		else
			return new Double((double)power);
	}

	@Override
	public String toString() {
		return getValue().toString();
	}
	
}