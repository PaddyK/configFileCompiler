package interpretation;

import java.util.List;
import java.util.ArrayList;

public class MyPath extends Value {
	private List<Mixed> pathelements;
	private Mixed extension;
	private boolean isRoot;
	
	public MyPath() {
		pathelements = new ArrayList<Mixed>();
		isRoot = false;
	}
	
	public void add(Mixed mix) {
		pathelements.add(mix);
	}
	
	public void setExtension(Mixed ext) {
		extension = ext;
	}
	
	public void setIsRoot() {
		isRoot = true;
	}
	
	@Override
	public String toString() {
		String path = "";
		String separator;
		if(System.getProperty("os.name").contains("Windows")) {
			if(isRoot) path += "C:\\";
			separator = "\\";
		}
		else {
			separator = "/";
			if(isRoot) path = "/";
		}
		for(Mixed mix : pathelements)
			path = mix.toString() + separator;
		path = path.substring(0, path.length() - 1);
		if(extension != null)
			path += "." + extension.toString();
		return path;
	}
	
	@Override
	public List<interpretation.KeyValue> getKeyValuePairs(MyString key) {
		List<interpretation.KeyValue> list = new ArrayList<interpretation.KeyValue>();
		list.add(new interpretation.KeyValue(key, this));
		return list;
	}
	
	@Override
	public List<Value> getValueSpace() {
		List<Value> list = new ArrayList<Value>();
		list.add(this);
		return null;
	}
}