package main;

import interpretation.ExperimentSetup;

import java.util.List;
import parser.WekaConfigGrammarLexer;
import parser.WekaConfigGrammarParser;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;


public class RunInterpreter {

	public static void main(String[] args) {
		System.out.println(args[0]);
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
				s.printClassifier();}

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}