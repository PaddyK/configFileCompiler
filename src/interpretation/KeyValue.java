package interpretation;

import java.util.List;
import java.util.ArrayList;

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
	
	public List<interpretation.KeyValue> getKeyValueSpace() {
		List<Value> values = value.getValueSpace();
		List<interpretation.KeyValue> pairs = new ArrayList<KeyValue>();
		
		for(Value val : values)
			pairs.add(new KeyValue(key, val));
		return pairs;
	}
}