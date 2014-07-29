// Generated from src/wekaConfigFileParser/WekaConfigGrammar.g4 by ANTLR 4.2.2

    package wekaConfigFileParser;
    import java.util.List;
    import java.util.ArrayList;
    import org.antlr.v4.runtime.Parser;
    import wekaConfigFileInterpretation.*;
 
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WekaConfigGrammarParser}.
 */
public interface WekaConfigGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull WekaConfigGrammarParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull WekaConfigGrammarParser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#shortend}.
	 * @param ctx the parse tree
	 */
	void enterShortend(@NotNull WekaConfigGrammarParser.ShortendContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#shortend}.
	 * @param ctx the parse tree
	 */
	void exitShortend(@NotNull WekaConfigGrammarParser.ShortendContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(@NotNull WekaConfigGrammarParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(@NotNull WekaConfigGrammarParser.NumericContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull WekaConfigGrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull WekaConfigGrammarParser.IntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(@NotNull WekaConfigGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(@NotNull WekaConfigGrammarParser.NumberContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalue(@NotNull WekaConfigGrammarParser.KeyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalue(@NotNull WekaConfigGrammarParser.KeyvalueContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#configfile}.
	 * @param ctx the parse tree
	 */
	void enterConfigfile(@NotNull WekaConfigGrammarParser.ConfigfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#configfile}.
	 * @param ctx the parse tree
	 */
	void exitConfigfile(@NotNull WekaConfigGrammarParser.ConfigfileContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#longend}.
	 * @param ctx the parse tree
	 */
	void enterLongend(@NotNull WekaConfigGrammarParser.LongendContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#longend}.
	 * @param ctx the parse tree
	 */
	void exitLongend(@NotNull WekaConfigGrammarParser.LongendContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void enterAttributelist(@NotNull WekaConfigGrammarParser.AttributelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void exitAttributelist(@NotNull WekaConfigGrammarParser.AttributelistContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#elementend}.
	 * @param ctx the parse tree
	 */
	void enterElementend(@NotNull WekaConfigGrammarParser.ElementendContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#elementend}.
	 * @param ctx the parse tree
	 */
	void exitElementend(@NotNull WekaConfigGrammarParser.ElementendContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull WekaConfigGrammarParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull WekaConfigGrammarParser.SequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(@NotNull WekaConfigGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(@NotNull WekaConfigGrammarParser.StringContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#floating}.
	 * @param ctx the parse tree
	 */
	void enterFloating(@NotNull WekaConfigGrammarParser.FloatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#floating}.
	 * @param ctx the parse tree
	 */
	void exitFloating(@NotNull WekaConfigGrammarParser.FloatingContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull WekaConfigGrammarParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull WekaConfigGrammarParser.PathContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull WekaConfigGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull WekaConfigGrammarParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull WekaConfigGrammarParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull WekaConfigGrammarParser.PowerContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#mixed}.
	 * @param ctx the parse tree
	 */
	void enterMixed(@NotNull WekaConfigGrammarParser.MixedContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#mixed}.
	 * @param ctx the parse tree
	 */
	void exitMixed(@NotNull WekaConfigGrammarParser.MixedContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#implizit}.
	 * @param ctx the parse tree
	 */
	void enterImplizit(@NotNull WekaConfigGrammarParser.ImplizitContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#implizit}.
	 * @param ctx the parse tree
	 */
	void exitImplizit(@NotNull WekaConfigGrammarParser.ImplizitContext ctx);

	/**
	 * Enter a parse tree produced by {@link WekaConfigGrammarParser#explizit}.
	 * @param ctx the parse tree
	 */
	void enterExplizit(@NotNull WekaConfigGrammarParser.ExplizitContext ctx);
	/**
	 * Exit a parse tree produced by {@link WekaConfigGrammarParser#explizit}.
	 * @param ctx the parse tree
	 */
	void exitExplizit(@NotNull WekaConfigGrammarParser.ExplizitContext ctx);
}