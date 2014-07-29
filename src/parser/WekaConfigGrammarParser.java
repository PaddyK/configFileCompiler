// Generated from src/parser/WekaConfigGrammar.g4 by ANTLR 4.2.2

    package parser;
    import java.util.List;
    import java.util.ArrayList;
    import org.antlr.v4.runtime.Parser;
    import interpretation.*;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WekaConfigGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STARTTAG=1, ENDTAG=2, SLASH=3, COMMA=4, DIGIT=5, MINUS=6, DOT=7, EQ=8, 
		HK=9, SMALLCHAR=10, CAPITALCHAR=11, WS=12, SPACE=13, BSLASH=14, HEAD=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'<'", "'>'", "'/'", "','", "DIGIT", "'-'", "'.'", "'='", 
		"'\"'", "SMALLCHAR", "CAPITALCHAR", "WS", "' '", "'\\'", "'^'"
	};
	public static final int
		RULE_configfile = 0, RULE_element = 1, RULE_elementend = 2, RULE_attributelist = 3, 
		RULE_keyvalue = 4, RULE_longend = 5, RULE_shortend = 6, RULE_string = 7, 
		RULE_value = 8, RULE_numeric = 9, RULE_sequence = 10, RULE_explizit = 11, 
		RULE_implizit = 12, RULE_path = 13, RULE_mixed = 14, RULE_number = 15, 
		RULE_power = 16, RULE_integer = 17, RULE_floating = 18;
	public static final String[] ruleNames = {
		"configfile", "element", "elementend", "attributelist", "keyvalue", "longend", 
		"shortend", "string", "value", "numeric", "sequence", "explizit", "implizit", 
		"path", "mixed", "number", "power", "integer", "floating"
	};

	@Override
	public String getGrammarFileName() { return "WekaConfigGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WekaConfigGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConfigfileContext extends ParserRuleContext {
		public ConfigFile f;
		public ElementContext e;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ConfigfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterConfigfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitConfigfile(this);
		}
	}

	public final ConfigfileContext configfile() throws RecognitionException {
		ConfigfileContext _localctx = new ConfigfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_configfile);

		       ((ConfigfileContext)_localctx).f =  new ConfigFile(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); ((ConfigfileContext)_localctx).e = element();
				 _localctx.f.addElement(((ConfigfileContext)_localctx).e.el); 
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STARTTAG );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public Element el;
		public StringContext name;
		public AttributelistContext a;
		public ElementendContext e;
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(WekaConfigGrammarParser.SPACE); }
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public ElementendContext elementend() {
			return getRuleContext(ElementendContext.class,0);
		}
		public TerminalNode SPACE(int i) {
			return getToken(WekaConfigGrammarParser.SPACE, i);
		}
		public TerminalNode STARTTAG() { return getToken(WekaConfigGrammarParser.STARTTAG, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);

		       ((ElementContext)_localctx).el =  new Element(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); match(STARTTAG);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(46); match(SPACE);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); ((ElementContext)_localctx).name = string();
			 _localctx.el.setElementName(((ElementContext)_localctx).name.mstring); 
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54); match(SPACE);
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(59); ((ElementContext)_localctx).a = attributelist();
				 _localctx.el.setAttributeList(((ElementContext)_localctx).a.attr); 
				}
				break;
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(64); match(SPACE);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); ((ElementContext)_localctx).e = elementend();
			 _localctx.el.setElementEnd(((ElementContext)_localctx).e.end); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementendContext extends ParserRuleContext {
		public ElementEnd end;
		public LongendContext l;
		public ShortendContext s;
		public ShortendContext shortend() {
			return getRuleContext(ShortendContext.class,0);
		}
		public LongendContext longend() {
			return getRuleContext(LongendContext.class,0);
		}
		public ElementendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterElementend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitElementend(this);
		}
	}

	public final ElementendContext elementend() throws RecognitionException {
		ElementendContext _localctx = new ElementendContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elementend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			switch (_input.LA(1)) {
			case ENDTAG:
				{
				setState(73); ((ElementendContext)_localctx).l = longend();
				 ((ElementendContext)_localctx).end =  ((ElementendContext)_localctx).l.le; 
				}
				break;
			case SLASH:
				{
				setState(76); ((ElementendContext)_localctx).s = shortend();
				 ((ElementendContext)_localctx).end =  ((ElementendContext)_localctx).s.se; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeList attr;
		public KeyvalueContext k1;
		public KeyvalueContext keyvalue(int i) {
			return getRuleContext(KeyvalueContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(WekaConfigGrammarParser.SPACE); }
		public List<KeyvalueContext> keyvalue() {
			return getRuleContexts(KeyvalueContext.class);
		}
		public TerminalNode SPACE(int i) {
			return getToken(WekaConfigGrammarParser.SPACE, i);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitAttributelist(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		AttributelistContext _localctx = new AttributelistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attributelist);

		       ((AttributelistContext)_localctx).attr =  new AttributeList();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81); ((AttributelistContext)_localctx).k1 = keyvalue();
				 _localctx.attr.addKeyValue(((AttributelistContext)_localctx).k1.kv); 
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83); match(SPACE);
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SMALLCHAR || _la==CAPITALCHAR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyvalueContext extends ParserRuleContext {
		public KeyValue kv;
		public StringContext s;
		public ValueContext v;
		public List<TerminalNode> HK() { return getTokens(WekaConfigGrammarParser.HK); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode HK(int i) {
			return getToken(WekaConfigGrammarParser.HK, i);
		}
		public TerminalNode EQ() { return getToken(WekaConfigGrammarParser.EQ, 0); }
		public KeyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterKeyvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitKeyvalue(this);
		}
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_keyvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); ((KeyvalueContext)_localctx).s = string();
			setState(94); match(EQ);
			setState(95); match(HK);
			setState(96); ((KeyvalueContext)_localctx).v = value();
			setState(97); match(HK);
			((KeyvalueContext)_localctx).kv =  new KeyValue(((KeyvalueContext)_localctx).s.mstring, ((KeyvalueContext)_localctx).v.val); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongendContext extends ParserRuleContext {
		public Longend le;
		public ElementContext e;
		public StringContext s;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(WekaConfigGrammarParser.SLASH, 0); }
		public TerminalNode ENDTAG(int i) {
			return getToken(WekaConfigGrammarParser.ENDTAG, i);
		}
		public TerminalNode STARTTAG() { return getToken(WekaConfigGrammarParser.STARTTAG, 0); }
		public List<TerminalNode> ENDTAG() { return getTokens(WekaConfigGrammarParser.ENDTAG); }
		public LongendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterLongend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitLongend(this);
		}
	}

	public final LongendContext longend() throws RecognitionException {
		LongendContext _localctx = new LongendContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_longend);

		       ((LongendContext)_localctx).le =  new Longend();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(ENDTAG);
			setState(104); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(101); ((LongendContext)_localctx).e = element();
					 _localctx.le.addElement(((LongendContext)_localctx).e.el);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(106); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			setState(108); match(STARTTAG);
			setState(109); match(SLASH);
			setState(110); ((LongendContext)_localctx).s = string();
			 _localctx.le.setEndName(((LongendContext)_localctx).s.mstring); 
			setState(112); match(ENDTAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShortendContext extends ParserRuleContext {
		public ShortEnd se;
		public TerminalNode SLASH() { return getToken(WekaConfigGrammarParser.SLASH, 0); }
		public TerminalNode ENDTAG() { return getToken(WekaConfigGrammarParser.ENDTAG, 0); }
		public ShortendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterShortend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitShortend(this);
		}
	}

	public final ShortendContext shortend() throws RecognitionException {
		ShortendContext _localctx = new ShortendContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_shortend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(SLASH);
			setState(115); match(ENDTAG);
			((ShortendContext)_localctx).se =  new ShortEnd(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public MyString mstring;
		public Token s;
		public Token c;
		public List<TerminalNode> SMALLCHAR() { return getTokens(WekaConfigGrammarParser.SMALLCHAR); }
		public TerminalNode SMALLCHAR(int i) {
			return getToken(WekaConfigGrammarParser.SMALLCHAR, i);
		}
		public TerminalNode CAPITALCHAR(int i) {
			return getToken(WekaConfigGrammarParser.CAPITALCHAR, i);
		}
		public List<TerminalNode> CAPITALCHAR() { return getTokens(WekaConfigGrammarParser.CAPITALCHAR); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);

		       ((StringContext)_localctx).mstring =  new MyString(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(122);
				switch (_input.LA(1)) {
				case SMALLCHAR:
					{
					setState(118); ((StringContext)_localctx).s = match(SMALLCHAR);
					 _localctx.mstring.add((((StringContext)_localctx).s!=null?((StringContext)_localctx).s.getText():null)); 
					}
					break;
				case CAPITALCHAR:
					{
					setState(120); ((StringContext)_localctx).c = match(CAPITALCHAR);
					 _localctx.mstring.add((((StringContext)_localctx).c!=null?((StringContext)_localctx).c.getText():null)); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SMALLCHAR || _la==CAPITALCHAR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public Value val;
		public StringContext s;
		public NumericContext n;
		public MixedContext m;
		public PathContext p;
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public MixedContext mixed() {
			return getRuleContext(MixedContext.class,0);
		}
		public NumericContext numeric() {
			return getRuleContext(NumericContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(126); ((ValueContext)_localctx).s = string();
				 ((ValueContext)_localctx).val =  ((ValueContext)_localctx).s.mstring; 
				}
				break;

			case 2:
				{
				setState(129); ((ValueContext)_localctx).n = numeric();
				 ((ValueContext)_localctx).val =  ((ValueContext)_localctx).n.num; 
				}
				break;

			case 3:
				{
				setState(132); ((ValueContext)_localctx).m = mixed();
				 ((ValueContext)_localctx).val =  ((ValueContext)_localctx).m.mmixed; 
				}
				break;

			case 4:
				{
				setState(135); ((ValueContext)_localctx).p = path();
				 ((ValueContext)_localctx).val =  ((ValueContext)_localctx).p.p;
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericContext extends ParserRuleContext {
		public MyNumeric num;
		public NumberContext n;
		public SequenceContext s;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public NumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitNumeric(this);
		}
	}

	public final NumericContext numeric() throws RecognitionException {
		NumericContext _localctx = new NumericContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numeric);

			MyNumber mn = null;
		        Sequence seq = null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); ((NumericContext)_localctx).n = number();
			 mn = ((NumericContext)_localctx).n.num; 
			setState(145);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(142); ((NumericContext)_localctx).s = sequence();
				 seq = ((NumericContext)_localctx).s.seq;
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {

			                 if(seq == null)
			                    ((NumericContext)_localctx).num =  mn;
			                 else {
			                       ((NumericContext)_localctx).num =  seq;
			                       _localctx.num.setFirstNumber(mn);
			                 }
			 
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public Sequence seq;
		public NumberContext n;
		public ExplizitContext e;
		public ImplizitContext i;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExplizitContext explizit() {
			return getRuleContext(ExplizitContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(WekaConfigGrammarParser.COMMA, 0); }
		public ImplizitContext implizit() {
			return getRuleContext(ImplizitContext.class,0);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitSequence(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sequence);

		       MyNumber nm = null;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(COMMA);
			setState(148); ((SequenceContext)_localctx).n = number();
			 nm = ((SequenceContext)_localctx).n.num; 
			setState(154);
			switch (_input.LA(1)) {
			case COMMA:
			case HK:
				{
				setState(150); ((SequenceContext)_localctx).e = explizit();
				 ((SequenceContext)_localctx).seq =   ((SequenceContext)_localctx).e.exp; 
				}
				break;
			case DOT:
				{
				setState(153); ((SequenceContext)_localctx).i = implizit();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 ((SequenceContext)_localctx).seq =  ((SequenceContext)_localctx).i.imp; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {

			         _localctx.seq.setNextNumber(nm); 
			exitRule();
		}
		return _localctx;
	}

	public static class ExplizitContext extends ParserRuleContext {
		public Explizit exp;
		public NumberContext n;
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(WekaConfigGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(WekaConfigGrammarParser.COMMA, i);
		}
		public ExplizitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explizit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterExplizit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitExplizit(this);
		}
	}

	public final ExplizitContext explizit() throws RecognitionException {
		ExplizitContext _localctx = new ExplizitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_explizit);

		       ((ExplizitContext)_localctx).exp =  new Explizit(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158); match(COMMA);
				setState(159); ((ExplizitContext)_localctx).n = number();
				 _localctx.exp.addNumber(((ExplizitContext)_localctx).n.num); 
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplizitContext extends ParserRuleContext {
		public Implizit imp;
		public NumberContext n;
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(WekaConfigGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(WekaConfigGrammarParser.DOT, i);
		}
		public ImplizitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implizit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterImplizit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitImplizit(this);
		}
	}

	public final ImplizitContext implizit() throws RecognitionException {
		ImplizitContext _localctx = new ImplizitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_implizit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(DOT);
			setState(168); match(DOT);
			setState(169); ((ImplizitContext)_localctx).n = number();
			 ((ImplizitContext)_localctx).imp =  new Implizit(((ImplizitContext)_localctx).n.num); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public MyPath p;
		public Token sl1;
		public MixedContext s1;
		public Token sl2;
		public MixedContext s2;
		public Token d;
		public MixedContext s3;
		public List<MixedContext> mixed() {
			return getRuleContexts(MixedContext.class);
		}
		public TerminalNode SLASH(int i) {
			return getToken(WekaConfigGrammarParser.SLASH, i);
		}
		public MixedContext mixed(int i) {
			return getRuleContext(MixedContext.class,i);
		}
		public TerminalNode DOT() { return getToken(WekaConfigGrammarParser.DOT, 0); }
		public List<TerminalNode> SLASH() { return getTokens(WekaConfigGrammarParser.SLASH); }
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitPath(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_path);

		       ((PathContext)_localctx).p =  new MyPath(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(172); ((PathContext)_localctx).sl1 = match(SLASH);
				 _localctx.p.setIsRoot();  
				}
			}

			setState(179); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(176); ((PathContext)_localctx).s1 = mixed();
					setState(177); ((PathContext)_localctx).sl2 = match(SLASH);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(181); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			 _localctx.p.add(((PathContext)_localctx).s1.mmixed);  
			setState(184); ((PathContext)_localctx).s2 = mixed();
			 _localctx.p.add(((PathContext)_localctx).s2.mmixed); 
			setState(186); ((PathContext)_localctx).d = match(DOT);
			setState(187); ((PathContext)_localctx).s3 = mixed();
			 _localctx.p.setExtension(((PathContext)_localctx).s3.mmixed); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixedContext extends ParserRuleContext {
		public Mixed mmixed;
		public Token d;
		public Token c;
		public Token s;
		public Token dg;
		public Token m;
		public Token bb;
		public Token bhk;
		public Token sc;
		public Token cc;
		public TerminalNode DIGIT(int i) {
			return getToken(WekaConfigGrammarParser.DIGIT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(WekaConfigGrammarParser.SPACE); }
		public List<TerminalNode> MINUS() { return getTokens(WekaConfigGrammarParser.MINUS); }
		public TerminalNode HK(int i) {
			return getToken(WekaConfigGrammarParser.HK, i);
		}
		public List<TerminalNode> BSLASH() { return getTokens(WekaConfigGrammarParser.BSLASH); }
		public TerminalNode SMALLCHAR(int i) {
			return getToken(WekaConfigGrammarParser.SMALLCHAR, i);
		}
		public TerminalNode CAPITALCHAR(int i) {
			return getToken(WekaConfigGrammarParser.CAPITALCHAR, i);
		}
		public TerminalNode DOT(int i) {
			return getToken(WekaConfigGrammarParser.DOT, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(WekaConfigGrammarParser.COMMA, i);
		}
		public List<TerminalNode> CAPITALCHAR() { return getTokens(WekaConfigGrammarParser.CAPITALCHAR); }
		public TerminalNode MINUS(int i) {
			return getToken(WekaConfigGrammarParser.MINUS, i);
		}
		public List<TerminalNode> HK() { return getTokens(WekaConfigGrammarParser.HK); }
		public List<TerminalNode> SMALLCHAR() { return getTokens(WekaConfigGrammarParser.SMALLCHAR); }
		public List<TerminalNode> DOT() { return getTokens(WekaConfigGrammarParser.DOT); }
		public List<TerminalNode> DIGIT() { return getTokens(WekaConfigGrammarParser.DIGIT); }
		public List<TerminalNode> COMMA() { return getTokens(WekaConfigGrammarParser.COMMA); }
		public TerminalNode BSLASH(int i) {
			return getToken(WekaConfigGrammarParser.BSLASH, i);
		}
		public TerminalNode SPACE(int i) {
			return getToken(WekaConfigGrammarParser.SPACE, i);
		}
		public MixedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterMixed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitMixed(this);
		}
	}

	public final MixedContext mixed() throws RecognitionException {
		MixedContext _localctx = new MixedContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mixed);

		       ((MixedContext)_localctx).mmixed =  new Mixed(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(210);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(190); ((MixedContext)_localctx).d = match(DOT);
						 _localctx.mmixed.add((((MixedContext)_localctx).d!=null?((MixedContext)_localctx).d.getText():null)); 
						}
						break;

					case 2:
						{
						setState(192); ((MixedContext)_localctx).c = match(COMMA);
						 _localctx.mmixed.add((((MixedContext)_localctx).c!=null?((MixedContext)_localctx).c.getText():null)); 
						}
						break;

					case 3:
						{
						setState(194); ((MixedContext)_localctx).s = match(SPACE);
						 _localctx.mmixed.add((((MixedContext)_localctx).s!=null?((MixedContext)_localctx).s.getText():null)); 
						}
						break;

					case 4:
						{
						setState(196); ((MixedContext)_localctx).dg = match(DIGIT);
						 _localctx.mmixed.add((((MixedContext)_localctx).dg!=null?((MixedContext)_localctx).dg.getText():null)); 
						}
						break;

					case 5:
						{
						setState(198); ((MixedContext)_localctx).m = match(MINUS);
						 _localctx.mmixed.add((((MixedContext)_localctx).m!=null?((MixedContext)_localctx).m.getText():null)); 
						}
						break;

					case 6:
						{
						setState(200); ((MixedContext)_localctx).bb = match(BSLASH);
						setState(201); match(BSLASH);
						 _localctx.mmixed.add((((MixedContext)_localctx).bb!=null?((MixedContext)_localctx).bb.getText():null)); 
						}
						break;

					case 7:
						{
						setState(203); ((MixedContext)_localctx).bhk = match(BSLASH);
						setState(204); match(HK);
						 _localctx.mmixed.add((((MixedContext)_localctx).bhk!=null?((MixedContext)_localctx).bhk.getText():null)); 
						}
						break;

					case 8:
						{
						setState(206); ((MixedContext)_localctx).sc = match(SMALLCHAR);
						 _localctx.mmixed.add((((MixedContext)_localctx).sc!=null?((MixedContext)_localctx).sc.getText():null)); 
						}
						break;

					case 9:
						{
						setState(208); ((MixedContext)_localctx).cc = match(CAPITALCHAR);
						 _localctx.mmixed.add((((MixedContext)_localctx).cc!=null?((MixedContext)_localctx).cc.getText():null)); 
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public MyNumber num;
		public IntegerContext i;
		public FloatingContext f;
		public PowerContext p;
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public FloatingContext floating() {
			return getRuleContext(FloatingContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_number);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); ((NumberContext)_localctx).i = integer();
				 ((NumberContext)_localctx).num =  ((NumberContext)_localctx).i.mint; 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); ((NumberContext)_localctx).f = floating();
				 ((NumberContext)_localctx).num =  ((NumberContext)_localctx).f.mfloat; 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220); ((NumberContext)_localctx).p = power();
				 ((NumberContext)_localctx).num =  ((NumberContext)_localctx).p.mPow; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public MyPower mPow;
		public IntegerContext i;
		public FloatingContext f;
		public IntegerContext integer(int i) {
			return getRuleContext(IntegerContext.class,i);
		}
		public List<IntegerContext> integer() {
			return getRuleContexts(IntegerContext.class);
		}
		public List<FloatingContext> floating() {
			return getRuleContexts(FloatingContext.class);
		}
		public TerminalNode HEAD() { return getToken(WekaConfigGrammarParser.HEAD, 0); }
		public FloatingContext floating(int i) {
			return getRuleContext(FloatingContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_power);

		       ((PowerContext)_localctx).mPow =  new MyPower(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(225); ((PowerContext)_localctx).i = integer();
				_localctx.mPow.setBase(((PowerContext)_localctx).i.mint);
				}
				break;

			case 2:
				{
				setState(228); ((PowerContext)_localctx).f = floating();
				_localctx.mPow.setBase(((PowerContext)_localctx).f.mfloat);
				}
				break;
			}
			setState(233); match(HEAD);
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(234); ((PowerContext)_localctx).i = integer();
				_localctx.mPow.setExponent(((PowerContext)_localctx).i.mint);
				}
				break;

			case 2:
				{
				setState(237); ((PowerContext)_localctx).f = floating();
				_localctx.mPow.setExponent(((PowerContext)_localctx).f.mfloat);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public MyInteger mint;
		public Token s;
		public Token n;
		public TerminalNode DIGIT() { return getToken(WekaConfigGrammarParser.DIGIT, 0); }
		public TerminalNode MINUS() { return getToken(WekaConfigGrammarParser.MINUS, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_integer);

			((IntegerContext)_localctx).mint =  new MyInteger(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(242); ((IntegerContext)_localctx).s = match(MINUS);
				 _localctx.mint.setSign(); 
				}
			}

			setState(246); ((IntegerContext)_localctx).n = match(DIGIT);
			 _localctx.mint.setNumber((((IntegerContext)_localctx).n!=null?((IntegerContext)_localctx).n.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingContext extends ParserRuleContext {
		public MyFloat mfloat;
		public Token s;
		public Token n;
		public Token m;
		public TerminalNode DIGIT(int i) {
			return getToken(WekaConfigGrammarParser.DIGIT, i);
		}
		public TerminalNode DOT() { return getToken(WekaConfigGrammarParser.DOT, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(WekaConfigGrammarParser.DIGIT); }
		public TerminalNode MINUS() { return getToken(WekaConfigGrammarParser.MINUS, 0); }
		public FloatingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floating; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).enterFloating(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WekaConfigGrammarListener ) ((WekaConfigGrammarListener)listener).exitFloating(this);
		}
	}

	public final FloatingContext floating() throws RecognitionException {
		FloatingContext _localctx = new FloatingContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_floating);

		       ((FloatingContext)_localctx).mfloat =  new MyFloat(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(249); ((FloatingContext)_localctx).s = match(MINUS);
				 _localctx.mfloat.setSign(); 
				}
			}

			setState(253); ((FloatingContext)_localctx).n = match(DIGIT);
			setState(254); match(DOT);
			setState(255); ((FloatingContext)_localctx).m = match(DIGIT);
			 _localctx.mfloat.setNumber((((FloatingContext)_localctx).n!=null?((FloatingContext)_localctx).n.getText():null), (((FloatingContext)_localctx).m!=null?((FloatingContext)_localctx).m.getText():null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u0105\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\3\3\3\3\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\3\3\5\3A\n\3"+
		"\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4R"+
		"\n\4\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\6\5\\\n\5\r\5\16\5]\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\6\7k\n\7\r\7\16\7l\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\6\t}\n\t\r\t\16\t~\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0094\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\7\r\u00a5\n\r\f\r\16\r\u00a8\13\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\5\17\u00b1\n\17\3\17\3\17\3\17\6\17\u00b6\n\17\r"+
		"\17\16\17\u00b7\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\6\20\u00d5\n\20\r\20\16\20\u00d6\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00e2\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00ea\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00f3\n\22\3\23\3"+
		"\23\5\23\u00f7\n\23\3\23\3\23\3\23\3\24\3\24\5\24\u00fe\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&\2\2\u0113\2+\3\2\2\2\4/\3\2\2\2\6Q\3\2\2\2\b[\3\2\2\2\n_\3\2\2\2\f"+
		"f\3\2\2\2\16t\3\2\2\2\20|\3\2\2\2\22\u008c\3\2\2\2\24\u008e\3\2\2\2\26"+
		"\u0095\3\2\2\2\30\u00a6\3\2\2\2\32\u00a9\3\2\2\2\34\u00b0\3\2\2\2\36\u00d4"+
		"\3\2\2\2 \u00e1\3\2\2\2\"\u00e9\3\2\2\2$\u00f6\3\2\2\2&\u00fd\3\2\2\2"+
		"()\5\4\3\2)*\b\2\1\2*,\3\2\2\2+(\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2"+
		".\3\3\2\2\2/\63\7\3\2\2\60\62\7\17\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\5\20\t\2\67"+
		"@\b\3\1\28:\7\17\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2"+
		"=>\5\b\5\2>?\b\3\1\2?A\3\2\2\2@9\3\2\2\2@A\3\2\2\2AE\3\2\2\2BD\7\17\2"+
		"\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\5\6\4"+
		"\2IJ\b\3\1\2J\5\3\2\2\2KL\5\f\7\2LM\b\4\1\2MR\3\2\2\2NO\5\16\b\2OP\b\4"+
		"\1\2PR\3\2\2\2QK\3\2\2\2QN\3\2\2\2R\7\3\2\2\2ST\5\n\6\2TX\b\5\1\2UW\7"+
		"\17\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2["+
		"S\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\t\3\2\2\2_`\5\20\t\2`a\7\n\2"+
		"\2ab\7\13\2\2bc\5\22\n\2cd\7\13\2\2de\b\6\1\2e\13\3\2\2\2fj\7\4\2\2gh"+
		"\5\4\3\2hi\b\7\1\2ik\3\2\2\2jg\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2m"+
		"n\3\2\2\2no\7\3\2\2op\7\5\2\2pq\5\20\t\2qr\b\7\1\2rs\7\4\2\2s\r\3\2\2"+
		"\2tu\7\5\2\2uv\7\4\2\2vw\b\b\1\2w\17\3\2\2\2xy\7\f\2\2y}\b\t\1\2z{\7\r"+
		"\2\2{}\b\t\1\2|x\3\2\2\2|z\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\21\3\2\2\2\u0080\u0081\5\20\t\2\u0081\u0082\b\n\1\2\u0082\u008d\3\2\2"+
		"\2\u0083\u0084\5\24\13\2\u0084\u0085\b\n\1\2\u0085\u008d\3\2\2\2\u0086"+
		"\u0087\5\36\20\2\u0087\u0088\b\n\1\2\u0088\u008d\3\2\2\2\u0089\u008a\5"+
		"\34\17\2\u008a\u008b\b\n\1\2\u008b\u008d\3\2\2\2\u008c\u0080\3\2\2\2\u008c"+
		"\u0083\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0089\3\2\2\2\u008d\23\3\2\2"+
		"\2\u008e\u008f\5 \21\2\u008f\u0093\b\13\1\2\u0090\u0091\5\26\f\2\u0091"+
		"\u0092\b\13\1\2\u0092\u0094\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\25\3\2\2\2\u0095\u0096\7\6\2\2\u0096\u0097\5 \21\2\u0097"+
		"\u009c\b\f\1\2\u0098\u0099\5\30\r\2\u0099\u009a\b\f\1\2\u009a\u009d\3"+
		"\2\2\2\u009b\u009d\5\32\16\2\u009c\u0098\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\b\f\1\2\u009f\27\3\2\2\2\u00a0\u00a1\7\6\2"+
		"\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\b\r\1\2\u00a3\u00a5\3\2\2\2\u00a4\u00a0"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\31\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\7\t\2"+
		"\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\b\16\1\2\u00ad\33\3\2\2\2\u00ae\u00af"+
		"\7\5\2\2\u00af\u00b1\b\17\1\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b5\3\2\2\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4\7\5\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\17\1\2\u00ba\u00bb\5"+
		"\36\20\2\u00bb\u00bc\b\17\1\2\u00bc\u00bd\7\t\2\2\u00bd\u00be\5\36\20"+
		"\2\u00be\u00bf\b\17\1\2\u00bf\35\3\2\2\2\u00c0\u00c1\7\t\2\2\u00c1\u00d5"+
		"\b\20\1\2\u00c2\u00c3\7\6\2\2\u00c3\u00d5\b\20\1\2\u00c4\u00c5\7\17\2"+
		"\2\u00c5\u00d5\b\20\1\2\u00c6\u00c7\7\7\2\2\u00c7\u00d5\b\20\1\2\u00c8"+
		"\u00c9\7\b\2\2\u00c9\u00d5\b\20\1\2\u00ca\u00cb\7\20\2\2\u00cb\u00cc\7"+
		"\20\2\2\u00cc\u00d5\b\20\1\2\u00cd\u00ce\7\20\2\2\u00ce\u00cf\7\13\2\2"+
		"\u00cf\u00d5\b\20\1\2\u00d0\u00d1\7\f\2\2\u00d1\u00d5\b\20\1\2\u00d2\u00d3"+
		"\7\r\2\2\u00d3\u00d5\b\20\1\2\u00d4\u00c0\3\2\2\2\u00d4\u00c2\3\2\2\2"+
		"\u00d4\u00c4\3\2\2\2\u00d4\u00c6\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4\u00ca"+
		"\3\2\2\2\u00d4\u00cd\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\37\3\2\2"+
		"\2\u00d8\u00d9\5$\23\2\u00d9\u00da\b\21\1\2\u00da\u00e2\3\2\2\2\u00db"+
		"\u00dc\5&\24\2\u00dc\u00dd\b\21\1\2\u00dd\u00e2\3\2\2\2\u00de\u00df\5"+
		"\"\22\2\u00df\u00e0\b\21\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1"+
		"\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2!\3\2\2\2\u00e3\u00e4\5$\23\2"+
		"\u00e4\u00e5\b\22\1\2\u00e5\u00ea\3\2\2\2\u00e6\u00e7\5&\24\2\u00e7\u00e8"+
		"\b\22\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb\u00f2\7\21\2\2\u00ec\u00ed\5$\23\2\u00ed\u00ee"+
		"\b\22\1\2\u00ee\u00f3\3\2\2\2\u00ef\u00f0\5&\24\2\u00f0\u00f1\b\22\1\2"+
		"\u00f1\u00f3\3\2\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3#\3"+
		"\2\2\2\u00f4\u00f5\7\b\2\2\u00f5\u00f7\b\23\1\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\7\2\2\u00f9\u00fa\b\23"+
		"\1\2\u00fa%\3\2\2\2\u00fb\u00fc\7\b\2\2\u00fc\u00fe\b\24\1\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\7\2\2\u0100"+
		"\u0101\7\t\2\2\u0101\u0102\7\7\2\2\u0102\u0103\b\24\1\2\u0103\'\3\2\2"+
		"\2\32-\63;@EQX]l|~\u008c\u0093\u009c\u00a6\u00b0\u00b7\u00d4\u00d6\u00e1"+
		"\u00e9\u00f2\u00f6\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}