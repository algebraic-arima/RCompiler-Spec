// Generated from /home/limike/rCompiler/RCompiler-Spec/Rx.g4 by ANTLR 4.13.1

    package src.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Rx}.
 */
public interface RxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Rx#crate}.
	 * @param ctx the parse tree
	 */
	void enterCrate(Rx.CrateContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#crate}.
	 * @param ctx the parse tree
	 */
	void exitCrate(Rx.CrateContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(Rx.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(Rx.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(Rx.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(Rx.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(Rx.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(Rx.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#function_param}.
	 * @param ctx the parse tree
	 */
	void enterFunction_param(Rx.Function_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#function_param}.
	 * @param ctx the parse tree
	 */
	void exitFunction_param(Rx.Function_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#self_param}.
	 * @param ctx the parse tree
	 */
	void enterSelf_param(Rx.Self_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#self_param}.
	 * @param ctx the parse tree
	 */
	void exitSelf_param(Rx.Self_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(Rx.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(Rx.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#struct_fields}.
	 * @param ctx the parse tree
	 */
	void enterStruct_fields(Rx.Struct_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#struct_fields}.
	 * @param ctx the parse tree
	 */
	void exitStruct_fields(Rx.Struct_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#struct_field}.
	 * @param ctx the parse tree
	 */
	void enterStruct_field(Rx.Struct_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#struct_field}.
	 * @param ctx the parse tree
	 */
	void exitStruct_field(Rx.Struct_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#enumeration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(Rx.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#enumeration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(Rx.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#enum_variants}.
	 * @param ctx the parse tree
	 */
	void enterEnum_variants(Rx.Enum_variantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#enum_variants}.
	 * @param ctx the parse tree
	 */
	void exitEnum_variants(Rx.Enum_variantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#enum_variant}.
	 * @param ctx the parse tree
	 */
	void enterEnum_variant(Rx.Enum_variantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#enum_variant}.
	 * @param ctx the parse tree
	 */
	void exitEnum_variant(Rx.Enum_variantContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#constant_item}.
	 * @param ctx the parse tree
	 */
	void enterConstant_item(Rx.Constant_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#constant_item}.
	 * @param ctx the parse tree
	 */
	void exitConstant_item(Rx.Constant_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#trait}.
	 * @param ctx the parse tree
	 */
	void enterTrait(Rx.TraitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#trait}.
	 * @param ctx the parse tree
	 */
	void exitTrait(Rx.TraitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#implementation}.
	 * @param ctx the parse tree
	 */
	void enterImplementation(Rx.ImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#implementation}.
	 * @param ctx the parse tree
	 */
	void exitImplementation(Rx.ImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#inderent_impl}.
	 * @param ctx the parse tree
	 */
	void enterInderent_impl(Rx.Inderent_implContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#inderent_impl}.
	 * @param ctx the parse tree
	 */
	void exitInderent_impl(Rx.Inderent_implContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#trait_impl}.
	 * @param ctx the parse tree
	 */
	void enterTrait_impl(Rx.Trait_implContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#trait_impl}.
	 * @param ctx the parse tree
	 */
	void exitTrait_impl(Rx.Trait_implContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#associated_item}.
	 * @param ctx the parse tree
	 */
	void enterAssociated_item(Rx.Associated_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#associated_item}.
	 * @param ctx the parse tree
	 */
	void exitAssociated_item(Rx.Associated_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Rx.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Rx.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#let_statement}.
	 * @param ctx the parse tree
	 */
	void enterLet_statement(Rx.Let_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#let_statement}.
	 * @param ctx the parse tree
	 */
	void exitLet_statement(Rx.Let_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(Rx.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(Rx.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Rx.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Rx.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#expression_without_block}.
	 * @param ctx the parse tree
	 */
	void enterExpression_without_block(Rx.Expression_without_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#expression_without_block}.
	 * @param ctx the parse tree
	 */
	void exitExpression_without_block(Rx.Expression_without_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#expression_with_block}.
	 * @param ctx the parse tree
	 */
	void enterExpression_with_block(Rx.Expression_with_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#expression_with_block}.
	 * @param ctx the parse tree
	 */
	void exitExpression_with_block(Rx.Expression_with_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#literal_expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expression(Rx.Literal_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#literal_expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expression(Rx.Literal_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#path_expression}.
	 * @param ctx the parse tree
	 */
	void enterPath_expression(Rx.Path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#path_expression}.
	 * @param ctx the parse tree
	 */
	void exitPath_expression(Rx.Path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#operator_expression}.
	 * @param ctx the parse tree
	 */
	void enterOperator_expression(Rx.Operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#operator_expression}.
	 * @param ctx the parse tree
	 */
	void exitOperator_expression(Rx.Operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#borrow_expression}.
	 * @param ctx the parse tree
	 */
	void enterBorrow_expression(Rx.Borrow_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#borrow_expression}.
	 * @param ctx the parse tree
	 */
	void exitBorrow_expression(Rx.Borrow_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#dereference_expression}.
	 * @param ctx the parse tree
	 */
	void enterDereference_expression(Rx.Dereference_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#dereference_expression}.
	 * @param ctx the parse tree
	 */
	void exitDereference_expression(Rx.Dereference_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#negation_expression}.
	 * @param ctx the parse tree
	 */
	void enterNegation_expression(Rx.Negation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#negation_expression}.
	 * @param ctx the parse tree
	 */
	void exitNegation_expression(Rx.Negation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#arithmetic_or_logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_or_logical_expression(Rx.Arithmetic_or_logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#arithmetic_or_logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_or_logical_expression(Rx.Arithmetic_or_logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expression(Rx.Comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expression(Rx.Comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#lazy_boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterLazy_boolean_expression(Rx.Lazy_boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#lazy_boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitLazy_boolean_expression(Rx.Lazy_boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(Rx.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(Rx.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#compound_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_assignment_expression(Rx.Compound_assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#compound_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_assignment_expression(Rx.Compound_assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#grouped_expression}.
	 * @param ctx the parse tree
	 */
	void enterGrouped_expression(Rx.Grouped_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#grouped_expression}.
	 * @param ctx the parse tree
	 */
	void exitGrouped_expression(Rx.Grouped_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#array_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_expression(Rx.Array_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#array_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_expression(Rx.Array_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#array_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_elements(Rx.Array_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#array_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_elements(Rx.Array_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#index_expression}.
	 * @param ctx the parse tree
	 */
	void enterIndex_expression(Rx.Index_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#index_expression}.
	 * @param ctx the parse tree
	 */
	void exitIndex_expression(Rx.Index_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#struct_expression}.
	 * @param ctx the parse tree
	 */
	void enterStruct_expression(Rx.Struct_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#struct_expression}.
	 * @param ctx the parse tree
	 */
	void exitStruct_expression(Rx.Struct_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#struct_expr_fields}.
	 * @param ctx the parse tree
	 */
	void enterStruct_expr_fields(Rx.Struct_expr_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#struct_expr_fields}.
	 * @param ctx the parse tree
	 */
	void exitStruct_expr_fields(Rx.Struct_expr_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#struct_expr_field}.
	 * @param ctx the parse tree
	 */
	void enterStruct_expr_field(Rx.Struct_expr_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#struct_expr_field}.
	 * @param ctx the parse tree
	 */
	void exitStruct_expr_field(Rx.Struct_expr_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#call_expression}.
	 * @param ctx the parse tree
	 */
	void enterCall_expression(Rx.Call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#call_expression}.
	 * @param ctx the parse tree
	 */
	void exitCall_expression(Rx.Call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#call_params}.
	 * @param ctx the parse tree
	 */
	void enterCall_params(Rx.Call_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#call_params}.
	 * @param ctx the parse tree
	 */
	void exitCall_params(Rx.Call_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#method_call_expression}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_expression(Rx.Method_call_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#method_call_expression}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_expression(Rx.Method_call_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#field_expression}.
	 * @param ctx the parse tree
	 */
	void enterField_expression(Rx.Field_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#field_expression}.
	 * @param ctx the parse tree
	 */
	void exitField_expression(Rx.Field_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#continue_expression}.
	 * @param ctx the parse tree
	 */
	void enterContinue_expression(Rx.Continue_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#continue_expression}.
	 * @param ctx the parse tree
	 */
	void exitContinue_expression(Rx.Continue_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#break_expression}.
	 * @param ctx the parse tree
	 */
	void enterBreak_expression(Rx.Break_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#break_expression}.
	 * @param ctx the parse tree
	 */
	void exitBreak_expression(Rx.Break_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#return_expression}.
	 * @param ctx the parse tree
	 */
	void enterReturn_expression(Rx.Return_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#return_expression}.
	 * @param ctx the parse tree
	 */
	void exitReturn_expression(Rx.Return_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#underscore_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnderscore_expression(Rx.Underscore_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#underscore_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnderscore_expression(Rx.Underscore_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#block_expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock_expression(Rx.Block_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#block_expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock_expression(Rx.Block_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(Rx.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(Rx.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#const_block_expression}.
	 * @param ctx the parse tree
	 */
	void enterConst_block_expression(Rx.Const_block_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#const_block_expression}.
	 * @param ctx the parse tree
	 */
	void exitConst_block_expression(Rx.Const_block_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterLoop_expression(Rx.Loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitLoop_expression(Rx.Loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#infinite_loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterInfinite_loop_expression(Rx.Infinite_loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#infinite_loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitInfinite_loop_expression(Rx.Infinite_loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#predicate_loop_expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicate_loop_expression(Rx.Predicate_loop_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#predicate_loop_expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicate_loop_expression(Rx.Predicate_loop_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(Rx.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(Rx.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(Rx.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(Rx.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#match_expression}.
	 * @param ctx the parse tree
	 */
	void enterMatch_expression(Rx.Match_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#match_expression}.
	 * @param ctx the parse tree
	 */
	void exitMatch_expression(Rx.Match_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#scrutinee}.
	 * @param ctx the parse tree
	 */
	void enterScrutinee(Rx.ScrutineeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#scrutinee}.
	 * @param ctx the parse tree
	 */
	void exitScrutinee(Rx.ScrutineeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#match_arms}.
	 * @param ctx the parse tree
	 */
	void enterMatch_arms(Rx.Match_armsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#match_arms}.
	 * @param ctx the parse tree
	 */
	void exitMatch_arms(Rx.Match_armsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#match_arm}.
	 * @param ctx the parse tree
	 */
	void enterMatch_arm(Rx.Match_armContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#match_arm}.
	 * @param ctx the parse tree
	 */
	void exitMatch_arm(Rx.Match_armContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(Rx.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(Rx.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_pattern(Rx.Literal_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#literal_pattern}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_pattern(Rx.Literal_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_pattern(Rx.Identifier_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#identifier_pattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_pattern(Rx.Identifier_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcard_pattern(Rx.Wildcard_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#wildcard_pattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcard_pattern(Rx.Wildcard_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#reference_pattern}.
	 * @param ctx the parse tree
	 */
	void enterReference_pattern(Rx.Reference_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#reference_pattern}.
	 * @param ctx the parse tree
	 */
	void exitReference_pattern(Rx.Reference_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#tuple_struct_pattern}.
	 * @param ctx the parse tree
	 */
	void enterTuple_struct_pattern(Rx.Tuple_struct_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#tuple_struct_pattern}.
	 * @param ctx the parse tree
	 */
	void exitTuple_struct_pattern(Rx.Tuple_struct_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#tuple_struct_items}.
	 * @param ctx the parse tree
	 */
	void enterTuple_struct_items(Rx.Tuple_struct_itemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#tuple_struct_items}.
	 * @param ctx the parse tree
	 */
	void exitTuple_struct_items(Rx.Tuple_struct_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#path_pattern}.
	 * @param ctx the parse tree
	 */
	void enterPath_pattern(Rx.Path_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#path_pattern}.
	 * @param ctx the parse tree
	 */
	void exitPath_pattern(Rx.Path_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Rx.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Rx.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#reference_type}.
	 * @param ctx the parse tree
	 */
	void enterReference_type(Rx.Reference_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#reference_type}.
	 * @param ctx the parse tree
	 */
	void exitReference_type(Rx.Reference_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(Rx.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(Rx.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#slice_type}.
	 * @param ctx the parse tree
	 */
	void enterSlice_type(Rx.Slice_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#slice_type}.
	 * @param ctx the parse tree
	 */
	void exitSlice_type(Rx.Slice_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#inferred_type}.
	 * @param ctx the parse tree
	 */
	void enterInferred_type(Rx.Inferred_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#inferred_type}.
	 * @param ctx the parse tree
	 */
	void exitInferred_type(Rx.Inferred_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#path_in_expression}.
	 * @param ctx the parse tree
	 */
	void enterPath_in_expression(Rx.Path_in_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#path_in_expression}.
	 * @param ctx the parse tree
	 */
	void exitPath_in_expression(Rx.Path_in_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#path_expr_segment}.
	 * @param ctx the parse tree
	 */
	void enterPath_expr_segment(Rx.Path_expr_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#path_expr_segment}.
	 * @param ctx the parse tree
	 */
	void exitPath_expr_segment(Rx.Path_expr_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#path_ident_segment}.
	 * @param ctx the parse tree
	 */
	void enterPath_ident_segment(Rx.Path_ident_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#path_ident_segment}.
	 * @param ctx the parse tree
	 */
	void exitPath_ident_segment(Rx.Path_ident_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#type_path}.
	 * @param ctx the parse tree
	 */
	void enterType_path(Rx.Type_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#type_path}.
	 * @param ctx the parse tree
	 */
	void exitType_path(Rx.Type_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Rx#type_path_segment}.
	 * @param ctx the parse tree
	 */
	void enterType_path_segment(Rx.Type_path_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Rx#type_path_segment}.
	 * @param ctx the parse tree
	 */
	void exitType_path_segment(Rx.Type_path_segmentContext ctx);
}