// Generated from mysql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mysqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mysqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mysqlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(mysqlParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(mysqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#diana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiana(mysqlParser.DianaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(mysqlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(mysqlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(mysqlParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(mysqlParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(mysqlParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(mysqlParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#create_table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column(mysqlParser.Create_table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#clustering_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustering_key(mysqlParser.Clustering_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#clustering_key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustering_key_value(mysqlParser.Clustering_key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(mysqlParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#columnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnType(mysqlParser.ColumnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(mysqlParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(mysqlParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(mysqlParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(mysqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(mysqlParser.ConstantContext ctx);
}