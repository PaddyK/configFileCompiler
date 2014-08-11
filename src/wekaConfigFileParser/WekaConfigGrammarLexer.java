// Generated from src/wekaConfigFileParser/WekaConfigGrammar.g4 by ANTLR 4.2.2

    package wekaConfigFileParser;
    import java.util.List;
    import java.util.ArrayList;
    import org.antlr.v4.runtime.Parser;
    import wekaConfigFileInterpretation.*;
 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WekaConfigGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STARTTAG=1, ENDTAG=2, SLASH=3, COMMA=4, DIGIT=5, MINUS=6, USCORE=7, DOT=8, 
		EQ=9, HK=10, SMALLCHAR=11, CAPITALCHAR=12, WS=13, SPACE=14, BSLASH=15, 
		HEAD=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'<'", "'>'", "'/'", "','", "DIGIT", "'-'", "'\\u005F'", "'.'", "'='", 
		"'\"'", "SMALLCHAR", "CAPITALCHAR", "WS", "' '", "'\\'", "'^'"
	};
	public static final String[] ruleNames = {
		"STARTTAG", "ENDTAG", "SLASH", "COMMA", "DIGIT", "MINUS", "USCORE", "DOT", 
		"EQ", "HK", "SMALLCHAR", "CAPITALCHAR", "WS", "SPACE", "BSLASH", "HEAD"
	};


	public WekaConfigGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WekaConfigGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 12: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22K\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6-\n\6\r\6\16\6.\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\5\16B\n\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\3\4\2\13\f\17\17L\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2"+
		"\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13,\3\2\2\2\r\60\3\2\2\2\17\62\3"+
		"\2\2\2\21\64\3\2\2\2\23\66\3\2\2\2\258\3\2\2\2\27:\3\2\2\2\31<\3\2\2\2"+
		"\33A\3\2\2\2\35E\3\2\2\2\37G\3\2\2\2!I\3\2\2\2#$\7>\2\2$\4\3\2\2\2%&\7"+
		"@\2\2&\6\3\2\2\2\'(\7\61\2\2(\b\3\2\2\2)*\7.\2\2*\n\3\2\2\2+-\4\62;\2"+
		",+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\f\3\2\2\2\60\61\7/\2\2\61\16"+
		"\3\2\2\2\62\63\7a\2\2\63\20\3\2\2\2\64\65\7\60\2\2\65\22\3\2\2\2\66\67"+
		"\7?\2\2\67\24\3\2\2\289\7$\2\29\26\3\2\2\2:;\4c|\2;\30\3\2\2\2<=\4C\\"+
		"\2=\32\3\2\2\2>B\t\2\2\2?@\7\17\2\2@B\7\f\2\2A>\3\2\2\2A?\3\2\2\2BC\3"+
		"\2\2\2CD\b\16\2\2D\34\3\2\2\2EF\7\"\2\2F\36\3\2\2\2GH\7^\2\2H \3\2\2\2"+
		"IJ\7`\2\2J\"\3\2\2\2\5\2.A\3\3\16\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}