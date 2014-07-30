package wekaConfigFileMain;

import wekaConfigFileInterpretation.ExperimentSetup;

import java.io.File;
import java.util.List;

import wekaConfigFileParser.WekaConfigGrammarLexer;
import wekaConfigFileParser.WekaConfigGrammarParser;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;


public class RunInterpreter {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.err.println("Specify a weka configuration file!");
			return;
		}
		File cf = new File(args[0]);
		if(!cf.exists() || !cf.isFile()){
			System.err.println("Specify a weka configuration file!");
			System.err.println(args[0] + " does not exist or is not a file!");
			return;
		}
			
		List<ExperimentSetup> setups = null;
		try {
			ANTLRFileStream			stream = new ANTLRFileStream(args[0]);
			WekaConfigGrammarLexer	lexer  = new WekaConfigGrammarLexer(stream);
			CommonTokenStream		ts     = new CommonTokenStream(lexer);
			WekaConfigGrammarParser	parser = new WekaConfigGrammarParser(ts);
			setups = parser.configfile().f.interpret();
			System.out.println(setups.size());
			for(ExperimentSetup s : setups) {
				System.out.println(s.resourcesToString());
				s.printClassifier();
				if(s.getClassifierSetups().get(0).hasOptions())
					System.out.println("Classifier has options");
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}