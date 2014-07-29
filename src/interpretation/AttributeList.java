package interpretation;

import java.util.ArrayList;
import java.util.List;

public class AttributeList {
	private List<interpretation.KeyValue> pairs;
	
	public AttributeList(){
		pairs = new ArrayList<KeyValue>();
	};
	
	public void addKeyValue(interpretation.KeyValue keyvalue) {
		pairs.add(keyvalue);
	}
	
	public List<List<interpretation.KeyValue>> getPermutations() {
		return getPermutations(pairs.size());
	}
	
	private List<List<interpretation.KeyValue>> getPermutations(int index) {
		int thisIndex = index;
		if(index == -1) {
			List<List<interpretation.KeyValue>> tmp = new ArrayList<List<interpretation.KeyValue>>();
			tmp.add(new ArrayList<interpretation.KeyValue>());
			return tmp;
		}
		else {
			List<List<interpretation.KeyValue>> prevList = getPermutations(index--);
			List<List<interpretation.KeyValue>> thisList = new ArrayList<List<KeyValue>>();
			List<interpretation.KeyValue> set = pairs.get(thisIndex).getKeyValueSpace();
			List<interpretation.KeyValue> tmp;
			
			for(List<interpretation.KeyValue> lkv : prevList) {
				for(interpretation.KeyValue kv : set) {
					tmp = new ArrayList<KeyValue>();
					tmp.addAll(lkv);
					tmp.add(kv);
					thisList.add(tmp);
				}
			}
			return thisList;		
		}
	}
	
	public List<KeyValue> getPairs() {
		return pairs;
	}
	
	public int size() {
		return pairs.size();
	}
	
	public KeyValue getKeyValue(String key) {
		for(KeyValue kv : pairs)
			if(((String)kv.getKey().getValue()).equalsIgnoreCase(key))
				return kv;
		return null;
	}
}