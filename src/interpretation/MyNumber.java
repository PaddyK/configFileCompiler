package interpretation;

import java.lang.Comparable;

public abstract class MyNumber extends Value implements Comparable<MyNumber>{
	protected boolean sign;
	
	public MyNumber() {
		super();
		sign = false;
	}
	public void setSign() {
		sign = true;
	}
}