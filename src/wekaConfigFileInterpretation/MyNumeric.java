package wekaConfigFileInterpretation;

public abstract class MyNumeric extends Value{
	protected MyNumber firstNumber;
	
	public void setFirstNumber(MyNumber number) {
		firstNumber = number;
	}
}