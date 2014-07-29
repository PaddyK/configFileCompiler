package wekaConfigFileInterpretation;

import java.util.ArrayList;
import java.util.List;

public class AttributeList {
	private List<KeyValue> pairs;
	
	public AttributeList(){
		pairs = new ArrayList<KeyValue>();
	};
	
	public void addKeyValue(KeyValue keyvalue) {
		pairs.add(keyvalue);
	}
	
	public List<List<KeyValue>> getPermutations() {
		return getPermutations(pairs.size());
	}
	
	private List<List<KeyValue>> getPermutations(int index) {
		int thisIndex = index;
		if(index == -1) {
			List<List<KeyValue>> tmp = new ArrayList<List<KeyValue>>();
			tmp.add(new ArrayList<KeyValue>());
			return tmp;
		}
		else {
			List<List<KeyValue>> prevList = getPermutations(index--);
			List<List<KeyValue>> thisList = new ArrayList<List<KeyValue>>();
			List<KeyValue> set = pairs.get(thisIndex).getKeyValueSpace();
			List<KeyValue> tmp;
			
			for(List<KeyValue> lkv : prevList) {
				for(KeyValue kv : set) {
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