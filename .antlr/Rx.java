// Generated from /home/limike/rCompiler/RCompiler-Spec/Rx.g4 by ANTLR 4.13.1

    package src.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Rx extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AS=1, BREAK=2, CONST=3, CONTINUE=4, CRATE=5, ELSE=6, ENUM=7, FALSE=8, 
		FN=9, FOR=10, IF=11, IMPL=12, IN=13, LET=14, LOOP=15, MATCH=16, MOVE=17, 
		MUT=18, PUB=19, REF=20, RETURN=21, SELF_KW=22, SELF_TYPE=23, STATIC=24, 
		STRUCT=25, SUPER=26, TRAIT=27, TRUE=28, TYPE_KW=29, UNSAFE=30, USE=31, 
		WHERE=32, WHILE=33, DYN=34, WS=35, LINE_COMMENT=36, BLOCK_COMMENT=37, 
		INTEGER_LITERAL=38, DEC_LITERAL=39, BIN_LITERAL=40, OCT_LITERAL=41, HEX_LITERAL=42, 
		CHAR_LITERAL=43, STRING_LITERAL=44, RAW_STRING_LITERAL=45, RAW_STRING_CONTENT=46, 
		PLUS=47, MINUS=48, STAR=49, SLASH=50, PERCENT=51, CARET=52, NOT=53, LT=54, 
		LE=55, EQEQ=56, NE=57, GE=58, GT=59, ANDAND=60, OROR=61, SHL=62, SHR=63, 
		AND=64, OR=65, PLUSEQ=66, MINUSEQ=67, STAREQ=68, SLASHEQ=69, PERCENTEQ=70, 
		CARETEQ=71, ANDEQ=72, OREQ=73, SHLEQ=74, SHREQ=75, EQ=76, UNDERSCORE=77, 
		DOT=78, DOTDOT=79, DOTDOTDOT=80, COMMA=81, SEMI=82, COLON=83, PATHSEP=84, 
		RARROW=85, FATARROW=86, QUESTION=87, LPAR=88, RPAR=89, LBKT=90, RBKT=91, 
		LBCE=92, RBCE=93, IDENTIFIER=94;
	public static final int
		RULE_crate = 0, RULE_item = 1, RULE_function = 2, RULE_function_parameters = 3, 
		RULE_function_param = 4, RULE_self_param = 5, RULE_struct = 6, RULE_struct_fields = 7, 
		RULE_struct_field = 8, RULE_enumeration = 9, RULE_enum_variants = 10, 
		RULE_enum_variant = 11, RULE_constant_item = 12, RULE_trait = 13, RULE_implementation = 14, 
		RULE_inderent_impl = 15, RULE_trait_impl = 16, RULE_associated_item = 17, 
		RULE_statement = 18, RULE_let_statement = 19, RULE_expression_statement = 20, 
		RULE_expression = 21, RULE_expression_without_block = 22, RULE_expression_with_block = 23, 
		RULE_literal_expression = 24, RULE_path_expression = 25, RULE_operator_expression = 26, 
		RULE_borrow_expression = 27, RULE_dereference_expression = 28, RULE_negation_expression = 29, 
		RULE_arithmetic_or_logical_expression = 30, RULE_comparison_expression = 31, 
		RULE_lazy_boolean_expression = 32, RULE_assignment_expression = 33, RULE_compound_assignment_expression = 34, 
		RULE_grouped_expression = 35, RULE_array_expression = 36, RULE_array_elements = 37, 
		RULE_index_expression = 38, RULE_struct_expression = 39, RULE_struct_expr_fields = 40, 
		RULE_struct_expr_field = 41, RULE_call_expression = 42, RULE_call_params = 43, 
		RULE_method_call_expression = 44, RULE_field_expression = 45, RULE_continue_expression = 46, 
		RULE_break_expression = 47, RULE_return_expression = 48, RULE_underscore_expression = 49, 
		RULE_block_expression = 50, RULE_statements = 51, RULE_const_block_expression = 52, 
		RULE_loop_expression = 53, RULE_infinite_loop_expression = 54, RULE_predicate_loop_expression = 55, 
		RULE_if_expression = 56, RULE_conditions = 57, RULE_match_expression = 58, 
		RULE_scrutinee = 59, RULE_match_arms = 60, RULE_match_arm = 61, RULE_pattern = 62, 
		RULE_literal_pattern = 63, RULE_identifier_pattern = 64, RULE_wildcard_pattern = 65, 
		RULE_reference_pattern = 66, RULE_tuple_struct_pattern = 67, RULE_tuple_struct_items = 68, 
		RULE_path_pattern = 69, RULE_type = 70, RULE_reference_type = 71, RULE_array_type = 72, 
		RULE_slice_type = 73, RULE_inferred_type = 74, RULE_path_in_expression = 75, 
		RULE_path_expr_segment = 76, RULE_path_ident_segment = 77, RULE_type_path = 78, 
		RULE_type_path_segment = 79;
	private static String[] makeRuleNames() {
		return new String[] {
			"crate", "item", "function", "function_parameters", "function_param", 
			"self_param", "struct", "struct_fields", "struct_field", "enumeration", 
			"enum_variants", "enum_variant", "constant_item", "trait", "implementation", 
			"inderent_impl", "trait_impl", "associated_item", "statement", "let_statement", 
			"expression_statement", "expression", "expression_without_block", "expression_with_block", 
			"literal_expression", "path_expression", "operator_expression", "borrow_expression", 
			"dereference_expression", "negation_expression", "arithmetic_or_logical_expression", 
			"comparison_expression", "lazy_boolean_expression", "assignment_expression", 
			"compound_assignment_expression", "grouped_expression", "array_expression", 
			"array_elements", "index_expression", "struct_expression", "struct_expr_fields", 
			"struct_expr_field", "call_expression", "call_params", "method_call_expression", 
			"field_expression", "continue_expression", "break_expression", "return_expression", 
			"underscore_expression", "block_expression", "statements", "const_block_expression", 
			"loop_expression", "infinite_loop_expression", "predicate_loop_expression", 
			"if_expression", "conditions", "match_expression", "scrutinee", "match_arms", 
			"match_arm", "pattern", "literal_pattern", "identifier_pattern", "wildcard_pattern", 
			"reference_pattern", "tuple_struct_pattern", "tuple_struct_items", "path_pattern", 
			"type", "reference_type", "array_type", "slice_type", "inferred_type", 
			"path_in_expression", "path_expr_segment", "path_ident_segment", "type_path", 
			"type_path_segment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'as'", "'break'", "'const'", "'continue'", "'crate'", "'else'", 
			"'enum'", "'false'", "'fn'", "'for'", "'if'", "'impl'", "'in'", "'let'", 
			"'loop'", "'match'", "'move'", "'mut'", "'pub'", "'ref'", "'return'", 
			"'self'", "'Self'", "'static'", "'struct'", "'super'", "'trait'", "'true'", 
			"'type'", "'unsafe'", "'use'", "'where'", "'while'", "'dyn'", null, null, 
			null, null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'^'", "'!'", "'<'", "'<='", "'=='", "'!='", "'>='", 
			"'>'", "'&&'", "'||'", "'<<'", "'>>'", "'&'", "'|'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<='", "'>>='", "'='", 
			"'_'", "'.'", "'..'", "'...'", "','", "';'", "':'", "'::'", "'->'", "'=>'", 
			"'?'", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AS", "BREAK", "CONST", "CONTINUE", "CRATE", "ELSE", "ENUM", "FALSE", 
			"FN", "FOR", "IF", "IMPL", "IN", "LET", "LOOP", "MATCH", "MOVE", "MUT", 
			"PUB", "REF", "RETURN", "SELF_KW", "SELF_TYPE", "STATIC", "STRUCT", "SUPER", 
			"TRAIT", "TRUE", "TYPE_KW", "UNSAFE", "USE", "WHERE", "WHILE", "DYN", 
			"WS", "LINE_COMMENT", "BLOCK_COMMENT", "INTEGER_LITERAL", "DEC_LITERAL", 
			"BIN_LITERAL", "OCT_LITERAL", "HEX_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", 
			"RAW_STRING_LITERAL", "RAW_STRING_CONTENT", "PLUS", "MINUS", "STAR", 
			"SLASH", "PERCENT", "CARET", "NOT", "LT", "LE", "EQEQ", "NE", "GE", "GT", 
			"ANDAND", "OROR", "SHL", "SHR", "AND", "OR", "PLUSEQ", "MINUSEQ", "STAREQ", 
			"SLASHEQ", "PERCENTEQ", "CARETEQ", "ANDEQ", "OREQ", "SHLEQ", "SHREQ", 
			"EQ", "UNDERSCORE", "DOT", "DOTDOT", "DOTDOTDOT", "COMMA", "SEMI", "COLON", 
			"PATHSEP", "RARROW", "FATARROW", "QUESTION", "LPAR", "RPAR", "LBKT", 
			"RBKT", "LBCE", "RBCE", "IDENTIFIER"
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
	public String getGrammarFileName() { return "Rx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Rx(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrateContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public TerminalNode EOF() { return getToken(Rx.EOF, 0); }
		public CrateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterCrate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitCrate(this);
		}
	}

	public final CrateContext crate() throws RecognitionException {
		CrateContext _localctx = new CrateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167776904L) != 0)) {
				{
				{
				setState(160);
				item();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(166);
				match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ItemContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public Constant_itemContext constant_item() {
			return getRuleContext(Constant_itemContext.class,0);
		}
		public TraitContext trait() {
			return getRuleContext(TraitContext.class,0);
		}
		public ImplementationContext implementation() {
			return getRuleContext(ImplementationContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_item);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				struct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				enumeration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				constant_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				trait();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(174);
				implementation();
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FN() { return getToken(Rx.FN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(Rx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Rx.RPAR, 0); }
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Rx.SEMI, 0); }
		public TerminalNode CONST() { return getToken(Rx.CONST, 0); }
		public Function_parametersContext function_parameters() {
			return getRuleContext(Function_parametersContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(Rx.RARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(177);
				match(CONST);
				}
			}

			setState(180);
			match(FN);
			setState(181);
			match(IDENTIFIER);
			setState(182);
			match(LPAR);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1153264827394949376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1073750017L) != 0)) {
				{
				setState(183);
				function_parameters();
				}
			}

			setState(186);
			match(RPAR);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(187);
				match(RARROW);
				setState(188);
				type();
				}
			}

			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBCE:
				{
				setState(191);
				block_expression();
				}
				break;
			case SEMI:
				{
				setState(192);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_parametersContext extends ParserRuleContext {
		public Self_paramContext self_param() {
			return getRuleContext(Self_paramContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public List<Function_paramContext> function_param() {
			return getRuleContexts(Function_paramContext.class);
		}
		public Function_paramContext function_param(int i) {
			return getRuleContext(Function_paramContext.class,i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitFunction_parameters(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_parameters);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				self_param();
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(196);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(199);
					self_param();
					setState(200);
					match(COMMA);
					}
					break;
				}
				setState(204);
				function_param();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(205);
					match(COMMA);
					setState(206);
					function_param();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class Function_paramContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode COLON() { return getToken(Rx.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitFunction_param(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			pattern();
			setState(215);
			match(COLON);
			setState(216);
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
	public static class Self_paramContext extends ParserRuleContext {
		public TerminalNode SELF_KW() { return getToken(Rx.SELF_KW, 0); }
		public TerminalNode AND() { return getToken(Rx.AND, 0); }
		public TerminalNode MUT() { return getToken(Rx.MUT, 0); }
		public TerminalNode COLON() { return getToken(Rx.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Self_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_self_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterSelf_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitSelf_param(this);
		}
	}

	public final Self_paramContext self_param() throws RecognitionException {
		Self_paramContext _localctx = new Self_paramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_self_param);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(218);
					match(AND);
					}
				}

				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUT) {
					{
					setState(221);
					match(MUT);
					}
				}

				setState(224);
				match(SELF_KW);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUT) {
					{
					setState(225);
					match(MUT);
					}
				}

				setState(228);
				match(SELF_KW);
				setState(229);
				match(COLON);
				setState(230);
				type();
				}
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
	public static class StructContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(Rx.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public TerminalNode SEMI() { return getToken(Rx.SEMI, 0); }
		public Struct_fieldsContext struct_fields() {
			return getRuleContext(Struct_fieldsContext.class,0);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitStruct(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(STRUCT);
			setState(234);
			match(IDENTIFIER);
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBCE:
				{
				setState(235);
				match(LBCE);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(236);
					struct_fields();
					}
				}

				setState(239);
				match(RBCE);
				}
				break;
			case SEMI:
				{
				setState(240);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_fieldsContext extends ParserRuleContext {
		public List<Struct_fieldContext> struct_field() {
			return getRuleContexts(Struct_fieldContext.class);
		}
		public Struct_fieldContext struct_field(int i) {
			return getRuleContext(Struct_fieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public Struct_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterStruct_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitStruct_fields(this);
		}
	}

	public final Struct_fieldsContext struct_fields() throws RecognitionException {
		Struct_fieldsContext _localctx = new Struct_fieldsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_struct_fields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			struct_field();
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					match(COMMA);
					setState(245);
					struct_field();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(251);
				match(COMMA);
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
	public static class Struct_fieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Rx.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Struct_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterStruct_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitStruct_field(this);
		}
	}

	public final Struct_fieldContext struct_field() throws RecognitionException {
		Struct_fieldContext _localctx = new Struct_fieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_struct_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(IDENTIFIER);
			setState(255);
			match(COLON);
			setState(256);
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
	public static class EnumerationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(Rx.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public Enum_variantsContext enum_variants() {
			return getRuleContext(Enum_variantsContext.class,0);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitEnumeration(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ENUM);
			setState(259);
			match(IDENTIFIER);
			setState(260);
			match(LBCE);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(261);
				enum_variants();
				}
			}

			setState(264);
			match(RBCE);
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
	public static class Enum_variantsContext extends ParserRuleContext {
		public List<Enum_variantContext> enum_variant() {
			return getRuleContexts(Enum_variantContext.class);
		}
		public Enum_variantContext enum_variant(int i) {
			return getRuleContext(Enum_variantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public Enum_variantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_variants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterEnum_variants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitEnum_variants(this);
		}
	}

	public final Enum_variantsContext enum_variants() throws RecognitionException {
		Enum_variantsContext _localctx = new Enum_variantsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enum_variants);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			enum_variant();
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					match(COMMA);
					setState(268);
					enum_variant();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(274);
				match(COMMA);
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
	public static class Enum_variantContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public Enum_variantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterEnum_variant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitEnum_variant(this);
		}
	}

	public final Enum_variantContext enum_variant() throws RecognitionException {
		Enum_variantContext _localctx = new Enum_variantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enum_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
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
	public static class Constant_itemContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(Rx.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Rx.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Rx.SEMI, 0); }
		public TerminalNode EQ() { return getToken(Rx.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterConstant_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitConstant_item(this);
		}
	}

	public final Constant_itemContext constant_item() throws RecognitionException {
		Constant_itemContext _localctx = new Constant_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(CONST);
			setState(280);
			match(IDENTIFIER);
			setState(281);
			match(COLON);
			setState(282);
			type();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(283);
				match(EQ);
				setState(284);
				expression(0);
				}
			}

			setState(287);
			match(SEMI);
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
	public static class TraitContext extends ParserRuleContext {
		public TerminalNode TRAIT() { return getToken(Rx.TRAIT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public List<Associated_itemContext> associated_item() {
			return getRuleContexts(Associated_itemContext.class);
		}
		public Associated_itemContext associated_item(int i) {
			return getRuleContext(Associated_itemContext.class,i);
		}
		public TraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitTrait(this);
		}
	}

	public final TraitContext trait() throws RecognitionException {
		TraitContext _localctx = new TraitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_trait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(TRAIT);
			setState(290);
			match(IDENTIFIER);
			setState(291);
			match(LBCE);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==FN) {
				{
				{
				setState(292);
				associated_item();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(RBCE);
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
	public static class ImplementationContext extends ParserRuleContext {
		public Inderent_implContext inderent_impl() {
			return getRuleContext(Inderent_implContext.class,0);
		}
		public Trait_implContext trait_impl() {
			return getRuleContext(Trait_implContext.class,0);
		}
		public ImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitImplementation(this);
		}
	}

	public final ImplementationContext implementation() throws RecognitionException {
		ImplementationContext _localctx = new ImplementationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_implementation);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				inderent_impl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				trait_impl();
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
	public static class Inderent_implContext extends ParserRuleContext {
		public TerminalNode IMPL() { return getToken(Rx.IMPL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public List<Associated_itemContext> associated_item() {
			return getRuleContexts(Associated_itemContext.class);
		}
		public Associated_itemContext associated_item(int i) {
			return getRuleContext(Associated_itemContext.class,i);
		}
		public Inderent_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inderent_impl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterInderent_impl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitInderent_impl(this);
		}
	}

	public final Inderent_implContext inderent_impl() throws RecognitionException {
		Inderent_implContext _localctx = new Inderent_implContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inderent_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IMPL);
			setState(305);
			type();
			setState(306);
			match(LBCE);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==FN) {
				{
				{
				setState(307);
				associated_item();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(RBCE);
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
	public static class Trait_implContext extends ParserRuleContext {
		public TerminalNode IMPL() { return getToken(Rx.IMPL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode FOR() { return getToken(Rx.FOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public List<Associated_itemContext> associated_item() {
			return getRuleContexts(Associated_itemContext.class);
		}
		public Associated_itemContext associated_item(int i) {
			return getRuleContext(Associated_itemContext.class,i);
		}
		public Trait_implContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trait_impl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterTrait_impl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitTrait_impl(this);
		}
	}

	public final Trait_implContext trait_impl() throws RecognitionException {
		Trait_implContext _localctx = new Trait_implContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trait_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(IMPL);
			setState(316);
			match(IDENTIFIER);
			setState(317);
			match(FOR);
			setState(318);
			type();
			setState(319);
			match(LBCE);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==FN) {
				{
				{
				setState(320);
				associated_item();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			match(RBCE);
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
	public static class Associated_itemContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Constant_itemContext constant_item() {
			return getRuleContext(Constant_itemContext.class,0);
		}
		public Associated_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associated_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterAssociated_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitAssociated_item(this);
		}
	}

	public final Associated_itemContext associated_item() throws RecognitionException {
		Associated_itemContext _localctx = new Associated_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_associated_item);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				constant_item();
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
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(Rx.SEMI, 0); }
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public Let_statementContext let_statement() {
			return getRuleContext(Let_statementContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				let_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				expression_statement();
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
	public static class Let_statementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(Rx.LET, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Rx.SEMI, 0); }
		public TerminalNode COLON() { return getToken(Rx.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Rx.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Let_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterLet_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitLet_statement(this);
		}
	}

	public final Let_statementContext let_statement() throws RecognitionException {
		Let_statementContext _localctx = new Let_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_let_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(LET);
			setState(339);
			pattern();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(340);
				match(COLON);
				setState(341);
				type();
				}
			}

			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(344);
				match(EQ);
				setState(345);
				expression(0);
				}
			}

			setState(348);
			match(SEMI);
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
	public static class Expression_statementContext extends ParserRuleContext {
		public Expression_without_blockContext expression_without_block() {
			return getRuleContext(Expression_without_blockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Rx.SEMI, 0); }
		public Expression_with_blockContext expression_with_block() {
			return getRuleContext(Expression_with_blockContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitExpression_statement(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression_statement);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				expression_without_block();
				setState(351);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				expression_with_block();
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(354);
					match(SEMI);
					}
					break;
				}
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(Rx.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(Rx.RPAR, 0); }
		public TerminalNode AND() { return getToken(Rx.AND, 0); }
		public TerminalNode ANDAND() { return getToken(Rx.ANDAND, 0); }
		public TerminalNode MUT() { return getToken(Rx.MUT, 0); }
		public TerminalNode STAR() { return getToken(Rx.STAR, 0); }
		public TerminalNode NOT() { return getToken(Rx.NOT, 0); }
		public TerminalNode MINUS() { return getToken(Rx.MINUS, 0); }
		public TerminalNode LBKT() { return getToken(Rx.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(Rx.RBKT, 0); }
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public Path_in_expressionContext path_in_expression() {
			return getRuleContext(Path_in_expressionContext.class,0);
		}
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public Struct_expr_fieldsContext struct_expr_fields() {
			return getRuleContext(Struct_expr_fieldsContext.class,0);
		}
		public Continue_expressionContext continue_expression() {
			return getRuleContext(Continue_expressionContext.class,0);
		}
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Return_expressionContext return_expression() {
			return getRuleContext(Return_expressionContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Underscore_expressionContext underscore_expression() {
			return getRuleContext(Underscore_expressionContext.class,0);
		}
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public Const_block_expressionContext const_block_expression() {
			return getRuleContext(Const_block_expressionContext.class,0);
		}
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public Match_expressionContext match_expression() {
			return getRuleContext(Match_expressionContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(Rx.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(Rx.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(Rx.PLUS, 0); }
		public TerminalNode SHL() { return getToken(Rx.SHL, 0); }
		public TerminalNode SHR() { return getToken(Rx.SHR, 0); }
		public TerminalNode LT() { return getToken(Rx.LT, 0); }
		public TerminalNode LE() { return getToken(Rx.LE, 0); }
		public TerminalNode EQEQ() { return getToken(Rx.EQEQ, 0); }
		public TerminalNode NE() { return getToken(Rx.NE, 0); }
		public TerminalNode GE() { return getToken(Rx.GE, 0); }
		public TerminalNode GT() { return getToken(Rx.GT, 0); }
		public TerminalNode CARET() { return getToken(Rx.CARET, 0); }
		public TerminalNode OR() { return getToken(Rx.OR, 0); }
		public TerminalNode OROR() { return getToken(Rx.OROR, 0); }
		public TerminalNode EQ() { return getToken(Rx.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(Rx.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(Rx.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(Rx.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(Rx.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(Rx.PERCENTEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(Rx.CARETEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(Rx.ANDEQ, 0); }
		public TerminalNode OREQ() { return getToken(Rx.OREQ, 0); }
		public TerminalNode SHLEQ() { return getToken(Rx.SHLEQ, 0); }
		public TerminalNode SHREQ() { return getToken(Rx.SHREQ, 0); }
		public TerminalNode DOT() { return getToken(Rx.DOT, 0); }
		public Path_expr_segmentContext path_expr_segment() {
			return getRuleContext(Path_expr_segmentContext.class,0);
		}
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(360);
				match(LPAR);
				setState(361);
				expression(0);
				setState(362);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(364);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(365);
				expression(25);
				}
				break;
			case 3:
				{
				setState(366);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(367);
				match(MUT);
				setState(368);
				expression(24);
				}
				break;
			case 4:
				{
				setState(369);
				match(STAR);
				setState(370);
				expression(23);
				}
				break;
			case 5:
				{
				setState(371);
				match(NOT);
				setState(372);
				expression(22);
				}
				break;
			case 6:
				{
				setState(373);
				match(MINUS);
				setState(374);
				expression(21);
				}
				break;
			case 7:
				{
				setState(375);
				match(LBKT);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(376);
					array_elements();
					}
				}

				setState(379);
				match(RBKT);
				}
				break;
			case 8:
				{
				setState(380);
				path_in_expression();
				setState(381);
				match(LBCE);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(382);
					struct_expr_fields();
					}
				}

				setState(385);
				match(RBCE);
				}
				break;
			case 9:
				{
				setState(387);
				continue_expression();
				}
				break;
			case 10:
				{
				setState(388);
				break_expression();
				}
				break;
			case 11:
				{
				setState(389);
				return_expression();
				}
				break;
			case 12:
				{
				setState(390);
				literal_expression();
				}
				break;
			case 13:
				{
				setState(391);
				path_expression();
				}
				break;
			case 14:
				{
				setState(392);
				underscore_expression();
				}
				break;
			case 15:
				{
				setState(393);
				block_expression();
				}
				break;
			case 16:
				{
				setState(394);
				const_block_expression();
				}
				break;
			case 17:
				{
				setState(395);
				loop_expression();
				}
				break;
			case 18:
				{
				setState(396);
				if_expression();
				}
				break;
			case 19:
				{
				setState(397);
				match_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(444);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(400);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(401);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(402);
						expression(21);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(403);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(404);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(405);
						expression(20);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(406);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(407);
						_la = _input.LA(1);
						if ( !(_la==SHL || _la==SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(408);
						expression(19);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(409);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(410);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1134907106097364992L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(411);
						expression(18);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(412);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(413);
						_la = _input.LA(1);
						if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 12289L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(414);
						expression(17);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(415);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(416);
						_la = _input.LA(1);
						if ( !(_la==ANDAND || _la==OROR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(417);
						expression(16);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(418);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(419);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2047L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(420);
						expression(14);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(421);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(422);
						match(DOT);
						setState(423);
						path_expr_segment();
						setState(424);
						match(LPAR);
						setState(426);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
							{
							setState(425);
							call_params();
							}
						}

						setState(428);
						match(RPAR);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(430);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(431);
						match(DOT);
						setState(432);
						match(IDENTIFIER);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(433);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(434);
						match(LBKT);
						setState(435);
						expression(0);
						setState(436);
						match(RBKT);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(438);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(439);
						match(LPAR);
						setState(441);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
							{
							setState(440);
							call_params();
							}
						}

						setState(443);
						match(RPAR);
						}
						break;
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_without_blockContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(Rx.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(Rx.RPAR, 0); }
		public TerminalNode EQ() { return getToken(Rx.EQ, 0); }
		public TerminalNode PLUSEQ() { return getToken(Rx.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(Rx.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(Rx.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(Rx.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(Rx.PERCENTEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(Rx.CARETEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(Rx.ANDEQ, 0); }
		public TerminalNode OREQ() { return getToken(Rx.OREQ, 0); }
		public TerminalNode SHLEQ() { return getToken(Rx.SHLEQ, 0); }
		public TerminalNode SHREQ() { return getToken(Rx.SHREQ, 0); }
		public TerminalNode ANDAND() { return getToken(Rx.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(Rx.OROR, 0); }
		public TerminalNode AND() { return getToken(Rx.AND, 0); }
		public TerminalNode CARET() { return getToken(Rx.CARET, 0); }
		public TerminalNode OR() { return getToken(Rx.OR, 0); }
		public TerminalNode LT() { return getToken(Rx.LT, 0); }
		public TerminalNode LE() { return getToken(Rx.LE, 0); }
		public TerminalNode EQEQ() { return getToken(Rx.EQEQ, 0); }
		public TerminalNode NE() { return getToken(Rx.NE, 0); }
		public TerminalNode GE() { return getToken(Rx.GE, 0); }
		public TerminalNode GT() { return getToken(Rx.GT, 0); }
		public TerminalNode SHL() { return getToken(Rx.SHL, 0); }
		public TerminalNode SHR() { return getToken(Rx.SHR, 0); }
		public TerminalNode PLUS() { return getToken(Rx.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Rx.MINUS, 0); }
		public TerminalNode STAR() { return getToken(Rx.STAR, 0); }
		public TerminalNode SLASH() { return getToken(Rx.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(Rx.PERCENT, 0); }
		public TerminalNode NOT() { return getToken(Rx.NOT, 0); }
		public TerminalNode MUT() { return getToken(Rx.MUT, 0); }
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public TerminalNode LBKT() { return getToken(Rx.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(Rx.RBKT, 0); }
		public TerminalNode DOT() { return getToken(Rx.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public Path_expr_segmentContext path_expr_segment() {
			return getRuleContext(Path_expr_segmentContext.class,0);
		}
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public Path_in_expressionContext path_in_expression() {
			return getRuleContext(Path_in_expressionContext.class,0);
		}
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public Struct_expr_fieldsContext struct_expr_fields() {
			return getRuleContext(Struct_expr_fieldsContext.class,0);
		}
		public Continue_expressionContext continue_expression() {
			return getRuleContext(Continue_expressionContext.class,0);
		}
		public Break_expressionContext break_expression() {
			return getRuleContext(Break_expressionContext.class,0);
		}
		public Return_expressionContext return_expression() {
			return getRuleContext(Return_expressionContext.class,0);
		}
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public Underscore_expressionContext underscore_expression() {
			return getRuleContext(Underscore_expressionContext.class,0);
		}
		public Expression_without_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_without_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterExpression_without_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitExpression_without_block(this);
		}
	}

	public final Expression_without_blockContext expression_without_block() throws RecognitionException {
		Expression_without_blockContext _localctx = new Expression_without_blockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression_without_block);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(LPAR);
				setState(450);
				expression(0);
				setState(451);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				expression(0);
				setState(454);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2047L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(455);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				expression(0);
				setState(458);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==OROR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(459);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				expression(0);
				setState(462);
				_la = _input.LA(1);
				if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 12289L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(463);
				expression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(465);
				expression(0);
				setState(466);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1134907106097364992L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(467);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(469);
				expression(0);
				setState(470);
				_la = _input.LA(1);
				if ( !(_la==SHL || _la==SHR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(471);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(473);
				expression(0);
				setState(474);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(475);
				expression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(477);
				expression(0);
				setState(478);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				expression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(481);
				match(NOT);
				setState(482);
				expression(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(483);
				match(MINUS);
				setState(484);
				expression(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(485);
				match(STAR);
				setState(486);
				expression(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(488);
				expression(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(489);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(490);
				match(MUT);
				setState(491);
				expression(0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(492);
				expression(0);
				setState(493);
				match(LPAR);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(494);
					call_params();
					}
				}

				setState(497);
				match(RPAR);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(499);
				expression(0);
				setState(500);
				match(LBKT);
				setState(501);
				expression(0);
				setState(502);
				match(RBKT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(504);
				expression(0);
				setState(505);
				match(DOT);
				setState(506);
				match(IDENTIFIER);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(508);
				expression(0);
				setState(509);
				match(DOT);
				setState(510);
				path_expr_segment();
				setState(511);
				match(LPAR);
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(512);
					call_params();
					}
				}

				setState(515);
				match(RPAR);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(517);
				match(LBKT);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(518);
					array_elements();
					}
				}

				setState(521);
				match(RBKT);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(522);
				path_in_expression();
				setState(523);
				match(LBCE);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(524);
					struct_expr_fields();
					}
				}

				setState(527);
				match(RBCE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(529);
				continue_expression();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(530);
				break_expression();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(531);
				return_expression();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(532);
				literal_expression();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(533);
				path_expression();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(534);
				underscore_expression();
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
	public static class Expression_with_blockContext extends ParserRuleContext {
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public Const_block_expressionContext const_block_expression() {
			return getRuleContext(Const_block_expressionContext.class,0);
		}
		public Loop_expressionContext loop_expression() {
			return getRuleContext(Loop_expressionContext.class,0);
		}
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public Match_expressionContext match_expression() {
			return getRuleContext(Match_expressionContext.class,0);
		}
		public Expression_with_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_with_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterExpression_with_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitExpression_with_block(this);
		}
	}

	public final Expression_with_blockContext expression_with_block() throws RecognitionException {
		Expression_with_blockContext _localctx = new Expression_with_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression_with_block);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				block_expression();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				const_block_expression();
				}
				break;
			case LOOP:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				loop_expression();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				if_expression();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				match_expression();
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
	public static class Literal_expressionContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(Rx.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(Rx.STRING_LITERAL, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(Rx.RAW_STRING_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(Rx.INTEGER_LITERAL, 0); }
		public TerminalNode TRUE() { return getToken(Rx.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Rx.FALSE, 0); }
		public Literal_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterLiteral_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitLiteral_expression(this);
		}
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61847797498112L) != 0)) ) {
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
	public static class Path_expressionContext extends ParserRuleContext {
		public Path_in_expressionContext path_in_expression() {
			return getRuleContext(Path_in_expressionContext.class,0);
		}
		public Path_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterPath_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitPath_expression(this);
		}
	}

	public final Path_expressionContext path_expression() throws RecognitionException {
		Path_expressionContext _localctx = new Path_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_path_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			path_in_expression();
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
	public static class Operator_expressionContext extends ParserRuleContext {
		public Borrow_expressionContext borrow_expression() {
			return getRuleContext(Borrow_expressionContext.class,0);
		}
		public Dereference_expressionContext dereference_expression() {
			return getRuleContext(Dereference_expressionContext.class,0);
		}
		public Negation_expressionContext negation_expression() {
			return getRuleContext(Negation_expressionContext.class,0);
		}
		public Arithmetic_or_logical_expressionContext arithmetic_or_logical_expression() {
			return getRuleContext(Arithmetic_or_logical_expressionContext.class,0);
		}
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public Lazy_boolean_expressionContext lazy_boolean_expression() {
			return getRuleContext(Lazy_boolean_expressionContext.class,0);
		}
		public Assignment_expressionContext assignment_expression() {
			return getRuleContext(Assignment_expressionContext.class,0);
		}
		public Compound_assignment_expressionContext compound_assignment_expression() {
			return getRuleContext(Compound_assignment_expressionContext.class,0);
		}
		public Operator_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterOperator_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitOperator_expression(this);
		}
	}

	public final Operator_expressionContext operator_expression() throws RecognitionException {
		Operator_expressionContext _localctx = new Operator_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_operator_expression);
		try {
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				borrow_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				dereference_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				negation_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				arithmetic_or_logical_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(552);
				comparison_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(553);
				lazy_boolean_expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(554);
				assignment_expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(555);
				compound_assignment_expression();
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
	public static class Borrow_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AND() { return getToken(Rx.AND, 0); }
		public TerminalNode ANDAND() { return getToken(Rx.ANDAND, 0); }
		public TerminalNode MUT() { return getToken(Rx.MUT, 0); }
		public Borrow_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_borrow_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterBorrow_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitBorrow_expression(this);
		}
	}

	public final Borrow_expressionContext borrow_expression() throws RecognitionException {
		Borrow_expressionContext _localctx = new Borrow_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_borrow_expression);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(559);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(561);
				match(MUT);
				setState(562);
				expression(0);
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
	public static class Dereference_expressionContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(Rx.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Dereference_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dereference_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterDereference_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitDereference_expression(this);
		}
	}

	public final Dereference_expressionContext dereference_expression() throws RecognitionException {
		Dereference_expressionContext _localctx = new Dereference_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dereference_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(STAR);
			setState(566);
			expression(0);
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
	public static class Negation_expressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Rx.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(Rx.MINUS, 0); }
		public Negation_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterNegation_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitNegation_expression(this);
		}
	}

	public final Negation_expressionContext negation_expression() throws RecognitionException {
		Negation_expressionContext _localctx = new Negation_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_negation_expression);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(NOT);
				setState(569);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(MINUS);
				setState(571);
				expression(0);
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
	public static class Arithmetic_or_logical_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(Rx.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Rx.MINUS, 0); }
		public TerminalNode STAR() { return getToken(Rx.STAR, 0); }
		public TerminalNode SLASH() { return getToken(Rx.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(Rx.PERCENT, 0); }
		public TerminalNode CARET() { return getToken(Rx.CARET, 0); }
		public TerminalNode AND() { return getToken(Rx.AND, 0); }
		public TerminalNode OR() { return getToken(Rx.OR, 0); }
		public TerminalNode SHL() { return getToken(Rx.SHL, 0); }
		public TerminalNode SHR() { return getToken(Rx.SHR, 0); }
		public Arithmetic_or_logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_or_logical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterArithmetic_or_logical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitArithmetic_or_logical_expression(this);
		}
	}

	public final Arithmetic_or_logical_expressionContext arithmetic_or_logical_expression() throws RecognitionException {
		Arithmetic_or_logical_expressionContext _localctx = new Arithmetic_or_logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arithmetic_or_logical_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			expression(0);
			setState(575);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 491583L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(576);
			expression(0);
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
	public static class Comparison_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(Rx.LT, 0); }
		public TerminalNode LE() { return getToken(Rx.LE, 0); }
		public TerminalNode EQEQ() { return getToken(Rx.EQEQ, 0); }
		public TerminalNode NE() { return getToken(Rx.NE, 0); }
		public TerminalNode GE() { return getToken(Rx.GE, 0); }
		public TerminalNode GT() { return getToken(Rx.GT, 0); }
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterComparison_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitComparison_expression(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			expression(0);
			setState(579);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1134907106097364992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(580);
			expression(0);
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
	public static class Lazy_boolean_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ANDAND() { return getToken(Rx.ANDAND, 0); }
		public TerminalNode OROR() { return getToken(Rx.OROR, 0); }
		public Lazy_boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazy_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterLazy_boolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitLazy_boolean_expression(this);
		}
	}

	public final Lazy_boolean_expressionContext lazy_boolean_expression() throws RecognitionException {
		Lazy_boolean_expressionContext _localctx = new Lazy_boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lazy_boolean_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			expression(0);
			setState(583);
			_la = _input.LA(1);
			if ( !(_la==ANDAND || _la==OROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(584);
			expression(0);
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
	public static class Assignment_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(Rx.EQ, 0); }
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitAssignment_expression(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			expression(0);
			setState(587);
			match(EQ);
			setState(588);
			expression(0);
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
	public static class Compound_assignment_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUSEQ() { return getToken(Rx.PLUSEQ, 0); }
		public TerminalNode MINUSEQ() { return getToken(Rx.MINUSEQ, 0); }
		public TerminalNode STAREQ() { return getToken(Rx.STAREQ, 0); }
		public TerminalNode SLASHEQ() { return getToken(Rx.SLASHEQ, 0); }
		public TerminalNode PERCENTEQ() { return getToken(Rx.PERCENTEQ, 0); }
		public TerminalNode CARETEQ() { return getToken(Rx.CARETEQ, 0); }
		public TerminalNode ANDEQ() { return getToken(Rx.ANDEQ, 0); }
		public TerminalNode OREQ() { return getToken(Rx.OREQ, 0); }
		public TerminalNode SHLEQ() { return getToken(Rx.SHLEQ, 0); }
		public TerminalNode SHREQ() { return getToken(Rx.SHREQ, 0); }
		public Compound_assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterCompound_assignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitCompound_assignment_expression(this);
		}
	}

	public final Compound_assignment_expressionContext compound_assignment_expression() throws RecognitionException {
		Compound_assignment_expressionContext _localctx = new Compound_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_compound_assignment_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			expression(0);
			setState(591);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1023L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(592);
			expression(0);
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
	public static class Grouped_expressionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(Rx.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(Rx.RPAR, 0); }
		public Grouped_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouped_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterGrouped_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitGrouped_expression(this);
		}
	}

	public final Grouped_expressionContext grouped_expression() throws RecognitionException {
		Grouped_expressionContext _localctx = new Grouped_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_grouped_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(LPAR);
			setState(595);
			expression(0);
			setState(596);
			match(RPAR);
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
	public static class Array_expressionContext extends ParserRuleContext {
		public TerminalNode LBKT() { return getToken(Rx.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(Rx.RBKT, 0); }
		public Array_elementsContext array_elements() {
			return getRuleContext(Array_elementsContext.class,0);
		}
		public Array_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterArray_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitArray_expression(this);
		}
	}

	public final Array_expressionContext array_expression() throws RecognitionException {
		Array_expressionContext _localctx = new Array_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_array_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(LBKT);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
				{
				setState(599);
				array_elements();
				}
			}

			setState(602);
			match(RBKT);
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
	public static class Array_elementsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public TerminalNode SEMI() { return getToken(Rx.SEMI, 0); }
		public Array_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterArray_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitArray_elements(this);
		}
	}

	public final Array_elementsContext array_elements() throws RecognitionException {
		Array_elementsContext _localctx = new Array_elementsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_array_elements);
		int _la;
		try {
			int _alt;
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(604);
				expression(0);
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(605);
						match(COMMA);
						setState(606);
						expression(0);
						}
						} 
					}
					setState(611);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(612);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				expression(0);
				setState(616);
				match(SEMI);
				setState(617);
				expression(0);
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
	public static class Index_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBKT() { return getToken(Rx.LBKT, 0); }
		public TerminalNode RBKT() { return getToken(Rx.RBKT, 0); }
		public Index_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterIndex_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitIndex_expression(this);
		}
	}

	public final Index_expressionContext index_expression() throws RecognitionException {
		Index_expressionContext _localctx = new Index_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_index_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			expression(0);
			setState(622);
			match(LBKT);
			setState(623);
			expression(0);
			setState(624);
			match(RBKT);
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
	public static class Struct_expressionContext extends ParserRuleContext {
		public Path_in_expressionContext path_in_expression() {
			return getRuleContext(Path_in_expressionContext.class,0);
		}
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public Struct_expr_fieldsContext struct_expr_fields() {
			return getRuleContext(Struct_expr_fieldsContext.class,0);
		}
		public Struct_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterStruct_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitStruct_expression(this);
		}
	}

	public final Struct_expressionContext struct_expression() throws RecognitionException {
		Struct_expressionContext _localctx = new Struct_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_struct_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			path_in_expression();
			setState(627);
			match(LBCE);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(628);
				struct_expr_fields();
				}
			}

			setState(631);
			match(RBCE);
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
	public static class Struct_expr_fieldsContext extends ParserRuleContext {
		public List<Struct_expr_fieldContext> struct_expr_field() {
			return getRuleContexts(Struct_expr_fieldContext.class);
		}
		public Struct_expr_fieldContext struct_expr_field(int i) {
			return getRuleContext(Struct_expr_fieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public Struct_expr_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_expr_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterStruct_expr_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitStruct_expr_fields(this);
		}
	}

	public final Struct_expr_fieldsContext struct_expr_fields() throws RecognitionException {
		Struct_expr_fieldsContext _localctx = new Struct_expr_fieldsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_struct_expr_fields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			struct_expr_field();
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(634);
					match(COMMA);
					setState(635);
					struct_expr_field();
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(641);
				match(COMMA);
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
	public static class Struct_expr_fieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(Rx.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Struct_expr_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_expr_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterStruct_expr_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitStruct_expr_field(this);
		}
	}

	public final Struct_expr_fieldContext struct_expr_field() throws RecognitionException {
		Struct_expr_fieldContext _localctx = new Struct_expr_fieldContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_struct_expr_field);
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				match(IDENTIFIER);
				setState(645);
				match(COLON);
				setState(646);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647);
				match(IDENTIFIER);
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
	public static class Call_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(Rx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Rx.RPAR, 0); }
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public Call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterCall_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitCall_expression(this);
		}
	}

	public final Call_expressionContext call_expression() throws RecognitionException {
		Call_expressionContext _localctx = new Call_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			expression(0);
			setState(651);
			match(LPAR);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
				{
				setState(652);
				call_params();
				}
			}

			setState(655);
			match(RPAR);
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
	public static class Call_paramsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public Call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterCall_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitCall_params(this);
		}
	}

	public final Call_paramsContext call_params() throws RecognitionException {
		Call_paramsContext _localctx = new Call_paramsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_call_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			expression(0);
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(658);
					match(COMMA);
					setState(659);
					expression(0);
					}
					} 
				}
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(665);
				match(COMMA);
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
	public static class Method_call_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Rx.DOT, 0); }
		public Path_expr_segmentContext path_expr_segment() {
			return getRuleContext(Path_expr_segmentContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(Rx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Rx.RPAR, 0); }
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public Method_call_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterMethod_call_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitMethod_call_expression(this);
		}
	}

	public final Method_call_expressionContext method_call_expression() throws RecognitionException {
		Method_call_expressionContext _localctx = new Method_call_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_method_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			expression(0);
			setState(669);
			match(DOT);
			setState(670);
			path_expr_segment();
			setState(671);
			match(LPAR);
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
				{
				setState(672);
				call_params();
				}
			}

			setState(675);
			match(RPAR);
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
	public static class Field_expressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Rx.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public Field_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterField_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitField_expression(this);
		}
	}

	public final Field_expressionContext field_expression() throws RecognitionException {
		Field_expressionContext _localctx = new Field_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_field_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			expression(0);
			setState(678);
			match(DOT);
			setState(679);
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
	public static class Continue_expressionContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(Rx.CONTINUE, 0); }
		public Continue_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterContinue_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitContinue_expression(this);
		}
	}

	public final Continue_expressionContext continue_expression() throws RecognitionException {
		Continue_expressionContext _localctx = new Continue_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_continue_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(CONTINUE);
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
	public static class Break_expressionContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(Rx.BREAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Break_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterBreak_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitBreak_expression(this);
		}
	}

	public final Break_expressionContext break_expression() throws RecognitionException {
		Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_break_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(BREAK);
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(684);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Return_expressionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Rx.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterReturn_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitReturn_expression(this);
		}
	}

	public final Return_expressionContext return_expression() throws RecognitionException {
		Return_expressionContext _localctx = new Return_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_return_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(RETURN);
			setState(689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(688);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Underscore_expressionContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Rx.UNDERSCORE, 0); }
		public Underscore_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underscore_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterUnderscore_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitUnderscore_expression(this);
		}
	}

	public final Underscore_expressionContext underscore_expression() throws RecognitionException {
		Underscore_expressionContext _localctx = new Underscore_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_underscore_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(UNDERSCORE);
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
	public static class Block_expressionContext extends ParserRuleContext {
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Block_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterBlock_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitBlock_expression(this);
		}
	}

	public final Block_expressionContext block_expression() throws RecognitionException {
		Block_expressionContext _localctx = new Block_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_block_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(LBCE);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985361726364L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426333697L) != 0)) {
				{
				setState(694);
				statements();
				}
			}

			setState(697);
			match(RBCE);
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
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Expression_without_blockContext expression_without_block() {
			return getRuleContext(Expression_without_blockContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statements);
		int _la;
		try {
			int _alt;
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(699);
					statement();
					}
					}
					setState(702); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985361726364L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426333697L) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(704);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(707); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(709);
				expression_without_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				expression_without_block();
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
	public static class Const_block_expressionContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(Rx.CONST, 0); }
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public Const_block_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_block_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterConst_block_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitConst_block_expression(this);
		}
	}

	public final Const_block_expressionContext const_block_expression() throws RecognitionException {
		Const_block_expressionContext _localctx = new Const_block_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_const_block_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(CONST);
			setState(715);
			block_expression();
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
	public static class Loop_expressionContext extends ParserRuleContext {
		public Infinite_loop_expressionContext infinite_loop_expression() {
			return getRuleContext(Infinite_loop_expressionContext.class,0);
		}
		public Predicate_loop_expressionContext predicate_loop_expression() {
			return getRuleContext(Predicate_loop_expressionContext.class,0);
		}
		public Loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterLoop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitLoop_expression(this);
		}
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_loop_expression);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				infinite_loop_expression();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				predicate_loop_expression();
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
	public static class Infinite_loop_expressionContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(Rx.LOOP, 0); }
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public Infinite_loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infinite_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterInfinite_loop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitInfinite_loop_expression(this);
		}
	}

	public final Infinite_loop_expressionContext infinite_loop_expression() throws RecognitionException {
		Infinite_loop_expressionContext _localctx = new Infinite_loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_infinite_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(LOOP);
			setState(722);
			block_expression();
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
	public static class Predicate_loop_expressionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(Rx.WHILE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public Block_expressionContext block_expression() {
			return getRuleContext(Block_expressionContext.class,0);
		}
		public Predicate_loop_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate_loop_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterPredicate_loop_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitPredicate_loop_expression(this);
		}
	}

	public final Predicate_loop_expressionContext predicate_loop_expression() throws RecognitionException {
		Predicate_loop_expressionContext _localctx = new Predicate_loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_predicate_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(WHILE);
			setState(725);
			conditions();
			setState(726);
			block_expression();
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
	public static class If_expressionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Rx.IF, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<Block_expressionContext> block_expression() {
			return getRuleContexts(Block_expressionContext.class);
		}
		public Block_expressionContext block_expression(int i) {
			return getRuleContext(Block_expressionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Rx.ELSE, 0); }
		public If_expressionContext if_expression() {
			return getRuleContext(If_expressionContext.class,0);
		}
		public If_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterIf_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitIf_expression(this);
		}
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(IF);
			setState(729);
			conditions();
			setState(730);
			block_expression();
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(731);
				match(ELSE);
				setState(734);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(732);
					if_expression();
					}
					break;
				case LBCE:
					{
					setState(733);
					block_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitConditions(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_conditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			expression(0);
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
	public static class Match_expressionContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(Rx.MATCH, 0); }
		public ScrutineeContext scrutinee() {
			return getRuleContext(ScrutineeContext.class,0);
		}
		public TerminalNode LBCE() { return getToken(Rx.LBCE, 0); }
		public TerminalNode RBCE() { return getToken(Rx.RBCE, 0); }
		public Match_armsContext match_arms() {
			return getRuleContext(Match_armsContext.class,0);
		}
		public Match_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterMatch_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitMatch_expression(this);
		}
	}

	public final Match_expressionContext match_expression() throws RecognitionException {
		Match_expressionContext _localctx = new Match_expressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_match_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(MATCH);
			setState(741);
			scrutinee();
			setState(742);
			match(LBCE);
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1153264827394949376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1073750017L) != 0)) {
				{
				setState(743);
				match_arms();
				}
			}

			setState(746);
			match(RBCE);
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
	public static class ScrutineeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScrutineeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrutinee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterScrutinee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitScrutinee(this);
		}
	}

	public final ScrutineeContext scrutinee() throws RecognitionException {
		ScrutineeContext _localctx = new ScrutineeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_scrutinee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			expression(0);
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
	public static class Match_armsContext extends ParserRuleContext {
		public List<Match_armContext> match_arm() {
			return getRuleContexts(Match_armContext.class);
		}
		public Match_armContext match_arm(int i) {
			return getRuleContext(Match_armContext.class,i);
		}
		public List<TerminalNode> FATARROW() { return getTokens(Rx.FATARROW); }
		public TerminalNode FATARROW(int i) {
			return getToken(Rx.FATARROW, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public List<Expression_without_blockContext> expression_without_block() {
			return getRuleContexts(Expression_without_blockContext.class);
		}
		public Expression_without_blockContext expression_without_block(int i) {
			return getRuleContext(Expression_without_blockContext.class,i);
		}
		public List<Expression_with_blockContext> expression_with_block() {
			return getRuleContexts(Expression_with_blockContext.class);
		}
		public Expression_with_blockContext expression_with_block(int i) {
			return getRuleContext(Expression_with_blockContext.class,i);
		}
		public Match_armsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_arms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterMatch_arms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitMatch_arms(this);
		}
	}

	public final Match_armsContext match_arms() throws RecognitionException {
		Match_armsContext _localctx = new Match_armsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_match_arms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(750);
					match_arm();
					setState(751);
					match(FATARROW);
					setState(759);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
					case 1:
						{
						setState(752);
						expression_without_block();
						setState(753);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(755);
						expression_with_block();
						setState(757);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(756);
							match(COMMA);
							}
						}

						}
						break;
					}
					}
					} 
				}
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(766);
			match_arm();
			setState(767);
			match(FATARROW);
			setState(768);
			expression(0);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(769);
				match(COMMA);
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
	public static class Match_armContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public Match_armContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_arm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterMatch_arm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitMatch_arm(this);
		}
	}

	public final Match_armContext match_arm() throws RecognitionException {
		Match_armContext _localctx = new Match_armContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_match_arm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			pattern();
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
	public static class PatternContext extends ParserRuleContext {
		public Literal_patternContext literal_pattern() {
			return getRuleContext(Literal_patternContext.class,0);
		}
		public Identifier_patternContext identifier_pattern() {
			return getRuleContext(Identifier_patternContext.class,0);
		}
		public Wildcard_patternContext wildcard_pattern() {
			return getRuleContext(Wildcard_patternContext.class,0);
		}
		public Reference_patternContext reference_pattern() {
			return getRuleContext(Reference_patternContext.class,0);
		}
		public Tuple_struct_patternContext tuple_struct_pattern() {
			return getRuleContext(Tuple_struct_patternContext.class,0);
		}
		public Path_patternContext path_pattern() {
			return getRuleContext(Path_patternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_pattern);
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				literal_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				identifier_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(776);
				wildcard_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(777);
				reference_pattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(778);
				tuple_struct_pattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(779);
				path_pattern();
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
	public static class Literal_patternContext extends ParserRuleContext {
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(Rx.MINUS, 0); }
		public Literal_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterLiteral_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitLiteral_pattern(this);
		}
	}

	public final Literal_patternContext literal_pattern() throws RecognitionException {
		Literal_patternContext _localctx = new Literal_patternContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_literal_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(782);
				match(MINUS);
				}
			}

			setState(785);
			literal_expression();
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
	public static class Identifier_patternContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode REF() { return getToken(Rx.REF, 0); }
		public TerminalNode MUT() { return getToken(Rx.MUT, 0); }
		public Identifier_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterIdentifier_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitIdentifier_pattern(this);
		}
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_identifier_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(787);
				match(REF);
				}
			}

			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUT) {
				{
				setState(790);
				match(MUT);
				}
			}

			setState(793);
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
	public static class Wildcard_patternContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Rx.UNDERSCORE, 0); }
		public Wildcard_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterWildcard_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitWildcard_pattern(this);
		}
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			match(UNDERSCORE);
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
	public static class Reference_patternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode AND() { return getToken(Rx.AND, 0); }
		public TerminalNode ANDAND() { return getToken(Rx.ANDAND, 0); }
		public TerminalNode MUT() { return getToken(Rx.MUT, 0); }
		public Reference_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterReference_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitReference_pattern(this);
		}
	}

	public final Reference_patternContext reference_pattern() throws RecognitionException {
		Reference_patternContext _localctx = new Reference_patternContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_reference_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_la = _input.LA(1);
			if ( !(_la==ANDAND || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(798);
				match(MUT);
				}
				break;
			}
			setState(801);
			pattern();
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
	public static class Tuple_struct_patternContext extends ParserRuleContext {
		public Path_in_expressionContext path_in_expression() {
			return getRuleContext(Path_in_expressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(Rx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Rx.RPAR, 0); }
		public Tuple_struct_itemsContext tuple_struct_items() {
			return getRuleContext(Tuple_struct_itemsContext.class,0);
		}
		public Tuple_struct_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_struct_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterTuple_struct_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitTuple_struct_pattern(this);
		}
	}

	public final Tuple_struct_patternContext tuple_struct_pattern() throws RecognitionException {
		Tuple_struct_patternContext _localctx = new Tuple_struct_patternContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tuple_struct_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			path_in_expression();
			setState(804);
			match(LPAR);
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1153264827394949376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1073750017L) != 0)) {
				{
				setState(805);
				tuple_struct_items();
				}
			}

			setState(808);
			match(RPAR);
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
	public static class Tuple_struct_itemsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public Tuple_struct_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_struct_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterTuple_struct_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitTuple_struct_items(this);
		}
	}

	public final Tuple_struct_itemsContext tuple_struct_items() throws RecognitionException {
		Tuple_struct_itemsContext _localctx = new Tuple_struct_itemsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tuple_struct_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			pattern();
			setState(815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(811);
					match(COMMA);
					setState(812);
					pattern();
					}
					} 
				}
				setState(817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(818);
				match(COMMA);
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
	public static class Path_patternContext extends ParserRuleContext {
		public Path_in_expressionContext path_in_expression() {
			return getRuleContext(Path_in_expressionContext.class,0);
		}
		public Path_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterPath_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitPath_pattern(this);
		}
	}

	public final Path_patternContext path_pattern() throws RecognitionException {
		Path_patternContext _localctx = new Path_patternContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_path_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			path_in_expression();
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
		public Type_pathContext type_path() {
			return getRuleContext(Type_pathContext.class,0);
		}
		public Reference_typeContext reference_type() {
			return getRuleContext(Reference_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Slice_typeContext slice_type() {
			return getRuleContext(Slice_typeContext.class,0);
		}
		public Inferred_typeContext inferred_type() {
			return getRuleContext(Inferred_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_type);
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				type_path();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				reference_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				array_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(826);
				slice_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(827);
				inferred_type();
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
	public static class Reference_typeContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Rx.AND, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode MUT() { return getToken(Rx.MUT, 0); }
		public Reference_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterReference_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitReference_type(this);
		}
	}

	public final Reference_typeContext reference_type() throws RecognitionException {
		Reference_typeContext _localctx = new Reference_typeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_reference_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(AND);
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUT) {
				{
				setState(831);
				match(MUT);
				}
			}

			setState(834);
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
	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode LBKT() { return getToken(Rx.LBKT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(Rx.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBKT() { return getToken(Rx.RBKT, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitArray_type(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(LBKT);
			setState(837);
			type();
			setState(838);
			match(SEMI);
			setState(839);
			expression(0);
			setState(840);
			match(RBKT);
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
	public static class Slice_typeContext extends ParserRuleContext {
		public TerminalNode LBKT() { return getToken(Rx.LBKT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RBKT() { return getToken(Rx.RBKT, 0); }
		public Slice_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterSlice_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitSlice_type(this);
		}
	}

	public final Slice_typeContext slice_type() throws RecognitionException {
		Slice_typeContext _localctx = new Slice_typeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_slice_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			match(LBKT);
			setState(843);
			type();
			setState(844);
			match(RBKT);
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
	public static class Inferred_typeContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Rx.UNDERSCORE, 0); }
		public Inferred_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferred_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterInferred_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitInferred_type(this);
		}
	}

	public final Inferred_typeContext inferred_type() throws RecognitionException {
		Inferred_typeContext _localctx = new Inferred_typeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_inferred_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(UNDERSCORE);
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
	public static class Path_in_expressionContext extends ParserRuleContext {
		public List<Path_expr_segmentContext> path_expr_segment() {
			return getRuleContexts(Path_expr_segmentContext.class);
		}
		public Path_expr_segmentContext path_expr_segment(int i) {
			return getRuleContext(Path_expr_segmentContext.class,i);
		}
		public List<TerminalNode> PATHSEP() { return getTokens(Rx.PATHSEP); }
		public TerminalNode PATHSEP(int i) {
			return getToken(Rx.PATHSEP, i);
		}
		public Path_in_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_in_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterPath_in_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitPath_in_expression(this);
		}
	}

	public final Path_in_expressionContext path_in_expression() throws RecognitionException {
		Path_in_expressionContext _localctx = new Path_in_expressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_path_in_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			path_expr_segment();
			setState(853);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(849);
					match(PATHSEP);
					setState(850);
					path_expr_segment();
					}
					} 
				}
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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
	public static class Path_expr_segmentContext extends ParserRuleContext {
		public Path_ident_segmentContext path_ident_segment() {
			return getRuleContext(Path_ident_segmentContext.class,0);
		}
		public Path_expr_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_expr_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterPath_expr_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitPath_expr_segment(this);
		}
	}

	public final Path_expr_segmentContext path_expr_segment() throws RecognitionException {
		Path_expr_segmentContext _localctx = new Path_expr_segmentContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_path_expr_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			path_ident_segment();
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
	public static class Path_ident_segmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode SELF_KW() { return getToken(Rx.SELF_KW, 0); }
		public TerminalNode SELF_TYPE() { return getToken(Rx.SELF_TYPE, 0); }
		public Path_ident_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_ident_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterPath_ident_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitPath_ident_segment(this);
		}
	}

	public final Path_ident_segmentContext path_ident_segment() throws RecognitionException {
		Path_ident_segmentContext _localctx = new Path_ident_segmentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_path_ident_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			_la = _input.LA(1);
			if ( !(_la==SELF_KW || _la==SELF_TYPE || _la==IDENTIFIER) ) {
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
	public static class Type_pathContext extends ParserRuleContext {
		public Type_path_segmentContext type_path_segment() {
			return getRuleContext(Type_path_segmentContext.class,0);
		}
		public Type_pathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterType_path(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitType_path(this);
		}
	}

	public final Type_pathContext type_path() throws RecognitionException {
		Type_pathContext _localctx = new Type_pathContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_type_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			type_path_segment();
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
	public static class Type_path_segmentContext extends ParserRuleContext {
		public Path_ident_segmentContext path_ident_segment() {
			return getRuleContext(Path_ident_segmentContext.class,0);
		}
		public Type_path_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_path_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).enterType_path_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RxListener ) ((RxListener)listener).exitType_path_segment(this);
		}
	}

	public final Type_path_segmentContext type_path_segment() throws RecognitionException {
		Type_path_segmentContext _localctx = new Type_path_segmentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_type_path_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			path_ident_segment();
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
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 29);
		case 8:
			return precpred(_ctx, 28);
		case 9:
			return precpred(_ctx, 27);
		case 10:
			return precpred(_ctx, 26);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001^\u0361\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0001"+
		"\u0000\u0005\u0000\u00a2\b\u0000\n\u0000\f\u0000\u00a5\t\u0000\u0001\u0000"+
		"\u0003\u0000\u00a8\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00b0\b\u0001\u0001\u0002\u0003\u0002"+
		"\u00b3\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00b9\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00be\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00c2\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00c6\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00cb\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00d0"+
		"\b\u0003\n\u0003\f\u0003\u00d3\t\u0003\u0003\u0003\u00d5\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005\u00dc"+
		"\b\u0005\u0001\u0005\u0003\u0005\u00df\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00e3\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00e8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00ee\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f2\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00f7\b\u0007\n\u0007\f\u0007"+
		"\u00fa\t\u0007\u0001\u0007\u0003\u0007\u00fd\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0107\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0005\n\u010e\b\n\n\n\f\n\u0111\t\n\u0001\n"+
		"\u0003\n\u0114\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u011e\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u0126\b\r\n\r\f\r\u0129\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u012f\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u0135\b\u000f\n\u000f\f\u000f\u0138\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0142\b\u0010\n\u0010\f\u0010\u0145\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u014b\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0151\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0157\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u015b\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0164\b\u0014\u0003\u0014\u0166\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u017a\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0180\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u018f\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01ab"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u01ba\b\u0015\u0001\u0015\u0005\u0015\u01bd"+
		"\b\u0015\n\u0015\f\u0015\u01c0\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01f0\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0202\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0208\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u020e\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0218\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u021f\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u022d\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0234\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u023d\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0003$\u0259\b$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0005%\u0260\b%\n%\f%\u0263\t%\u0001%\u0003%\u0266\b%"+
		"\u0001%\u0001%\u0001%\u0001%\u0003%\u026c\b%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u0276\b\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0005(\u027d\b(\n(\f(\u0280\t(\u0001(\u0003(\u0283\b("+
		"\u0001)\u0001)\u0001)\u0001)\u0003)\u0289\b)\u0001*\u0001*\u0001*\u0003"+
		"*\u028e\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0005+\u0295\b+\n+\f+\u0298"+
		"\t+\u0001+\u0003+\u029b\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02a2"+
		"\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001"+
		"/\u0003/\u02ae\b/\u00010\u00010\u00030\u02b2\b0\u00011\u00011\u00012\u0001"+
		"2\u00032\u02b8\b2\u00012\u00012\u00013\u00043\u02bd\b3\u000b3\f3\u02be"+
		"\u00013\u00043\u02c2\b3\u000b3\f3\u02c3\u00013\u00013\u00013\u00033\u02c9"+
		"\b3\u00014\u00014\u00014\u00015\u00015\u00035\u02d0\b5\u00016\u00016\u0001"+
		"6\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00038\u02df\b8\u00038\u02e1\b8\u00019\u00019\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u02e9\b:\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0003<\u02f6\b<\u0003<\u02f8\b<\u0005<\u02fa\b"+
		"<\n<\f<\u02fd\t<\u0001<\u0001<\u0001<\u0001<\u0003<\u0303\b<\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u030d\b>\u0001?\u0003"+
		"?\u0310\b?\u0001?\u0001?\u0001@\u0003@\u0315\b@\u0001@\u0003@\u0318\b"+
		"@\u0001@\u0001@\u0001A\u0001A\u0001B\u0001B\u0003B\u0320\bB\u0001B\u0001"+
		"B\u0001C\u0001C\u0001C\u0003C\u0327\bC\u0001C\u0001C\u0001D\u0001D\u0001"+
		"D\u0005D\u032e\bD\nD\fD\u0331\tD\u0001D\u0003D\u0334\bD\u0001E\u0001E"+
		"\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u033d\bF\u0001G\u0001G\u0003"+
		"G\u0341\bG\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001K\u0005K\u0354"+
		"\bK\nK\fK\u0357\tK\u0001L\u0001L\u0001M\u0001M\u0001N\u0001N\u0001O\u0001"+
		"O\u0001O\u0000\u0001*P\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u0000\f\u0002\u0000<<@@\u0001"+
		"\u000013\u0001\u0000/0\u0001\u0000>?\u0001\u00006;\u0002\u000044@A\u0001"+
		"\u0000<=\u0001\u0000BL\u0004\u0000\b\b\u001c\u001c&&+-\u0002\u0000/4>"+
		"A\u0001\u0000BK\u0002\u0000\u0016\u0017^^\u03ae\u0000\u00a3\u0001\u0000"+
		"\u0000\u0000\u0002\u00af\u0001\u0000\u0000\u0000\u0004\u00b2\u0001\u0000"+
		"\u0000\u0000\u0006\u00d4\u0001\u0000\u0000\u0000\b\u00d6\u0001\u0000\u0000"+
		"\u0000\n\u00e7\u0001\u0000\u0000\u0000\f\u00e9\u0001\u0000\u0000\u0000"+
		"\u000e\u00f3\u0001\u0000\u0000\u0000\u0010\u00fe\u0001\u0000\u0000\u0000"+
		"\u0012\u0102\u0001\u0000\u0000\u0000\u0014\u010a\u0001\u0000\u0000\u0000"+
		"\u0016\u0115\u0001\u0000\u0000\u0000\u0018\u0117\u0001\u0000\u0000\u0000"+
		"\u001a\u0121\u0001\u0000\u0000\u0000\u001c\u012e\u0001\u0000\u0000\u0000"+
		"\u001e\u0130\u0001\u0000\u0000\u0000 \u013b\u0001\u0000\u0000\u0000\""+
		"\u014a\u0001\u0000\u0000\u0000$\u0150\u0001\u0000\u0000\u0000&\u0152\u0001"+
		"\u0000\u0000\u0000(\u0165\u0001\u0000\u0000\u0000*\u018e\u0001\u0000\u0000"+
		"\u0000,\u0217\u0001\u0000\u0000\u0000.\u021e\u0001\u0000\u0000\u00000"+
		"\u0220\u0001\u0000\u0000\u00002\u0222\u0001\u0000\u0000\u00004\u022c\u0001"+
		"\u0000\u0000\u00006\u0233\u0001\u0000\u0000\u00008\u0235\u0001\u0000\u0000"+
		"\u0000:\u023c\u0001\u0000\u0000\u0000<\u023e\u0001\u0000\u0000\u0000>"+
		"\u0242\u0001\u0000\u0000\u0000@\u0246\u0001\u0000\u0000\u0000B\u024a\u0001"+
		"\u0000\u0000\u0000D\u024e\u0001\u0000\u0000\u0000F\u0252\u0001\u0000\u0000"+
		"\u0000H\u0256\u0001\u0000\u0000\u0000J\u026b\u0001\u0000\u0000\u0000L"+
		"\u026d\u0001\u0000\u0000\u0000N\u0272\u0001\u0000\u0000\u0000P\u0279\u0001"+
		"\u0000\u0000\u0000R\u0288\u0001\u0000\u0000\u0000T\u028a\u0001\u0000\u0000"+
		"\u0000V\u0291\u0001\u0000\u0000\u0000X\u029c\u0001\u0000\u0000\u0000Z"+
		"\u02a5\u0001\u0000\u0000\u0000\\\u02a9\u0001\u0000\u0000\u0000^\u02ab"+
		"\u0001\u0000\u0000\u0000`\u02af\u0001\u0000\u0000\u0000b\u02b3\u0001\u0000"+
		"\u0000\u0000d\u02b5\u0001\u0000\u0000\u0000f\u02c8\u0001\u0000\u0000\u0000"+
		"h\u02ca\u0001\u0000\u0000\u0000j\u02cf\u0001\u0000\u0000\u0000l\u02d1"+
		"\u0001\u0000\u0000\u0000n\u02d4\u0001\u0000\u0000\u0000p\u02d8\u0001\u0000"+
		"\u0000\u0000r\u02e2\u0001\u0000\u0000\u0000t\u02e4\u0001\u0000\u0000\u0000"+
		"v\u02ec\u0001\u0000\u0000\u0000x\u02fb\u0001\u0000\u0000\u0000z\u0304"+
		"\u0001\u0000\u0000\u0000|\u030c\u0001\u0000\u0000\u0000~\u030f\u0001\u0000"+
		"\u0000\u0000\u0080\u0314\u0001\u0000\u0000\u0000\u0082\u031b\u0001\u0000"+
		"\u0000\u0000\u0084\u031d\u0001\u0000\u0000\u0000\u0086\u0323\u0001\u0000"+
		"\u0000\u0000\u0088\u032a\u0001\u0000\u0000\u0000\u008a\u0335\u0001\u0000"+
		"\u0000\u0000\u008c\u033c\u0001\u0000\u0000\u0000\u008e\u033e\u0001\u0000"+
		"\u0000\u0000\u0090\u0344\u0001\u0000\u0000\u0000\u0092\u034a\u0001\u0000"+
		"\u0000\u0000\u0094\u034e\u0001\u0000\u0000\u0000\u0096\u0350\u0001\u0000"+
		"\u0000\u0000\u0098\u0358\u0001\u0000\u0000\u0000\u009a\u035a\u0001\u0000"+
		"\u0000\u0000\u009c\u035c\u0001\u0000\u0000\u0000\u009e\u035e\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a2\u0003\u0002\u0001\u0000\u00a1\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\u0000"+
		"\u0000\u0001\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u0001\u0001\u0000\u0000\u0000\u00a9\u00b0\u0003\u0004"+
		"\u0002\u0000\u00aa\u00b0\u0003\f\u0006\u0000\u00ab\u00b0\u0003\u0012\t"+
		"\u0000\u00ac\u00b0\u0003\u0018\f\u0000\u00ad\u00b0\u0003\u001a\r\u0000"+
		"\u00ae\u00b0\u0003\u001c\u000e\u0000\u00af\u00a9\u0001\u0000\u0000\u0000"+
		"\u00af\u00aa\u0001\u0000\u0000\u0000\u00af\u00ab\u0001\u0000\u0000\u0000"+
		"\u00af\u00ac\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u0003\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b3\u0005\u0003\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005\t\u0000\u0000\u00b5\u00b6\u0005^\u0000\u0000\u00b6"+
		"\u00b8\u0005X\u0000\u0000\u00b7\u00b9\u0003\u0006\u0003\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bd\u0005Y\u0000\u0000\u00bb\u00bc\u0005"+
		"U\u0000\u0000\u00bc\u00be\u0003\u008cF\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c2\u0003d2\u0000\u00c0\u00c2\u0005R\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u0005\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003\n\u0005\u0000\u00c4\u00c6"+
		"\u0005Q\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00d5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003"+
		"\n\u0005\u0000\u00c8\u00c9\u0005Q\u0000\u0000\u00c9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d1\u0003\b\u0004"+
		"\u0000\u00cd\u00ce\u0005Q\u0000\u0000\u00ce\u00d0\u0003\b\u0004\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d4\u00c3\u0001\u0000\u0000\u0000\u00d4\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d5\u0007\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003|>\u0000\u00d7\u00d8"+
		"\u0005S\u0000\u0000\u00d8\u00d9\u0003\u008cF\u0000\u00d9\t\u0001\u0000"+
		"\u0000\u0000\u00da\u00dc\u0005@\u0000\u0000\u00db\u00da\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0005\u0012\u0000\u0000\u00de\u00dd\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e8\u0005\u0016\u0000\u0000\u00e1\u00e3\u0005\u0012\u0000"+
		"\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0016\u0000"+
		"\u0000\u00e5\u00e6\u0005S\u0000\u0000\u00e6\u00e8\u0003\u008cF\u0000\u00e7"+
		"\u00db\u0001\u0000\u0000\u0000\u00e7\u00e2\u0001\u0000\u0000\u0000\u00e8"+
		"\u000b\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0019\u0000\u0000\u00ea"+
		"\u00f1\u0005^\u0000\u0000\u00eb\u00ed\u0005\\\u0000\u0000\u00ec\u00ee"+
		"\u0003\u000e\u0007\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0005]\u0000\u0000\u00f0\u00f2\u0005R\u0000\u0000\u00f1\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\r\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f8\u0003\u0010\b\u0000\u00f4\u00f5\u0005Q\u0000\u0000"+
		"\u00f5\u00f7\u0003\u0010\b\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005Q\u0000\u0000\u00fc\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u000f"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005^\u0000\u0000\u00ff\u0100\u0005"+
		"S\u0000\u0000\u0100\u0101\u0003\u008cF\u0000\u0101\u0011\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0005\u0007\u0000\u0000\u0103\u0104\u0005^\u0000\u0000"+
		"\u0104\u0106\u0005\\\u0000\u0000\u0105\u0107\u0003\u0014\n\u0000\u0106"+
		"\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0005]\u0000\u0000\u0109\u0013"+
		"\u0001\u0000\u0000\u0000\u010a\u010f\u0003\u0016\u000b\u0000\u010b\u010c"+
		"\u0005Q\u0000\u0000\u010c\u010e\u0003\u0016\u000b\u0000\u010d\u010b\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0113\u0001"+
		"\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0114\u0005"+
		"Q\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000"+
		"\u0000\u0000\u0114\u0015\u0001\u0000\u0000\u0000\u0115\u0116\u0005^\u0000"+
		"\u0000\u0116\u0017\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u0003\u0000"+
		"\u0000\u0118\u0119\u0005^\u0000\u0000\u0119\u011a\u0005S\u0000\u0000\u011a"+
		"\u011d\u0003\u008cF\u0000\u011b\u011c\u0005L\u0000\u0000\u011c\u011e\u0003"+
		"*\u0015\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0005R\u0000"+
		"\u0000\u0120\u0019\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u001b\u0000"+
		"\u0000\u0122\u0123\u0005^\u0000\u0000\u0123\u0127\u0005\\\u0000\u0000"+
		"\u0124\u0126\u0003\"\u0011\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126"+
		"\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0005]\u0000\u0000\u012b\u001b"+
		"\u0001\u0000\u0000\u0000\u012c\u012f\u0003\u001e\u000f\u0000\u012d\u012f"+
		"\u0003 \u0010\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u001d\u0001\u0000\u0000\u0000\u0130\u0131\u0005"+
		"\f\u0000\u0000\u0131\u0132\u0003\u008cF\u0000\u0132\u0136\u0005\\\u0000"+
		"\u0000\u0133\u0135\u0003\"\u0011\u0000\u0134\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000"+
		"\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013a\u0005]\u0000\u0000\u013a"+
		"\u001f\u0001\u0000\u0000\u0000\u013b\u013c\u0005\f\u0000\u0000\u013c\u013d"+
		"\u0005^\u0000\u0000\u013d\u013e\u0005\n\u0000\u0000\u013e\u013f\u0003"+
		"\u008cF\u0000\u013f\u0143\u0005\\\u0000\u0000\u0140\u0142\u0003\"\u0011"+
		"\u0000\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000"+
		"\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000"+
		"\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0146\u0147\u0005]\u0000\u0000\u0147!\u0001\u0000\u0000\u0000\u0148"+
		"\u014b\u0003\u0004\u0002\u0000\u0149\u014b\u0003\u0018\f\u0000\u014a\u0148"+
		"\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b#\u0001"+
		"\u0000\u0000\u0000\u014c\u0151\u0005R\u0000\u0000\u014d\u0151\u0003\u0002"+
		"\u0001\u0000\u014e\u0151\u0003&\u0013\u0000\u014f\u0151\u0003(\u0014\u0000"+
		"\u0150\u014c\u0001\u0000\u0000\u0000\u0150\u014d\u0001\u0000\u0000\u0000"+
		"\u0150\u014e\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000"+
		"\u0151%\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u000e\u0000\u0000\u0153"+
		"\u0156\u0003|>\u0000\u0154\u0155\u0005S\u0000\u0000\u0155\u0157\u0003"+
		"\u008cF\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u015a\u0001\u0000\u0000\u0000\u0158\u0159\u0005L\u0000"+
		"\u0000\u0159\u015b\u0003*\u0015\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0005R\u0000\u0000\u015d\'\u0001\u0000\u0000\u0000\u015e"+
		"\u015f\u0003,\u0016\u0000\u015f\u0160\u0005R\u0000\u0000\u0160\u0166\u0001"+
		"\u0000\u0000\u0000\u0161\u0163\u0003.\u0017\u0000\u0162\u0164\u0005R\u0000"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u015e\u0001\u0000\u0000"+
		"\u0000\u0165\u0161\u0001\u0000\u0000\u0000\u0166)\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0006\u0015\uffff\uffff\u0000\u0168\u0169\u0005X\u0000\u0000"+
		"\u0169\u016a\u0003*\u0015\u0000\u016a\u016b\u0005Y\u0000\u0000\u016b\u018f"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0007\u0000\u0000\u0000\u016d\u018f"+
		"\u0003*\u0015\u0019\u016e\u016f\u0007\u0000\u0000\u0000\u016f\u0170\u0005"+
		"\u0012\u0000\u0000\u0170\u018f\u0003*\u0015\u0018\u0171\u0172\u00051\u0000"+
		"\u0000\u0172\u018f\u0003*\u0015\u0017\u0173\u0174\u00055\u0000\u0000\u0174"+
		"\u018f\u0003*\u0015\u0016\u0175\u0176\u00050\u0000\u0000\u0176\u018f\u0003"+
		"*\u0015\u0015\u0177\u0179\u0005Z\u0000\u0000\u0178\u017a\u0003J%\u0000"+
		"\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u018f\u0005[\u0000\u0000\u017c"+
		"\u017d\u0003\u0096K\u0000\u017d\u017f\u0005\\\u0000\u0000\u017e\u0180"+
		"\u0003P(\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0005]\u0000"+
		"\u0000\u0182\u018f\u0001\u0000\u0000\u0000\u0183\u018f\u0003\\.\u0000"+
		"\u0184\u018f\u0003^/\u0000\u0185\u018f\u0003`0\u0000\u0186\u018f\u0003"+
		"0\u0018\u0000\u0187\u018f\u00032\u0019\u0000\u0188\u018f\u0003b1\u0000"+
		"\u0189\u018f\u0003d2\u0000\u018a\u018f\u0003h4\u0000\u018b\u018f\u0003"+
		"j5\u0000\u018c\u018f\u0003p8\u0000\u018d\u018f\u0003t:\u0000\u018e\u0167"+
		"\u0001\u0000\u0000\u0000\u018e\u016c\u0001\u0000\u0000\u0000\u018e\u016e"+
		"\u0001\u0000\u0000\u0000\u018e\u0171\u0001\u0000\u0000\u0000\u018e\u0173"+
		"\u0001\u0000\u0000\u0000\u018e\u0175\u0001\u0000\u0000\u0000\u018e\u0177"+
		"\u0001\u0000\u0000\u0000\u018e\u017c\u0001\u0000\u0000\u0000\u018e\u0183"+
		"\u0001\u0000\u0000\u0000\u018e\u0184\u0001\u0000\u0000\u0000\u018e\u0185"+
		"\u0001\u0000\u0000\u0000\u018e\u0186\u0001\u0000\u0000\u0000\u018e\u0187"+
		"\u0001\u0000\u0000\u0000\u018e\u0188\u0001\u0000\u0000\u0000\u018e\u0189"+
		"\u0001\u0000\u0000\u0000\u018e\u018a\u0001\u0000\u0000\u0000\u018e\u018b"+
		"\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018e\u018d"+
		"\u0001\u0000\u0000\u0000\u018f\u01be\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\n\u0014\u0000\u0000\u0191\u0192\u0007\u0001\u0000\u0000\u0192\u01bd\u0003"+
		"*\u0015\u0015\u0193\u0194\n\u0013\u0000\u0000\u0194\u0195\u0007\u0002"+
		"\u0000\u0000\u0195\u01bd\u0003*\u0015\u0014\u0196\u0197\n\u0012\u0000"+
		"\u0000\u0197\u0198\u0007\u0003\u0000\u0000\u0198\u01bd\u0003*\u0015\u0013"+
		"\u0199\u019a\n\u0011\u0000\u0000\u019a\u019b\u0007\u0004\u0000\u0000\u019b"+
		"\u01bd\u0003*\u0015\u0012\u019c\u019d\n\u0010\u0000\u0000\u019d\u019e"+
		"\u0007\u0005\u0000\u0000\u019e\u01bd\u0003*\u0015\u0011\u019f\u01a0\n"+
		"\u000f\u0000\u0000\u01a0\u01a1\u0007\u0006\u0000\u0000\u01a1\u01bd\u0003"+
		"*\u0015\u0010\u01a2\u01a3\n\u000e\u0000\u0000\u01a3\u01a4\u0007\u0007"+
		"\u0000\u0000\u01a4\u01bd\u0003*\u0015\u000e\u01a5\u01a6\n\u001d\u0000"+
		"\u0000\u01a6\u01a7\u0005N\u0000\u0000\u01a7\u01a8\u0003\u0098L\u0000\u01a8"+
		"\u01aa\u0005X\u0000\u0000\u01a9\u01ab\u0003V+\u0000\u01aa\u01a9\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0005Y\u0000\u0000\u01ad\u01bd\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\n\u001c\u0000\u0000\u01af\u01b0\u0005N\u0000"+
		"\u0000\u01b0\u01bd\u0005^\u0000\u0000\u01b1\u01b2\n\u001b\u0000\u0000"+
		"\u01b2\u01b3\u0005Z\u0000\u0000\u01b3\u01b4\u0003*\u0015\u0000\u01b4\u01b5"+
		"\u0005[\u0000\u0000\u01b5\u01bd\u0001\u0000\u0000\u0000\u01b6\u01b7\n"+
		"\u001a\u0000\u0000\u01b7\u01b9\u0005X\u0000\u0000\u01b8\u01ba\u0003V+"+
		"\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd\u0005Y\u0000\u0000"+
		"\u01bc\u0190\u0001\u0000\u0000\u0000\u01bc\u0193\u0001\u0000\u0000\u0000"+
		"\u01bc\u0196\u0001\u0000\u0000\u0000\u01bc\u0199\u0001\u0000\u0000\u0000"+
		"\u01bc\u019c\u0001\u0000\u0000\u0000\u01bc\u019f\u0001\u0000\u0000\u0000"+
		"\u01bc\u01a2\u0001\u0000\u0000\u0000\u01bc\u01a5\u0001\u0000\u0000\u0000"+
		"\u01bc\u01ae\u0001\u0000\u0000\u0000\u01bc\u01b1\u0001\u0000\u0000\u0000"+
		"\u01bc\u01b6\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf+\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0005X\u0000\u0000\u01c2\u01c3\u0003*\u0015\u0000\u01c3\u01c4\u0005"+
		"Y\u0000\u0000\u01c4\u0218\u0001\u0000\u0000\u0000\u01c5\u01c6\u0003*\u0015"+
		"\u0000\u01c6\u01c7\u0007\u0007\u0000\u0000\u01c7\u01c8\u0003*\u0015\u0000"+
		"\u01c8\u0218\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003*\u0015\u0000\u01ca"+
		"\u01cb\u0007\u0006\u0000\u0000\u01cb\u01cc\u0003*\u0015\u0000\u01cc\u0218"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0003*\u0015\u0000\u01ce\u01cf\u0007"+
		"\u0005\u0000\u0000\u01cf\u01d0\u0003*\u0015\u0000\u01d0\u0218\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0003*\u0015\u0000\u01d2\u01d3\u0007\u0004\u0000"+
		"\u0000\u01d3\u01d4\u0003*\u0015\u0000\u01d4\u0218\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d6\u0003*\u0015\u0000\u01d6\u01d7\u0007\u0003\u0000\u0000\u01d7"+
		"\u01d8\u0003*\u0015\u0000\u01d8\u0218\u0001\u0000\u0000\u0000\u01d9\u01da"+
		"\u0003*\u0015\u0000\u01da\u01db\u0007\u0002\u0000\u0000\u01db\u01dc\u0003"+
		"*\u0015\u0000\u01dc\u0218\u0001\u0000\u0000\u0000\u01dd\u01de\u0003*\u0015"+
		"\u0000\u01de\u01df\u0007\u0001\u0000\u0000\u01df\u01e0\u0003*\u0015\u0000"+
		"\u01e0\u0218\u0001\u0000\u0000\u0000\u01e1\u01e2\u00055\u0000\u0000\u01e2"+
		"\u0218\u0003*\u0015\u0000\u01e3\u01e4\u00050\u0000\u0000\u01e4\u0218\u0003"+
		"*\u0015\u0000\u01e5\u01e6\u00051\u0000\u0000\u01e6\u0218\u0003*\u0015"+
		"\u0000\u01e7\u01e8\u0007\u0000\u0000\u0000\u01e8\u0218\u0003*\u0015\u0000"+
		"\u01e9\u01ea\u0007\u0000\u0000\u0000\u01ea\u01eb\u0005\u0012\u0000\u0000"+
		"\u01eb\u0218\u0003*\u0015\u0000\u01ec\u01ed\u0003*\u0015\u0000\u01ed\u01ef"+
		"\u0005X\u0000\u0000\u01ee\u01f0\u0003V+\u0000\u01ef\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0005Y\u0000\u0000\u01f2\u0218\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0003*\u0015\u0000\u01f4\u01f5\u0005Z\u0000\u0000\u01f5"+
		"\u01f6\u0003*\u0015\u0000\u01f6\u01f7\u0005[\u0000\u0000\u01f7\u0218\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0003*\u0015\u0000\u01f9\u01fa\u0005N\u0000"+
		"\u0000\u01fa\u01fb\u0005^\u0000\u0000\u01fb\u0218\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fd\u0003*\u0015\u0000\u01fd\u01fe\u0005N\u0000\u0000\u01fe\u01ff"+
		"\u0003\u0098L\u0000\u01ff\u0201\u0005X\u0000\u0000\u0200\u0202\u0003V"+
		"+\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000"+
		"\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0005Y\u0000\u0000"+
		"\u0204\u0218\u0001\u0000\u0000\u0000\u0205\u0207\u0005Z\u0000\u0000\u0206"+
		"\u0208\u0003J%\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0207\u0208\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u0218\u0005"+
		"[\u0000\u0000\u020a\u020b\u0003\u0096K\u0000\u020b\u020d\u0005\\\u0000"+
		"\u0000\u020c\u020e\u0003P(\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020d"+
		"\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0005]\u0000\u0000\u0210\u0218\u0001\u0000\u0000\u0000\u0211\u0218"+
		"\u0003\\.\u0000\u0212\u0218\u0003^/\u0000\u0213\u0218\u0003`0\u0000\u0214"+
		"\u0218\u00030\u0018\u0000\u0215\u0218\u00032\u0019\u0000\u0216\u0218\u0003"+
		"b1\u0000\u0217\u01c1\u0001\u0000\u0000\u0000\u0217\u01c5\u0001\u0000\u0000"+
		"\u0000\u0217\u01c9\u0001\u0000\u0000\u0000\u0217\u01cd\u0001\u0000\u0000"+
		"\u0000\u0217\u01d1\u0001\u0000\u0000\u0000\u0217\u01d5\u0001\u0000\u0000"+
		"\u0000\u0217\u01d9\u0001\u0000\u0000\u0000\u0217\u01dd\u0001\u0000\u0000"+
		"\u0000\u0217\u01e1\u0001\u0000\u0000\u0000\u0217\u01e3\u0001\u0000\u0000"+
		"\u0000\u0217\u01e5\u0001\u0000\u0000\u0000\u0217\u01e7\u0001\u0000\u0000"+
		"\u0000\u0217\u01e9\u0001\u0000\u0000\u0000\u0217\u01ec\u0001\u0000\u0000"+
		"\u0000\u0217\u01f3\u0001\u0000\u0000\u0000\u0217\u01f8\u0001\u0000\u0000"+
		"\u0000\u0217\u01fc\u0001\u0000\u0000\u0000\u0217\u0205\u0001\u0000\u0000"+
		"\u0000\u0217\u020a\u0001\u0000\u0000\u0000\u0217\u0211\u0001\u0000\u0000"+
		"\u0000\u0217\u0212\u0001\u0000\u0000\u0000\u0217\u0213\u0001\u0000\u0000"+
		"\u0000\u0217\u0214\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000"+
		"\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218-\u0001\u0000\u0000\u0000"+
		"\u0219\u021f\u0003d2\u0000\u021a\u021f\u0003h4\u0000\u021b\u021f\u0003"+
		"j5\u0000\u021c\u021f\u0003p8\u0000\u021d\u021f\u0003t:\u0000\u021e\u0219"+
		"\u0001\u0000\u0000\u0000\u021e\u021a\u0001\u0000\u0000\u0000\u021e\u021b"+
		"\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021d"+
		"\u0001\u0000\u0000\u0000\u021f/\u0001\u0000\u0000\u0000\u0220\u0221\u0007"+
		"\b\u0000\u0000\u02211\u0001\u0000\u0000\u0000\u0222\u0223\u0003\u0096"+
		"K\u0000\u02233\u0001\u0000\u0000\u0000\u0224\u022d\u00036\u001b\u0000"+
		"\u0225\u022d\u00038\u001c\u0000\u0226\u022d\u0003:\u001d\u0000\u0227\u022d"+
		"\u0003<\u001e\u0000\u0228\u022d\u0003>\u001f\u0000\u0229\u022d\u0003@"+
		" \u0000\u022a\u022d\u0003B!\u0000\u022b\u022d\u0003D\"\u0000\u022c\u0224"+
		"\u0001\u0000\u0000\u0000\u022c\u0225\u0001\u0000\u0000\u0000\u022c\u0226"+
		"\u0001\u0000\u0000\u0000\u022c\u0227\u0001\u0000\u0000\u0000\u022c\u0228"+
		"\u0001\u0000\u0000\u0000\u022c\u0229\u0001\u0000\u0000\u0000\u022c\u022a"+
		"\u0001\u0000\u0000\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022d5\u0001"+
		"\u0000\u0000\u0000\u022e\u022f\u0007\u0000\u0000\u0000\u022f\u0234\u0003"+
		"*\u0015\u0000\u0230\u0231\u0007\u0000\u0000\u0000\u0231\u0232\u0005\u0012"+
		"\u0000\u0000\u0232\u0234\u0003*\u0015\u0000\u0233\u022e\u0001\u0000\u0000"+
		"\u0000\u0233\u0230\u0001\u0000\u0000\u0000\u02347\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u00051\u0000\u0000\u0236\u0237\u0003*\u0015\u0000\u02379"+
		"\u0001\u0000\u0000\u0000\u0238\u0239\u00055\u0000\u0000\u0239\u023d\u0003"+
		"*\u0015\u0000\u023a\u023b\u00050\u0000\u0000\u023b\u023d\u0003*\u0015"+
		"\u0000\u023c\u0238\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000"+
		"\u0000\u023d;\u0001\u0000\u0000\u0000\u023e\u023f\u0003*\u0015\u0000\u023f"+
		"\u0240\u0007\t\u0000\u0000\u0240\u0241\u0003*\u0015\u0000\u0241=\u0001"+
		"\u0000\u0000\u0000\u0242\u0243\u0003*\u0015\u0000\u0243\u0244\u0007\u0004"+
		"\u0000\u0000\u0244\u0245\u0003*\u0015\u0000\u0245?\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0003*\u0015\u0000\u0247\u0248\u0007\u0006\u0000\u0000\u0248"+
		"\u0249\u0003*\u0015\u0000\u0249A\u0001\u0000\u0000\u0000\u024a\u024b\u0003"+
		"*\u0015\u0000\u024b\u024c\u0005L\u0000\u0000\u024c\u024d\u0003*\u0015"+
		"\u0000\u024dC\u0001\u0000\u0000\u0000\u024e\u024f\u0003*\u0015\u0000\u024f"+
		"\u0250\u0007\n\u0000\u0000\u0250\u0251\u0003*\u0015\u0000\u0251E\u0001"+
		"\u0000\u0000\u0000\u0252\u0253\u0005X\u0000\u0000\u0253\u0254\u0003*\u0015"+
		"\u0000\u0254\u0255\u0005Y\u0000\u0000\u0255G\u0001\u0000\u0000\u0000\u0256"+
		"\u0258\u0005Z\u0000\u0000\u0257\u0259\u0003J%\u0000\u0258\u0257\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0005[\u0000\u0000\u025bI\u0001\u0000\u0000"+
		"\u0000\u025c\u0261\u0003*\u0015\u0000\u025d\u025e\u0005Q\u0000\u0000\u025e"+
		"\u0260\u0003*\u0015\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u0260\u0263"+
		"\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0262"+
		"\u0001\u0000\u0000\u0000\u0262\u0265\u0001\u0000\u0000\u0000\u0263\u0261"+
		"\u0001\u0000\u0000\u0000\u0264\u0266\u0005Q\u0000\u0000\u0265\u0264\u0001"+
		"\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u026c\u0001"+
		"\u0000\u0000\u0000\u0267\u0268\u0003*\u0015\u0000\u0268\u0269\u0005R\u0000"+
		"\u0000\u0269\u026a\u0003*\u0015\u0000\u026a\u026c\u0001\u0000\u0000\u0000"+
		"\u026b\u025c\u0001\u0000\u0000\u0000\u026b\u0267\u0001\u0000\u0000\u0000"+
		"\u026cK\u0001\u0000\u0000\u0000\u026d\u026e\u0003*\u0015\u0000\u026e\u026f"+
		"\u0005Z\u0000\u0000\u026f\u0270\u0003*\u0015\u0000\u0270\u0271\u0005["+
		"\u0000\u0000\u0271M\u0001\u0000\u0000\u0000\u0272\u0273\u0003\u0096K\u0000"+
		"\u0273\u0275\u0005\\\u0000\u0000\u0274\u0276\u0003P(\u0000\u0275\u0274"+
		"\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0277"+
		"\u0001\u0000\u0000\u0000\u0277\u0278\u0005]\u0000\u0000\u0278O\u0001\u0000"+
		"\u0000\u0000\u0279\u027e\u0003R)\u0000\u027a\u027b\u0005Q\u0000\u0000"+
		"\u027b\u027d\u0003R)\u0000\u027c\u027a\u0001\u0000\u0000\u0000\u027d\u0280"+
		"\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e"+
		"\u0001\u0000\u0000\u0000\u0281\u0283\u0005Q\u0000\u0000\u0282\u0281\u0001"+
		"\u0000\u0000\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283Q\u0001\u0000"+
		"\u0000\u0000\u0284\u0285\u0005^\u0000\u0000\u0285\u0286\u0005S\u0000\u0000"+
		"\u0286\u0289\u0003*\u0015\u0000\u0287\u0289\u0005^\u0000\u0000\u0288\u0284"+
		"\u0001\u0000\u0000\u0000\u0288\u0287\u0001\u0000\u0000\u0000\u0289S\u0001"+
		"\u0000\u0000\u0000\u028a\u028b\u0003*\u0015\u0000\u028b\u028d\u0005X\u0000"+
		"\u0000\u028c\u028e\u0003V+\u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f"+
		"\u0290\u0005Y\u0000\u0000\u0290U\u0001\u0000\u0000\u0000\u0291\u0296\u0003"+
		"*\u0015\u0000\u0292\u0293\u0005Q\u0000\u0000\u0293\u0295\u0003*\u0015"+
		"\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000"+
		"\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000"+
		"\u0000\u0299\u029b\u0005Q\u0000\u0000\u029a\u0299\u0001\u0000\u0000\u0000"+
		"\u029a\u029b\u0001\u0000\u0000\u0000\u029bW\u0001\u0000\u0000\u0000\u029c"+
		"\u029d\u0003*\u0015\u0000\u029d\u029e\u0005N\u0000\u0000\u029e\u029f\u0003"+
		"\u0098L\u0000\u029f\u02a1\u0005X\u0000\u0000\u02a0\u02a2\u0003V+\u0000"+
		"\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005Y\u0000\u0000\u02a4"+
		"Y\u0001\u0000\u0000\u0000\u02a5\u02a6\u0003*\u0015\u0000\u02a6\u02a7\u0005"+
		"N\u0000\u0000\u02a7\u02a8\u0005^\u0000\u0000\u02a8[\u0001\u0000\u0000"+
		"\u0000\u02a9\u02aa\u0005\u0004\u0000\u0000\u02aa]\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ad\u0005\u0002\u0000\u0000\u02ac\u02ae\u0003*\u0015\u0000\u02ad"+
		"\u02ac\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000\u0000\u0000\u02ae"+
		"_\u0001\u0000\u0000\u0000\u02af\u02b1\u0005\u0015\u0000\u0000\u02b0\u02b2"+
		"\u0003*\u0015\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b2a\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005M\u0000"+
		"\u0000\u02b4c\u0001\u0000\u0000\u0000\u02b5\u02b7\u0005\\\u0000\u0000"+
		"\u02b6\u02b8\u0003f3\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b7\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9\u02ba"+
		"\u0005]\u0000\u0000\u02bae\u0001\u0000\u0000\u0000\u02bb\u02bd\u0003$"+
		"\u0012\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000"+
		"\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c9\u0001\u0000\u0000\u0000\u02c0\u02c2\u0003$\u0012"+
		"\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000"+
		"\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c6\u0003,\u0016\u0000"+
		"\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c9\u0003,\u0016\u0000\u02c8"+
		"\u02bc\u0001\u0000\u0000\u0000\u02c8\u02c1\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c9g\u0001\u0000\u0000\u0000\u02ca\u02cb"+
		"\u0005\u0003\u0000\u0000\u02cb\u02cc\u0003d2\u0000\u02cci\u0001\u0000"+
		"\u0000\u0000\u02cd\u02d0\u0003l6\u0000\u02ce\u02d0\u0003n7\u0000\u02cf"+
		"\u02cd\u0001\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02d0"+
		"k\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005\u000f\u0000\u0000\u02d2\u02d3"+
		"\u0003d2\u0000\u02d3m\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005!\u0000"+
		"\u0000\u02d5\u02d6\u0003r9\u0000\u02d6\u02d7\u0003d2\u0000\u02d7o\u0001"+
		"\u0000\u0000\u0000\u02d8\u02d9\u0005\u000b\u0000\u0000\u02d9\u02da\u0003"+
		"r9\u0000\u02da\u02e0\u0003d2\u0000\u02db\u02de\u0005\u0006\u0000\u0000"+
		"\u02dc\u02df\u0003p8\u0000\u02dd\u02df\u0003d2\u0000\u02de\u02dc\u0001"+
		"\u0000\u0000\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02df\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e0\u02db\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e1q\u0001\u0000\u0000\u0000\u02e2\u02e3\u0003*\u0015"+
		"\u0000\u02e3s\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005\u0010\u0000\u0000"+
		"\u02e5\u02e6\u0003v;\u0000\u02e6\u02e8\u0005\\\u0000\u0000\u02e7\u02e9"+
		"\u0003x<\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0005]\u0000"+
		"\u0000\u02ebu\u0001\u0000\u0000\u0000\u02ec\u02ed\u0003*\u0015\u0000\u02ed"+
		"w\u0001\u0000\u0000\u0000\u02ee\u02ef\u0003z=\u0000\u02ef\u02f7\u0005"+
		"V\u0000\u0000\u02f0\u02f1\u0003,\u0016\u0000\u02f1\u02f2\u0005Q\u0000"+
		"\u0000\u02f2\u02f8\u0001\u0000\u0000\u0000\u02f3\u02f5\u0003.\u0017\u0000"+
		"\u02f4\u02f6\u0005Q\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7"+
		"\u02f0\u0001\u0000\u0000\u0000\u02f7\u02f3\u0001\u0000\u0000\u0000\u02f8"+
		"\u02fa\u0001\u0000\u0000\u0000\u02f9\u02ee\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fd\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fe\u02ff\u0003z=\u0000\u02ff\u0300\u0005"+
		"V\u0000\u0000\u0300\u0302\u0003*\u0015\u0000\u0301\u0303\u0005Q\u0000"+
		"\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000"+
		"\u0000\u0303y\u0001\u0000\u0000\u0000\u0304\u0305\u0003|>\u0000\u0305"+
		"{\u0001\u0000\u0000\u0000\u0306\u030d\u0003~?\u0000\u0307\u030d\u0003"+
		"\u0080@\u0000\u0308\u030d\u0003\u0082A\u0000\u0309\u030d\u0003\u0084B"+
		"\u0000\u030a\u030d\u0003\u0086C\u0000\u030b\u030d\u0003\u008aE\u0000\u030c"+
		"\u0306\u0001\u0000\u0000\u0000\u030c\u0307\u0001\u0000\u0000\u0000\u030c"+
		"\u0308\u0001\u0000\u0000\u0000\u030c\u0309\u0001\u0000\u0000\u0000\u030c"+
		"\u030a\u0001\u0000\u0000\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030d"+
		"}\u0001\u0000\u0000\u0000\u030e\u0310\u00050\u0000\u0000\u030f\u030e\u0001"+
		"\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0311\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u00030\u0018\u0000\u0312\u007f\u0001\u0000"+
		"\u0000\u0000\u0313\u0315\u0005\u0014\u0000\u0000\u0314\u0313\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0317\u0001\u0000"+
		"\u0000\u0000\u0316\u0318\u0005\u0012\u0000\u0000\u0317\u0316\u0001\u0000"+
		"\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u0005^\u0000\u0000\u031a\u0081\u0001\u0000\u0000"+
		"\u0000\u031b\u031c\u0005M\u0000\u0000\u031c\u0083\u0001\u0000\u0000\u0000"+
		"\u031d\u031f\u0007\u0000\u0000\u0000\u031e\u0320\u0005\u0012\u0000\u0000"+
		"\u031f\u031e\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000"+
		"\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0003|>\u0000\u0322\u0085"+
		"\u0001\u0000\u0000\u0000\u0323\u0324\u0003\u0096K\u0000\u0324\u0326\u0005"+
		"X\u0000\u0000\u0325\u0327\u0003\u0088D\u0000\u0326\u0325\u0001\u0000\u0000"+
		"\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0328\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0005Y\u0000\u0000\u0329\u0087\u0001\u0000\u0000\u0000"+
		"\u032a\u032f\u0003|>\u0000\u032b\u032c\u0005Q\u0000\u0000\u032c\u032e"+
		"\u0003|>\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032e\u0331\u0001\u0000"+
		"\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000"+
		"\u0000\u0000\u0330\u0333\u0001\u0000\u0000\u0000\u0331\u032f\u0001\u0000"+
		"\u0000\u0000\u0332\u0334\u0005Q\u0000\u0000\u0333\u0332\u0001\u0000\u0000"+
		"\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0089\u0001\u0000\u0000"+
		"\u0000\u0335\u0336\u0003\u0096K\u0000\u0336\u008b\u0001\u0000\u0000\u0000"+
		"\u0337\u033d\u0003\u009cN\u0000\u0338\u033d\u0003\u008eG\u0000\u0339\u033d"+
		"\u0003\u0090H\u0000\u033a\u033d\u0003\u0092I\u0000\u033b\u033d\u0003\u0094"+
		"J\u0000\u033c\u0337\u0001\u0000\u0000\u0000\u033c\u0338\u0001\u0000\u0000"+
		"\u0000\u033c\u0339\u0001\u0000\u0000\u0000\u033c\u033a\u0001\u0000\u0000"+
		"\u0000\u033c\u033b\u0001\u0000\u0000\u0000\u033d\u008d\u0001\u0000\u0000"+
		"\u0000\u033e\u0340\u0005@\u0000\u0000\u033f\u0341\u0005\u0012\u0000\u0000"+
		"\u0340\u033f\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000"+
		"\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0343\u0003\u008cF\u0000\u0343"+
		"\u008f\u0001\u0000\u0000\u0000\u0344\u0345\u0005Z\u0000\u0000\u0345\u0346"+
		"\u0003\u008cF\u0000\u0346\u0347\u0005R\u0000\u0000\u0347\u0348\u0003*"+
		"\u0015\u0000\u0348\u0349\u0005[\u0000\u0000\u0349\u0091\u0001\u0000\u0000"+
		"\u0000\u034a\u034b\u0005Z\u0000\u0000\u034b\u034c\u0003\u008cF\u0000\u034c"+
		"\u034d\u0005[\u0000\u0000\u034d\u0093\u0001\u0000\u0000\u0000\u034e\u034f"+
		"\u0005M\u0000\u0000\u034f\u0095\u0001\u0000\u0000\u0000\u0350\u0355\u0003"+
		"\u0098L\u0000\u0351\u0352\u0005T\u0000\u0000\u0352\u0354\u0003\u0098L"+
		"\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354\u0357\u0001\u0000\u0000"+
		"\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000"+
		"\u0000\u0356\u0097\u0001\u0000\u0000\u0000\u0357\u0355\u0001\u0000\u0000"+
		"\u0000\u0358\u0359\u0003\u009aM\u0000\u0359\u0099\u0001\u0000\u0000\u0000"+
		"\u035a\u035b\u0007\u000b\u0000\u0000\u035b\u009b\u0001\u0000\u0000\u0000"+
		"\u035c\u035d\u0003\u009eO\u0000\u035d\u009d\u0001\u0000\u0000\u0000\u035e"+
		"\u035f\u0003\u009aM\u0000\u035f\u009f\u0001\u0000\u0000\u0000V\u00a3\u00a7"+
		"\u00af\u00b2\u00b8\u00bd\u00c1\u00c5\u00ca\u00d1\u00d4\u00db\u00de\u00e2"+
		"\u00e7\u00ed\u00f1\u00f8\u00fc\u0106\u010f\u0113\u011d\u0127\u012e\u0136"+
		"\u0143\u014a\u0150\u0156\u015a\u0163\u0165\u0179\u017f\u018e\u01aa\u01b9"+
		"\u01bc\u01be\u01ef\u0201\u0207\u020d\u0217\u021e\u022c\u0233\u023c\u0258"+
		"\u0261\u0265\u026b\u0275\u027e\u0282\u0288\u028d\u0296\u029a\u02a1\u02ad"+
		"\u02b1\u02b7\u02be\u02c3\u02c8\u02cf\u02de\u02e0\u02e8\u02f5\u02f7\u02fb"+
		"\u0302\u030c\u030f\u0314\u0317\u031f\u0326\u032f\u0333\u033c\u0340\u0355";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}