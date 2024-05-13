// Generated from mysql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class mysqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CREATE=3, SELECT=4, FROM=5, TABLE=6, INSERT=7, INTO=8, 
		VALUES=9, UPDATE=10, SET=11, WHERE=12, DELETE=13, PRIMARY_KEY=14, INDEX=15, 
		ON=16, INT_TYPE=17, FLOAT_TYPE=18, STRING_TYPE=19, DOUBLE_TYPE=20, VARCHAR_TYPE=21, 
		DECIMAL_TYPE=22, COMMA=23, ASTERISK=24, LEFT_PARENTHESIS=25, RIGHT_PARENTHESIS=26, 
		EQUALS=27, NOT=28, MINUS=29, PLUS=30, GT=31, GE=32, LT=33, LE=34, NE=35, 
		AND=36, OR=37, XOR=38, QUOTED_STRING=39, INTEGER_VALUE=40, DECIMAL_VALUE=41, 
		IDENTIFIER=42, WS=43;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_diana = 2, RULE_create_table = 3, 
		RULE_create_index = 4, RULE_update = 5, RULE_insert = 6, RULE_delete = 7, 
		RULE_select = 8, RULE_create_table_column = 9, RULE_clustering_key = 10, 
		RULE_clustering_key_value = 11, RULE_columnName = 12, RULE_columnType = 13, 
		RULE_type = 14, RULE_operation = 15, RULE_operator = 16, RULE_table_name = 17, 
		RULE_constant = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statement", "diana", "create_table", "create_index", "update", 
			"insert", "delete", "select", "create_table_column", "clustering_key", 
			"clustering_key_value", "columnName", "columnType", "type", "operation", 
			"operator", "table_name", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "' '", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "','", 
			"'*'", "'('", "')'", "'='", "'!'", "'-'", "'+'", "'>'", "'>='", "'<'", 
			"'<='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CREATE", "SELECT", "FROM", "TABLE", "INSERT", "INTO", 
			"VALUES", "UPDATE", "SET", "WHERE", "DELETE", "PRIMARY_KEY", "INDEX", 
			"ON", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "DOUBLE_TYPE", "VARCHAR_TYPE", 
			"DECIMAL_TYPE", "COMMA", "ASTERISK", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", 
			"EQUALS", "NOT", "MINUS", "PLUS", "GT", "GE", "LT", "LE", "NE", "AND", 
			"OR", "XOR", "QUOTED_STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "IDENTIFIER", 
			"WS"
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
	public String getGrammarFileName() { return "mysql.g4"; }

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

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(mysqlParser.EOF, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitStart(this);
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
			setState(38);
			statement();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(39);
				match(T__0);
				}
			}

			setState(42);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public DianaContext diana() {
			return getRuleContext(DianaContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				create_index();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				update();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				insert();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				delete();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				select();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				diana();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DianaContext extends ParserRuleContext {
		public DianaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).enterDiana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysqlListener ) ((mysqlListener)listener).exitDiana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitDiana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DianaContext diana() throws RecognitionException {
		DianaContext _localctx = new DianaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_diana);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			matchWildcard();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(mysqlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> LEFT_PARENTHESIS() { return getTokens(mysqlParser.LEFT_PARENTHESIS); }
		public TerminalNode LEFT_PARENTHESIS(int i) {
			return getToken(mysqlParser.LEFT_PARENTHESIS, i);
		}
		public List<Create_table_columnContext> create_table_column() {
			return getRuleContexts(Create_table_columnContext.class);
		}
		public Create_table_columnContext create_table_column(int i) {
			return getRuleContext(Create_table_columnContext.class,i);
		}
		public List<TerminalNode> RIGHT_PARENTHESIS() { return getTokens(mysqlParser.RIGHT_PARENTHESIS); }
		public TerminalNode RIGHT_PARENTHESIS(int i) {
			return getToken(mysqlParser.RIGHT_PARENTHESIS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlParser.COMMA, i);
		}
		public TerminalNode PRIMARY_KEY() { return getToken(mysqlParser.PRIMARY_KEY, 0); }
		public Clustering_keyContext clustering_key() {
			return getRuleContext(Clustering_keyContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create_table);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(55);
				match(T__1);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(CREATE);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(62);
				match(T__1);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(TABLE);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(69);
				match(T__1);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			table_name();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(76);
				match(T__1);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(LEFT_PARENTHESIS);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(83);
				match(T__1);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			create_table_column();
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(T__1);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(96);
						match(T__1);
						}
						}
						setState(101);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(102);
					match(COMMA);
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(103);
						match(T__1);
						}
						}
						setState(108);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(109);
					create_table_column();
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					match(T__1);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(121);
					match(T__1);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(COMMA);
				setState(128);
				match(PRIMARY_KEY);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(129);
					match(T__1);
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(LEFT_PARENTHESIS);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(136);
					match(T__1);
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				clustering_key();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(143);
					match(T__1);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(RIGHT_PARENTHESIS);
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(153);
				match(T__1);
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(RIGHT_PARENTHESIS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Create_indexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysqlParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(mysqlParser.INDEX, 0); }
		public TerminalNode IDENTIFIER() { return getToken(mysqlParser.IDENTIFIER, 0); }
		public TerminalNode ON() { return getToken(mysqlParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode LEFT_PARENTHESIS() { return getToken(mysqlParser.LEFT_PARENTHESIS, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(mysqlParser.RIGHT_PARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(mysqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlParser.COMMA, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitCreate_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create_index);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(161);
				match(T__1);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(CREATE);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(168);
				match(T__1);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
			match(INDEX);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(175);
				match(T__1);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(IDENTIFIER);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(182);
				match(T__1);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(ON);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(189);
				match(T__1);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			table_name();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(196);
				match(T__1);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(LEFT_PARENTHESIS);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(203);
				match(T__1);
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			columnName();
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					match(T__1);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(216);
						match(T__1);
						}
						}
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(222);
					match(COMMA);
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(223);
						match(T__1);
						}
						}
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(229);
					columnName();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(235);
				match(T__1);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(RIGHT_PARENTHESIS);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(242);
				match(T__1);
				}
				}
				setState(247);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(mysqlParser.UPDATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode SET() { return getToken(mysqlParser.SET, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(mysqlParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(mysqlParser.EQUALS, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(mysqlParser.WHERE, 0); }
		public Clustering_keyContext clustering_key() {
			return getRuleContext(Clustering_keyContext.class,0);
		}
		public Clustering_key_valueContext clustering_key_value() {
			return getRuleContext(Clustering_key_valueContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlParser.COMMA, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_update);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(248);
				match(T__1);
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(UPDATE);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(255);
				match(T__1);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			table_name();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(262);
				match(T__1);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(SET);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(269);
				match(T__1);
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			columnName();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(276);
				match(T__1);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(EQUALS);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(283);
				match(T__1);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			constant();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(290);
					match(T__1);
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(296);
						match(T__1);
						}
						}
						setState(301);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(302);
					match(COMMA);
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(303);
						match(T__1);
						}
						}
						setState(308);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(309);
					columnName();
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(310);
						match(T__1);
						}
						}
						setState(315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(316);
					match(EQUALS);
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(317);
						match(T__1);
						}
						}
						setState(322);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(323);
					constant();
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(330);
				match(T__1);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(WHERE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(337);
				match(T__1);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			clustering_key();
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(344);
				match(T__1);
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(EQUALS);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(351);
				match(T__1);
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
			clustering_key_value();
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(358);
				match(T__1);
				}
				}
				setState(363);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(mysqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(mysqlParser.INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> LEFT_PARENTHESIS() { return getTokens(mysqlParser.LEFT_PARENTHESIS); }
		public TerminalNode LEFT_PARENTHESIS(int i) {
			return getToken(mysqlParser.LEFT_PARENTHESIS, i);
		}
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> RIGHT_PARENTHESIS() { return getTokens(mysqlParser.RIGHT_PARENTHESIS); }
		public TerminalNode RIGHT_PARENTHESIS(int i) {
			return getToken(mysqlParser.RIGHT_PARENTHESIS, i);
		}
		public TerminalNode VALUES() { return getToken(mysqlParser.VALUES, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mysqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mysqlParser.COMMA, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insert);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(364);
				match(T__1);
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			match(INSERT);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(371);
				match(T__1);
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			match(INTO);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(378);
				match(T__1);
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			table_name();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(385);
				match(T__1);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(LEFT_PARENTHESIS);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(392);
				match(T__1);
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			columnName();
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					match(T__1);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(405);
						match(T__1);
						}
						}
						setState(410);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(411);
					match(COMMA);
					setState(415);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(412);
						match(T__1);
						}
						}
						setState(417);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(418);
					columnName();
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(424);
				match(T__1);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(RIGHT_PARENTHESIS);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(431);
				match(T__1);
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			match(VALUES);
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(438);
				match(T__1);
				}
				}
				setState(443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(444);
			match(LEFT_PARENTHESIS);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(445);
				match(T__1);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			constant();
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(452);
						match(T__1);
						}
						}
						setState(457);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(458);
					match(COMMA);
					setState(462);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(459);
						match(T__1);
						}
						}
						setState(464);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(465);
					constant();
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(471);
				match(T__1);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
			match(RIGHT_PARENTHESIS);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(478);
				match(T__1);
				}
				}
				setState(483);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(mysqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(mysqlParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(mysqlParser.WHERE, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(mysqlParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(mysqlParser.EQUALS, i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(mysqlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(mysqlParser.AND, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_delete);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(484);
				match(T__1);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			match(DELETE);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(491);
				match(T__1);
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			match(FROM);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(498);
				match(T__1);
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			table_name();
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(505);
					match(T__1);
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(511);
				match(WHERE);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(512);
					match(T__1);
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(518);
				columnName();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(519);
					match(T__1);
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				match(EQUALS);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(526);
					match(T__1);
					}
					}
					setState(531);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(532);
				constant();
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(533);
						match(T__1);
						}
						} 
					}
					setState(538);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(539);
					match(AND);
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(540);
						match(T__1);
						}
						}
						setState(545);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(546);
					columnName();
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(547);
						match(T__1);
						}
						}
						setState(552);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(553);
					match(EQUALS);
					setState(557);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(554);
						match(T__1);
						}
						}
						setState(559);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(560);
					constant();
					}
					}
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(569);
				match(T__1);
				}
				}
				setState(574);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(mysqlParser.SELECT, 0); }
		public TerminalNode ASTERISK() { return getToken(mysqlParser.ASTERISK, 0); }
		public TerminalNode FROM() { return getToken(mysqlParser.FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(mysqlParser.WHERE, 0); }
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_select);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(575);
				match(T__1);
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581);
			match(SELECT);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(582);
				match(T__1);
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
			match(ASTERISK);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(589);
				match(T__1);
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
			match(FROM);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(596);
				match(T__1);
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			table_name();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(603);
				match(T__1);
				}
				}
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(609);
			match(WHERE);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(610);
				match(T__1);
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
			columnName();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(617);
				match(T__1);
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
			operation();
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(624);
				match(T__1);
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(630);
			constant();
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(631);
					match(T__1);
					}
					} 
				}
				setState(636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			}
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(637);
						match(T__1);
						}
						}
						setState(642);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(643);
					operator();
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(644);
						match(T__1);
						}
						}
						setState(649);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(650);
					columnName();
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(651);
						match(T__1);
						}
						}
						setState(656);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(657);
					operation();
					setState(661);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(658);
						match(T__1);
						}
						}
						setState(663);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(664);
					constant();
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(671);
				match(T__1);
				}
				}
				setState(676);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Create_table_columnContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public ColumnTypeContext columnType() {
			return getRuleContext(ColumnTypeContext.class,0);
		}
		public TerminalNode PRIMARY_KEY() { return getToken(mysqlParser.PRIMARY_KEY, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitCreate_table_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnContext create_table_column() throws RecognitionException {
		Create_table_columnContext _localctx = new Create_table_columnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_create_table_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			columnName();
			setState(678);
			columnType();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY_KEY) {
				{
				setState(679);
				match(PRIMARY_KEY);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitClustering_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clustering_keyContext clustering_key() throws RecognitionException {
		Clustering_keyContext _localctx = new Clustering_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_clustering_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			columnName();
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitClustering_key_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Clustering_key_valueContext clustering_key_value() throws RecognitionException {
		Clustering_key_valueContext _localctx = new Clustering_key_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_clustering_key_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			constant();
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitColumnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnTypeContext columnType() throws RecognitionException {
		ColumnTypeContext _localctx = new ColumnTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			type();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(mysqlParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(mysqlParser.FLOAT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(mysqlParser.STRING_TYPE, 0); }
		public TerminalNode DOUBLE_TYPE() { return getToken(mysqlParser.DOUBLE_TYPE, 0); }
		public TerminalNode VARCHAR_TYPE() { return getToken(mysqlParser.VARCHAR_TYPE, 0); }
		public TerminalNode DECIMAL_TYPE() { return getToken(mysqlParser.DECIMAL_TYPE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				match(INT_TYPE);
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				match(FLOAT_TYPE);
				}
				break;
			case STRING_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				match(STRING_TYPE);
				}
				break;
			case DOUBLE_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(693);
				match(DOUBLE_TYPE);
				}
				break;
			case VARCHAR_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(694);
				match(VARCHAR_TYPE);
				}
				break;
			case DECIMAL_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(695);
				match(DECIMAL_TYPE);
				}
				break;
			case T__1:
			case PRIMARY_KEY:
			case COMMA:
			case RIGHT_PARENTHESIS:
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(mysqlParser.EQUALS, 0); }
		public TerminalNode GT() { return getToken(mysqlParser.GT, 0); }
		public TerminalNode GE() { return getToken(mysqlParser.GE, 0); }
		public TerminalNode LT() { return getToken(mysqlParser.LT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66706210816L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036337152L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(mysqlParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(mysqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(mysqlParser.PLUS, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(mysqlParser.DECIMAL_VALUE, 0); }
		public List<TerminalNode> QUOTED_STRING() { return getTokens(mysqlParser.QUOTED_STRING); }
		public TerminalNode QUOTED_STRING(int i) {
			return getToken(mysqlParser.QUOTED_STRING, i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysqlVisitor ) return ((mysqlVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constant);
		int _la;
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(705);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(708);
				match(INTEGER_VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS || _la==PLUS) {
					{
					setState(709);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==PLUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(712);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(713);
					match(QUOTED_STRING);
					}
					}
					setState(716); 
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
		"\u0004\u0001+\u02d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0003\u0000)\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0005\u00039\b\u0003\n\u0003\f\u0003<\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003G\b\u0003\n\u0003\f\u0003J\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003U\b\u0003\n\u0003\f\u0003X\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\\\b\u0003\n\u0003\f\u0003_\t\u0003\u0001\u0003\u0005\u0003"+
		"b\b\u0003\n\u0003\f\u0003e\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"i\b\u0003\n\u0003\f\u0003l\t\u0003\u0001\u0003\u0005\u0003o\b\u0003\n"+
		"\u0003\f\u0003r\t\u0003\u0001\u0003\u0005\u0003u\b\u0003\n\u0003\f\u0003"+
		"x\t\u0003\u0001\u0003\u0005\u0003{\b\u0003\n\u0003\f\u0003~\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0083\b\u0003\n\u0003\f\u0003"+
		"\u0086\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008a\b\u0003\n\u0003"+
		"\f\u0003\u008d\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0091\b\u0003"+
		"\n\u0003\f\u0003\u0094\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0098"+
		"\b\u0003\u0001\u0003\u0005\u0003\u009b\b\u0003\n\u0003\f\u0003\u009e\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004\u00a3\b\u0004\n"+
		"\u0004\f\u0004\u00a6\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00aa"+
		"\b\u0004\n\u0004\f\u0004\u00ad\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00b1\b\u0004\n\u0004\f\u0004\u00b4\t\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00b8\b\u0004\n\u0004\f\u0004\u00bb\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u00bf\b\u0004\n\u0004\f\u0004\u00c2\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u00c6\b\u0004\n\u0004\f\u0004\u00c9\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00cd\b\u0004\n\u0004\f\u0004\u00d0\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00d4\b\u0004\n\u0004\f\u0004\u00d7\t\u0004"+
		"\u0001\u0004\u0005\u0004\u00da\b\u0004\n\u0004\f\u0004\u00dd\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00e1\b\u0004\n\u0004\f\u0004\u00e4\t\u0004"+
		"\u0001\u0004\u0005\u0004\u00e7\b\u0004\n\u0004\f\u0004\u00ea\t\u0004\u0001"+
		"\u0004\u0005\u0004\u00ed\b\u0004\n\u0004\f\u0004\u00f0\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00f4\b\u0004\n\u0004\f\u0004\u00f7\t\u0004\u0001"+
		"\u0005\u0005\u0005\u00fa\b\u0005\n\u0005\f\u0005\u00fd\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0101\b\u0005\n\u0005\f\u0005\u0104\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0108\b\u0005\n\u0005\f\u0005\u010b\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u010f\b\u0005\n\u0005\f\u0005\u0112"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0116\b\u0005\n\u0005\f\u0005"+
		"\u0119\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u011d\b\u0005\n\u0005"+
		"\f\u0005\u0120\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0124\b\u0005"+
		"\n\u0005\f\u0005\u0127\t\u0005\u0001\u0005\u0005\u0005\u012a\b\u0005\n"+
		"\u0005\f\u0005\u012d\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0131"+
		"\b\u0005\n\u0005\f\u0005\u0134\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0138\b\u0005\n\u0005\f\u0005\u013b\t\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u013f\b\u0005\n\u0005\f\u0005\u0142\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0146\b\u0005\n\u0005\f\u0005\u0149\t\u0005\u0001\u0005\u0005"+
		"\u0005\u014c\b\u0005\n\u0005\f\u0005\u014f\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0153\b\u0005\n\u0005\f\u0005\u0156\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u015a\b\u0005\n\u0005\f\u0005\u015d\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0161\b\u0005\n\u0005\f\u0005\u0164\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0168\b\u0005\n\u0005\f\u0005\u016b\t\u0005"+
		"\u0001\u0006\u0005\u0006\u016e\b\u0006\n\u0006\f\u0006\u0171\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0175\b\u0006\n\u0006\f\u0006\u0178\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u017c\b\u0006\n\u0006\f\u0006\u017f"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0183\b\u0006\n\u0006\f\u0006"+
		"\u0186\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u018a\b\u0006\n\u0006"+
		"\f\u0006\u018d\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0191\b\u0006"+
		"\n\u0006\f\u0006\u0194\t\u0006\u0001\u0006\u0005\u0006\u0197\b\u0006\n"+
		"\u0006\f\u0006\u019a\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u019e"+
		"\b\u0006\n\u0006\f\u0006\u01a1\t\u0006\u0001\u0006\u0005\u0006\u01a4\b"+
		"\u0006\n\u0006\f\u0006\u01a7\t\u0006\u0001\u0006\u0005\u0006\u01aa\b\u0006"+
		"\n\u0006\f\u0006\u01ad\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u01b1"+
		"\b\u0006\n\u0006\f\u0006\u01b4\t\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u01b8\b\u0006\n\u0006\f\u0006\u01bb\t\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u01bf\b\u0006\n\u0006\f\u0006\u01c2\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u01c6\b\u0006\n\u0006\f\u0006\u01c9\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u01cd\b\u0006\n\u0006\f\u0006\u01d0\t\u0006\u0001\u0006"+
		"\u0005\u0006\u01d3\b\u0006\n\u0006\f\u0006\u01d6\t\u0006\u0001\u0006\u0005"+
		"\u0006\u01d9\b\u0006\n\u0006\f\u0006\u01dc\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u01e0\b\u0006\n\u0006\f\u0006\u01e3\t\u0006\u0001\u0007\u0005"+
		"\u0007\u01e6\b\u0007\n\u0007\f\u0007\u01e9\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u01ed\b\u0007\n\u0007\f\u0007\u01f0\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u01f4\b\u0007\n\u0007\f\u0007\u01f7\t\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u01fb\b\u0007\n\u0007\f\u0007\u01fe\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0202\b\u0007\n\u0007\f\u0007\u0205\t\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0209\b\u0007\n\u0007\f\u0007\u020c"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0210\b\u0007\n\u0007\f\u0007"+
		"\u0213\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0217\b\u0007\n\u0007"+
		"\f\u0007\u021a\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u021e\b\u0007"+
		"\n\u0007\f\u0007\u0221\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0225"+
		"\b\u0007\n\u0007\f\u0007\u0228\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u022c\b\u0007\n\u0007\f\u0007\u022f\t\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0233\b\u0007\n\u0007\f\u0007\u0236\t\u0007\u0003\u0007\u0238\b"+
		"\u0007\u0001\u0007\u0005\u0007\u023b\b\u0007\n\u0007\f\u0007\u023e\t\u0007"+
		"\u0001\b\u0005\b\u0241\b\b\n\b\f\b\u0244\t\b\u0001\b\u0001\b\u0005\b\u0248"+
		"\b\b\n\b\f\b\u024b\t\b\u0001\b\u0001\b\u0005\b\u024f\b\b\n\b\f\b\u0252"+
		"\t\b\u0001\b\u0001\b\u0005\b\u0256\b\b\n\b\f\b\u0259\t\b\u0001\b\u0001"+
		"\b\u0005\b\u025d\b\b\n\b\f\b\u0260\t\b\u0001\b\u0001\b\u0005\b\u0264\b"+
		"\b\n\b\f\b\u0267\t\b\u0001\b\u0001\b\u0005\b\u026b\b\b\n\b\f\b\u026e\t"+
		"\b\u0001\b\u0001\b\u0005\b\u0272\b\b\n\b\f\b\u0275\t\b\u0001\b\u0001\b"+
		"\u0005\b\u0279\b\b\n\b\f\b\u027c\t\b\u0001\b\u0005\b\u027f\b\b\n\b\f\b"+
		"\u0282\t\b\u0001\b\u0001\b\u0005\b\u0286\b\b\n\b\f\b\u0289\t\b\u0001\b"+
		"\u0001\b\u0005\b\u028d\b\b\n\b\f\b\u0290\t\b\u0001\b\u0001\b\u0005\b\u0294"+
		"\b\b\n\b\f\b\u0297\t\b\u0001\b\u0001\b\u0005\b\u029b\b\b\n\b\f\b\u029e"+
		"\t\b\u0001\b\u0005\b\u02a1\b\b\n\b\f\b\u02a4\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u02a9\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u02ba\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0003"+
		"\u0012\u02c3\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u02c7\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0004\u0012\u02cb\b\u0012\u000b\u0012\f\u0012"+
		"\u02cc\u0003\u0012\u02cf\b\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0003\u0002\u0000\u001b\u001b\u001f#\u0001\u0000$&\u0001\u0000"+
		"\u001d\u001e\u032d\u0000&\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000"+
		"\u0000\u00045\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b"+
		"\u00a4\u0001\u0000\u0000\u0000\n\u00fb\u0001\u0000\u0000\u0000\f\u016f"+
		"\u0001\u0000\u0000\u0000\u000e\u01e7\u0001\u0000\u0000\u0000\u0010\u0242"+
		"\u0001\u0000\u0000\u0000\u0012\u02a5\u0001\u0000\u0000\u0000\u0014\u02aa"+
		"\u0001\u0000\u0000\u0000\u0016\u02ac\u0001\u0000\u0000\u0000\u0018\u02ae"+
		"\u0001\u0000\u0000\u0000\u001a\u02b0\u0001\u0000\u0000\u0000\u001c\u02b9"+
		"\u0001\u0000\u0000\u0000\u001e\u02bb\u0001\u0000\u0000\u0000 \u02bd\u0001"+
		"\u0000\u0000\u0000\"\u02bf\u0001\u0000\u0000\u0000$\u02ce\u0001\u0000"+
		"\u0000\u0000&(\u0003\u0002\u0001\u0000\')\u0005\u0001\u0000\u0000(\'\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000"+
		"*+\u0005\u0000\u0000\u0001+\u0001\u0001\u0000\u0000\u0000,4\u0003\u0006"+
		"\u0003\u0000-4\u0003\b\u0004\u0000.4\u0003\n\u0005\u0000/4\u0003\f\u0006"+
		"\u000004\u0003\u000e\u0007\u000014\u0003\u0010\b\u000024\u0003\u0004\u0002"+
		"\u00003,\u0001\u0000\u0000\u00003-\u0001\u0000\u0000\u00003.\u0001\u0000"+
		"\u0000\u00003/\u0001\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001"+
		"\u0000\u0000\u000032\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000"+
		"\u000056\t\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u000079\u0005\u0002"+
		"\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000=A\u0005\u0003\u0000\u0000>@\u0005\u0002\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000DH\u0005\u0006\u0000\u0000EG\u0005\u0002\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000KO\u0003\"\u0011\u0000LN\u0005\u0002\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000"+
		"RV\u0005\u0019\u0000\u0000SU\u0005\u0002\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y]\u0003"+
		"\u0012\t\u0000Z\\\u0005\u0002\u0000\u0000[Z\u0001\u0000\u0000\u0000\\"+
		"_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^p\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`b\u0005\u0002"+
		"\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000fj\u0005\u0017\u0000\u0000gi\u0005\u0002\u0000"+
		"\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mo\u0003\u0012\t\u0000nc\u0001\u0000\u0000\u0000or\u0001"+
		"\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000"+
		"qv\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0005\u0002\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0097\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000y{\u0005\u0002\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005\u0017\u0000\u0000\u0080\u0084\u0005\u000e\u0000\u0000"+
		"\u0081\u0083\u0005\u0002\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008b\u0005\u0019\u0000\u0000"+
		"\u0088\u008a\u0005\u0002\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000"+
		"\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000"+
		"\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0092\u0003\u0014\n\u0000\u008f"+
		"\u0091\u0005\u0002\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091"+
		"\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001a\u0000\u0000\u0096"+
		"\u0098\u0001\u0000\u0000\u0000\u0097|\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u009c\u0001\u0000\u0000\u0000\u0099\u009b"+
		"\u0005\u0002\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u001a\u0000\u0000\u00a0\u0007"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a3\u0005\u0002\u0000\u0000\u00a2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00ab"+
		"\u0005\u0003\u0000\u0000\u00a8\u00aa\u0005\u0002\u0000\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b2"+
		"\u0005\u000f\u0000\u0000\u00af\u00b1\u0005\u0002\u0000\u0000\u00b0\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b9"+
		"\u0005*\u0000\u0000\u00b6\u00b8\u0005\u0002\u0000\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00c0\u0005"+
		"\u0010\u0000\u0000\u00bd\u00bf\u0005\u0002\u0000\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c7\u0003"+
		"\"\u0011\u0000\u00c4\u00c6\u0005\u0002\u0000\u0000\u00c5\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00ce\u0005\u0019"+
		"\u0000\u0000\u00cb\u00cd\u0005\u0002\u0000\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d1\u00d5\u0003\u0018"+
		"\f\u0000\u00d2\u00d4\u0005\u0002\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00e8\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u00da\u0005\u0002\u0000"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00e2\u0005\u0017\u0000\u0000\u00df\u00e1\u0005\u0002\u0000"+
		"\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e7\u0003\u0018\f\u0000\u00e6\u00db\u0001\u0000\u0000\u0000"+
		"\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ed\u0005\u0002\u0000\u0000"+
		"\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f5\u0005\u001a\u0000\u0000\u00f2\u00f4\u0005\u0002\u0000\u0000"+
		"\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\t\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fa\u0005\u0002\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fe\u0102\u0005\n\u0000\u0000\u00ff\u0101"+
		"\u0005\u0002\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u0101\u0104"+
		"\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0001\u0000\u0000\u0000\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0105\u0109\u0003\"\u0011\u0000\u0106\u0108\u0005"+
		"\u0002\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010c\u0110\u0005\u000b\u0000\u0000\u010d\u010f\u0005"+
		"\u0002\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u0113\u0117\u0003\u0018\f\u0000\u0114\u0116\u0005\u0002"+
		"\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u011a\u011e\u0005\u001b\u0000\u0000\u011b\u011d\u0005\u0002"+
		"\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000"+
		"\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0121\u0125\u0003$\u0012\u0000\u0122\u0124\u0005\u0002\u0000"+
		"\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u0147\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0128\u012a\u0005\u0002\u0000\u0000\u0129\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000"+
		"\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0132\u0005\u0017\u0000"+
		"\u0000\u012f\u0131\u0005\u0002\u0000\u0000\u0130\u012f\u0001\u0000\u0000"+
		"\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0135\u0001\u0000\u0000"+
		"\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0139\u0003\u0018\f\u0000"+
		"\u0136\u0138\u0005\u0002\u0000\u0000\u0137\u0136\u0001\u0000\u0000\u0000"+
		"\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000"+
		"\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000"+
		"\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0140\u0005\u001b\u0000\u0000"+
		"\u013d\u013f\u0005\u0002\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000"+
		"\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000\u0000"+
		"\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0144\u0003$\u0012\u0000\u0144"+
		"\u0146\u0001\u0000\u0000\u0000\u0145\u012b\u0001\u0000\u0000\u0000\u0146"+
		"\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0001\u0000\u0000\u0000\u0148\u014d\u0001\u0000\u0000\u0000\u0149"+
		"\u0147\u0001\u0000\u0000\u0000\u014a\u014c\u0005\u0002\u0000\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u0150\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150"+
		"\u0154\u0005\f\u0000\u0000\u0151\u0153\u0005\u0002\u0000\u0000\u0152\u0151"+
		"\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0157"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u015b"+
		"\u0003\u0014\n\u0000\u0158\u015a\u0005\u0002\u0000\u0000\u0159\u0158\u0001"+
		"\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0001"+
		"\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u0162\u0005"+
		"\u001b\u0000\u0000\u015f\u0161\u0005\u0002\u0000\u0000\u0160\u015f\u0001"+
		"\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0165\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0169\u0003"+
		"\u0016\u000b\u0000\u0166\u0168\u0005\u0002\u0000\u0000\u0167\u0166\u0001"+
		"\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u000b\u0001"+
		"\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c\u016e\u0005"+
		"\u0002\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0171\u0001"+
		"\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001"+
		"\u0000\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0172\u0176\u0005\u0007\u0000\u0000\u0173\u0175\u0005"+
		"\u0002\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u0178\u0001"+
		"\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001"+
		"\u0000\u0000\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0179\u017d\u0005\b\u0000\u0000\u017a\u017c\u0005\u0002"+
		"\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000"+
		"\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000"+
		"\u0000\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u0180\u0184\u0003\"\u0011\u0000\u0181\u0183\u0005\u0002\u0000"+
		"\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000"+
		"\u0000\u0187\u018b\u0005\u0019\u0000\u0000\u0188\u018a\u0005\u0002\u0000"+
		"\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000"+
		"\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018e\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000"+
		"\u0000\u018e\u0192\u0003\u0018\f\u0000\u018f\u0191\u0005\u0002\u0000\u0000"+
		"\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000"+
		"\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000"+
		"\u0193\u01a5\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000"+
		"\u0195\u0197\u0005\u0002\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0001\u0000\u0000\u0000"+
		"\u019a\u0198\u0001\u0000\u0000\u0000\u019b\u019f\u0005\u0017\u0000\u0000"+
		"\u019c\u019e\u0005\u0002\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000"+
		"\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000"+
		"\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01a4\u0003\u0018\f\u0000\u01a3"+
		"\u0198\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6"+
		"\u01ab\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8"+
		"\u01aa\u0005\u0002\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b2\u0005\u001a\u0000\u0000\u01af"+
		"\u01b1\u0005\u0002\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b9\u0005\t\u0000\u0000\u01b6\u01b8"+
		"\u0005\u0002\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01bb"+
		"\u0001\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba"+
		"\u0001\u0000\u0000\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bc\u01c0\u0005\u0019\u0000\u0000\u01bd\u01bf"+
		"\u0005\u0002\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c3\u01d4\u0003$\u0012\u0000\u01c4\u01c6\u0005"+
		"\u0002\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001"+
		"\u0000\u0000\u0000\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01ca\u01ce\u0005\u0017\u0000\u0000\u01cb\u01cd\u0005"+
		"\u0002\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd\u01d0\u0001"+
		"\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d3\u0003$\u0012\u0000\u01d2\u01c7\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01da\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d9\u0005\u0002"+
		"\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000"+
		"\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000"+
		"\u0000\u0000\u01dd\u01e1\u0005\u001a\u0000\u0000\u01de\u01e0\u0005\u0002"+
		"\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e2\r\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e6\u0005\u0002\u0000\u0000\u01e5\u01e4\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea\u0001\u0000\u0000"+
		"\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01ee\u0005\r\u0000\u0000"+
		"\u01eb\u01ed\u0005\u0002\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f5\u0005\u0005\u0000\u0000"+
		"\u01f2\u01f4\u0005\u0002\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8\u01fc\u0003\"\u0011\u0000\u01f9"+
		"\u01fb\u0005\u0002\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc"+
		"\u01fd\u0001\u0000\u0000\u0000\u01fd\u0237\u0001\u0000\u0000\u0000\u01fe"+
		"\u01fc\u0001\u0000\u0000\u0000\u01ff\u0203\u0005\f\u0000\u0000\u0200\u0202"+
		"\u0005\u0002\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202\u0205"+
		"\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204\u0206\u0001\u0000\u0000\u0000\u0205\u0203"+
		"\u0001\u0000\u0000\u0000\u0206\u020a\u0003\u0018\f\u0000\u0207\u0209\u0005"+
		"\u0002\u0000\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0209\u020c\u0001"+
		"\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001"+
		"\u0000\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u020a\u0001"+
		"\u0000\u0000\u0000\u020d\u0211\u0005\u001b\u0000\u0000\u020e\u0210\u0005"+
		"\u0002\u0000\u0000\u020f\u020e\u0001\u0000\u0000\u0000\u0210\u0213\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u0212\u0214\u0001\u0000\u0000\u0000\u0213\u0211\u0001"+
		"\u0000\u0000\u0000\u0214\u0218\u0003$\u0012\u0000\u0215\u0217\u0005\u0002"+
		"\u0000\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000"+
		"\u0000\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000"+
		"\u0000\u0000\u0219\u0234\u0001\u0000\u0000\u0000\u021a\u0218\u0001\u0000"+
		"\u0000\u0000\u021b\u021f\u0005$\u0000\u0000\u021c\u021e\u0005\u0002\u0000"+
		"\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021e\u0221\u0001\u0000\u0000"+
		"\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000"+
		"\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000"+
		"\u0000\u0222\u0226\u0003\u0018\f\u0000\u0223\u0225\u0005\u0002\u0000\u0000"+
		"\u0224\u0223\u0001\u0000\u0000\u0000\u0225\u0228\u0001\u0000\u0000\u0000"+
		"\u0226\u0224\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000"+
		"\u0227\u0229\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000"+
		"\u0229\u022d\u0005\u001b\u0000\u0000\u022a\u022c\u0005\u0002\u0000\u0000"+
		"\u022b\u022a\u0001\u0000\u0000\u0000\u022c\u022f\u0001\u0000\u0000\u0000"+
		"\u022d\u022b\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000"+
		"\u022e\u0230\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000"+
		"\u0230\u0231\u0003$\u0012\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232"+
		"\u021b\u0001\u0000\u0000\u0000\u0233\u0236\u0001\u0000\u0000\u0000\u0234"+
		"\u0232\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235"+
		"\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0237"+
		"\u01ff\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238"+
		"\u023c\u0001\u0000\u0000\u0000\u0239\u023b\u0005\u0002\u0000\u0000\u023a"+
		"\u0239\u0001\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c"+
		"\u023a\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d"+
		"\u000f\u0001\u0000\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023f"+
		"\u0241\u0005\u0002\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241"+
		"\u0244\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243\u0245\u0001\u0000\u0000\u0000\u0244"+
		"\u0242\u0001\u0000\u0000\u0000\u0245\u0249\u0005\u0004\u0000\u0000\u0246"+
		"\u0248\u0005\u0002\u0000\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0248"+
		"\u024b\u0001\u0000\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0001\u0000\u0000\u0000\u024a\u024c\u0001\u0000\u0000\u0000\u024b"+
		"\u0249\u0001\u0000\u0000\u0000\u024c\u0250\u0005\u0018\u0000\u0000\u024d"+
		"\u024f\u0005\u0002\u0000\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024f"+
		"\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250"+
		"\u0251\u0001\u0000\u0000\u0000\u0251\u0253\u0001\u0000\u0000\u0000\u0252"+
		"\u0250\u0001\u0000\u0000\u0000\u0253\u0257\u0005\u0005\u0000\u0000\u0254"+
		"\u0256\u0005\u0002\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256"+
		"\u0259\u0001\u0000\u0000\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257"+
		"\u0258\u0001\u0000\u0000\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259"+
		"\u0257\u0001\u0000\u0000\u0000\u025a\u025e\u0003\"\u0011\u0000\u025b\u025d"+
		"\u0005\u0002\u0000\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025d\u0260"+
		"\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000\u025e\u025f"+
		"\u0001\u0000\u0000\u0000\u025f\u0261\u0001\u0000\u0000\u0000\u0260\u025e"+
		"\u0001\u0000\u0000\u0000\u0261\u0265\u0005\f\u0000\u0000\u0262\u0264\u0005"+
		"\u0002\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0264\u0267\u0001"+
		"\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001"+
		"\u0000\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0265\u0001"+
		"\u0000\u0000\u0000\u0268\u026c\u0003\u0018\f\u0000\u0269\u026b\u0005\u0002"+
		"\u0000\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000"+
		"\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000"+
		"\u0000\u0000\u026d\u026f\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000"+
		"\u0000\u0000\u026f\u0273\u0003\u001e\u000f\u0000\u0270\u0272\u0005\u0002"+
		"\u0000\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000"+
		"\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000"+
		"\u0000\u0000\u0274\u0276\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000"+
		"\u0000\u0000\u0276\u027a\u0003$\u0012\u0000\u0277\u0279\u0005\u0002\u0000"+
		"\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0279\u027c\u0001\u0000\u0000"+
		"\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000"+
		"\u0000\u027b\u029c\u0001\u0000\u0000\u0000\u027c\u027a\u0001\u0000\u0000"+
		"\u0000\u027d\u027f\u0005\u0002\u0000\u0000\u027e\u027d\u0001\u0000\u0000"+
		"\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000\u0000"+
		"\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0283\u0001\u0000\u0000"+
		"\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0287\u0003 \u0010\u0000"+
		"\u0284\u0286\u0005\u0002\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000"+
		"\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u028a\u0001\u0000\u0000\u0000"+
		"\u0289\u0287\u0001\u0000\u0000\u0000\u028a\u028e\u0003\u0018\f\u0000\u028b"+
		"\u028d\u0005\u0002\u0000\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028d"+
		"\u0290\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0001\u0000\u0000\u0000\u028f\u0291\u0001\u0000\u0000\u0000\u0290"+
		"\u028e\u0001\u0000\u0000\u0000\u0291\u0295\u0003\u001e\u000f\u0000\u0292"+
		"\u0294\u0005\u0002\u0000\u0000\u0293\u0292\u0001\u0000\u0000\u0000\u0294"+
		"\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0001\u0000\u0000\u0000\u0296\u0298\u0001\u0000\u0000\u0000\u0297"+
		"\u0295\u0001\u0000\u0000\u0000\u0298\u0299\u0003$\u0012\u0000\u0299\u029b"+
		"\u0001\u0000\u0000\u0000\u029a\u0280\u0001\u0000\u0000\u0000\u029b\u029e"+
		"\u0001\u0000\u0000\u0000\u029c\u029a\u0001\u0000\u0000\u0000\u029c\u029d"+
		"\u0001\u0000\u0000\u0000\u029d\u02a2\u0001\u0000\u0000\u0000\u029e\u029c"+
		"\u0001\u0000\u0000\u0000\u029f\u02a1\u0005\u0002\u0000\u0000\u02a0\u029f"+
		"\u0001\u0000\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u0011"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u0003\u0018\f\u0000\u02a6\u02a8\u0003\u001a\r\u0000\u02a7\u02a9\u0005"+
		"\u000e\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001"+
		"\u0000\u0000\u0000\u02a9\u0013\u0001\u0000\u0000\u0000\u02aa\u02ab\u0003"+
		"\u0018\f\u0000\u02ab\u0015\u0001\u0000\u0000\u0000\u02ac\u02ad\u0003$"+
		"\u0012\u0000\u02ad\u0017\u0001\u0000\u0000\u0000\u02ae\u02af\u0005*\u0000"+
		"\u0000\u02af\u0019\u0001\u0000\u0000\u0000\u02b0\u02b1\u0003\u001c\u000e"+
		"\u0000\u02b1\u001b\u0001\u0000\u0000\u0000\u02b2\u02ba\u0005\u0011\u0000"+
		"\u0000\u02b3\u02ba\u0005\u0012\u0000\u0000\u02b4\u02ba\u0005\u0013\u0000"+
		"\u0000\u02b5\u02ba\u0005\u0014\u0000\u0000\u02b6\u02ba\u0005\u0015\u0000"+
		"\u0000\u02b7\u02ba\u0005\u0016\u0000\u0000\u02b8\u02ba\u0001\u0000\u0000"+
		"\u0000\u02b9\u02b2\u0001\u0000\u0000\u0000\u02b9\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b9\u02b4\u0001\u0000\u0000\u0000\u02b9\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b9\u02b6\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02ba\u001d\u0001\u0000\u0000"+
		"\u0000\u02bb\u02bc\u0007\u0000\u0000\u0000\u02bc\u001f\u0001\u0000\u0000"+
		"\u0000\u02bd\u02be\u0007\u0001\u0000\u0000\u02be!\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0005*\u0000\u0000\u02c0#\u0001\u0000\u0000\u0000\u02c1\u02c3"+
		"\u0007\u0002\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4\u02cf"+
		"\u0005(\u0000\u0000\u02c5\u02c7\u0007\u0002\u0000\u0000\u02c6\u02c5\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001"+
		"\u0000\u0000\u0000\u02c8\u02cf\u0005)\u0000\u0000\u02c9\u02cb\u0005\'"+
		"\u0000\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000"+
		"\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000"+
		"\u0000\u0000\u02cd\u02cf\u0001\u0000\u0000\u0000\u02ce\u02c2\u0001\u0000"+
		"\u0000\u0000\u02ce\u02c6\u0001\u0000\u0000\u0000\u02ce\u02ca\u0001\u0000"+
		"\u0000\u0000\u02cf%\u0001\u0000\u0000\u0000e(3:AHOV]cjpv|\u0084\u008b"+
		"\u0092\u0097\u009c\u00a4\u00ab\u00b2\u00b9\u00c0\u00c7\u00ce\u00d5\u00db"+
		"\u00e2\u00e8\u00ee\u00f5\u00fb\u0102\u0109\u0110\u0117\u011e\u0125\u012b"+
		"\u0132\u0139\u0140\u0147\u014d\u0154\u015b\u0162\u0169\u016f\u0176\u017d"+
		"\u0184\u018b\u0192\u0198\u019f\u01a5\u01ab\u01b2\u01b9\u01c0\u01c7\u01ce"+
		"\u01d4\u01da\u01e1\u01e7\u01ee\u01f5\u01fc\u0203\u020a\u0211\u0218\u021f"+
		"\u0226\u022d\u0234\u0237\u023c\u0242\u0249\u0250\u0257\u025e\u0265\u026c"+
		"\u0273\u027a\u0280\u0287\u028e\u0295\u029c\u02a2\u02a8\u02b9\u02c2\u02c6"+
		"\u02cc\u02ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}