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
		RULE_expression = 21, RULE_expression_without_struct = 22, RULE_expression_without_block = 23, 
		RULE_expression_with_block = 24, RULE_literal_expression = 25, RULE_path_expression = 26, 
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
		RULE_if_expression = 56, RULE_conditions = 57, RULE_let_chain = 58, RULE_let_chain_condition = 59, 
		RULE_match_expression = 60, RULE_scrutinee = 61, RULE_match_arms = 62, 
		RULE_match_arm = 63, RULE_pattern = 64, RULE_literal_pattern = 65, RULE_identifier_pattern = 66, 
		RULE_wildcard_pattern = 67, RULE_reference_pattern = 68, RULE_tuple_struct_pattern = 69, 
		RULE_tuple_struct_items = 70, RULE_path_pattern = 71, RULE_type = 72, 
		RULE_reference_type = 73, RULE_array_type = 74, RULE_slice_type = 75, 
		RULE_tuple_type = 76, RULE_inferred_type = 77, RULE_path_in_expression = 78, 
		RULE_path_expr_segment = 79, RULE_path_ident_segment = 80, RULE_type_path = 81, 
		RULE_type_path_segment = 82;
	private static String[] makeRuleNames() {
		return new String[] {
			"crate", "item", "function", "function_parameters", "function_param", 
			"self_param", "struct", "struct_fields", "struct_field", "enumeration", 
			"enum_variants", "enum_variant", "constant_item", "trait", "implementation", 
			"inderent_impl", "trait_impl", "associated_item", "statement", "let_statement", 
			"expression_statement", "expression", "expression_without_struct", "expression_without_block", 
			"expression_with_block", "literal_expression", "path_expression", "borrow_expression", 
			"dereference_expression", "negation_expression", "arithmetic_or_logical_expression", 
			"comparison_expression", "lazy_boolean_expression", "assignment_expression", 
			"compound_assignment_expression", "grouped_expression", "array_expression", 
			"array_elements", "index_expression", "struct_expression", "struct_expr_fields", 
			"struct_expr_field", "call_expression", "call_params", "method_call_expression", 
			"field_expression", "continue_expression", "break_expression", "return_expression", 
			"underscore_expression", "block_expression", "statements", "const_block_expression", 
			"loop_expression", "infinite_loop_expression", "predicate_loop_expression", 
			"if_expression", "conditions", "let_chain", "let_chain_condition", "match_expression", 
			"scrutinee", "match_arms", "match_arm", "pattern", "literal_pattern", 
			"identifier_pattern", "wildcard_pattern", "reference_pattern", "tuple_struct_pattern", 
			"tuple_struct_items", "path_pattern", "type", "reference_type", "array_type", 
			"slice_type", "tuple_type", "inferred_type", "path_in_expression", "path_expr_segment", 
			"path_ident_segment", "type_path", "type_path_segment"
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
	}

	public final CrateContext crate() throws RecognitionException {
		CrateContext _localctx = new CrateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 167776904L) != 0)) {
				{
				{
				setState(166);
				item();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(172);
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
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_item);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				struct();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				enumeration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				constant_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				trait();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
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
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(183);
				match(CONST);
				}
			}

			setState(186);
			match(FN);
			setState(187);
			match(IDENTIFIER);
			setState(188);
			match(LPAR);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1153264827394949376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1073750017L) != 0)) {
				{
				setState(189);
				function_parameters();
				}
			}

			setState(192);
			match(RPAR);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RARROW) {
				{
				setState(193);
				match(RARROW);
				setState(194);
				type();
				}
			}

			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBCE:
				{
				setState(197);
				block_expression();
				}
				break;
			case SEMI:
				{
				setState(198);
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
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_parameters);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				self_param();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(202);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(205);
					self_param();
					setState(206);
					match(COMMA);
					}
					break;
				}
				setState(210);
				function_param();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(211);
					match(COMMA);
					setState(212);
					function_param();
					}
					}
					setState(217);
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
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			pattern();
			setState(221);
			match(COLON);
			setState(222);
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
	}

	public final Self_paramContext self_param() throws RecognitionException {
		Self_paramContext _localctx = new Self_paramContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_self_param);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(224);
					match(AND);
					}
				}

				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUT) {
					{
					setState(227);
					match(MUT);
					}
				}

				setState(230);
				match(SELF_KW);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MUT) {
					{
					setState(231);
					match(MUT);
					}
				}

				setState(234);
				match(SELF_KW);
				setState(235);
				match(COLON);
				setState(236);
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
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(STRUCT);
			setState(240);
			match(IDENTIFIER);
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBCE:
				{
				setState(241);
				match(LBCE);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(242);
					struct_fields();
					}
				}

				setState(245);
				match(RBCE);
				}
				break;
			case SEMI:
				{
				setState(246);
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
	}

	public final Struct_fieldsContext struct_fields() throws RecognitionException {
		Struct_fieldsContext _localctx = new Struct_fieldsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_struct_fields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			struct_field();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					match(COMMA);
					setState(251);
					struct_field();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(257);
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
	}

	public final Struct_fieldContext struct_field() throws RecognitionException {
		Struct_fieldContext _localctx = new Struct_fieldContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_struct_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(IDENTIFIER);
			setState(261);
			match(COLON);
			setState(262);
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
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(ENUM);
			setState(265);
			match(IDENTIFIER);
			setState(266);
			match(LBCE);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(267);
				enum_variants();
				}
			}

			setState(270);
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
	}

	public final Enum_variantsContext enum_variants() throws RecognitionException {
		Enum_variantsContext _localctx = new Enum_variantsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enum_variants);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			enum_variant();
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					enum_variant();
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(280);
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
	}

	public final Enum_variantContext enum_variant() throws RecognitionException {
		Enum_variantContext _localctx = new Enum_variantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enum_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
	}

	public final Constant_itemContext constant_item() throws RecognitionException {
		Constant_itemContext _localctx = new Constant_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constant_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(CONST);
			setState(286);
			match(IDENTIFIER);
			setState(287);
			match(COLON);
			setState(288);
			type();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(289);
				match(EQ);
				setState(290);
				expression(0);
				}
			}

			setState(293);
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
	}

	public final TraitContext trait() throws RecognitionException {
		TraitContext _localctx = new TraitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_trait);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(TRAIT);
			setState(296);
			match(IDENTIFIER);
			setState(297);
			match(LBCE);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==FN) {
				{
				{
				setState(298);
				associated_item();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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
	}

	public final ImplementationContext implementation() throws RecognitionException {
		ImplementationContext _localctx = new ImplementationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_implementation);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				inderent_impl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
	}

	public final Inderent_implContext inderent_impl() throws RecognitionException {
		Inderent_implContext _localctx = new Inderent_implContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inderent_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(IMPL);
			setState(311);
			type();
			setState(312);
			match(LBCE);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==FN) {
				{
				{
				setState(313);
				associated_item();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
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
	}

	public final Trait_implContext trait_impl() throws RecognitionException {
		Trait_implContext _localctx = new Trait_implContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_trait_impl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(IMPL);
			setState(322);
			match(IDENTIFIER);
			setState(323);
			match(FOR);
			setState(324);
			type();
			setState(325);
			match(LBCE);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST || _la==FN) {
				{
				{
				setState(326);
				associated_item();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
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
	}

	public final Associated_itemContext associated_item() throws RecognitionException {
		Associated_itemContext _localctx = new Associated_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_associated_item);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				let_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
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
	}

	public final Let_statementContext let_statement() throws RecognitionException {
		Let_statementContext _localctx = new Let_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_let_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(LET);
			setState(345);
			pattern();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(346);
				match(COLON);
				setState(347);
				type();
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(350);
				match(EQ);
				setState(351);
				expression(0);
				}
			}

			setState(354);
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
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression_statement);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				expression_without_block();
				setState(357);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				expression_with_block();
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(360);
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
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
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
		public TerminalNode CONTINUE() { return getToken(Rx.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(Rx.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(Rx.RETURN, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(Rx.UNDERSCORE, 0); }
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
		public TerminalNode DOTDOT() { return getToken(Rx.DOTDOT, 0); }
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
		public TerminalNode INTEGER_LITERAL() { return getToken(Rx.INTEGER_LITERAL, 0); }
		public TerminalNode AS() { return getToken(Rx.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
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
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(366);
				match(LPAR);
				setState(367);
				expression(0);
				setState(368);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(370);
				match(LPAR);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(374); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(371);
							expression(0);
							setState(372);
							match(COMMA);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(376); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
						{
						setState(378);
						expression(0);
						}
					}

					}
				}

				setState(383);
				match(RPAR);
				}
				break;
			case 3:
				{
				setState(384);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(385);
				expression(27);
				}
				break;
			case 4:
				{
				setState(386);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(387);
				match(MUT);
				setState(388);
				expression(26);
				}
				break;
			case 5:
				{
				setState(389);
				match(STAR);
				setState(390);
				expression(25);
				}
				break;
			case 6:
				{
				setState(391);
				match(NOT);
				setState(392);
				expression(24);
				}
				break;
			case 7:
				{
				setState(393);
				match(MINUS);
				setState(394);
				expression(23);
				}
				break;
			case 8:
				{
				setState(395);
				match(LBKT);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(396);
					array_elements();
					}
				}

				setState(399);
				match(RBKT);
				}
				break;
			case 9:
				{
				setState(400);
				path_in_expression();
				setState(401);
				match(LBCE);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(402);
					struct_expr_fields();
					}
				}

				setState(405);
				match(RBCE);
				}
				break;
			case 10:
				{
				setState(407);
				match(CONTINUE);
				}
				break;
			case 11:
				{
				setState(408);
				match(BREAK);
				setState(410);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(409);
					expression(0);
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(412);
				match(RETURN);
				setState(414);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(413);
					expression(0);
					}
					break;
				}
				}
				break;
			case 13:
				{
				setState(416);
				literal_expression();
				}
				break;
			case 14:
				{
				setState(417);
				path_expression();
				}
				break;
			case 15:
				{
				setState(418);
				match(UNDERSCORE);
				}
				break;
			case 16:
				{
				setState(419);
				block_expression();
				}
				break;
			case 17:
				{
				setState(420);
				const_block_expression();
				}
				break;
			case 18:
				{
				setState(421);
				loop_expression();
				}
				break;
			case 19:
				{
				setState(422);
				if_expression();
				}
				break;
			case 20:
				{
				setState(423);
				match_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(481);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(479);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(426);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(427);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(428);
						expression(23);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(429);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(430);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(431);
						expression(22);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(432);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(433);
						_la = _input.LA(1);
						if ( !(_la==SHL || _la==SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(434);
						expression(21);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(435);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(436);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1134907106097364992L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(437);
						expression(20);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(438);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(439);
						_la = _input.LA(1);
						if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 12289L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(440);
						expression(19);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(441);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(442);
						_la = _input.LA(1);
						if ( !(_la==ANDAND || _la==OROR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(443);
						expression(18);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(444);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(445);
						match(DOTDOT);
						setState(446);
						expression(17);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(447);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(448);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2047L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(449);
						expression(14);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(450);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(451);
						match(DOT);
						setState(452);
						path_expr_segment();
						setState(453);
						match(LPAR);
						setState(455);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
							{
							setState(454);
							call_params();
							}
						}

						setState(457);
						match(RPAR);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(459);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(460);
						match(DOT);
						setState(461);
						match(IDENTIFIER);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(462);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(463);
						match(DOT);
						setState(464);
						match(INTEGER_LITERAL);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 29))) throw new FailedPredicateException(this, "precpred(_ctx, 29)");
						setState(466);
						match(LBKT);
						setState(467);
						expression(0);
						setState(468);
						match(RBKT);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(470);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(471);
						match(LPAR);
						setState(473);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
							{
							setState(472);
							call_params();
							}
						}

						setState(475);
						match(RPAR);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(476);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(477);
						match(AS);
						setState(478);
						type();
						}
						break;
					}
					} 
				}
				setState(483);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
	public static class Expression_without_structContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(Rx.LPAR, 0); }
		public List<Expression_without_structContext> expression_without_struct() {
			return getRuleContexts(Expression_without_structContext.class);
		}
		public Expression_without_structContext expression_without_struct(int i) {
			return getRuleContext(Expression_without_structContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(Rx.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(Rx.DOT, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(Rx.INTEGER_LITERAL, 0); }
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
		public TerminalNode CONTINUE() { return getToken(Rx.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(Rx.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(Rx.RETURN, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(Rx.UNDERSCORE, 0); }
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
		public TerminalNode DOTDOT() { return getToken(Rx.DOTDOT, 0); }
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
		public Path_expr_segmentContext path_expr_segment() {
			return getRuleContext(Path_expr_segmentContext.class,0);
		}
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(Rx.IDENTIFIER, 0); }
		public TerminalNode AS() { return getToken(Rx.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expression_without_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_without_struct; }
	}

	public final Expression_without_structContext expression_without_struct() throws RecognitionException {
		return expression_without_struct(0);
	}

	private Expression_without_structContext expression_without_struct(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_without_structContext _localctx = new Expression_without_structContext(_ctx, _parentState);
		Expression_without_structContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression_without_struct, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(485);
				match(LPAR);
				setState(486);
				expression_without_struct(0);
				setState(487);
				match(RPAR);
				}
				break;
			case 2:
				{
				setState(489);
				match(LPAR);
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(493); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(490);
							expression_without_struct(0);
							setState(491);
							match(COMMA);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(495); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(498);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
						{
						setState(497);
						expression_without_struct(0);
						}
					}

					}
				}

				setState(502);
				match(RPAR);
				}
				break;
			case 3:
				{
				setState(503);
				expression(0);
				setState(504);
				match(DOT);
				setState(505);
				match(INTEGER_LITERAL);
				}
				break;
			case 4:
				{
				setState(507);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(508);
				expression_without_struct(26);
				}
				break;
			case 5:
				{
				setState(509);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(510);
				match(MUT);
				setState(511);
				expression_without_struct(25);
				}
				break;
			case 6:
				{
				setState(512);
				match(STAR);
				setState(513);
				expression_without_struct(24);
				}
				break;
			case 7:
				{
				setState(514);
				match(NOT);
				setState(515);
				expression_without_struct(23);
				}
				break;
			case 8:
				{
				setState(516);
				match(MINUS);
				setState(517);
				expression_without_struct(22);
				}
				break;
			case 9:
				{
				setState(518);
				match(LBKT);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(519);
					array_elements();
					}
				}

				setState(522);
				match(RBKT);
				}
				break;
			case 10:
				{
				setState(523);
				match(CONTINUE);
				}
				break;
			case 11:
				{
				setState(524);
				match(BREAK);
				setState(526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(525);
					expression_without_struct(0);
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(528);
				match(RETURN);
				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(529);
					expression_without_struct(0);
					}
					break;
				}
				}
				break;
			case 13:
				{
				setState(532);
				literal_expression();
				}
				break;
			case 14:
				{
				setState(533);
				path_expression();
				}
				break;
			case 15:
				{
				setState(534);
				match(UNDERSCORE);
				}
				break;
			case 16:
				{
				setState(535);
				block_expression();
				}
				break;
			case 17:
				{
				setState(536);
				const_block_expression();
				}
				break;
			case 18:
				{
				setState(537);
				loop_expression();
				}
				break;
			case 19:
				{
				setState(538);
				if_expression();
				}
				break;
			case 20:
				{
				setState(539);
				match_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(594);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(592);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(542);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(543);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(544);
						expression_without_struct(22);
						}
						break;
					case 2:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(545);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(546);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(547);
						expression_without_struct(21);
						}
						break;
					case 3:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(548);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(549);
						_la = _input.LA(1);
						if ( !(_la==SHL || _la==SHR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(550);
						expression_without_struct(20);
						}
						break;
					case 4:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(551);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(552);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1134907106097364992L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(553);
						expression_without_struct(19);
						}
						break;
					case 5:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(554);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(555);
						_la = _input.LA(1);
						if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 12289L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(556);
						expression_without_struct(18);
						}
						break;
					case 6:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(557);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(558);
						_la = _input.LA(1);
						if ( !(_la==ANDAND || _la==OROR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(559);
						expression_without_struct(17);
						}
						break;
					case 7:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(560);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(561);
						match(DOTDOT);
						setState(562);
						expression_without_struct(16);
						}
						break;
					case 8:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(563);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(564);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2047L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(565);
						expression_without_struct(13);
						}
						break;
					case 9:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(566);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(567);
						match(DOT);
						setState(568);
						path_expr_segment();
						setState(569);
						match(LPAR);
						setState(571);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
							{
							setState(570);
							call_params();
							}
						}

						setState(573);
						match(RPAR);
						}
						break;
					case 10:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(575);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(576);
						match(DOT);
						setState(577);
						match(IDENTIFIER);
						}
						break;
					case 11:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(578);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(579);
						match(LBKT);
						setState(580);
						expression_without_struct(0);
						setState(581);
						match(RBKT);
						}
						break;
					case 12:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(583);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(584);
						match(LPAR);
						setState(586);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
							{
							setState(585);
							call_params();
							}
						}

						setState(588);
						match(RPAR);
						}
						break;
					case 13:
						{
						_localctx = new Expression_without_structContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_without_struct);
						setState(589);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(590);
						match(AS);
						setState(591);
						type();
						}
						break;
					}
					} 
				}
				setState(596);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
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
		public TerminalNode AS() { return getToken(Rx.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DOTDOT() { return getToken(Rx.DOTDOT, 0); }
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
		public TerminalNode INTEGER_LITERAL() { return getToken(Rx.INTEGER_LITERAL, 0); }
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
		public TerminalNode CONTINUE() { return getToken(Rx.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(Rx.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(Rx.RETURN, 0); }
		public Literal_expressionContext literal_expression() {
			return getRuleContext(Literal_expressionContext.class,0);
		}
		public Path_expressionContext path_expression() {
			return getRuleContext(Path_expressionContext.class,0);
		}
		public TerminalNode UNDERSCORE() { return getToken(Rx.UNDERSCORE, 0); }
		public Expression_without_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_without_block; }
	}

	public final Expression_without_blockContext expression_without_block() throws RecognitionException {
		Expression_without_blockContext _localctx = new Expression_without_blockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression_without_block);
		int _la;
		try {
			int _alt;
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				match(LPAR);
				setState(598);
				expression(0);
				setState(599);
				match(RPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				match(LPAR);
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(605); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(602);
							expression(0);
							setState(603);
							match(COMMA);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(607); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
						{
						setState(609);
						expression(0);
						}
					}

					}
				}

				setState(614);
				match(RPAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				expression(0);
				setState(616);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 2047L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(617);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(619);
				expression(0);
				setState(620);
				match(AS);
				setState(621);
				type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(623);
				expression(0);
				setState(624);
				match(DOTDOT);
				setState(625);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(627);
				expression(0);
				setState(628);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==OROR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(629);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(631);
				expression(0);
				setState(632);
				_la = _input.LA(1);
				if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & 12289L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(633);
				expression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(635);
				expression(0);
				setState(636);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1134907106097364992L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(637);
				expression(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(639);
				expression(0);
				setState(640);
				_la = _input.LA(1);
				if ( !(_la==SHL || _la==SHR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(641);
				expression(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(643);
				expression(0);
				setState(644);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(645);
				expression(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(647);
				expression(0);
				setState(648);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(649);
				expression(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(651);
				match(NOT);
				setState(652);
				expression(0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(653);
				match(MINUS);
				setState(654);
				expression(0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(655);
				match(STAR);
				setState(656);
				expression(0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(657);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(658);
				expression(0);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(659);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(660);
				match(MUT);
				setState(661);
				expression(0);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(662);
				expression(0);
				setState(663);
				match(LPAR);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(664);
					call_params();
					}
				}

				setState(667);
				match(RPAR);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(669);
				expression(0);
				setState(670);
				match(LBKT);
				setState(671);
				expression(0);
				setState(672);
				match(RBKT);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(674);
				expression(0);
				setState(675);
				match(DOT);
				setState(676);
				match(INTEGER_LITERAL);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(678);
				expression(0);
				setState(679);
				match(DOT);
				setState(680);
				match(IDENTIFIER);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(682);
				expression(0);
				setState(683);
				match(DOT);
				setState(684);
				path_expr_segment();
				setState(685);
				match(LPAR);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(686);
					call_params();
					}
				}

				setState(689);
				match(RPAR);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(691);
				match(LBKT);
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(692);
					array_elements();
					}
				}

				setState(695);
				match(RBKT);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(696);
				path_in_expression();
				setState(697);
				match(LBCE);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(698);
					struct_expr_fields();
					}
				}

				setState(701);
				match(RBCE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(703);
				match(CONTINUE);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(704);
				match(BREAK);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(705);
					expression(0);
					}
				}

				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(708);
				match(RETURN);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
					{
					setState(709);
					expression(0);
					}
				}

				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(712);
				literal_expression();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(713);
				path_expression();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(714);
				match(UNDERSCORE);
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
	}

	public final Expression_with_blockContext expression_with_block() throws RecognitionException {
		Expression_with_blockContext _localctx = new Expression_with_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression_with_block);
		try {
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				block_expression();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				const_block_expression();
				}
				break;
			case LOOP:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				loop_expression();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 4);
				{
				setState(720);
				if_expression();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(721);
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
	}

	public final Literal_expressionContext literal_expression() throws RecognitionException {
		Literal_expressionContext _localctx = new Literal_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_literal_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
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
	}

	public final Path_expressionContext path_expression() throws RecognitionException {
		Path_expressionContext _localctx = new Path_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_path_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
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
	}

	public final Borrow_expressionContext borrow_expression() throws RecognitionException {
		Borrow_expressionContext _localctx = new Borrow_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_borrow_expression);
		int _la;
		try {
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(729);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				_la = _input.LA(1);
				if ( !(_la==ANDAND || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(731);
				match(MUT);
				setState(732);
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
	}

	public final Dereference_expressionContext dereference_expression() throws RecognitionException {
		Dereference_expressionContext _localctx = new Dereference_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_dereference_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(STAR);
			setState(736);
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
	}

	public final Negation_expressionContext negation_expression() throws RecognitionException {
		Negation_expressionContext _localctx = new Negation_expressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_negation_expression);
		try {
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				match(NOT);
				setState(739);
				expression(0);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(MINUS);
				setState(741);
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
	}

	public final Arithmetic_or_logical_expressionContext arithmetic_or_logical_expression() throws RecognitionException {
		Arithmetic_or_logical_expressionContext _localctx = new Arithmetic_or_logical_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arithmetic_or_logical_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			expression(0);
			setState(745);
			_la = _input.LA(1);
			if ( !(((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 491583L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(746);
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
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparison_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			expression(0);
			setState(749);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1134907106097364992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(750);
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
	}

	public final Lazy_boolean_expressionContext lazy_boolean_expression() throws RecognitionException {
		Lazy_boolean_expressionContext _localctx = new Lazy_boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lazy_boolean_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			expression(0);
			setState(753);
			_la = _input.LA(1);
			if ( !(_la==ANDAND || _la==OROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(754);
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
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			expression(0);
			setState(757);
			match(EQ);
			setState(758);
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
	}

	public final Compound_assignment_expressionContext compound_assignment_expression() throws RecognitionException {
		Compound_assignment_expressionContext _localctx = new Compound_assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_compound_assignment_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			expression(0);
			setState(761);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1023L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(762);
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
	}

	public final Grouped_expressionContext grouped_expression() throws RecognitionException {
		Grouped_expressionContext _localctx = new Grouped_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_grouped_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(LPAR);
			setState(765);
			expression(0);
			setState(766);
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
	}

	public final Array_expressionContext array_expression() throws RecognitionException {
		Array_expressionContext _localctx = new Array_expressionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_array_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(LBKT);
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
				{
				setState(769);
				array_elements();
				}
			}

			setState(772);
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
	}

	public final Array_elementsContext array_elements() throws RecognitionException {
		Array_elementsContext _localctx = new Array_elementsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_array_elements);
		int _la;
		try {
			int _alt;
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				expression(0);
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(775);
						match(COMMA);
						setState(776);
						expression(0);
						}
						} 
					}
					setState(781);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(782);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				expression(0);
				setState(786);
				match(SEMI);
				setState(787);
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
	}

	public final Index_expressionContext index_expression() throws RecognitionException {
		Index_expressionContext _localctx = new Index_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_index_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			expression(0);
			setState(792);
			match(LBKT);
			setState(793);
			expression(0);
			setState(794);
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
	}

	public final Struct_expressionContext struct_expression() throws RecognitionException {
		Struct_expressionContext _localctx = new Struct_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_struct_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			path_in_expression();
			setState(797);
			match(LBCE);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(798);
				struct_expr_fields();
				}
			}

			setState(801);
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
	}

	public final Struct_expr_fieldsContext struct_expr_fields() throws RecognitionException {
		Struct_expr_fieldsContext _localctx = new Struct_expr_fieldsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_struct_expr_fields);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			struct_expr_field();
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(804);
					match(COMMA);
					setState(805);
					struct_expr_field();
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(811);
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
	}

	public final Struct_expr_fieldContext struct_expr_field() throws RecognitionException {
		Struct_expr_fieldContext _localctx = new Struct_expr_fieldContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_struct_expr_field);
		try {
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(IDENTIFIER);
				setState(815);
				match(COLON);
				setState(816);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
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
	}

	public final Call_expressionContext call_expression() throws RecognitionException {
		Call_expressionContext _localctx = new Call_expressionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			expression(0);
			setState(821);
			match(LPAR);
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
				{
				setState(822);
				call_params();
				}
			}

			setState(825);
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
	}

	public final Call_paramsContext call_params() throws RecognitionException {
		Call_paramsContext _localctx = new Call_paramsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_call_params);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			expression(0);
			setState(832);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(828);
					match(COMMA);
					setState(829);
					expression(0);
					}
					} 
				}
				setState(834);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(835);
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
	}

	public final Method_call_expressionContext method_call_expression() throws RecognitionException {
		Method_call_expressionContext _localctx = new Method_call_expressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_method_call_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			expression(0);
			setState(839);
			match(DOT);
			setState(840);
			path_expr_segment();
			setState(841);
			match(LPAR);
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
				{
				setState(842);
				call_params();
				}
			}

			setState(845);
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
	}

	public final Field_expressionContext field_expression() throws RecognitionException {
		Field_expressionContext _localctx = new Field_expressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_field_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			expression(0);
			setState(848);
			match(DOT);
			setState(849);
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
	}

	public final Continue_expressionContext continue_expression() throws RecognitionException {
		Continue_expressionContext _localctx = new Continue_expressionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_continue_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
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
	}

	public final Break_expressionContext break_expression() throws RecognitionException {
		Break_expressionContext _localctx = new Break_expressionContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_break_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(BREAK);
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
				{
				setState(854);
				expression(0);
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
	public static class Return_expressionContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Rx.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_expression; }
	}

	public final Return_expressionContext return_expression() throws RecognitionException {
		Return_expressionContext _localctx = new Return_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_return_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(RETURN);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985193933084L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426071553L) != 0)) {
				{
				setState(858);
				expression(0);
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
	public static class Underscore_expressionContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Rx.UNDERSCORE, 0); }
		public Underscore_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_underscore_expression; }
	}

	public final Underscore_expressionContext underscore_expression() throws RecognitionException {
		Underscore_expressionContext _localctx = new Underscore_expressionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_underscore_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
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
	}

	public final Block_expressionContext block_expression() throws RecognitionException {
		Block_expressionContext _localctx = new Block_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_block_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			match(LBCE);
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985361726364L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426333697L) != 0)) {
				{
				setState(864);
				statements();
				}
			}

			setState(867);
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
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statements);
		int _la;
		try {
			int _alt;
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(869);
					statement();
					}
					}
					setState(872); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1162834985361726364L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1426333697L) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(874);
						statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(877); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(879);
				expression_without_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(881);
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
	}

	public final Const_block_expressionContext const_block_expression() throws RecognitionException {
		Const_block_expressionContext _localctx = new Const_block_expressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_const_block_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(CONST);
			setState(885);
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
	}

	public final Loop_expressionContext loop_expression() throws RecognitionException {
		Loop_expressionContext _localctx = new Loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_loop_expression);
		try {
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(887);
				infinite_loop_expression();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(888);
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
	}

	public final Infinite_loop_expressionContext infinite_loop_expression() throws RecognitionException {
		Infinite_loop_expressionContext _localctx = new Infinite_loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_infinite_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(LOOP);
			setState(892);
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
	}

	public final Predicate_loop_expressionContext predicate_loop_expression() throws RecognitionException {
		Predicate_loop_expressionContext _localctx = new Predicate_loop_expressionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_predicate_loop_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(WHILE);
			setState(895);
			conditions();
			setState(896);
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
	}

	public final If_expressionContext if_expression() throws RecognitionException {
		If_expressionContext _localctx = new If_expressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_if_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(IF);
			setState(899);
			conditions();
			setState(900);
			block_expression();
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(901);
				match(ELSE);
				setState(904);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(902);
					if_expression();
					}
					break;
				case LBCE:
					{
					setState(903);
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
		public Expression_without_structContext expression_without_struct() {
			return getRuleContext(Expression_without_structContext.class,0);
		}
		public Let_chainContext let_chain() {
			return getRuleContext(Let_chainContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_conditions);
		try {
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				expression_without_struct(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				let_chain();
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
	public static class Let_chainContext extends ParserRuleContext {
		public List<Let_chain_conditionContext> let_chain_condition() {
			return getRuleContexts(Let_chain_conditionContext.class);
		}
		public Let_chain_conditionContext let_chain_condition(int i) {
			return getRuleContext(Let_chain_conditionContext.class,i);
		}
		public List<TerminalNode> ANDAND() { return getTokens(Rx.ANDAND); }
		public TerminalNode ANDAND(int i) {
			return getToken(Rx.ANDAND, i);
		}
		public Let_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_chain; }
	}

	public final Let_chainContext let_chain() throws RecognitionException {
		Let_chainContext _localctx = new Let_chainContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_let_chain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			let_chain_condition();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ANDAND) {
				{
				{
				setState(913);
				match(ANDAND);
				setState(914);
				let_chain_condition();
				}
				}
				setState(919);
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
	public static class Let_chain_conditionContext extends ParserRuleContext {
		public Expression_without_structContext expression_without_struct() {
			return getRuleContext(Expression_without_structContext.class,0);
		}
		public TerminalNode LET() { return getToken(Rx.LET, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode EQ() { return getToken(Rx.EQ, 0); }
		public ScrutineeContext scrutinee() {
			return getRuleContext(ScrutineeContext.class,0);
		}
		public Let_chain_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let_chain_condition; }
	}

	public final Let_chain_conditionContext let_chain_condition() throws RecognitionException {
		Let_chain_conditionContext _localctx = new Let_chain_conditionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_let_chain_condition);
		try {
			setState(926);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
			case CONST:
			case CONTINUE:
			case FALSE:
			case IF:
			case LOOP:
			case MATCH:
			case RETURN:
			case SELF_KW:
			case SELF_TYPE:
			case TRUE:
			case WHILE:
			case INTEGER_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case RAW_STRING_LITERAL:
			case MINUS:
			case STAR:
			case NOT:
			case ANDAND:
			case AND:
			case UNDERSCORE:
			case LPAR:
			case LBKT:
			case LBCE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				expression_without_struct(0);
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(921);
				match(LET);
				setState(922);
				pattern();
				setState(923);
				match(EQ);
				setState(924);
				scrutinee();
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
	}

	public final Match_expressionContext match_expression() throws RecognitionException {
		Match_expressionContext _localctx = new Match_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_match_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(MATCH);
			setState(929);
			scrutinee();
			setState(930);
			match(LBCE);
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1153264827394949376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1073750017L) != 0)) {
				{
				setState(931);
				match_arms();
				}
			}

			setState(934);
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
		public Expression_without_structContext expression_without_struct() {
			return getRuleContext(Expression_without_structContext.class,0);
		}
		public ScrutineeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scrutinee; }
	}

	public final ScrutineeContext scrutinee() throws RecognitionException {
		ScrutineeContext _localctx = new ScrutineeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_scrutinee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			expression_without_struct(0);
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
	}

	public final Match_armsContext match_arms() throws RecognitionException {
		Match_armsContext _localctx = new Match_armsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_match_arms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(938);
					match_arm();
					setState(939);
					match(FATARROW);
					setState(947);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
					case 1:
						{
						setState(940);
						expression_without_block();
						setState(941);
						match(COMMA);
						}
						break;
					case 2:
						{
						setState(943);
						expression_with_block();
						setState(945);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(944);
							match(COMMA);
							}
						}

						}
						break;
					}
					}
					} 
				}
				setState(953);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			}
			setState(954);
			match_arm();
			setState(955);
			match(FATARROW);
			setState(956);
			expression(0);
			setState(958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(957);
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
	}

	public final Match_armContext match_arm() throws RecognitionException {
		Match_armContext _localctx = new Match_armContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_match_arm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
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
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_pattern);
		try {
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				literal_pattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				identifier_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(964);
				wildcard_pattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(965);
				reference_pattern();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(966);
				tuple_struct_pattern();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(967);
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
	}

	public final Literal_patternContext literal_pattern() throws RecognitionException {
		Literal_patternContext _localctx = new Literal_patternContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_literal_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(970);
				match(MINUS);
				}
			}

			setState(973);
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
	}

	public final Identifier_patternContext identifier_pattern() throws RecognitionException {
		Identifier_patternContext _localctx = new Identifier_patternContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_identifier_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(975);
				match(REF);
				}
			}

			setState(979);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUT) {
				{
				setState(978);
				match(MUT);
				}
			}

			setState(981);
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
	}

	public final Wildcard_patternContext wildcard_pattern() throws RecognitionException {
		Wildcard_patternContext _localctx = new Wildcard_patternContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_wildcard_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
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
	}

	public final Reference_patternContext reference_pattern() throws RecognitionException {
		Reference_patternContext _localctx = new Reference_patternContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_reference_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_la = _input.LA(1);
			if ( !(_la==ANDAND || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(986);
				match(MUT);
				}
				break;
			}
			setState(989);
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
	}

	public final Tuple_struct_patternContext tuple_struct_pattern() throws RecognitionException {
		Tuple_struct_patternContext _localctx = new Tuple_struct_patternContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tuple_struct_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			path_in_expression();
			setState(992);
			match(LPAR);
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1153264827394949376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1073750017L) != 0)) {
				{
				setState(993);
				tuple_struct_items();
				}
			}

			setState(996);
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
	}

	public final Tuple_struct_itemsContext tuple_struct_items() throws RecognitionException {
		Tuple_struct_itemsContext _localctx = new Tuple_struct_itemsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_tuple_struct_items);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			pattern();
			setState(1003);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(999);
					match(COMMA);
					setState(1000);
					pattern();
					}
					} 
				}
				setState(1005);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1006);
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
	}

	public final Path_patternContext path_pattern() throws RecognitionException {
		Path_patternContext _localctx = new Path_patternContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_path_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
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
		public Tuple_typeContext tuple_type() {
			return getRuleContext(Tuple_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_type);
		try {
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				type_path();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				reference_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1013);
				array_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1014);
				slice_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1015);
				inferred_type();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1016);
				tuple_type();
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
	}

	public final Reference_typeContext reference_type() throws RecognitionException {
		Reference_typeContext _localctx = new Reference_typeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_reference_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(AND);
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MUT) {
				{
				setState(1020);
				match(MUT);
				}
			}

			setState(1023);
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
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(LBKT);
			setState(1026);
			type();
			setState(1027);
			match(SEMI);
			setState(1028);
			expression(0);
			setState(1029);
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
	}

	public final Slice_typeContext slice_type() throws RecognitionException {
		Slice_typeContext _localctx = new Slice_typeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_slice_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(LBKT);
			setState(1032);
			type();
			setState(1033);
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
	public static class Tuple_typeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(Rx.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(Rx.RPAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Rx.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Rx.COMMA, i);
		}
		public Tuple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple_type; }
	}

	public final Tuple_typeContext tuple_type() throws RecognitionException {
		Tuple_typeContext _localctx = new Tuple_typeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tuple_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(LPAR);
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELF_KW || _la==SELF_TYPE || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1157636097L) != 0)) {
				{
				setState(1039); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1036);
						type();
						setState(1037);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1041); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELF_KW || _la==SELF_TYPE || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1157636097L) != 0)) {
					{
					setState(1043);
					type();
					}
				}

				}
			}

			setState(1048);
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
	public static class Inferred_typeContext extends ParserRuleContext {
		public TerminalNode UNDERSCORE() { return getToken(Rx.UNDERSCORE, 0); }
		public Inferred_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferred_type; }
	}

	public final Inferred_typeContext inferred_type() throws RecognitionException {
		Inferred_typeContext _localctx = new Inferred_typeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_inferred_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
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
	}

	public final Path_in_expressionContext path_in_expression() throws RecognitionException {
		Path_in_expressionContext _localctx = new Path_in_expressionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_path_in_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			path_expr_segment();
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1053);
					match(PATHSEP);
					setState(1054);
					path_expr_segment();
					}
					} 
				}
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
	}

	public final Path_expr_segmentContext path_expr_segment() throws RecognitionException {
		Path_expr_segmentContext _localctx = new Path_expr_segmentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_path_expr_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
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
	}

	public final Path_ident_segmentContext path_ident_segment() throws RecognitionException {
		Path_ident_segmentContext _localctx = new Path_ident_segmentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_path_ident_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
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
	}

	public final Type_pathContext type_path() throws RecognitionException {
		Type_pathContext _localctx = new Type_pathContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_type_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
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
	}

	public final Type_path_segmentContext type_path_segment() throws RecognitionException {
		Type_path_segmentContext _localctx = new Type_path_segmentContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_type_path_segment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
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
		case 22:
			return expression_without_struct_sempred((Expression_without_structContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 32);
		case 9:
			return precpred(_ctx, 31);
		case 10:
			return precpred(_ctx, 30);
		case 11:
			return precpred(_ctx, 29);
		case 12:
			return precpred(_ctx, 28);
		case 13:
			return precpred(_ctx, 15);
		}
		return true;
	}
	private boolean expression_without_struct_sempred(Expression_without_structContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 20);
		case 16:
			return precpred(_ctx, 19);
		case 17:
			return precpred(_ctx, 18);
		case 18:
			return precpred(_ctx, 17);
		case 19:
			return precpred(_ctx, 16);
		case 20:
			return precpred(_ctx, 15);
		case 21:
			return precpred(_ctx, 13);
		case 22:
			return precpred(_ctx, 31);
		case 23:
			return precpred(_ctx, 30);
		case 24:
			return precpred(_ctx, 28);
		case 25:
			return precpred(_ctx, 27);
		case 26:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001^\u042d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0001\u0000\u0005\u0000\u00a8\b\u0000"+
		"\n\u0000\f\u0000\u00ab\t\u0000\u0001\u0000\u0003\u0000\u00ae\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00b6\b\u0001\u0001\u0002\u0003\u0002\u00b9\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00bf\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00c4\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u00c8\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00cc\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d1\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00d6\b\u0003\n\u0003\f\u0003"+
		"\u00d9\t\u0003\u0003\u0003\u00db\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0003\u0005\u00e2\b\u0005\u0001\u0005\u0003"+
		"\u0005\u00e5\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e9\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ee\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00f4\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00f8\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00fd\b\u0007\n\u0007\f\u0007\u0100\t\u0007\u0001\u0007\u0003"+
		"\u0007\u0103\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u010d\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u0114\b\n\n\n\f\n\u0117\t\n\u0001\n\u0003\n\u011a\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0124\b"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u012c\b\r\n"+
		"\r\f\r\u012f\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u0135"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u013b"+
		"\b\u000f\n\u000f\f\u000f\u013e\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0148\b\u0010\n\u0010\f\u0010\u014b\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0151\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0157\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u015d\b\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0161\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u016a\b\u0014\u0003\u0014\u016c"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0177\b\u0015\u000b"+
		"\u0015\f\u0015\u0178\u0001\u0015\u0003\u0015\u017c\b\u0015\u0003\u0015"+
		"\u017e\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u018e\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0194\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u019b\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u019f\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u01a9\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01c8\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01da\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u01e0\b\u0015\n\u0015\f\u0015\u01e3\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u01ee\b\u0016\u000b\u0016\f"+
		"\u0016\u01ef\u0001\u0016\u0003\u0016\u01f3\b\u0016\u0003\u0016\u01f5\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0209\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u020f\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0213"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u021d\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u023c\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u024b\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0251\b\u0016\n\u0016\f\u0016\u0254\t\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0004\u0017\u025e\b\u0017\u000b\u0017\f\u0017\u025f\u0001"+
		"\u0017\u0003\u0017\u0263\b\u0017\u0003\u0017\u0265\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u029a\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u02b0\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u02b6\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u02bc\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u02c3\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u02c7\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u02cc\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u02d3\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u02de"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u02e7\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0003$\u0303\b$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0005%\u030a\b%\n%\f%\u030d\t%\u0001%\u0003"+
		"%\u0310\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u0316\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0003\'\u0320\b\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0005(\u0327\b(\n(\f(\u032a\t(\u0001(\u0003(\u032d"+
		"\b(\u0001)\u0001)\u0001)\u0001)\u0003)\u0333\b)\u0001*\u0001*\u0001*\u0003"+
		"*\u0338\b*\u0001*\u0001*\u0001+\u0001+\u0001+\u0005+\u033f\b+\n+\f+\u0342"+
		"\t+\u0001+\u0003+\u0345\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u034c"+
		"\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001/\u0001"+
		"/\u0003/\u0358\b/\u00010\u00010\u00030\u035c\b0\u00011\u00011\u00012\u0001"+
		"2\u00032\u0362\b2\u00012\u00012\u00013\u00043\u0367\b3\u000b3\f3\u0368"+
		"\u00013\u00043\u036c\b3\u000b3\f3\u036d\u00013\u00013\u00013\u00033\u0373"+
		"\b3\u00014\u00014\u00014\u00015\u00015\u00035\u037a\b5\u00016\u00016\u0001"+
		"6\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00038\u0389\b8\u00038\u038b\b8\u00019\u00019\u00039\u038f\b9\u0001"+
		":\u0001:\u0001:\u0005:\u0394\b:\n:\f:\u0397\t:\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u039f\b;\u0001<\u0001<\u0001<\u0001<\u0003<\u03a5"+
		"\b<\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0003>\u03b2\b>\u0003>\u03b4\b>\u0005>\u03b6\b>\n>\f>\u03b9\t"+
		">\u0001>\u0001>\u0001>\u0001>\u0003>\u03bf\b>\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0003@\u03c9\b@\u0001A\u0003A\u03cc\bA\u0001"+
		"A\u0001A\u0001B\u0003B\u03d1\bB\u0001B\u0003B\u03d4\bB\u0001B\u0001B\u0001"+
		"C\u0001C\u0001D\u0001D\u0003D\u03dc\bD\u0001D\u0001D\u0001E\u0001E\u0001"+
		"E\u0003E\u03e3\bE\u0001E\u0001E\u0001F\u0001F\u0001F\u0005F\u03ea\bF\n"+
		"F\fF\u03ed\tF\u0001F\u0003F\u03f0\bF\u0001G\u0001G\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0003H\u03fa\bH\u0001I\u0001I\u0003I\u03fe\bI\u0001"+
		"I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0001K\u0001L\u0001L\u0001L\u0001L\u0004L\u0410\bL\u000bL\fL\u0411\u0001"+
		"L\u0003L\u0415\bL\u0003L\u0417\bL\u0001L\u0001L\u0001M\u0001M\u0001N\u0001"+
		"N\u0001N\u0005N\u0420\bN\nN\fN\u0423\tN\u0001O\u0001O\u0001P\u0001P\u0001"+
		"Q\u0001Q\u0001R\u0001R\u0001R\u0000\u0002*,S\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u0000\f\u0002\u0000<<@@\u0001\u000013\u0001\u0000/0\u0001"+
		"\u0000>?\u0001\u00006;\u0002\u000044@A\u0001\u0000<=\u0001\u0000BL\u0004"+
		"\u0000\b\b\u001c\u001c&&+-\u0002\u0000/4>A\u0001\u0000BK\u0002\u0000\u0016"+
		"\u0017^^\u04b1\u0000\u00a9\u0001\u0000\u0000\u0000\u0002\u00b5\u0001\u0000"+
		"\u0000\u0000\u0004\u00b8\u0001\u0000\u0000\u0000\u0006\u00da\u0001\u0000"+
		"\u0000\u0000\b\u00dc\u0001\u0000\u0000\u0000\n\u00ed\u0001\u0000\u0000"+
		"\u0000\f\u00ef\u0001\u0000\u0000\u0000\u000e\u00f9\u0001\u0000\u0000\u0000"+
		"\u0010\u0104\u0001\u0000\u0000\u0000\u0012\u0108\u0001\u0000\u0000\u0000"+
		"\u0014\u0110\u0001\u0000\u0000\u0000\u0016\u011b\u0001\u0000\u0000\u0000"+
		"\u0018\u011d\u0001\u0000\u0000\u0000\u001a\u0127\u0001\u0000\u0000\u0000"+
		"\u001c\u0134\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000\u0000\u0000"+
		" \u0141\u0001\u0000\u0000\u0000\"\u0150\u0001\u0000\u0000\u0000$\u0156"+
		"\u0001\u0000\u0000\u0000&\u0158\u0001\u0000\u0000\u0000(\u016b\u0001\u0000"+
		"\u0000\u0000*\u01a8\u0001\u0000\u0000\u0000,\u021c\u0001\u0000\u0000\u0000"+
		".\u02cb\u0001\u0000\u0000\u00000\u02d2\u0001\u0000\u0000\u00002\u02d4"+
		"\u0001\u0000\u0000\u00004\u02d6\u0001\u0000\u0000\u00006\u02dd\u0001\u0000"+
		"\u0000\u00008\u02df\u0001\u0000\u0000\u0000:\u02e6\u0001\u0000\u0000\u0000"+
		"<\u02e8\u0001\u0000\u0000\u0000>\u02ec\u0001\u0000\u0000\u0000@\u02f0"+
		"\u0001\u0000\u0000\u0000B\u02f4\u0001\u0000\u0000\u0000D\u02f8\u0001\u0000"+
		"\u0000\u0000F\u02fc\u0001\u0000\u0000\u0000H\u0300\u0001\u0000\u0000\u0000"+
		"J\u0315\u0001\u0000\u0000\u0000L\u0317\u0001\u0000\u0000\u0000N\u031c"+
		"\u0001\u0000\u0000\u0000P\u0323\u0001\u0000\u0000\u0000R\u0332\u0001\u0000"+
		"\u0000\u0000T\u0334\u0001\u0000\u0000\u0000V\u033b\u0001\u0000\u0000\u0000"+
		"X\u0346\u0001\u0000\u0000\u0000Z\u034f\u0001\u0000\u0000\u0000\\\u0353"+
		"\u0001\u0000\u0000\u0000^\u0355\u0001\u0000\u0000\u0000`\u0359\u0001\u0000"+
		"\u0000\u0000b\u035d\u0001\u0000\u0000\u0000d\u035f\u0001\u0000\u0000\u0000"+
		"f\u0372\u0001\u0000\u0000\u0000h\u0374\u0001\u0000\u0000\u0000j\u0379"+
		"\u0001\u0000\u0000\u0000l\u037b\u0001\u0000\u0000\u0000n\u037e\u0001\u0000"+
		"\u0000\u0000p\u0382\u0001\u0000\u0000\u0000r\u038e\u0001\u0000\u0000\u0000"+
		"t\u0390\u0001\u0000\u0000\u0000v\u039e\u0001\u0000\u0000\u0000x\u03a0"+
		"\u0001\u0000\u0000\u0000z\u03a8\u0001\u0000\u0000\u0000|\u03b7\u0001\u0000"+
		"\u0000\u0000~\u03c0\u0001\u0000\u0000\u0000\u0080\u03c8\u0001\u0000\u0000"+
		"\u0000\u0082\u03cb\u0001\u0000\u0000\u0000\u0084\u03d0\u0001\u0000\u0000"+
		"\u0000\u0086\u03d7\u0001\u0000\u0000\u0000\u0088\u03d9\u0001\u0000\u0000"+
		"\u0000\u008a\u03df\u0001\u0000\u0000\u0000\u008c\u03e6\u0001\u0000\u0000"+
		"\u0000\u008e\u03f1\u0001\u0000\u0000\u0000\u0090\u03f9\u0001\u0000\u0000"+
		"\u0000\u0092\u03fb\u0001\u0000\u0000\u0000\u0094\u0401\u0001\u0000\u0000"+
		"\u0000\u0096\u0407\u0001\u0000\u0000\u0000\u0098\u040b\u0001\u0000\u0000"+
		"\u0000\u009a\u041a\u0001\u0000\u0000\u0000\u009c\u041c\u0001\u0000\u0000"+
		"\u0000\u009e\u0424\u0001\u0000\u0000\u0000\u00a0\u0426\u0001\u0000\u0000"+
		"\u0000\u00a2\u0428\u0001\u0000\u0000\u0000\u00a4\u042a\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a8\u0003\u0002\u0001\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ae\u0005\u0000\u0000"+
		"\u0001\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u0001\u0001\u0000\u0000\u0000\u00af\u00b6\u0003\u0004\u0002"+
		"\u0000\u00b0\u00b6\u0003\f\u0006\u0000\u00b1\u00b6\u0003\u0012\t\u0000"+
		"\u00b2\u00b6\u0003\u0018\f\u0000\u00b3\u00b6\u0003\u001a\r\u0000\u00b4"+
		"\u00b6\u0003\u001c\u000e\u0000\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u0003\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b9\u0005\u0003\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0005\t\u0000\u0000\u00bb\u00bc\u0005^\u0000\u0000\u00bc\u00be"+
		"\u0005X\u0000\u0000\u00bd\u00bf\u0003\u0006\u0003\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0005Y\u0000\u0000\u00c1\u00c2\u0005U\u0000"+
		"\u0000\u00c2\u00c4\u0003\u0090H\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c8\u0003d2\u0000\u00c6\u00c8\u0005R\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u0005"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\n\u0005\u0000\u00ca\u00cc\u0005"+
		"Q\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00db\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003\n\u0005"+
		"\u0000\u00ce\u00cf\u0005Q\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d7\u0003\b\u0004\u0000\u00d3"+
		"\u00d4\u0005Q\u0000\u0000\u00d4\u00d6\u0003\b\u0004\u0000\u00d5\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00c9"+
		"\u0001\u0000\u0000\u0000\u00da\u00d0\u0001\u0000\u0000\u0000\u00db\u0007"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003\u0080@\u0000\u00dd\u00de\u0005"+
		"S\u0000\u0000\u00de\u00df\u0003\u0090H\u0000\u00df\t\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e2\u0005@\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u0005\u0012\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00ee\u0005\u0016\u0000\u0000\u00e7\u00e9\u0005\u0012\u0000\u0000"+
		"\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005\u0016\u0000\u0000"+
		"\u00eb\u00ec\u0005S\u0000\u0000\u00ec\u00ee\u0003\u0090H\u0000\u00ed\u00e1"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ee\u000b"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u0019\u0000\u0000\u00f0\u00f7"+
		"\u0005^\u0000\u0000\u00f1\u00f3\u0005\\\u0000\u0000\u00f2\u00f4\u0003"+
		"\u000e\u0007\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f8\u0005"+
		"]\u0000\u0000\u00f6\u00f8\u0005R\u0000\u0000\u00f7\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8\r\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fe\u0003\u0010\b\u0000\u00fa\u00fb\u0005Q\u0000\u0000\u00fb"+
		"\u00fd\u0003\u0010\b\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u0100"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0101\u0103\u0005Q\u0000\u0000\u0102\u0101\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u000f\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0005^\u0000\u0000\u0105\u0106\u0005S\u0000"+
		"\u0000\u0106\u0107\u0003\u0090H\u0000\u0107\u0011\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005\u0007\u0000\u0000\u0109\u010a\u0005^\u0000\u0000\u010a"+
		"\u010c\u0005\\\u0000\u0000\u010b\u010d\u0003\u0014\n\u0000\u010c\u010b"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0005]\u0000\u0000\u010f\u0013\u0001"+
		"\u0000\u0000\u0000\u0110\u0115\u0003\u0016\u000b\u0000\u0111\u0112\u0005"+
		"Q\u0000\u0000\u0112\u0114\u0003\u0016\u000b\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011a\u0005Q\u0000"+
		"\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u0015\u0001\u0000\u0000\u0000\u011b\u011c\u0005^\u0000\u0000"+
		"\u011c\u0017\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0003\u0000\u0000"+
		"\u011e\u011f\u0005^\u0000\u0000\u011f\u0120\u0005S\u0000\u0000\u0120\u0123"+
		"\u0003\u0090H\u0000\u0121\u0122\u0005L\u0000\u0000\u0122\u0124\u0003*"+
		"\u0015\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005R\u0000"+
		"\u0000\u0126\u0019\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u001b\u0000"+
		"\u0000\u0128\u0129\u0005^\u0000\u0000\u0129\u012d\u0005\\\u0000\u0000"+
		"\u012a\u012c\u0003\"\u0011\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012c"+
		"\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0005]\u0000\u0000\u0131\u001b"+
		"\u0001\u0000\u0000\u0000\u0132\u0135\u0003\u001e\u000f\u0000\u0133\u0135"+
		"\u0003 \u0010\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0133\u0001"+
		"\u0000\u0000\u0000\u0135\u001d\u0001\u0000\u0000\u0000\u0136\u0137\u0005"+
		"\f\u0000\u0000\u0137\u0138\u0003\u0090H\u0000\u0138\u013c\u0005\\\u0000"+
		"\u0000\u0139\u013b\u0003\"\u0011\u0000\u013a\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u0005]\u0000\u0000\u0140"+
		"\u001f\u0001\u0000\u0000\u0000\u0141\u0142\u0005\f\u0000\u0000\u0142\u0143"+
		"\u0005^\u0000\u0000\u0143\u0144\u0005\n\u0000\u0000\u0144\u0145\u0003"+
		"\u0090H\u0000\u0145\u0149\u0005\\\u0000\u0000\u0146\u0148\u0003\"\u0011"+
		"\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000"+
		"\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"+
		"\u0000\u014a\u014c\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0005]\u0000\u0000\u014d!\u0001\u0000\u0000\u0000\u014e"+
		"\u0151\u0003\u0004\u0002\u0000\u014f\u0151\u0003\u0018\f\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151#\u0001"+
		"\u0000\u0000\u0000\u0152\u0157\u0005R\u0000\u0000\u0153\u0157\u0003\u0002"+
		"\u0001\u0000\u0154\u0157\u0003&\u0013\u0000\u0155\u0157\u0003(\u0014\u0000"+
		"\u0156\u0152\u0001\u0000\u0000\u0000\u0156\u0153\u0001\u0000\u0000\u0000"+
		"\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000"+
		"\u0157%\u0001\u0000\u0000\u0000\u0158\u0159\u0005\u000e\u0000\u0000\u0159"+
		"\u015c\u0003\u0080@\u0000\u015a\u015b\u0005S\u0000\u0000\u015b\u015d\u0003"+
		"\u0090H\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d\u0160\u0001\u0000\u0000\u0000\u015e\u015f\u0005L\u0000"+
		"\u0000\u015f\u0161\u0003*\u0015\u0000\u0160\u015e\u0001\u0000\u0000\u0000"+
		"\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0005R\u0000\u0000\u0163\'\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0003.\u0017\u0000\u0165\u0166\u0005R\u0000\u0000\u0166\u016c\u0001"+
		"\u0000\u0000\u0000\u0167\u0169\u00030\u0018\u0000\u0168\u016a\u0005R\u0000"+
		"\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0164\u0001\u0000\u0000"+
		"\u0000\u016b\u0167\u0001\u0000\u0000\u0000\u016c)\u0001\u0000\u0000\u0000"+
		"\u016d\u016e\u0006\u0015\uffff\uffff\u0000\u016e\u016f\u0005X\u0000\u0000"+
		"\u016f\u0170\u0003*\u0015\u0000\u0170\u0171\u0005Y\u0000\u0000\u0171\u01a9"+
		"\u0001\u0000\u0000\u0000\u0172\u017d\u0005X\u0000\u0000\u0173\u0174\u0003"+
		"*\u0015\u0000\u0174\u0175\u0005Q\u0000\u0000\u0175\u0177\u0001\u0000\u0000"+
		"\u0000\u0176\u0173\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179\u017b\u0001\u0000\u0000\u0000\u017a\u017c\u0003*\u0015\u0000"+
		"\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000"+
		"\u017c\u017e\u0001\u0000\u0000\u0000\u017d\u0176\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f\u01a9\u0005Y\u0000\u0000\u0180\u0181\u0007\u0000\u0000\u0000\u0181"+
		"\u01a9\u0003*\u0015\u001b\u0182\u0183\u0007\u0000\u0000\u0000\u0183\u0184"+
		"\u0005\u0012\u0000\u0000\u0184\u01a9\u0003*\u0015\u001a\u0185\u0186\u0005"+
		"1\u0000\u0000\u0186\u01a9\u0003*\u0015\u0019\u0187\u0188\u00055\u0000"+
		"\u0000\u0188\u01a9\u0003*\u0015\u0018\u0189\u018a\u00050\u0000\u0000\u018a"+
		"\u01a9\u0003*\u0015\u0017\u018b\u018d\u0005Z\u0000\u0000\u018c\u018e\u0003"+
		"J%\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u01a9\u0005[\u0000\u0000"+
		"\u0190\u0191\u0003\u009cN\u0000\u0191\u0193\u0005\\\u0000\u0000\u0192"+
		"\u0194\u0003P(\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0005"+
		"]\u0000\u0000\u0196\u01a9\u0001\u0000\u0000\u0000\u0197\u01a9\u0005\u0004"+
		"\u0000\u0000\u0198\u019a\u0005\u0002\u0000\u0000\u0199\u019b\u0003*\u0015"+
		"\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u01a9\u0001\u0000\u0000\u0000\u019c\u019e\u0005\u0015\u0000"+
		"\u0000\u019d\u019f\u0003*\u0015\u0000\u019e\u019d\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a9\u00032\u0019\u0000\u01a1\u01a9\u00034\u001a\u0000\u01a2\u01a9"+
		"\u0005M\u0000\u0000\u01a3\u01a9\u0003d2\u0000\u01a4\u01a9\u0003h4\u0000"+
		"\u01a5\u01a9\u0003j5\u0000\u01a6\u01a9\u0003p8\u0000\u01a7\u01a9\u0003"+
		"x<\u0000\u01a8\u016d\u0001\u0000\u0000\u0000\u01a8\u0172\u0001\u0000\u0000"+
		"\u0000\u01a8\u0180\u0001\u0000\u0000\u0000\u01a8\u0182\u0001\u0000\u0000"+
		"\u0000\u01a8\u0185\u0001\u0000\u0000\u0000\u01a8\u0187\u0001\u0000\u0000"+
		"\u0000\u01a8\u0189\u0001\u0000\u0000\u0000\u01a8\u018b\u0001\u0000\u0000"+
		"\u0000\u01a8\u0190\u0001\u0000\u0000\u0000\u01a8\u0197\u0001\u0000\u0000"+
		"\u0000\u01a8\u0198\u0001\u0000\u0000\u0000\u01a8\u019c\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a0\u0001\u0000\u0000\u0000\u01a8\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a2\u0001\u0000\u0000\u0000\u01a8\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000\u01a8\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a9\u01e1\u0001\u0000\u0000\u0000\u01aa\u01ab\n\u0016\u0000\u0000"+
		"\u01ab\u01ac\u0007\u0001\u0000\u0000\u01ac\u01e0\u0003*\u0015\u0017\u01ad"+
		"\u01ae\n\u0015\u0000\u0000\u01ae\u01af\u0007\u0002\u0000\u0000\u01af\u01e0"+
		"\u0003*\u0015\u0016\u01b0\u01b1\n\u0014\u0000\u0000\u01b1\u01b2\u0007"+
		"\u0003\u0000\u0000\u01b2\u01e0\u0003*\u0015\u0015\u01b3\u01b4\n\u0013"+
		"\u0000\u0000\u01b4\u01b5\u0007\u0004\u0000\u0000\u01b5\u01e0\u0003*\u0015"+
		"\u0014\u01b6\u01b7\n\u0012\u0000\u0000\u01b7\u01b8\u0007\u0005\u0000\u0000"+
		"\u01b8\u01e0\u0003*\u0015\u0013\u01b9\u01ba\n\u0011\u0000\u0000\u01ba"+
		"\u01bb\u0007\u0006\u0000\u0000\u01bb\u01e0\u0003*\u0015\u0012\u01bc\u01bd"+
		"\n\u0010\u0000\u0000\u01bd\u01be\u0005O\u0000\u0000\u01be\u01e0\u0003"+
		"*\u0015\u0011\u01bf\u01c0\n\u000e\u0000\u0000\u01c0\u01c1\u0007\u0007"+
		"\u0000\u0000\u01c1\u01e0\u0003*\u0015\u000e\u01c2\u01c3\n \u0000\u0000"+
		"\u01c3\u01c4\u0005N\u0000\u0000\u01c4\u01c5\u0003\u009eO\u0000\u01c5\u01c7"+
		"\u0005X\u0000\u0000\u01c6\u01c8\u0003V+\u0000\u01c7\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0005Y\u0000\u0000\u01ca\u01e0\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\n\u001f\u0000\u0000\u01cc\u01cd\u0005N\u0000\u0000"+
		"\u01cd\u01e0\u0005^\u0000\u0000\u01ce\u01cf\n\u001e\u0000\u0000\u01cf"+
		"\u01d0\u0005N\u0000\u0000\u01d0\u01e0\u0005&\u0000\u0000\u01d1\u01d2\n"+
		"\u001d\u0000\u0000\u01d2\u01d3\u0005Z\u0000\u0000\u01d3\u01d4\u0003*\u0015"+
		"\u0000\u01d4\u01d5\u0005[\u0000\u0000\u01d5\u01e0\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\n\u001c\u0000\u0000\u01d7\u01d9\u0005X\u0000\u0000\u01d8"+
		"\u01da\u0003V+\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9\u01da\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01e0\u0005"+
		"Y\u0000\u0000\u01dc\u01dd\n\u000f\u0000\u0000\u01dd\u01de\u0005\u0001"+
		"\u0000\u0000\u01de\u01e0\u0003\u0090H\u0000\u01df\u01aa\u0001\u0000\u0000"+
		"\u0000\u01df\u01ad\u0001\u0000\u0000\u0000\u01df\u01b0\u0001\u0000\u0000"+
		"\u0000\u01df\u01b3\u0001\u0000\u0000\u0000\u01df\u01b6\u0001\u0000\u0000"+
		"\u0000\u01df\u01b9\u0001\u0000\u0000\u0000\u01df\u01bc\u0001\u0000\u0000"+
		"\u0000\u01df\u01bf\u0001\u0000\u0000\u0000\u01df\u01c2\u0001\u0000\u0000"+
		"\u0000\u01df\u01cb\u0001\u0000\u0000\u0000\u01df\u01ce\u0001\u0000\u0000"+
		"\u0000\u01df\u01d1\u0001\u0000\u0000\u0000\u01df\u01d6\u0001\u0000\u0000"+
		"\u0000\u01df\u01dc\u0001\u0000\u0000\u0000\u01e0\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e2+\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e4\u01e5\u0006\u0016\uffff\uffff\u0000\u01e5\u01e6\u0005X\u0000\u0000"+
		"\u01e6\u01e7\u0003,\u0016\u0000\u01e7\u01e8\u0005Y\u0000\u0000\u01e8\u021d"+
		"\u0001\u0000\u0000\u0000\u01e9\u01f4\u0005X\u0000\u0000\u01ea\u01eb\u0003"+
		",\u0016\u0000\u01eb\u01ec\u0005Q\u0000\u0000\u01ec\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ed\u01ea\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01f3\u0003,\u0016\u0000"+
		"\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4\u01ed\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f6\u021d\u0005Y\u0000\u0000\u01f7\u01f8\u0003*\u0015\u0000\u01f8\u01f9"+
		"\u0005N\u0000\u0000\u01f9\u01fa\u0005&\u0000\u0000\u01fa\u021d\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0007\u0000\u0000\u0000\u01fc\u021d\u0003,\u0016"+
		"\u001a\u01fd\u01fe\u0007\u0000\u0000\u0000\u01fe\u01ff\u0005\u0012\u0000"+
		"\u0000\u01ff\u021d\u0003,\u0016\u0019\u0200\u0201\u00051\u0000\u0000\u0201"+
		"\u021d\u0003,\u0016\u0018\u0202\u0203\u00055\u0000\u0000\u0203\u021d\u0003"+
		",\u0016\u0017\u0204\u0205\u00050\u0000\u0000\u0205\u021d\u0003,\u0016"+
		"\u0016\u0206\u0208\u0005Z\u0000\u0000\u0207\u0209\u0003J%\u0000\u0208"+
		"\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u0001\u0000\u0000\u0000\u020a\u021d\u0005[\u0000\u0000\u020b\u021d"+
		"\u0005\u0004\u0000\u0000\u020c\u020e\u0005\u0002\u0000\u0000\u020d\u020f"+
		"\u0003,\u0016\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e\u020f\u0001"+
		"\u0000\u0000\u0000\u020f\u021d\u0001\u0000\u0000\u0000\u0210\u0212\u0005"+
		"\u0015\u0000\u0000\u0211\u0213\u0003,\u0016\u0000\u0212\u0211\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u021d\u0001\u0000"+
		"\u0000\u0000\u0214\u021d\u00032\u0019\u0000\u0215\u021d\u00034\u001a\u0000"+
		"\u0216\u021d\u0005M\u0000\u0000\u0217\u021d\u0003d2\u0000\u0218\u021d"+
		"\u0003h4\u0000\u0219\u021d\u0003j5\u0000\u021a\u021d\u0003p8\u0000\u021b"+
		"\u021d\u0003x<\u0000\u021c\u01e4\u0001\u0000\u0000\u0000\u021c\u01e9\u0001"+
		"\u0000\u0000\u0000\u021c\u01f7\u0001\u0000\u0000\u0000\u021c\u01fb\u0001"+
		"\u0000\u0000\u0000\u021c\u01fd\u0001\u0000\u0000\u0000\u021c\u0200\u0001"+
		"\u0000\u0000\u0000\u021c\u0202\u0001\u0000\u0000\u0000\u021c\u0204\u0001"+
		"\u0000\u0000\u0000\u021c\u0206\u0001\u0000\u0000\u0000\u021c\u020b\u0001"+
		"\u0000\u0000\u0000\u021c\u020c\u0001\u0000\u0000\u0000\u021c\u0210\u0001"+
		"\u0000\u0000\u0000\u021c\u0214\u0001\u0000\u0000\u0000\u021c\u0215\u0001"+
		"\u0000\u0000\u0000\u021c\u0216\u0001\u0000\u0000\u0000\u021c\u0217\u0001"+
		"\u0000\u0000\u0000\u021c\u0218\u0001\u0000\u0000\u0000\u021c\u0219\u0001"+
		"\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021b\u0001"+
		"\u0000\u0000\u0000\u021d\u0252\u0001\u0000\u0000\u0000\u021e\u021f\n\u0015"+
		"\u0000\u0000\u021f\u0220\u0007\u0001\u0000\u0000\u0220\u0251\u0003,\u0016"+
		"\u0016\u0221\u0222\n\u0014\u0000\u0000\u0222\u0223\u0007\u0002\u0000\u0000"+
		"\u0223\u0251\u0003,\u0016\u0015\u0224\u0225\n\u0013\u0000\u0000\u0225"+
		"\u0226\u0007\u0003\u0000\u0000\u0226\u0251\u0003,\u0016\u0014\u0227\u0228"+
		"\n\u0012\u0000\u0000\u0228\u0229\u0007\u0004\u0000\u0000\u0229\u0251\u0003"+
		",\u0016\u0013\u022a\u022b\n\u0011\u0000\u0000\u022b\u022c\u0007\u0005"+
		"\u0000\u0000\u022c\u0251\u0003,\u0016\u0012\u022d\u022e\n\u0010\u0000"+
		"\u0000\u022e\u022f\u0007\u0006\u0000\u0000\u022f\u0251\u0003,\u0016\u0011"+
		"\u0230\u0231\n\u000f\u0000\u0000\u0231\u0232\u0005O\u0000\u0000\u0232"+
		"\u0251\u0003,\u0016\u0010\u0233\u0234\n\r\u0000\u0000\u0234\u0235\u0007"+
		"\u0007\u0000\u0000\u0235\u0251\u0003,\u0016\r\u0236\u0237\n\u001f\u0000"+
		"\u0000\u0237\u0238\u0005N\u0000\u0000\u0238\u0239\u0003\u009eO\u0000\u0239"+
		"\u023b\u0005X\u0000\u0000\u023a\u023c\u0003V+\u0000\u023b\u023a\u0001"+
		"\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0001"+
		"\u0000\u0000\u0000\u023d\u023e\u0005Y\u0000\u0000\u023e\u0251\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\n\u001e\u0000\u0000\u0240\u0241\u0005N\u0000"+
		"\u0000\u0241\u0251\u0005^\u0000\u0000\u0242\u0243\n\u001c\u0000\u0000"+
		"\u0243\u0244\u0005Z\u0000\u0000\u0244\u0245\u0003,\u0016\u0000\u0245\u0246"+
		"\u0005[\u0000\u0000\u0246\u0251\u0001\u0000\u0000\u0000\u0247\u0248\n"+
		"\u001b\u0000\u0000\u0248\u024a\u0005X\u0000\u0000\u0249\u024b\u0003V+"+
		"\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000"+
		"\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u0251\u0005Y\u0000\u0000"+
		"\u024d\u024e\n\u000e\u0000\u0000\u024e\u024f\u0005\u0001\u0000\u0000\u024f"+
		"\u0251\u0003\u0090H\u0000\u0250\u021e\u0001\u0000\u0000\u0000\u0250\u0221"+
		"\u0001\u0000\u0000\u0000\u0250\u0224\u0001\u0000\u0000\u0000\u0250\u0227"+
		"\u0001\u0000\u0000\u0000\u0250\u022a\u0001\u0000\u0000\u0000\u0250\u022d"+
		"\u0001\u0000\u0000\u0000\u0250\u0230\u0001\u0000\u0000\u0000\u0250\u0233"+
		"\u0001\u0000\u0000\u0000\u0250\u0236\u0001\u0000\u0000\u0000\u0250\u023f"+
		"\u0001\u0000\u0000\u0000\u0250\u0242\u0001\u0000\u0000\u0000\u0250\u0247"+
		"\u0001\u0000\u0000\u0000\u0250\u024d\u0001\u0000\u0000\u0000\u0251\u0254"+
		"\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253"+
		"\u0001\u0000\u0000\u0000\u0253-\u0001\u0000\u0000\u0000\u0254\u0252\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0005X\u0000\u0000\u0256\u0257\u0003*\u0015"+
		"\u0000\u0257\u0258\u0005Y\u0000\u0000\u0258\u02cc\u0001\u0000\u0000\u0000"+
		"\u0259\u0264\u0005X\u0000\u0000\u025a\u025b\u0003*\u0015\u0000\u025b\u025c"+
		"\u0005Q\u0000\u0000\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u025a\u0001"+
		"\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u025d\u0001"+
		"\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0262\u0001"+
		"\u0000\u0000\u0000\u0261\u0263\u0003*\u0015\u0000\u0262\u0261\u0001\u0000"+
		"\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001\u0000"+
		"\u0000\u0000\u0264\u025d\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u02cc\u0005Y\u0000"+
		"\u0000\u0267\u0268\u0003*\u0015\u0000\u0268\u0269\u0007\u0007\u0000\u0000"+
		"\u0269\u026a\u0003*\u0015\u0000\u026a\u02cc\u0001\u0000\u0000\u0000\u026b"+
		"\u026c\u0003*\u0015\u0000\u026c\u026d\u0005\u0001\u0000\u0000\u026d\u026e"+
		"\u0003\u0090H\u0000\u026e\u02cc\u0001\u0000\u0000\u0000\u026f\u0270\u0003"+
		"*\u0015\u0000\u0270\u0271\u0005O\u0000\u0000\u0271\u0272\u0003*\u0015"+
		"\u0000\u0272\u02cc\u0001\u0000\u0000\u0000\u0273\u0274\u0003*\u0015\u0000"+
		"\u0274\u0275\u0007\u0006\u0000\u0000\u0275\u0276\u0003*\u0015\u0000\u0276"+
		"\u02cc\u0001\u0000\u0000\u0000\u0277\u0278\u0003*\u0015\u0000\u0278\u0279"+
		"\u0007\u0005\u0000\u0000\u0279\u027a\u0003*\u0015\u0000\u027a\u02cc\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0003*\u0015\u0000\u027c\u027d\u0007\u0004"+
		"\u0000\u0000\u027d\u027e\u0003*\u0015\u0000\u027e\u02cc\u0001\u0000\u0000"+
		"\u0000\u027f\u0280\u0003*\u0015\u0000\u0280\u0281\u0007\u0003\u0000\u0000"+
		"\u0281\u0282\u0003*\u0015\u0000\u0282\u02cc\u0001\u0000\u0000\u0000\u0283"+
		"\u0284\u0003*\u0015\u0000\u0284\u0285\u0007\u0002\u0000\u0000\u0285\u0286"+
		"\u0003*\u0015\u0000\u0286\u02cc\u0001\u0000\u0000\u0000\u0287\u0288\u0003"+
		"*\u0015\u0000\u0288\u0289\u0007\u0001\u0000\u0000\u0289\u028a\u0003*\u0015"+
		"\u0000\u028a\u02cc\u0001\u0000\u0000\u0000\u028b\u028c\u00055\u0000\u0000"+
		"\u028c\u02cc\u0003*\u0015\u0000\u028d\u028e\u00050\u0000\u0000\u028e\u02cc"+
		"\u0003*\u0015\u0000\u028f\u0290\u00051\u0000\u0000\u0290\u02cc\u0003*"+
		"\u0015\u0000\u0291\u0292\u0007\u0000\u0000\u0000\u0292\u02cc\u0003*\u0015"+
		"\u0000\u0293\u0294\u0007\u0000\u0000\u0000\u0294\u0295\u0005\u0012\u0000"+
		"\u0000\u0295\u02cc\u0003*\u0015\u0000\u0296\u0297\u0003*\u0015\u0000\u0297"+
		"\u0299\u0005X\u0000\u0000\u0298\u029a\u0003V+\u0000\u0299\u0298\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0001"+
		"\u0000\u0000\u0000\u029b\u029c\u0005Y\u0000\u0000\u029c\u02cc\u0001\u0000"+
		"\u0000\u0000\u029d\u029e\u0003*\u0015\u0000\u029e\u029f\u0005Z\u0000\u0000"+
		"\u029f\u02a0\u0003*\u0015\u0000\u02a0\u02a1\u0005[\u0000\u0000\u02a1\u02cc"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a3\u0003*\u0015\u0000\u02a3\u02a4\u0005"+
		"N\u0000\u0000\u02a4\u02a5\u0005&\u0000\u0000\u02a5\u02cc\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0003*\u0015\u0000\u02a7\u02a8\u0005N\u0000\u0000\u02a8"+
		"\u02a9\u0005^\u0000\u0000\u02a9\u02cc\u0001\u0000\u0000\u0000\u02aa\u02ab"+
		"\u0003*\u0015\u0000\u02ab\u02ac\u0005N\u0000\u0000\u02ac\u02ad\u0003\u009e"+
		"O\u0000\u02ad\u02af\u0005X\u0000\u0000\u02ae\u02b0\u0003V+\u0000\u02af"+
		"\u02ae\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0005Y\u0000\u0000\u02b2\u02cc"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b5\u0005Z\u0000\u0000\u02b4\u02b6\u0003"+
		"J%\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02cc\u0005[\u0000\u0000"+
		"\u02b8\u02b9\u0003\u009cN\u0000\u02b9\u02bb\u0005\\\u0000\u0000\u02ba"+
		"\u02bc\u0003P(\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0005"+
		"]\u0000\u0000\u02be\u02cc\u0001\u0000\u0000\u0000\u02bf\u02cc\u0005\u0004"+
		"\u0000\u0000\u02c0\u02c2\u0005\u0002\u0000\u0000\u02c1\u02c3\u0003*\u0015"+
		"\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c3\u02cc\u0001\u0000\u0000\u0000\u02c4\u02c6\u0005\u0015\u0000"+
		"\u0000\u02c5\u02c7\u0003*\u0015\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000"+
		"\u02c6\u02c7\u0001\u0000\u0000\u0000\u02c7\u02cc\u0001\u0000\u0000\u0000"+
		"\u02c8\u02cc\u00032\u0019\u0000\u02c9\u02cc\u00034\u001a\u0000\u02ca\u02cc"+
		"\u0005M\u0000\u0000\u02cb\u0255\u0001\u0000\u0000\u0000\u02cb\u0259\u0001"+
		"\u0000\u0000\u0000\u02cb\u0267\u0001\u0000\u0000\u0000\u02cb\u026b\u0001"+
		"\u0000\u0000\u0000\u02cb\u026f\u0001\u0000\u0000\u0000\u02cb\u0273\u0001"+
		"\u0000\u0000\u0000\u02cb\u0277\u0001\u0000\u0000\u0000\u02cb\u027b\u0001"+
		"\u0000\u0000\u0000\u02cb\u027f\u0001\u0000\u0000\u0000\u02cb\u0283\u0001"+
		"\u0000\u0000\u0000\u02cb\u0287\u0001\u0000\u0000\u0000\u02cb\u028b\u0001"+
		"\u0000\u0000\u0000\u02cb\u028d\u0001\u0000\u0000\u0000\u02cb\u028f\u0001"+
		"\u0000\u0000\u0000\u02cb\u0291\u0001\u0000\u0000\u0000\u02cb\u0293\u0001"+
		"\u0000\u0000\u0000\u02cb\u0296\u0001\u0000\u0000\u0000\u02cb\u029d\u0001"+
		"\u0000\u0000\u0000\u02cb\u02a2\u0001\u0000\u0000\u0000\u02cb\u02a6\u0001"+
		"\u0000\u0000\u0000\u02cb\u02aa\u0001\u0000\u0000\u0000\u02cb\u02b3\u0001"+
		"\u0000\u0000\u0000\u02cb\u02b8\u0001\u0000\u0000\u0000\u02cb\u02bf\u0001"+
		"\u0000\u0000\u0000\u02cb\u02c0\u0001\u0000\u0000\u0000\u02cb\u02c4\u0001"+
		"\u0000\u0000\u0000\u02cb\u02c8\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001"+
		"\u0000\u0000\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cc/\u0001\u0000"+
		"\u0000\u0000\u02cd\u02d3\u0003d2\u0000\u02ce\u02d3\u0003h4\u0000\u02cf"+
		"\u02d3\u0003j5\u0000\u02d0\u02d3\u0003p8\u0000\u02d1\u02d3\u0003x<\u0000"+
		"\u02d2\u02cd\u0001\u0000\u0000\u0000\u02d2\u02ce\u0001\u0000\u0000\u0000"+
		"\u02d2\u02cf\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000"+
		"\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d31\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0007\b\u0000\u0000\u02d53\u0001\u0000\u0000\u0000\u02d6\u02d7"+
		"\u0003\u009cN\u0000\u02d75\u0001\u0000\u0000\u0000\u02d8\u02d9\u0007\u0000"+
		"\u0000\u0000\u02d9\u02de\u0003*\u0015\u0000\u02da\u02db\u0007\u0000\u0000"+
		"\u0000\u02db\u02dc\u0005\u0012\u0000\u0000\u02dc\u02de\u0003*\u0015\u0000"+
		"\u02dd\u02d8\u0001\u0000\u0000\u0000\u02dd\u02da\u0001\u0000\u0000\u0000"+
		"\u02de7\u0001\u0000\u0000\u0000\u02df\u02e0\u00051\u0000\u0000\u02e0\u02e1"+
		"\u0003*\u0015\u0000\u02e19\u0001\u0000\u0000\u0000\u02e2\u02e3\u00055"+
		"\u0000\u0000\u02e3\u02e7\u0003*\u0015\u0000\u02e4\u02e5\u00050\u0000\u0000"+
		"\u02e5\u02e7\u0003*\u0015\u0000\u02e6\u02e2\u0001\u0000\u0000\u0000\u02e6"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e7;\u0001\u0000\u0000\u0000\u02e8\u02e9"+
		"\u0003*\u0015\u0000\u02e9\u02ea\u0007\t\u0000\u0000\u02ea\u02eb\u0003"+
		"*\u0015\u0000\u02eb=\u0001\u0000\u0000\u0000\u02ec\u02ed\u0003*\u0015"+
		"\u0000\u02ed\u02ee\u0007\u0004\u0000\u0000\u02ee\u02ef\u0003*\u0015\u0000"+
		"\u02ef?\u0001\u0000\u0000\u0000\u02f0\u02f1\u0003*\u0015\u0000\u02f1\u02f2"+
		"\u0007\u0006\u0000\u0000\u02f2\u02f3\u0003*\u0015\u0000\u02f3A\u0001\u0000"+
		"\u0000\u0000\u02f4\u02f5\u0003*\u0015\u0000\u02f5\u02f6\u0005L\u0000\u0000"+
		"\u02f6\u02f7\u0003*\u0015\u0000\u02f7C\u0001\u0000\u0000\u0000\u02f8\u02f9"+
		"\u0003*\u0015\u0000\u02f9\u02fa\u0007\n\u0000\u0000\u02fa\u02fb\u0003"+
		"*\u0015\u0000\u02fbE\u0001\u0000\u0000\u0000\u02fc\u02fd\u0005X\u0000"+
		"\u0000\u02fd\u02fe\u0003*\u0015\u0000\u02fe\u02ff\u0005Y\u0000\u0000\u02ff"+
		"G\u0001\u0000\u0000\u0000\u0300\u0302\u0005Z\u0000\u0000\u0301\u0303\u0003"+
		"J%\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304\u0305\u0005[\u0000\u0000"+
		"\u0305I\u0001\u0000\u0000\u0000\u0306\u030b\u0003*\u0015\u0000\u0307\u0308"+
		"\u0005Q\u0000\u0000\u0308\u030a\u0003*\u0015\u0000\u0309\u0307\u0001\u0000"+
		"\u0000\u0000\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000"+
		"\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000"+
		"\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030e\u0310\u0005Q\u0000"+
		"\u0000\u030f\u030e\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000"+
		"\u0000\u0310\u0316\u0001\u0000\u0000\u0000\u0311\u0312\u0003*\u0015\u0000"+
		"\u0312\u0313\u0005R\u0000\u0000\u0313\u0314\u0003*\u0015\u0000\u0314\u0316"+
		"\u0001\u0000\u0000\u0000\u0315\u0306\u0001\u0000\u0000\u0000\u0315\u0311"+
		"\u0001\u0000\u0000\u0000\u0316K\u0001\u0000\u0000\u0000\u0317\u0318\u0003"+
		"*\u0015\u0000\u0318\u0319\u0005Z\u0000\u0000\u0319\u031a\u0003*\u0015"+
		"\u0000\u031a\u031b\u0005[\u0000\u0000\u031bM\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0003\u009cN\u0000\u031d\u031f\u0005\\\u0000\u0000\u031e\u0320"+
		"\u0003P(\u0000\u031f\u031e\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000"+
		"\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0005]\u0000"+
		"\u0000\u0322O\u0001\u0000\u0000\u0000\u0323\u0328\u0003R)\u0000\u0324"+
		"\u0325\u0005Q\u0000\u0000\u0325\u0327\u0003R)\u0000\u0326\u0324\u0001"+
		"\u0000\u0000\u0000\u0327\u032a\u0001\u0000\u0000\u0000\u0328\u0326\u0001"+
		"\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032c\u0001"+
		"\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u032d\u0005"+
		"Q\u0000\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000"+
		"\u0000\u0000\u032dQ\u0001\u0000\u0000\u0000\u032e\u032f\u0005^\u0000\u0000"+
		"\u032f\u0330\u0005S\u0000\u0000\u0330\u0333\u0003*\u0015\u0000\u0331\u0333"+
		"\u0005^\u0000\u0000\u0332\u032e\u0001\u0000\u0000\u0000\u0332\u0331\u0001"+
		"\u0000\u0000\u0000\u0333S\u0001\u0000\u0000\u0000\u0334\u0335\u0003*\u0015"+
		"\u0000\u0335\u0337\u0005X\u0000\u0000\u0336\u0338\u0003V+\u0000\u0337"+
		"\u0336\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338"+
		"\u0339\u0001\u0000\u0000\u0000\u0339\u033a\u0005Y\u0000\u0000\u033aU\u0001"+
		"\u0000\u0000\u0000\u033b\u0340\u0003*\u0015\u0000\u033c\u033d\u0005Q\u0000"+
		"\u0000\u033d\u033f\u0003*\u0015\u0000\u033e\u033c\u0001\u0000\u0000\u0000"+
		"\u033f\u0342\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000"+
		"\u0340\u0341\u0001\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000"+
		"\u0342\u0340\u0001\u0000\u0000\u0000\u0343\u0345\u0005Q\u0000\u0000\u0344"+
		"\u0343\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345"+
		"W\u0001\u0000\u0000\u0000\u0346\u0347\u0003*\u0015\u0000\u0347\u0348\u0005"+
		"N\u0000\u0000\u0348\u0349\u0003\u009eO\u0000\u0349\u034b\u0005X\u0000"+
		"\u0000\u034a\u034c\u0003V+\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034b"+
		"\u034c\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d"+
		"\u034e\u0005Y\u0000\u0000\u034eY\u0001\u0000\u0000\u0000\u034f\u0350\u0003"+
		"*\u0015\u0000\u0350\u0351\u0005N\u0000\u0000\u0351\u0352\u0005^\u0000"+
		"\u0000\u0352[\u0001\u0000\u0000\u0000\u0353\u0354\u0005\u0004\u0000\u0000"+
		"\u0354]\u0001\u0000\u0000\u0000\u0355\u0357\u0005\u0002\u0000\u0000\u0356"+
		"\u0358\u0003*\u0015\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0357\u0358"+
		"\u0001\u0000\u0000\u0000\u0358_\u0001\u0000\u0000\u0000\u0359\u035b\u0005"+
		"\u0015\u0000\u0000\u035a\u035c\u0003*\u0015\u0000\u035b\u035a\u0001\u0000"+
		"\u0000\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035ca\u0001\u0000\u0000"+
		"\u0000\u035d\u035e\u0005M\u0000\u0000\u035ec\u0001\u0000\u0000\u0000\u035f"+
		"\u0361\u0005\\\u0000\u0000\u0360\u0362\u0003f3\u0000\u0361\u0360\u0001"+
		"\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0363\u0001"+
		"\u0000\u0000\u0000\u0363\u0364\u0005]\u0000\u0000\u0364e\u0001\u0000\u0000"+
		"\u0000\u0365\u0367\u0003$\u0012\u0000\u0366\u0365\u0001\u0000\u0000\u0000"+
		"\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000"+
		"\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u0373\u0001\u0000\u0000\u0000"+
		"\u036a\u036c\u0003$\u0012\u0000\u036b\u036a\u0001\u0000\u0000\u0000\u036c"+
		"\u036d\u0001\u0000\u0000\u0000\u036d\u036b\u0001\u0000\u0000\u0000\u036d"+
		"\u036e\u0001\u0000\u0000\u0000\u036e\u036f\u0001\u0000\u0000\u0000\u036f"+
		"\u0370\u0003.\u0017\u0000\u0370\u0373\u0001\u0000\u0000\u0000\u0371\u0373"+
		"\u0003.\u0017\u0000\u0372\u0366\u0001\u0000\u0000\u0000\u0372\u036b\u0001"+
		"\u0000\u0000\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0373g\u0001\u0000"+
		"\u0000\u0000\u0374\u0375\u0005\u0003\u0000\u0000\u0375\u0376\u0003d2\u0000"+
		"\u0376i\u0001\u0000\u0000\u0000\u0377\u037a\u0003l6\u0000\u0378\u037a"+
		"\u0003n7\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u0378\u0001\u0000"+
		"\u0000\u0000\u037ak\u0001\u0000\u0000\u0000\u037b\u037c\u0005\u000f\u0000"+
		"\u0000\u037c\u037d\u0003d2\u0000\u037dm\u0001\u0000\u0000\u0000\u037e"+
		"\u037f\u0005!\u0000\u0000\u037f\u0380\u0003r9\u0000\u0380\u0381\u0003"+
		"d2\u0000\u0381o\u0001\u0000\u0000\u0000\u0382\u0383\u0005\u000b\u0000"+
		"\u0000\u0383\u0384\u0003r9\u0000\u0384\u038a\u0003d2\u0000\u0385\u0388"+
		"\u0005\u0006\u0000\u0000\u0386\u0389\u0003p8\u0000\u0387\u0389\u0003d"+
		"2\u0000\u0388\u0386\u0001\u0000\u0000\u0000\u0388\u0387\u0001\u0000\u0000"+
		"\u0000\u0389\u038b\u0001\u0000\u0000\u0000\u038a\u0385\u0001\u0000\u0000"+
		"\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038bq\u0001\u0000\u0000\u0000"+
		"\u038c\u038f\u0003,\u0016\u0000\u038d\u038f\u0003t:\u0000\u038e\u038c"+
		"\u0001\u0000\u0000\u0000\u038e\u038d\u0001\u0000\u0000\u0000\u038fs\u0001"+
		"\u0000\u0000\u0000\u0390\u0395\u0003v;\u0000\u0391\u0392\u0005<\u0000"+
		"\u0000\u0392\u0394\u0003v;\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0394"+
		"\u0397\u0001\u0000\u0000\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0395"+
		"\u0396\u0001\u0000\u0000\u0000\u0396u\u0001\u0000\u0000\u0000\u0397\u0395"+
		"\u0001\u0000\u0000\u0000\u0398\u039f\u0003,\u0016\u0000\u0399\u039a\u0005"+
		"\u000e\u0000\u0000\u039a\u039b\u0003\u0080@\u0000\u039b\u039c\u0005L\u0000"+
		"\u0000\u039c\u039d\u0003z=\u0000\u039d\u039f\u0001\u0000\u0000\u0000\u039e"+
		"\u0398\u0001\u0000\u0000\u0000\u039e\u0399\u0001\u0000\u0000\u0000\u039f"+
		"w\u0001\u0000\u0000\u0000\u03a0\u03a1\u0005\u0010\u0000\u0000\u03a1\u03a2"+
		"\u0003z=\u0000\u03a2\u03a4\u0005\\\u0000\u0000\u03a3\u03a5\u0003|>\u0000"+
		"\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a7\u0005]\u0000\u0000\u03a7"+
		"y\u0001\u0000\u0000\u0000\u03a8\u03a9\u0003,\u0016\u0000\u03a9{\u0001"+
		"\u0000\u0000\u0000\u03aa\u03ab\u0003~?\u0000\u03ab\u03b3\u0005V\u0000"+
		"\u0000\u03ac\u03ad\u0003.\u0017\u0000\u03ad\u03ae\u0005Q\u0000\u0000\u03ae"+
		"\u03b4\u0001\u0000\u0000\u0000\u03af\u03b1\u00030\u0018\u0000\u03b0\u03b2"+
		"\u0005Q\u0000\u0000\u03b1\u03b0\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b2\u03b4\u0001\u0000\u0000\u0000\u03b3\u03ac\u0001"+
		"\u0000\u0000\u0000\u03b3\u03af\u0001\u0000\u0000\u0000\u03b4\u03b6\u0001"+
		"\u0000\u0000\u0000\u03b5\u03aa\u0001\u0000\u0000\u0000\u03b6\u03b9\u0001"+
		"\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001"+
		"\u0000\u0000\u0000\u03b8\u03ba\u0001\u0000\u0000\u0000\u03b9\u03b7\u0001"+
		"\u0000\u0000\u0000\u03ba\u03bb\u0003~?\u0000\u03bb\u03bc\u0005V\u0000"+
		"\u0000\u03bc\u03be\u0003*\u0015\u0000\u03bd\u03bf\u0005Q\u0000\u0000\u03be"+
		"\u03bd\u0001\u0000\u0000\u0000\u03be\u03bf\u0001\u0000\u0000\u0000\u03bf"+
		"}\u0001\u0000\u0000\u0000\u03c0\u03c1\u0003\u0080@\u0000\u03c1\u007f\u0001"+
		"\u0000\u0000\u0000\u03c2\u03c9\u0003\u0082A\u0000\u03c3\u03c9\u0003\u0084"+
		"B\u0000\u03c4\u03c9\u0003\u0086C\u0000\u03c5\u03c9\u0003\u0088D\u0000"+
		"\u03c6\u03c9\u0003\u008aE\u0000\u03c7\u03c9\u0003\u008eG\u0000\u03c8\u03c2"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c3\u0001\u0000\u0000\u0000\u03c8\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c5\u0001\u0000\u0000\u0000\u03c8\u03c6"+
		"\u0001\u0000\u0000\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c9\u0081"+
		"\u0001\u0000\u0000\u0000\u03ca\u03cc\u00050\u0000\u0000\u03cb\u03ca\u0001"+
		"\u0000\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03cd\u0001"+
		"\u0000\u0000\u0000\u03cd\u03ce\u00032\u0019\u0000\u03ce\u0083\u0001\u0000"+
		"\u0000\u0000\u03cf\u03d1\u0005\u0014\u0000\u0000\u03d0\u03cf\u0001\u0000"+
		"\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000\u03d1\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d2\u03d4\u0005\u0012\u0000\u0000\u03d3\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000"+
		"\u0000\u0000\u03d5\u03d6\u0005^\u0000\u0000\u03d6\u0085\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d8\u0005M\u0000\u0000\u03d8\u0087\u0001\u0000\u0000\u0000"+
		"\u03d9\u03db\u0007\u0000\u0000\u0000\u03da\u03dc\u0005\u0012\u0000\u0000"+
		"\u03db\u03da\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000"+
		"\u03dc\u03dd\u0001\u0000\u0000\u0000\u03dd\u03de\u0003\u0080@\u0000\u03de"+
		"\u0089\u0001\u0000\u0000\u0000\u03df\u03e0\u0003\u009cN\u0000\u03e0\u03e2"+
		"\u0005X\u0000\u0000\u03e1\u03e3\u0003\u008cF\u0000\u03e2\u03e1\u0001\u0000"+
		"\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000\u03e3\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e4\u03e5\u0005Y\u0000\u0000\u03e5\u008b\u0001\u0000\u0000"+
		"\u0000\u03e6\u03eb\u0003\u0080@\u0000\u03e7\u03e8\u0005Q\u0000\u0000\u03e8"+
		"\u03ea\u0003\u0080@\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000\u03ea\u03ed"+
		"\u0001\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec"+
		"\u0001\u0000\u0000\u0000\u03ec\u03ef\u0001\u0000\u0000\u0000\u03ed\u03eb"+
		"\u0001\u0000\u0000\u0000\u03ee\u03f0\u0005Q\u0000\u0000\u03ef\u03ee\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u008d\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f2\u0003\u009cN\u0000\u03f2\u008f\u0001\u0000"+
		"\u0000\u0000\u03f3\u03fa\u0003\u00a2Q\u0000\u03f4\u03fa\u0003\u0092I\u0000"+
		"\u03f5\u03fa\u0003\u0094J\u0000\u03f6\u03fa\u0003\u0096K\u0000\u03f7\u03fa"+
		"\u0003\u009aM\u0000\u03f8\u03fa\u0003\u0098L\u0000\u03f9\u03f3\u0001\u0000"+
		"\u0000\u0000\u03f9\u03f4\u0001\u0000\u0000\u0000\u03f9\u03f5\u0001\u0000"+
		"\u0000\u0000\u03f9\u03f6\u0001\u0000\u0000\u0000\u03f9\u03f7\u0001\u0000"+
		"\u0000\u0000\u03f9\u03f8\u0001\u0000\u0000\u0000\u03fa\u0091\u0001\u0000"+
		"\u0000\u0000\u03fb\u03fd\u0005@\u0000\u0000\u03fc\u03fe\u0005\u0012\u0000"+
		"\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u0400\u0003\u0090H\u0000"+
		"\u0400\u0093\u0001\u0000\u0000\u0000\u0401\u0402\u0005Z\u0000\u0000\u0402"+
		"\u0403\u0003\u0090H\u0000\u0403\u0404\u0005R\u0000\u0000\u0404\u0405\u0003"+
		"*\u0015\u0000\u0405\u0406\u0005[\u0000\u0000\u0406\u0095\u0001\u0000\u0000"+
		"\u0000\u0407\u0408\u0005Z\u0000\u0000\u0408\u0409\u0003\u0090H\u0000\u0409"+
		"\u040a\u0005[\u0000\u0000\u040a\u0097\u0001\u0000\u0000\u0000\u040b\u0416"+
		"\u0005X\u0000\u0000\u040c\u040d\u0003\u0090H\u0000\u040d\u040e\u0005Q"+
		"\u0000\u0000\u040e\u0410\u0001\u0000\u0000\u0000\u040f\u040c\u0001\u0000"+
		"\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411\u040f\u0001\u0000"+
		"\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0414\u0001\u0000"+
		"\u0000\u0000\u0413\u0415\u0003\u0090H\u0000\u0414\u0413\u0001\u0000\u0000"+
		"\u0000\u0414\u0415\u0001\u0000\u0000\u0000\u0415\u0417\u0001\u0000\u0000"+
		"\u0000\u0416\u040f\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000"+
		"\u0000\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u0419\u0005Y\u0000\u0000"+
		"\u0419\u0099\u0001\u0000\u0000\u0000\u041a\u041b\u0005M\u0000\u0000\u041b"+
		"\u009b\u0001\u0000\u0000\u0000\u041c\u0421\u0003\u009eO\u0000\u041d\u041e"+
		"\u0005T\u0000\u0000\u041e\u0420\u0003\u009eO\u0000\u041f\u041d\u0001\u0000"+
		"\u0000\u0000\u0420\u0423\u0001\u0000\u0000\u0000\u0421\u041f\u0001\u0000"+
		"\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422\u009d\u0001\u0000"+
		"\u0000\u0000\u0423\u0421\u0001\u0000\u0000\u0000\u0424\u0425\u0003\u00a0"+
		"P\u0000\u0425\u009f\u0001\u0000\u0000\u0000\u0426\u0427\u0007\u000b\u0000"+
		"\u0000\u0427\u00a1\u0001\u0000\u0000\u0000\u0428\u0429\u0003\u00a4R\u0000"+
		"\u0429\u00a3\u0001\u0000\u0000\u0000\u042a\u042b\u0003\u00a0P\u0000\u042b"+
		"\u00a5\u0001\u0000\u0000\u0000p\u00a9\u00ad\u00b5\u00b8\u00be\u00c3\u00c7"+
		"\u00cb\u00d0\u00d7\u00da\u00e1\u00e4\u00e8\u00ed\u00f3\u00f7\u00fe\u0102"+
		"\u010c\u0115\u0119\u0123\u012d\u0134\u013c\u0149\u0150\u0156\u015c\u0160"+
		"\u0169\u016b\u0178\u017b\u017d\u018d\u0193\u019a\u019e\u01a8\u01c7\u01d9"+
		"\u01df\u01e1\u01ef\u01f2\u01f4\u0208\u020e\u0212\u021c\u023b\u024a\u0250"+
		"\u0252\u025f\u0262\u0264\u0299\u02af\u02b5\u02bb\u02c2\u02c6\u02cb\u02d2"+
		"\u02dd\u02e6\u0302\u030b\u030f\u0315\u031f\u0328\u032c\u0332\u0337\u0340"+
		"\u0344\u034b\u0357\u035b\u0361\u0368\u036d\u0372\u0379\u0388\u038a\u038e"+
		"\u0395\u039e\u03a4\u03b1\u03b3\u03b7\u03be\u03c8\u03cb\u03d0\u03d3\u03db"+
		"\u03e2\u03eb\u03ef\u03f9\u03fd\u0411\u0414\u0416\u0421";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}