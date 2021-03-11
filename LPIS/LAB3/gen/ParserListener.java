// Generated from C:/Users/ACER/Desktop/6sem/LPIS/LPIS/LAB3/src/main/java\Parser.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserParser}.
 */
public interface ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ParserParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ParserParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ParserParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ParserParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(ParserParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(ParserParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ParserParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ParserParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ParserParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ParserParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(ParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(ParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(ParserParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(ParserParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ParserParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ParserParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ParserParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ParserParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(ParserParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(ParserParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(ParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(ParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ParserParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ParserParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ParserParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ParserParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ParserParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ParserParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ParserParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ParserParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ParserParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ParserParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ParserParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ParserParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(ParserParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(ParserParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(ParserParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(ParserParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ParserParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ParserParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(ParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(ParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(ParserParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(ParserParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ParserParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ParserParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(ParserParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(ParserParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(ParserParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(ParserParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ParserParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ParserParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ParserParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ParserParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ParserParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ParserParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(ParserParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(ParserParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ParserParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ParserParser.PrimitiveTypeContext ctx);
}