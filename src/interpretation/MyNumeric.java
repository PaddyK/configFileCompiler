package interpretation;

public abstract class MyNumeric extends Value{
	protected MyNumber firstNumber;
	
	public void setFirstNumber(MyNumber number) {
		firstNumber = number;
	}
	/*private Sequence sequence;
	private boolean isSequence;
	private MyNumeric numeric;
	
	public MyNumeric() {
		isSequence = false;
		firstNumber = null;
		sequence = null;
		numeric = (MyNumeric)firstNumber;
	}
	
	public void setSequence(Sequence seq) {
		sequence = seq;
		isSequence = true;
		numeric = (MyNumeric)sequence;
	}*/
}