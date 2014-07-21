package interpretation;

import java.util.ArrayList;
import java.util.List;

public abstract class MyNumeric extends Value{
	protected MyNumber firstNumber;
	private Sequence sequence;
	private boolean isSequence;
	private MyNumeric numeric;
	
	public MyNumeric() {
		isSequence = false;
		firstNumber = null;
		sequence = null;
		numeric = (MyNumeric)firstNumber;
	}
	
	public void setFirstNumber(MyNumber number) {
		firstNumber = number;
	}
	
	public void setSequence(Sequence seq) {
		sequence = seq;
		isSequence = true;
		numeric = (MyNumeric)sequence;
	}
	
//	public List<Value> explodeValues() {
//		List<Value> values;
//		if(isSequence) {
//			sequence.setFirstNumber(firstNumber);
//			values = sequence.explodeValues();
//		}
//		else {
//			values = new ArrayList<Value>();
//			values.add(firstNumber);
//		}
//		return values;
//	}
}