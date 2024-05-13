// Generated from mysql.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by {@link mysqlParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull mysqlParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(@NotNull mysqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull mysqlParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(@NotNull mysqlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(@NotNull mysqlParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(@NotNull mysqlParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#clustering_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustering_key(@NotNull mysqlParser.Clustering_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull mysqlParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(@NotNull mysqlParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull mysqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(@NotNull mysqlParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#columnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnType(@NotNull mysqlParser.ColumnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#create_table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column(@NotNull mysqlParser.Create_table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(@NotNull mysqlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull mysqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#clustering_key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustering_key_value(@NotNull mysqlParser.Clustering_key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#diana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiana(@NotNull mysqlParser.DianaContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(@NotNull mysqlParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysqlParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(@NotNull mysqlParser.ColumnNameContext ctx);
}