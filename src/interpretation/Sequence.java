package interpretation;

import java.util.List;

public class Sequence {
	protected MyNumber firstNumber;
	protected MyNumber nextNumber;
	private Sequence remainder;
	
	public Sequence() {
		
	}
	
	public void setFirstNumber(MyNumber number) {
		firstNumber = number;
	}
	
	public void setNextNumber(MyNumber number) {
		nextNumber = number;
	}
	
	public void setRemainder(Sequence rem) {
		remainder = rem;
	}
	
	public List<Value> explodeValues() {
		remainder.setFirstNumber(firstNumber);
		remainder.setNextNumber(nextNumber);
		return remainder.explodeValues();
	}
}