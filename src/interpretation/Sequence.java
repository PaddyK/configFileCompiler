package interpretation;

import java.util.List;

public abstract class Sequence extends MyNumeric {
	protected MyNumber nextNumber;
	//private Sequence remainder;
	
	public Sequence() {
		
	}
	
	public void setNextNumber(MyNumber number) {
		nextNumber = number;
	}
	
	/*public void setRemainder(Sequence rem) {
		remainder = rem;
	}
	
	@Override
	public List<KeyValue> getKeyValuePairs(MyString key) {
		remainder.setFirstNumber(firstNumber);
		remainder.setNextNumber(nextNumber);
		return remainder.getKeyValuePairs(key);
	}*/
}