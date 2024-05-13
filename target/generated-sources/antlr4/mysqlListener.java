// Generated from mysql.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mysqlParser}.
 */
public interface mysqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mysqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull mysqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull mysqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull mysqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull mysqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull mysqlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull mysqlParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(@NotNull mysqlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(@NotNull mysqlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(@NotNull mysqlParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(@NotNull mysqlParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(@NotNull mysqlParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(@NotNull mysqlParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#clustering_key}.
	 * @param ctx the parse tree
	 */
	void enterClustering_key(@NotNull mysqlParser.Clustering_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#clustering_key}.
	 * @param ctx the parse tree
	 */
	void exitClustering_key(@NotNull mysqlParser.Clustering_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull mysqlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull mysqlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(@NotNull mysqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(@NotNull mysqlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull mysqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull mysqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(@NotNull mysqlParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(@NotNull mysqlParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#columnType}.
	 * @param ctx the parse tree
	 */
	void enterColumnType(@NotNull mysqlParser.ColumnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#columnType}.
	 * @param ctx the parse tree
	 */
	void exitColumnType(@NotNull mysqlParser.ColumnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_table_column}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column(@NotNull mysqlParser.Create_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_table_column}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column(@NotNull mysqlParser.Create_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(@NotNull mysqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(@NotNull mysqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull mysqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull mysqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#clustering_key_value}.
	 * @param ctx the parse tree
	 */
	void enterClustering_key_value(@NotNull mysqlParser.Clustering_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#clustering_key_value}.
	 * @param ctx the parse tree
	 */
	void exitClustering_key_value(@NotNull mysqlParser.Clustering_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull mysqlParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull mysqlParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(@NotNull mysqlParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(@NotNull mysqlParser.ColumnNameContext ctx);
}