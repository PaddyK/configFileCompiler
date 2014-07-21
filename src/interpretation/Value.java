package interpretation;

import java.util.List;

public abstract class Value {
	
	public Value() {}
	
	public abstract List<interpretation.KeyValue> getKeyValuePairs(MyString key);
	public abstract List<Value> getValueSpace();
	
}