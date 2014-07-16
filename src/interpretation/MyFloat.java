package interpretation;

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
		return myFloat;
	}
	
	@Override
	public String toString() {
		if(sign) {
			myFloat *= -1;			
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
}