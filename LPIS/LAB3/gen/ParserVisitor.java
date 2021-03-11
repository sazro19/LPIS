// Generated from C:/Users/ACER/Desktop/6sem/LPIS/LPIS/LAB3/src/main/java\Parser.g4 by ANTLR 4.9.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ParserParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(ParserParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(ParserParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ParserParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ParserParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(ParserParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(ParserParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ParserParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ParserParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(ParserParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(ParserParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ParserParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(ParserParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ParserParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ParserParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(ParserParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ParserParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ParserParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ParserParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(ParserParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(ParserParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ParserParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(ParserParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(ParserParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ParserParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(ParserParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(ParserParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ParserParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ParserParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ParserParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ParserParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(ParserParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ParserParser.PrimitiveTypeContext ctx);
}