// Generated from C:/Users/Connor/Documents/GitHub/NavigationTesting/app/src/main/java/com/example/connor/navigationtesting\dategrammar2.g4 by ANTLR 4.7
package com.example.connor.navigationtesting;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dategrammar2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, DIGIT=9, 
		NEWLINE=10;
	public static final int
		RULE_start = 0, RULE_date = 1, RULE_dshortcut = 2, RULE_mshortcut = 3, 
		RULE_yshortcut = 4, RULE_ddate = 5, RULE_mdate = 6, RULE_ydate = 7;
	public static final String[] ruleNames = {
		"start", "date", "dshortcut", "mshortcut", "yshortcut", "ddate", "mdate", 
		"ydate"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'1'", "'0'", "'d'", "'D'", "'m'", "'M'", "'y'", "'Y'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "DIGIT", "NEWLINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "dategrammar2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dategrammar2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(dategrammar2Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(dategrammar2Parser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dategrammar2Visitor ) return ((dategrammar2Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(16);
				date();
				setState(17);
				match(NEWLINE);
				}
				}
				setState(23);
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

	public static class DateContext extends ParserRuleContext {
		public DdateContext ddate() {
			return getRuleContext(DdateContext.class,0);
		}
		public DshortcutContext dshortcut() {
			return getRuleContext(DshortcutContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dategrammar2Visitor ) return ((dategrammar2Visitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_date);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				ddate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				dshortcut();
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

	public static class DshortcutContext extends ParserRuleContext {
		public MshortcutContext mshortcut() {
			return getRuleContext(MshortcutContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(dategrammar2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(dategrammar2Parser.DIGIT, i);
		}
		public DshortcutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dshortcut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).enterDshortcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).exitDshortcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dategrammar2Visitor ) return ((dategrammar2Visitor<? extends T>)visitor).visitDshortcut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DshortcutContext dshortcut() throws RecognitionException {
		DshortcutContext _localctx = new DshortcutContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dshortcut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(28);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << DIGIT))) != 0)) {
				{
				setState(35);
				mshortcut();
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
			exitRule();
		}
		return _localctx;
	}

	public static class MshortcutContext extends ParserRuleContext {
		public YshortcutContext yshortcut() {
			return getRuleContext(YshortcutContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(dategrammar2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(dategrammar2Parser.DIGIT, i);
		}
		public MshortcutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mshortcut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).enterMshortcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).exitMshortcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dategrammar2Visitor ) return ((dategrammar2Visitor<? extends T>)visitor).visitMshortcut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MshortcutContext mshortcut() throws RecognitionException {
		MshortcutContext _localctx = new MshortcutContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mshortcut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(38);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__7) | (1L << DIGIT))) != 0)) {
				{
				setState(45);
				yshortcut();
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
			exitRule();
		}
		return _localctx;
	}

	public static class YshortcutContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(dategrammar2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(dategrammar2Parser.DIGIT, i);
		}
		public YshortcutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yshortcut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).enterYshortcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).exitYshortcut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dategrammar2Visitor ) return ((dategrammar2Visitor<? extends T>)visitor).visitYshortcut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YshortcutContext yshortcut() throws RecognitionException {
		YshortcutContext _localctx = new YshortcutContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_yshortcut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(48);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DdateContext extends ParserRuleContext {
		public MdateContext mdate() {
			return getRuleContext(MdateContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(dategrammar2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(dategrammar2Parser.DIGIT, i);
		}
		public DdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).enterDdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).exitDdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dategrammar2Visitor ) return ((dategrammar2Visitor<? extends T>)visitor).visitDdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DdateContext ddate() throws RecognitionException {
		DdateContext _localctx = new DdateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ddate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(58);
			mdate();
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

	public static class MdateContext extends ParserRuleContext {
		public YdateContext ydate() {
			return getRuleContext(YdateContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(dategrammar2Parser.DIGIT, 0); }
		public MdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).enterMdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).exitMdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dategrammar2Visitor ) return ((dategrammar2Visitor<? extends T>)visitor).visitMdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MdateContext mdate() throws RecognitionException {
		MdateContext _localctx = new MdateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mdate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(62);
			ydate();
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

	public static class YdateContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(dategrammar2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(dategrammar2Parser.DIGIT, i);
		}
		public YdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ydate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).enterYdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dategrammar2Listener ) ((dategrammar2Listener)listener).exitYdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dategrammar2Visitor ) return ((dategrammar2Visitor<? extends T>)visitor).visitYdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YdateContext ydate() throws RecognitionException {
		YdateContext _localctx = new YdateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ydate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << DIGIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fH\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\5\3\35\n\3\3\4\7\4 \n\4\f\4\16\4#\13\4\3"+
		"\4\3\4\5\4\'\n\4\3\5\7\5*\n\5\f\5\16\5-\13\5\3\5\3\5\5\5\61\n\5\3\6\7"+
		"\6\64\n\6\f\6\16\6\67\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\7\4\2\3\4\13\13\3\2\5\6"+
		"\3\2\7\b\3\2\t\n\3\2\3\4\2F\2\27\3\2\2\2\4\34\3\2\2\2\6!\3\2\2\2\b+\3"+
		"\2\2\2\n\65\3\2\2\2\f:\3\2\2\2\16>\3\2\2\2\20B\3\2\2\2\22\23\5\4\3\2\23"+
		"\24\7\f\2\2\24\26\3\2\2\2\25\22\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32\35\5\f\7\2\33\35\5\6\4\2\34"+
		"\32\3\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36 \t\2\2\2\37\36\3\2\2\2 #\3\2"+
		"\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$&\t\3\2\2%\'\5\b\5\2"+
		"&%\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(*\t\2\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2"+
		"\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2.\60\t\4\2\2/\61\5\n\6\2\60/\3\2\2\2"+
		"\60\61\3\2\2\2\61\t\3\2\2\2\62\64\t\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2"+
		"\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\t\5\2\29\13\3"+
		"\2\2\2:;\t\2\2\2;<\t\2\2\2<=\5\16\b\2=\r\3\2\2\2>?\t\6\2\2?@\t\2\2\2@"+
		"A\5\20\t\2A\17\3\2\2\2BC\t\2\2\2CD\t\2\2\2DE\t\2\2\2EF\t\2\2\2F\21\3\2"+
		"\2\2\t\27\34!&+\60\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}