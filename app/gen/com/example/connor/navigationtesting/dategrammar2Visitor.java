// Generated from C:/Users/Connor/Documents/GitHub/NavigationTesting/app/src/main/java/com/example/connor/navigationtesting\dategrammar2.g4 by ANTLR 4.7
package com.example.connor.navigationtesting;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link dategrammar2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface dategrammar2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link dategrammar2Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(dategrammar2Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link dategrammar2Parser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(dategrammar2Parser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dategrammar2Parser#dshortcut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDshortcut(dategrammar2Parser.DshortcutContext ctx);
	/**
	 * Visit a parse tree produced by {@link dategrammar2Parser#mshortcut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMshortcut(dategrammar2Parser.MshortcutContext ctx);
	/**
	 * Visit a parse tree produced by {@link dategrammar2Parser#yshortcut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYshortcut(dategrammar2Parser.YshortcutContext ctx);
	/**
	 * Visit a parse tree produced by {@link dategrammar2Parser#ddate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdate(dategrammar2Parser.DdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dategrammar2Parser#mdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMdate(dategrammar2Parser.MdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link dategrammar2Parser#ydate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYdate(dategrammar2Parser.YdateContext ctx);
}