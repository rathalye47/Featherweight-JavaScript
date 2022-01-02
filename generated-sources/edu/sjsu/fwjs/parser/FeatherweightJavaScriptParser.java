// Generated from FeatherweightJavaScript.g4 by ANTLR 4.9.2
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FeatherweightJavaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IF=6, ELSE=7, WHILE=8, FUNCTION=9, 
		VAR=10, PRINT=11, INT=12, BOOL=13, NULL=14, ID=15, MUL=16, DIV=17, SEPARATOR=18, 
		ADD=19, SUB=20, MOD=21, GT=22, LT=23, GE=24, LE=25, EQ=26, ASSIGN=27, 
		NEWLINE=28, BLOCK_COMMENT=29, LINE_COMMENT=30, WS=31;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_block = 3, RULE_params = 4, 
		RULE_args = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "block", "params", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "'if'", "'else'", "'while'", 
			"'function'", "'var'", "'print'", null, null, "'null'", null, "'*'", 
			"'/'", "';'", "'+'", "'-'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "IF", "ELSE", "WHILE", "FUNCTION", 
			"VAR", "PRINT", "INT", "BOOL", "NULL", "ID", "MUL", "DIV", "SEPARATOR", 
			"ADD", "SUB", "MOD", "GT", "LT", "GE", "LE", "EQ", "ASSIGN", "NEWLINE", 
			"BLOCK_COMMENT", "LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "FeatherweightJavaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FeatherweightJavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << WHILE) | (1L << FUNCTION) | (1L << VAR) | (1L << PRINT) | (1L << INT) | (1L << BOOL) | (1L << NULL) | (1L << ID) | (1L << SEPARATOR))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(FeatherweightJavaScriptParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenElseContext extends StatContext {
		public TerminalNode IF() { return getToken(FeatherweightJavaScriptParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FeatherweightJavaScriptParser.ELSE, 0); }
		public IfThenElseContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenContext extends StatContext {
		public TerminalNode IF() { return getToken(FeatherweightJavaScriptParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfThenContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterIfThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitIfThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitIfThen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatContext {
		public TerminalNode WHILE() { return getToken(FeatherweightJavaScriptParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BareExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public BareExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterBareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitBareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitBareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyContext extends StatContext {
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public EmptyContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				expr(0);
				setState(18);
				match(SEPARATOR);
				}
				break;
			case 2:
				_localctx = new IfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(IF);
				setState(21);
				match(T__0);
				setState(22);
				expr(0);
				setState(23);
				match(T__1);
				setState(24);
				block();
				setState(25);
				match(ELSE);
				setState(26);
				block();
				}
				break;
			case 3:
				_localctx = new IfThenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(IF);
				setState(29);
				match(T__0);
				setState(30);
				expr(0);
				setState(31);
				match(T__1);
				setState(32);
				block();
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				match(WHILE);
				setState(35);
				match(T__0);
				setState(36);
				expr(0);
				setState(37);
				match(T__1);
				setState(38);
				block();
				}
				break;
			case 5:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(PRINT);
				setState(41);
				match(T__0);
				setState(42);
				expr(0);
				setState(43);
				match(T__1);
				setState(44);
				match(SEPARATOR);
				}
				break;
			case 6:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				match(SEPARATOR);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarRefContext extends ExprContext {
		public TerminalNode ID() { return getToken(FeatherweightJavaScriptParser.ID, 0); }
		public VarRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(FeatherweightJavaScriptParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(FeatherweightJavaScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FeatherweightJavaScriptParser.MOD, 0); }
		public MulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(FeatherweightJavaScriptParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends ExprContext {
		public TerminalNode NULL() { return getToken(FeatherweightJavaScriptParser.NULL, 0); }
		public NullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(FeatherweightJavaScriptParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(FeatherweightJavaScriptParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDecContext extends ExprContext {
		public TerminalNode VAR() { return getToken(FeatherweightJavaScriptParser.VAR, 0); }
		public TerminalNode ID() { return getToken(FeatherweightJavaScriptParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FeatherweightJavaScriptParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDecContext extends ExprContext {
		public TerminalNode FUNCTION() { return getToken(FeatherweightJavaScriptParser.FUNCTION, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterFuncDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitFuncDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitFuncDec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends ExprContext {
		public TerminalNode ID() { return getToken(FeatherweightJavaScriptParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FeatherweightJavaScriptParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(FeatherweightJavaScriptParser.LT, 0); }
		public TerminalNode LE() { return getToken(FeatherweightJavaScriptParser.LE, 0); }
		public TerminalNode GT() { return getToken(FeatherweightJavaScriptParser.GT, 0); }
		public TerminalNode GE() { return getToken(FeatherweightJavaScriptParser.GE, 0); }
		public TerminalNode EQ() { return getToken(FeatherweightJavaScriptParser.EQ, 0); }
		public CompareContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncAppContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncAppContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterFuncApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitFuncApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitFuncApp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(FeatherweightJavaScriptParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new FuncDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(50);
				match(FUNCTION);
				setState(51);
				match(T__0);
				setState(52);
				params();
				setState(53);
				match(T__1);
				setState(54);
				block();
				}
				break;
			case 2:
				{
				_localctx = new VarDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(VAR);
				setState(57);
				match(ID);
				setState(58);
				match(ASSIGN);
				setState(59);
				expr(7);
				}
				break;
			case 3:
				{
				_localctx = new VarRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new AssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(ID);
				setState(62);
				match(ASSIGN);
				setState(63);
				expr(5);
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(INT);
				}
				break;
			case 6:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(NULL);
				}
				break;
			case 8:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(T__0);
				setState(68);
				expr(0);
				setState(69);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(74);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(75);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(77);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(80);
						((CompareContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GE) | (1L << LE) | (1L << EQ))) != 0)) ) {
							((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new FuncAppContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(83);
						match(T__0);
						setState(84);
						args();
						setState(85);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FullBlockContext extends BlockContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FullBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterFullBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitFullBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitFullBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpBlockContext extends BlockContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public SimpBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterSimpBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitSimpBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitSimpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new FullBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__2);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << WHILE) | (1L << FUNCTION) | (1L << VAR) | (1L << PRINT) | (1L << INT) | (1L << BOOL) | (1L << NULL) | (1L << ID) | (1L << SEPARATOR))) != 0)) {
					{
					{
					setState(93);
					stat();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(T__3);
				}
				break;
			case T__0:
			case IF:
			case WHILE:
			case FUNCTION:
			case VAR:
			case PRINT:
			case INT:
			case BOOL:
			case NULL:
			case ID:
			case SEPARATOR:
				_localctx = new SimpBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FeatherweightJavaScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FeatherweightJavaScriptParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(103);
				match(ID);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(104);
					match(T__4);
					setState(105);
					match(ID);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FeatherweightJavaScriptListener ) ((FeatherweightJavaScriptListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << FUNCTION) | (1L << VAR) | (1L << INT) | (1L << BOOL) | (1L << NULL) | (1L << ID))) != 0)) {
				{
				setState(113);
				expr(0);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(114);
					match(T__4);
					setState(115);
					expr(0);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!~\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"Z\n\4\f\4\16\4]\13\4\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\5\3\5\5\5h\n\5"+
		"\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\5\6r\n\6\3\7\3\7\3\7\7\7w\n\7\f\7"+
		"\16\7z\13\7\5\7|\n\7\3\7\2\3\6\b\2\4\6\b\n\f\2\5\4\2\22\23\27\27\3\2\25"+
		"\26\3\2\30\34\2\u008e\2\17\3\2\2\2\4\61\3\2\2\2\6I\3\2\2\2\bg\3\2\2\2"+
		"\nq\3\2\2\2\f{\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17"+
		"\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\5\6\4\2\24\25\7\24\2\2\25\62"+
		"\3\2\2\2\26\27\7\b\2\2\27\30\7\3\2\2\30\31\5\6\4\2\31\32\7\4\2\2\32\33"+
		"\5\b\5\2\33\34\7\t\2\2\34\35\5\b\5\2\35\62\3\2\2\2\36\37\7\b\2\2\37 \7"+
		"\3\2\2 !\5\6\4\2!\"\7\4\2\2\"#\5\b\5\2#\62\3\2\2\2$%\7\n\2\2%&\7\3\2\2"+
		"&\'\5\6\4\2\'(\7\4\2\2()\5\b\5\2)\62\3\2\2\2*+\7\r\2\2+,\7\3\2\2,-\5\6"+
		"\4\2-.\7\4\2\2./\7\24\2\2/\62\3\2\2\2\60\62\7\24\2\2\61\23\3\2\2\2\61"+
		"\26\3\2\2\2\61\36\3\2\2\2\61$\3\2\2\2\61*\3\2\2\2\61\60\3\2\2\2\62\5\3"+
		"\2\2\2\63\64\b\4\1\2\64\65\7\13\2\2\65\66\7\3\2\2\66\67\5\n\6\2\678\7"+
		"\4\2\289\5\b\5\29J\3\2\2\2:;\7\f\2\2;<\7\21\2\2<=\7\35\2\2=J\5\6\4\t>"+
		"J\7\21\2\2?@\7\21\2\2@A\7\35\2\2AJ\5\6\4\7BJ\7\16\2\2CJ\7\17\2\2DJ\7\20"+
		"\2\2EF\7\3\2\2FG\5\6\4\2GH\7\4\2\2HJ\3\2\2\2I\63\3\2\2\2I:\3\2\2\2I>\3"+
		"\2\2\2I?\3\2\2\2IB\3\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2J[\3\2\2\2KL\f"+
		"\16\2\2LM\t\2\2\2MZ\5\6\4\17NO\f\r\2\2OP\t\3\2\2PZ\5\6\4\16QR\f\f\2\2"+
		"RS\t\4\2\2SZ\5\6\4\rTU\f\n\2\2UV\7\3\2\2VW\5\f\7\2WX\7\4\2\2XZ\3\2\2\2"+
		"YK\3\2\2\2YN\3\2\2\2YQ\3\2\2\2YT\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\\7\3\2\2\2][\3\2\2\2^b\7\5\2\2_a\5\4\3\2`_\3\2\2\2ad\3\2\2\2b`\3\2"+
		"\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2eh\7\6\2\2fh\5\4\3\2g^\3\2\2\2gf\3\2"+
		"\2\2h\t\3\2\2\2in\7\21\2\2jk\7\7\2\2km\7\21\2\2lj\3\2\2\2mp\3\2\2\2nl"+
		"\3\2\2\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qi\3\2\2\2qr\3\2\2\2r\13\3\2\2\2"+
		"sx\5\6\4\2tu\7\7\2\2uw\5\6\4\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2"+
		"y|\3\2\2\2zx\3\2\2\2{s\3\2\2\2{|\3\2\2\2|\r\3\2\2\2\r\21\61IY[bgnqx{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}