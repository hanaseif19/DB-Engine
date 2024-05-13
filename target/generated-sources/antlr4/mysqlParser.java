// Generated from mysql.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mysqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, CREATE=3, SELECT=4, FROM=5, TABLE=6, INSERT=7, INTO=8, 
		VALUES=9, UPDATE=10, SET=11, WHERE=12, DELETE=13, PRIMARY_KEY=14, INDEX=15, 
		ON=16, INT_TYPE=17, FLOAT_TYPE=18, STRING_TYPE=19, DOUBLE_TYPE=20, VARCHAR_TYPE=21, 
		DECIMAL_TYPE=22, COMMA=23, ASTERISK=24, LEFT_PARENTHESIS=25, RIGHT_PARENTHESIS=26, 
		EQUALS=27, NOT=28, MINUS=29, PLUS=30, GT=31, GE=32, LT=33, LE=34, NE=35, 
		AND=36, OR=37, XOR=38, QUOTED_STRING=39, INTEGER_VALUE=40, DECIMAL_VALUE=41, 
		IDENTIFIER=42, WS=43;
	public static final String[] tokenNames = {
		"<INVALID>", "' '", "';'", "CREATE", "SELECT", "FROM", "TABLE", "INSERT", 
		"INTO", "VALUES", "UPDATE", "SET", "WHERE", "DELETE", "PRIMARY_KEY", "INDEX", 
		"ON", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "DOUBLE_TYPE", "VARCHAR_TYPE", 
		"DECIMAL_TYPE", "','", "'*'", "'('", "')'", "'='", "'!'", "'-'", "'+'", 
		"'>'", "'>='", "'<'", "'<='", "'!='", "AND", "OR", "XOR", "QUOTED_STRING", 
		"INTEGER_VALUE", "DECIMAL_VALUE", "IDENTIFIER", "WS"
	};
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_create_table = 2, RULE_create_index = 3, 
		RULE_update = 4, RULE_insert = 5, RULE_delete = 6, RULE_select = 7, RULE_create_table_column = 8, 
		RULE_clustering_key = 9, RULE_clustering_key_value = 10, RULE_columnName = 11, 
		RULE_columnType = 12, RULE_type = 13, RULE_operation = 14, RULE_operator = 15, 
		RULE_table_name = 16, RULE_constant = 17;
	public static final String[] ruleNames = {
		"start", "statement", "create_table", "create_index", "update", "insert", 
		"delete", "select", "create_table_column", "clustering_key", "clustering_key_value", 
		"columnName", "columnType", "type", "operation", "operator", "table_name", 
		"constant"
	};

	@Override
	public String getGrammarFileName() { return "mysql.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mysqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mysqlParser.EOF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); statement();
			setState(38);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(37); match(T__0);
				}
			}

			setState(40); match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43); create_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); update();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45); insert();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46); delete();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47); select();
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

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode RIGHT_PARENTHESIS(int i) {
			return getToken(mysqlParser.RIGHT_PARENTHESIS, i);
		}
		public TerminalNode LEFT_PARENTHESIS(int i) {
			return getToken(mysqlParser.LEFT_PARENTHESIS, i);
		}
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlParser.COMMA, i);
		}
		public TerminalNode PRIMARY_KEY() { return getToken(mysqlParser.PRIMARY_KEY, 0); }
		public List<Create_table_columnContext> create_table_column() {
			return getRuleContexts(Create_table_columnContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlParser.COMMA); }
		public Clustering_keyContext clustering_key() {
			return getRuleContext(Clustering_keyContext.class,0);
		}
		public Create_table_columnContext create_table_column(int i) {
			return getRuleContext(Create_table_columnContext.class,i);
		}
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public List<TerminalNode> LEFT_PARENTHESIS() { return getTokens(mysqlParser.LEFT_PARENTHESIS); }
		public List<TerminalNode> RIGHT_PARENTHESIS() { return getTokens(mysqlParser.RIGHT_PARENTHESIS); }
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_table(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(CREATE);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(51); match(T__1);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(TABLE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(58); match(T__1);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64); table_name();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(65); match(T__1);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); match(LEFT_PARENTHESIS);
			{
			setState(72); match(T__1);
			}
			setState(73); create_table_column();
			{
			setState(74); match(T__1);
			}
			{
			{
			setState(75); match(T__1);
			}
			setState(76); match(COMMA);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(77); match(T__1);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); create_table_column();
			}
			{
			setState(85); match(T__1);
			}
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(86); match(T__1);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92); match(COMMA);
				setState(93); match(PRIMARY_KEY);
				setState(94); match(LEFT_PARENTHESIS);
				setState(95); clustering_key();
				setState(96); match(RIGHT_PARENTHESIS);
				}
				break;
			}
			{
			setState(100); match(T__1);
			}
			setState(101); match(RIGHT_PARENTHESIS);
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

	public static class Create_indexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(mysqlParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(mysqlParser.COMMA, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public TerminalNode LEFT_PARENTHESIS() { return getToken(mysqlParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(mysqlParser.IDENTIFIER, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(mysqlParser.RIGHT_PARENTHESIS, 0); }
		public Create_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_index(this);
		}
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(103); match(T__1);
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(CREATE);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(110); match(T__1);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116); match(INDEX);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(117); match(T__1);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); match(IDENTIFIER);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(124); match(T__1);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130); match(ON);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(131); match(T__1);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137); table_name();
			{
			setState(138); match(T__1);
			}
			setState(139); match(LEFT_PARENTHESIS);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(140); match(T__1);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146); columnName();
			{
			setState(147); match(T__1);
			}
			{
			{
			setState(148); match(T__1);
			}
			setState(149); match(COMMA);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(150); match(T__1);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156); columnName();
			}
			setState(158); match(RIGHT_PARENTHESIS);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(159); match(T__1);
				}
				}
				setState(164);
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

	public static class UpdateContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public Clustering_key_valueContext clustering_key_value() {
			return getRuleContext(Clustering_key_valueContext.class,0);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(mysqlParser.EQUALS); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode UPDATE() { return getToken(mysqlParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Clustering_keyContext clustering_key() {
			return getRuleContext(Clustering_keyContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(mysqlParser.COMMA, 0); }
		public TerminalNode EQUALS(int i) {
			return getToken(mysqlParser.EQUALS, i);
		}
		public TerminalNode WHERE() { return getToken(mysqlParser.WHERE, 0); }
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitUpdate(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_update);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(165); match(T__1);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171); match(UPDATE);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(172); match(T__1);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178); table_name();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(179); match(T__1);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185); match(SET);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(186); match(T__1);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192); columnName();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(193); match(T__1);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199); match(EQUALS);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(200); match(T__1);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206); constant();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207); match(T__1);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(213); match(T__1);
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219); match(COMMA);
			{
			setState(220); match(T__1);
			}
			setState(221); columnName();
			{
			setState(222); match(T__1);
			}
			setState(223); match(EQUALS);
			{
			setState(224); match(T__1);
			}
			setState(225); constant();
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(227); match(T__1);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233); match(WHERE);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(234); match(T__1);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240); clustering_key();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(241); match(T__1);
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247); match(EQUALS);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(248); match(T__1);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254); clustering_key_value();
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode RIGHT_PARENTHESIS(int i) {
			return getToken(mysqlParser.RIGHT_PARENTHESIS, i);
		}
		public TerminalNode VALUES() { return getToken(mysqlParser.VALUES, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode LEFT_PARENTHESIS(int i) {
			return getToken(mysqlParser.LEFT_PARENTHESIS, i);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(mysqlParser.COMMA, i);
		}
		public TerminalNode INTO() { return getToken(mysqlParser.INTO, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlParser.COMMA); }
		public List<TerminalNode> LEFT_PARENTHESIS() { return getTokens(mysqlParser.LEFT_PARENTHESIS); }
		public TerminalNode INSERT() { return getToken(mysqlParser.INSERT, 0); }
		public List<TerminalNode> RIGHT_PARENTHESIS() { return getTokens(mysqlParser.RIGHT_PARENTHESIS); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitInsert(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_insert);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(256); match(T__1);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262); match(INSERT);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(263); match(T__1);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(269); match(INTO);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(270); match(T__1);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276); table_name();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(277); match(T__1);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283); match(LEFT_PARENTHESIS);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(284); match(T__1);
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290); columnName();
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(291); match(T__1);
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(297); match(T__1);
						}
						}
						setState(302);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(303); match(COMMA);
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(304); match(T__1);
						}
						}
						setState(309);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(310); columnName();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(316); match(T__1);
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(322); match(RIGHT_PARENTHESIS);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(323); match(T__1);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329); match(VALUES);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(330); match(T__1);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336); match(LEFT_PARENTHESIS);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(337); match(T__1);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343); constant();
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(344); match(T__1);
					}
					setState(345); match(COMMA);
					{
					setState(346); match(T__1);
					}
					setState(347); constant();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(353); match(T__1);
				}
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(359); match(RIGHT_PARENTHESIS);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(360); match(T__1);
				}
				}
				setState(365);
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

	public static class DeleteContext extends ParserRuleContext {
		public List<TerminalNode> EQUALS() { return getTokens(mysqlParser.EQUALS); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public TerminalNode DELETE() { return getToken(mysqlParser.DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(mysqlParser.WHERE, 0); }
		public TerminalNode EQUALS(int i) {
			return getToken(mysqlParser.EQUALS, i);
		}
		public TerminalNode AND() { return getToken(mysqlParser.AND, 0); }
		public TerminalNode FROM() { return getToken(mysqlParser.FROM, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_delete);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(366); match(T__1);
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372); match(DELETE);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(373); match(T__1);
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379); match(FROM);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(380); match(T__1);
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386); table_name();
			setState(390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(387); match(T__1);
					}
					} 
				}
				setState(392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(434);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(393); match(WHERE);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(394); match(T__1);
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(400); columnName();
				setState(404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(401); match(T__1);
					}
					}
					setState(406);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(407); match(EQUALS);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(408); match(T__1);
					}
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(414); constant();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(415); match(T__1);
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(421); match(AND);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(422); match(T__1);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428); columnName();
				{
				setState(429); match(T__1);
				}
				setState(430); match(EQUALS);
				{
				setState(431); match(T__1);
				}
				setState(432); constant();
				}
				}
			}

			{
			setState(436); match(T__1);
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

	public static class SelectContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(mysqlParser.WHERE, 0); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode FROM() { return getToken(mysqlParser.FROM, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode SELECT() { return getToken(mysqlParser.SELECT, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(mysqlParser.ASTERISK, 0); }
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_select);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(438); match(T__1);
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444); match(SELECT);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(445); match(T__1);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451); match(ASTERISK);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(452); match(T__1);
				}
				}
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(458); match(FROM);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(459); match(T__1);
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465); table_name();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(466); match(T__1);
				}
				}
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(472); match(WHERE);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(473); match(T__1);
				}
				}
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(479); columnName();
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(480); match(T__1);
				}
				}
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(486); operation();
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(487); match(T__1);
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493); constant();
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494); match(T__1);
					}
					} 
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			{
			{
			setState(500); match(T__1);
			}
			setState(501); operator();
			{
			setState(502); match(T__1);
			}
			setState(503); columnName();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(504); match(T__1);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510); operation();
			{
			setState(511); match(T__1);
			}
			setState(512); constant();
			}
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(514); match(T__1);
				}
				}
				setState(519);
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

	public static class Create_table_columnContext extends ParserRuleContext {
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public TerminalNode PRIMARY_KEY() { return getToken(mysqlParser.PRIMARY_KEY, 0); }
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public Create_table_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterCreate_table_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitCreate_table_column(this);
		}
	}

	public final Create_table_columnContext create_table_column() throws RecognitionException {
		Create_table_columnContext _localctx = new Create_table_columnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_table_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); columnName();
			setState(521); columnType();
			setState(523);
			_la = _input.LA(1);
			if (_la==PRIMARY_KEY) {
				{
				setState(522); match(PRIMARY_KEY);
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

	public static class Clustering_keyContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public Clustering_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustering_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterClustering_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitClustering_key(this);
		}
	}

	public final Clustering_keyContext clustering_key() throws RecognitionException {
		Clustering_keyContext _localctx = new Clustering_keyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_clustering_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525); columnName();
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

	public static class Clustering_key_valueContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Clustering_key_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustering_key_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterClustering_key_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitClustering_key_value(this);
		}
	}

	public final Clustering_key_valueContext clustering_key_value() throws RecognitionException {
		Clustering_key_valueContext _localctx = new Clustering_key_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_clustering_key_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); constant();
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

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(mysqlParser.IDENTIFIER, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitColumnName(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); match(IDENTIFIER);
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

	public static class ColumnTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ColumnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterColumnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitColumnType(this);
		}
	}

	public final ColumnTypeContext columnType() throws RecognitionException {
		ColumnTypeContext _localctx = new ColumnTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_columnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(mysqlParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(mysqlParser.FLOAT_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(mysqlParser.DOUBLE_TYPE, 0); }
		public TerminalNode DECIMAL_TYPE() { return getToken(mysqlParser.DECIMAL_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(mysqlParser.STRING_TYPE, 0); }
		public TerminalNode VARCHAR_TYPE() { return getToken(mysqlParser.VARCHAR_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(540);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(533); match(INT_TYPE);
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(534); match(FLOAT_TYPE);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(535); match(STRING_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(536); match(DOUBLE_TYPE);
				}
				break;
			case VARCHAR_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(537); match(VARCHAR_TYPE);
				}
				break;
			case DECIMAL_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(538); match(DECIMAL_TYPE);
				}
				break;
			case T__1:
			case PRIMARY_KEY:
				enterOuterAlt(_localctx, 7);
				{
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(mysqlParser.EQUALS, 0); }
		public TerminalNode GE() { return getToken(mysqlParser.GE, 0); }
		public TerminalNode LT() { return getToken(mysqlParser.LT, 0); }
		public TerminalNode GT() { return getToken(mysqlParser.GT, 0); }
		public TerminalNode LE() { return getToken(mysqlParser.LE, 0); }
		public TerminalNode NE() { return getToken(mysqlParser.NE, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(mysqlParser.XOR, 0); }
		public TerminalNode AND() { return getToken(mysqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(mysqlParser.OR, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(mysqlParser.IDENTIFIER, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546); match(IDENTIFIER);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING(int i) {
			return getToken(mysqlParser.QUOTED_STRING, i);
		}
		public List<TerminalNode> QUOTED_STRING() { return getTokens(mysqlParser.QUOTED_STRING); }
		public TerminalNode MINUS() { return getToken(mysqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(mysqlParser.PLUS, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(mysqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(mysqlParser.DECIMAL_VALUE, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constant);
		int _la;
		try {
			setState(561);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(548);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(551); match(INTEGER_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(552);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(555); match(DECIMAL_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(556); match(QUOTED_STRING);
					}
					}
					setState(559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==QUOTED_STRING );
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u0236\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3"+
		"\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4"+
		"\3\4\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4"+
		"\16\4T\13\4\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4e\n\4\3\4\3\4\3\4\3\5\7\5k\n\5\f\5\16\5n\13\5\3\5\3\5\7\5r\n"+
		"\5\f\5\16\5u\13\5\3\5\3\5\7\5y\n\5\f\5\16\5|\13\5\3\5\3\5\7\5\u0080\n"+
		"\5\f\5\16\5\u0083\13\5\3\5\3\5\7\5\u0087\n\5\f\5\16\5\u008a\13\5\3\5\3"+
		"\5\3\5\3\5\7\5\u0090\n\5\f\5\16\5\u0093\13\5\3\5\3\5\3\5\3\5\3\5\7\5\u009a"+
		"\n\5\f\5\16\5\u009d\13\5\3\5\3\5\3\5\3\5\7\5\u00a3\n\5\f\5\16\5\u00a6"+
		"\13\5\3\6\7\6\u00a9\n\6\f\6\16\6\u00ac\13\6\3\6\3\6\7\6\u00b0\n\6\f\6"+
		"\16\6\u00b3\13\6\3\6\3\6\7\6\u00b7\n\6\f\6\16\6\u00ba\13\6\3\6\3\6\7\6"+
		"\u00be\n\6\f\6\16\6\u00c1\13\6\3\6\3\6\7\6\u00c5\n\6\f\6\16\6\u00c8\13"+
		"\6\3\6\3\6\7\6\u00cc\n\6\f\6\16\6\u00cf\13\6\3\6\3\6\7\6\u00d3\n\6\f\6"+
		"\16\6\u00d6\13\6\3\6\7\6\u00d9\n\6\f\6\16\6\u00dc\13\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u00e7\n\6\f\6\16\6\u00ea\13\6\3\6\3\6\7\6\u00ee"+
		"\n\6\f\6\16\6\u00f1\13\6\3\6\3\6\7\6\u00f5\n\6\f\6\16\6\u00f8\13\6\3\6"+
		"\3\6\7\6\u00fc\n\6\f\6\16\6\u00ff\13\6\3\6\3\6\3\7\7\7\u0104\n\7\f\7\16"+
		"\7\u0107\13\7\3\7\3\7\7\7\u010b\n\7\f\7\16\7\u010e\13\7\3\7\3\7\7\7\u0112"+
		"\n\7\f\7\16\7\u0115\13\7\3\7\3\7\7\7\u0119\n\7\f\7\16\7\u011c\13\7\3\7"+
		"\3\7\7\7\u0120\n\7\f\7\16\7\u0123\13\7\3\7\3\7\7\7\u0127\n\7\f\7\16\7"+
		"\u012a\13\7\3\7\7\7\u012d\n\7\f\7\16\7\u0130\13\7\3\7\3\7\7\7\u0134\n"+
		"\7\f\7\16\7\u0137\13\7\3\7\7\7\u013a\n\7\f\7\16\7\u013d\13\7\3\7\7\7\u0140"+
		"\n\7\f\7\16\7\u0143\13\7\3\7\3\7\7\7\u0147\n\7\f\7\16\7\u014a\13\7\3\7"+
		"\3\7\7\7\u014e\n\7\f\7\16\7\u0151\13\7\3\7\3\7\7\7\u0155\n\7\f\7\16\7"+
		"\u0158\13\7\3\7\3\7\3\7\3\7\3\7\7\7\u015f\n\7\f\7\16\7\u0162\13\7\3\7"+
		"\7\7\u0165\n\7\f\7\16\7\u0168\13\7\3\7\3\7\7\7\u016c\n\7\f\7\16\7\u016f"+
		"\13\7\3\b\7\b\u0172\n\b\f\b\16\b\u0175\13\b\3\b\3\b\7\b\u0179\n\b\f\b"+
		"\16\b\u017c\13\b\3\b\3\b\7\b\u0180\n\b\f\b\16\b\u0183\13\b\3\b\3\b\7\b"+
		"\u0187\n\b\f\b\16\b\u018a\13\b\3\b\3\b\7\b\u018e\n\b\f\b\16\b\u0191\13"+
		"\b\3\b\3\b\7\b\u0195\n\b\f\b\16\b\u0198\13\b\3\b\3\b\7\b\u019c\n\b\f\b"+
		"\16\b\u019f\13\b\3\b\3\b\7\b\u01a3\n\b\f\b\16\b\u01a6\13\b\3\b\3\b\7\b"+
		"\u01aa\n\b\f\b\16\b\u01ad\13\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01b5\n\b\3"+
		"\b\3\b\3\t\7\t\u01ba\n\t\f\t\16\t\u01bd\13\t\3\t\3\t\7\t\u01c1\n\t\f\t"+
		"\16\t\u01c4\13\t\3\t\3\t\7\t\u01c8\n\t\f\t\16\t\u01cb\13\t\3\t\3\t\7\t"+
		"\u01cf\n\t\f\t\16\t\u01d2\13\t\3\t\3\t\7\t\u01d6\n\t\f\t\16\t\u01d9\13"+
		"\t\3\t\3\t\7\t\u01dd\n\t\f\t\16\t\u01e0\13\t\3\t\3\t\7\t\u01e4\n\t\f\t"+
		"\16\t\u01e7\13\t\3\t\3\t\7\t\u01eb\n\t\f\t\16\t\u01ee\13\t\3\t\3\t\7\t"+
		"\u01f2\n\t\f\t\16\t\u01f5\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u01fc\n\t\f\t\16"+
		"\t\u01ff\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u0206\n\t\f\t\16\t\u0209\13\t\3"+
		"\n\3\n\3\n\5\n\u020e\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u021f\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\5\23\u0228\n\23\3\23\3\23\5\23\u022c\n\23\3\23\3\23\6\23\u0230\n"+
		"\23\r\23\16\23\u0231\5\23\u0234\n\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\5\4\2\35\35!%\3\2&(\3\2\37 \u0274\2&\3\2\2\2"+
		"\4\62\3\2\2\2\6\64\3\2\2\2\bl\3\2\2\2\n\u00aa\3\2\2\2\f\u0105\3\2\2\2"+
		"\16\u0173\3\2\2\2\20\u01bb\3\2\2\2\22\u020a\3\2\2\2\24\u020f\3\2\2\2\26"+
		"\u0211\3\2\2\2\30\u0213\3\2\2\2\32\u0215\3\2\2\2\34\u021e\3\2\2\2\36\u0220"+
		"\3\2\2\2 \u0222\3\2\2\2\"\u0224\3\2\2\2$\u0233\3\2\2\2&(\5\4\3\2\')\7"+
		"\4\2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*+\7\2\2\3+\3\3\2\2\2,\63\5\6\4\2"+
		"-\63\5\b\5\2.\63\5\n\6\2/\63\5\f\7\2\60\63\5\16\b\2\61\63\5\20\t\2\62"+
		",\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2"+
		"\2\2\63\5\3\2\2\2\648\7\5\2\2\65\67\7\3\2\2\66\65\3\2\2\2\67:\3\2\2\2"+
		"8\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;?\7\b\2\2<>\7\3\2\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BF\5\"\22\2CE\7\3"+
		"\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\33"+
		"\2\2JK\7\3\2\2KL\5\22\n\2LM\7\3\2\2MN\7\3\2\2NR\7\31\2\2OQ\7\3\2\2PO\3"+
		"\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\5\22\n\2VW"+
		"\3\2\2\2Wd\7\3\2\2XZ\7\3\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2"+
		"\\^\3\2\2\2][\3\2\2\2^_\7\31\2\2_`\7\20\2\2`a\7\33\2\2ab\5\24\13\2bc\7"+
		"\34\2\2ce\3\2\2\2d[\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\3\2\2gh\7\34\2\2h"+
		"\7\3\2\2\2ik\7\3\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2"+
		"nl\3\2\2\2os\7\5\2\2pr\7\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tv\3\2\2\2us\3\2\2\2vz\7\21\2\2wy\7\3\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2"+
		"\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u0081\7,\2\2~\u0080\7\3\2\2\177~\3\2"+
		"\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088\7\22\2\2\u0085\u0087\7\3\2\2"+
		"\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\5\"\22\2"+
		"\u008c\u008d\7\3\2\2\u008d\u0091\7\33\2\2\u008e\u0090\7\3\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\5\30\r\2\u0095\u0096\7"+
		"\3\2\2\u0096\u0097\7\3\2\2\u0097\u009b\7\31\2\2\u0098\u009a\7\3\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\5\30\r\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a4\7\34\2\2\u00a1\u00a3\7\3\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\t\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7\3\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b1\7\f\2\2\u00ae\u00b0\7\3\2\2\u00af"+
		"\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b8\5\"\22\2\u00b5"+
		"\u00b7\7\3\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bf\7\r\2\2\u00bc\u00be\7\3\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c6\5\30\r\2\u00c3\u00c5\7\3\2\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cd\7\35\2\2\u00ca\u00cc\7"+
		"\3\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d4\5$"+
		"\23\2\u00d1\u00d3\7\3\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d9\7\3\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00de\7\31\2\2\u00de\u00df\7\3\2\2\u00df\u00e0\5\30\r\2\u00e0"+
		"\u00e1\7\3\2\2\u00e1\u00e2\7\35\2\2\u00e2\u00e3\7\3\2\2\u00e3\u00e4\5"+
		"$\23\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7\7\3\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ef\7\16\2\2\u00ec\u00ee\7\3\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f6\5\24\13\2\u00f3"+
		"\u00f5\7\3\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fd\7\35\2\2\u00fa\u00fc\7\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3"+
		"\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\5\26\f\2\u0101\13\3\2\2\2\u0102\u0104\7\3\2"+
		"\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010c\7\t\2\2\u0109"+
		"\u010b\7\3\2\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0113\7\n\2\2\u0110\u0112\7\3\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2"+
		"\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u011a\5\"\22\2\u0117\u0119\7\3\2\2\u0118\u0117\3"+
		"\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0121\7\33\2\2\u011e\u0120\7"+
		"\3\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0128\5\30"+
		"\r\2\u0125\u0127\7\3\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u013b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012d\7\3\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2"+
		"\2\2\u0131\u0135\7\31\2\2\u0132\u0134\7\3\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u013a\5\30\r\2\u0139\u012e\3\2\2\2\u013a"+
		"\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0141\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013e\u0140\7\3\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0148\7\34\2\2\u0145\u0147\7\3\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014f\7\13\2\2\u014c"+
		"\u014e\7\3\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0156\7\33\2\2\u0153\u0155\7\3\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3"+
		"\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u0160\5$\23\2\u015a\u015b\7\3\2\2\u015b\u015c\7\31"+
		"\2\2\u015c\u015d\7\3\2\2\u015d\u015f\5$\23\2\u015e\u015a\3\2\2\2\u015f"+
		"\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0166\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0163\u0165\7\3\2\2\u0164\u0163\3\2\2\2\u0165"+
		"\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0169\u016d\7\34\2\2\u016a\u016c\7\3\2\2\u016b"+
		"\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2"+
		"\2\2\u016e\r\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\7\3\2\2\u0171\u0170"+
		"\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0176\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u017a\7\17\2\2\u0177\u0179\7"+
		"\3\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0181\7\7"+
		"\2\2\u017e\u0180\7\3\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0184\u0188\5\"\22\2\u0185\u0187\7\3\2\2\u0186\u0185\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u01b4\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u018f\7\16\2\2\u018c\u018e\7\3\2\2\u018d"+
		"\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2"+
		"\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0196\5\30\r\2\u0193"+
		"\u0195\7\3\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199"+
		"\u019d\7\35\2\2\u019a\u019c\7\3\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3"+
		"\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f"+
		"\u019d\3\2\2\2\u01a0\u01a4\5$\23\2\u01a1\u01a3\7\3\2\2\u01a2\u01a1\3\2"+
		"\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01ab\7&\2\2\u01a8\u01aa\7\3"+
		"\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\5\30"+
		"\r\2\u01af\u01b0\7\3\2\2\u01b0\u01b1\7\35\2\2\u01b1\u01b2\7\3\2\2\u01b2"+
		"\u01b3\5$\23\2\u01b3\u01b5\3\2\2\2\u01b4\u018b\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\3\2\2\u01b7\17\3\2\2\2\u01b8\u01ba"+
		"\7\3\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c2\7\6"+
		"\2\2\u01bf\u01c1\7\3\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c5\u01c9\7\32\2\2\u01c6\u01c8\7\3\2\2\u01c7\u01c6\3\2\2\2\u01c8"+
		"\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2"+
		"\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01d0\7\7\2\2\u01cd\u01cf\7\3\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d7\5\"\22\2\u01d4"+
		"\u01d6\7\3\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01d7\3\2\2\2\u01da"+
		"\u01de\7\16\2\2\u01db\u01dd\7\3\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3"+
		"\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01e5\5\30\r\2\u01e2\u01e4\7\3\2\2\u01e3\u01e2\3"+
		"\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ec\5\36\20\2\u01e9\u01eb\7"+
		"\3\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f3\5$"+
		"\23\2\u01f0\u01f2\7\3\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f6\u01f7\7\3\2\2\u01f7\u01f8\5 \21\2\u01f8\u01f9\7\3\2\2\u01f9"+
		"\u01fd\5\30\r\2\u01fa\u01fc\7\3\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01ff\3"+
		"\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u0200\u0201\5\36\20\2\u0201\u0202\7\3\2\2\u0202\u0203\5"+
		"$\23\2\u0203\u0207\3\2\2\2\u0204\u0206\7\3\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\21\3\2\2"+
		"\2\u0209\u0207\3\2\2\2\u020a\u020b\5\30\r\2\u020b\u020d\5\32\16\2\u020c"+
		"\u020e\7\20\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\23\3\2\2"+
		"\2\u020f\u0210\5\30\r\2\u0210\25\3\2\2\2\u0211\u0212\5$\23\2\u0212\27"+
		"\3\2\2\2\u0213\u0214\7,\2\2\u0214\31\3\2\2\2\u0215\u0216\5\34\17\2\u0216"+
		"\33\3\2\2\2\u0217\u021f\7\23\2\2\u0218\u021f\7\24\2\2\u0219\u021f\7\25"+
		"\2\2\u021a\u021f\7\26\2\2\u021b\u021f\7\27\2\2\u021c\u021f\7\30\2\2\u021d"+
		"\u021f\3\2\2\2\u021e\u0217\3\2\2\2\u021e\u0218\3\2\2\2\u021e\u0219\3\2"+
		"\2\2\u021e\u021a\3\2\2\2\u021e\u021b\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021d\3\2\2\2\u021f\35\3\2\2\2\u0220\u0221\t\2\2\2\u0221\37\3\2\2\2\u0222"+
		"\u0223\t\3\2\2\u0223!\3\2\2\2\u0224\u0225\7,\2\2\u0225#\3\2\2\2\u0226"+
		"\u0228\t\4\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u0234\7*\2\2\u022a\u022c\t\4\2\2\u022b\u022a\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0234\7+\2\2\u022e\u0230\7)\2"+
		"\2\u022f\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u0227\3\2\2\2\u0233\u022b\3\2\2\2\u0233"+
		"\u022f\3\2\2\2\u0234%\3\2\2\2I(\628?FR[dlsz\u0081\u0088\u0091\u009b\u00a4"+
		"\u00aa\u00b1\u00b8\u00bf\u00c6\u00cd\u00d4\u00da\u00e8\u00ef\u00f6\u00fd"+
		"\u0105\u010c\u0113\u011a\u0121\u0128\u012e\u0135\u013b\u0141\u0148\u014f"+
		"\u0156\u0160\u0166\u016d\u0173\u017a\u0181\u0188\u018f\u0196\u019d\u01a4"+
		"\u01ab\u01b4\u01bb\u01c2\u01c9\u01d0\u01d7\u01de\u01e5\u01ec\u01f3\u01fd"+
		"\u0207\u020d\u021e\u0227\u022b\u0231\u0233";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}