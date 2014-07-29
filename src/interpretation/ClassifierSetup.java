package interpretation;

import java.util.ArrayList;
import java.util.List;

public class ClassifierSetup {
	
	/**
	 * Returns the fully qualified Classifier name for a classifier name. For instance returns
	 * weka.classifiers.met.AdaBoostM1 for input AdaBoostM1
	 * @param classifierName	Name of a classifier, e.g. AdaBoostM1
	 * @return					Fully qualified name of a classifier e.g. weka.classifiers.met.AdaBoostM1 
	 */
	public static String getClassifierPath(String classifierName) {
		String component;
		switch(classifierName) {
		case "AdaBoostM1"						: component = "weka.classifiers.meta.AdaBoostM1"; break;
		case "ADTree"							: component = "weka.classifiers.trees.ADTree"; break;
		case "Bagging" 							: component = "weka.classifiers.meta.Bagging"; break;
		case "BayesNet"							: component = "weka.classifiers.bayes.BayesNet"; break;
		case "BFTree"							: component = "weka.classifiers.trees.BFTree"; break;
		case "CitationKNN"						: component = "weka.classifiers.mi.CitationKNN"; break;
		case "ComplementNaiveBayes"				: component = "weka.classifiers.bayes.ComplementNaiveBayes"; break;
		case "ConjunctiveRule"					: component = "weka.classifiers.rules.ConjunctiveRule"; break;
		case "DecisionStump"					: component = "weka.classifiers.trees.DecisionStump"; break;
		case "DecisionTable"					: component = "weka.classifiers.rules.DecisionTable"; break;
		case "DTNB"								: component = "weka.classifiers.rules.DTNB"; break;
		case "DMNBtext"							: component = "weka.classifiers.bayes.DMNBtext"; break;
		case "FT"								: component = "weka.classifiers.trees.FT"; break;
		case "IB1"								: component = "weka.classifiers.lazy.IB1"; break;
		case "IBk"								: component = "weka.classifiers.lazy.IBk"; break;
		case "J48"								: component = "weka.classifiers.trees.J48"; break;
		case "J48graft"							: component = "weka.classifiers.trees.J48graft"; break;
		case "JRip"								: component = "weka.classifiers.rules.JRip"; break;
		case "KStar" 							: component = "weka.classifiers.lazy.KStar"; break;
		case "LADTree"							: component = "weka.classifiers.trees.LADTree"; break;
		case "LibLINEAR"						: component = "weka.classifiers.functions.LibLinear"; break;
		case "LibSVM"							: component = "weka.classifiers.functions.LibSVM"; break;
		case "LMT" 								: component = "weka.classifiers.trees.LMT"; break;
		case "Logistic"							: component = "weka.classifiers.functions.Logistic"; break;
		case "LWL"								: component = "weka.classifiers.lazy.LWL"; break;
		case "MetaCost" 						: component = "weka.classifiers.meta.MetaCost"; break;
		case "MISMO"							: component = "weka.classifiers.mi.MISMO"; break;
		case "MIWrapper"						: component = "weka.classifiers.mi.MIWrapper"; break;
		case "MultilayerPerceptron" 			: component = "weka.classifiers.functions.MultilayerPerceptron"; break;
		case "NBTree"							: component = "weka.classifiers.trees.NBTree"; break;
		case "NaiveBayes"						: component = "weka.classifiers.bayes.NaiveBayes"; break;
		case "NaiveBayesMultinomial"			: component = "weka.classifiers.bayes.NaiveBayesMultinomial"; break;
		case "NaiveBayesMultinomialUpdateable"	: component = "weka.classifiers.bayes.NaiveBayesMultinomialUpdateable"; break;
		case "NaiveBayesSimple"					: component = "weka.classifiers.bayes.NaiveBayesSimple"; break;
		case "NaiveBayesSimpleUpdateable"		: component = "weka.classifiers.bayes.NaiveBayesSimpleUpdateable"; break;
		case "NNge"								: component = "weka.classifiers.rules.NNge"; break;
		case "OneR"								: component = "weka.classifiers.rules.OneR"; break;
		case "PART"								: component = "weka.classifiers.rules.PART"; break;
		case "RandomForest" 					: component = "weka.classifiers.trees.RandomForest"; break;
		case "RandomTree"						: component = "weka.classifiers.trees.RandomTree"; break;
		case "RBFNetwork"						: component = "weka.classifiers.functions.RBFNetwork"; break;
		case "REPTree" 							: component = "weka.classifiers.trees.REPTree"; break;
		case "Ridor"							: component = "weka.classifiers.rules.Ridor"; break;
		case "SimpleLogistic" 					: component = "weka.classifiers.functions.SimpleLogistic"; break;
		case "SimpleMI"							: component = "weak.classifiers.mi.SimpleMI"; break;
		case "Stacking"							: component = "weka.classifiers.meta.Stacking"; break;
		case "SMO"								: component = "weka.classifiers.functions.SMO"; break;
		case "ZeroR"							: component = "weka.classifiers.rules.ZeroR"; break;
		default: component = null;
		}
		return component;
	} 
	
	private List<List<String>> listOfLists;
	private String classifierName;
	
	/**
	 * Creates the permutations as specified in the config file
	 * @param secondlevel	The classifier specification
	 * @throws Exception	An error if semantics are not correct
	 */
	public ClassifierSetup(Element secondlevel) throws Exception {
		listOfLists = new ArrayList<List<String>>();
		List<List<String>> localListOfLists;
		List<String> list;
		KeyValue name;
		
		if(secondlevel.getAttributeList().size() != 1)
			throw new Exception("Classifier tag MUST contain name=\"\" only");
		if((name = secondlevel.getAttributeList().getKeyValue("name")) == null)
			throw new Exception("Classifier tag MUST contain name attribute");		
		
		
		classifierName = getClassifierPath(name.getValue().getValue().toString());
		if(classifierName == null)
			throw new Exception("Classifier " + name.getValue().getValue().toString() + " seems"
					+ "not to be a valid classifier name. Check spelling or if it exists in weka."
					+ "If it does exist it is not yet listed in this application.");
		// Populate listOfLists with name of classifier as starting point
		list = new ArrayList<>();
		listOfLists.add(list);
		
		// Check if it is a short notation i.e. using classifier without any options specified
		// In weka standard options are then used. If it is a short notation simply the classifier
		// name needs to be set. No additional instructions are necessary
		if(secondlevel.getEnd() instanceof Longend) {
			for(Element el : secondlevel.getEnd().getElements()) {
				// It is not allowed to specify an classifier within an classifier. A classifier can
				// only be a child node of an attribute
				if(el.getName().toString().equalsIgnoreCase("classifier")) {
					throw new Exception("Nested classifier is not allowed");
				}
				else if(el.getName().toString().equalsIgnoreCase("attribute")) {
					localListOfLists = new ArrayList<List<String>>();
					AttributeSetup attrSetup = new AttributeSetup(el); //Get the permuations of the attribute tag
					for(List<String> oldList : listOfLists) {			// Go trough all existing settings
						for(List<String> l : attrSetup.getListOfLists()) {
							list = new ArrayList<>();
							list.addAll(oldList);						// Add existing settings	
							list.addAll(l);								// Add new settings
							localListOfLists.add(list);
						}
					}
					// Change listOfLists. This step is necessary since Java does not allow to change
					// an element, if it is used in the foreach loop
					listOfLists = localListOfLists;
				}
				else {
					throw new Exception("Unknown EndType encountered while interpreting element " +
							el.getName().toString());
				}						
			}
		}
	}
	
	public List<List<String>> getList(){
		return listOfLists;
	}
	
	/**
	 * Returns classifiername and options imploded to a string concatenated with spaces
	 * @return	List of Strings representing classifier settings
	 */
	public List<String> toStringList() {
		String add;
		List<String> ret = new ArrayList<String>();
		if(listOfLists.isEmpty())
			return null;
		
		for(List<String> l : listOfLists)
			if((add = implode(l)) == null)
				ret.add("");
			else
				ret.add(add);
		return ret;
	}
	
	/**
	 * Concatenates all elements of a list of strings with a space 
	 * @param list	List of strings to be concatenated
	 * @return	With spaces concatenated String
	 */
	private String implode(List<String> list) {
		if(list.isEmpty())
			return null;
		String ret = "";
		for(String s : list)
			ret += s + " ";
		return ret.substring(0, ret.length()-1);
	}
	
	public String getClassifierName() {
		return classifierName;
	}
	
	/**
	 * Returns permutation of options as List of String arrays so they may be used to instanciate
	 * weka classifier objects using classifiername and options
	 * @return	List of String Arrays representing specified classifier options
	 */
	public List<String[]> getOptionsAsArray() {
		List<String[]> ret = new ArrayList<String[]>();
		for(List<String> l : listOfLists)
			ret.add((String[])l.toArray());
		return ret;
	}
}