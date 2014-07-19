package interpretation;

public class KeyValue {
	private Value key;
	private Value value;
	
	public KeyValue(Value key, Value value) {
		this.key = key;
		this.value = value;
	}
	
	public Value getKey() {
		return key;
	}
	
	public Value getValue() {
		return value;
	}
}