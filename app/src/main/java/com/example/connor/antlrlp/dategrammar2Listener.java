// Generated from C:/Users/Connor/Documents/GitHub/NavigationTesting/app/src/main/java/com/example/connor/navigationtesting\dategrammar2.g4 by ANTLR 4.7
package com.example.connor.antlrlp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dategrammar2Parser}.
 */
public interface dategrammar2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dategrammar2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(dategrammar2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link dategrammar2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(dategrammar2Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link dategrammar2Parser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(dategrammar2Parser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dategrammar2Parser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(dategrammar2Parser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link dategrammar2Parser#dshortcut}.
	 * @param ctx the parse tree
	 */
	void enterDshortcut(dategrammar2Parser.DshortcutContext ctx);
	/**
	 * Exit a parse tree produced by {@link dategrammar2Parser#dshortcut}.
	 * @param ctx the parse tree
	 */
	void exitDshortcut(dategrammar2Parser.DshortcutContext ctx);
	/**
	 * Enter a parse tree produced by {@link dategrammar2Parser#mshortcut}.
	 * @param ctx the parse tree
	 */
	void enterMshortcut(dategrammar2Parser.MshortcutContext ctx);
	/**
	 * Exit a parse tree produced by {@link dategrammar2Parser#mshortcut}.
	 * @param ctx the parse tree
	 */
	void exitMshortcut(dategrammar2Parser.MshortcutContext ctx);
	/**
	 * Enter a parse tree produced by {@link dategrammar2Parser#yshortcut}.
	 * @param ctx the parse tree
	 */
	void enterYshortcut(dategrammar2Parser.YshortcutContext ctx);
	/**
	 * Exit a parse tree produced by {@link dategrammar2Parser#yshortcut}.
	 * @param ctx the parse tree
	 */
	void exitYshortcut(dategrammar2Parser.YshortcutContext ctx);
	/**
	 * Enter a parse tree produced by {@link dategrammar2Parser#ddate}.
	 * @param ctx the parse tree
	 */
	void enterDdate(dategrammar2Parser.DdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dategrammar2Parser#ddate}.
	 * @param ctx the parse tree
	 */
	void exitDdate(dategrammar2Parser.DdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link dategrammar2Parser#mdate}.
	 * @param ctx the parse tree
	 */
	void enterMdate(dategrammar2Parser.MdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dategrammar2Parser#mdate}.
	 * @param ctx the parse tree
	 */
	void exitMdate(dategrammar2Parser.MdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link dategrammar2Parser#ydate}.
	 * @param ctx the parse tree
	 */
	void enterYdate(dategrammar2Parser.YdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link dategrammar2Parser#ydate}.
	 * @param ctx the parse tree
	 */
	void exitYdate(dategrammar2Parser.YdateContext ctx);
}