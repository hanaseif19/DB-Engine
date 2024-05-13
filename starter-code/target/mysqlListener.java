package target;
// Generated from mysql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mysqlParser}.
 */
public interface mysqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mysqlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(mysqlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(mysqlParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(mysqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(mysqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#diana}.
	 * @param ctx the parse tree
	 */
	void enterDiana(mysqlParser.DianaContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#diana}.
	 * @param ctx the parse tree
	 */
	void exitDiana(mysqlParser.DianaContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(mysqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(mysqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(mysqlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(mysqlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(mysqlParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(mysqlParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(mysqlParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(mysqlParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(mysqlParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(mysqlParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(mysqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(mysqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#create_table_column}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column(mysqlParser.Create_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#create_table_column}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column(mysqlParser.Create_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#clustering_key}.
	 * @param ctx the parse tree
	 */
	void enterClustering_key(mysqlParser.Clustering_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#clustering_key}.
	 * @param ctx the parse tree
	 */
	void exitClustering_key(mysqlParser.Clustering_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#clustering_key_value}.
	 * @param ctx the parse tree
	 */
	void enterClustering_key_value(mysqlParser.Clustering_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#clustering_key_value}.
	 * @param ctx the parse tree
	 */
	void exitClustering_key_value(mysqlParser.Clustering_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(mysqlParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(mysqlParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#columnType}.
	 * @param ctx the parse tree
	 */
	void enterColumnType(mysqlParser.ColumnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#columnType}.
	 * @param ctx the parse tree
	 */
	void exitColumnType(mysqlParser.ColumnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(mysqlParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(mysqlParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(mysqlParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(mysqlParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(mysqlParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(mysqlParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(mysqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(mysqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(mysqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(mysqlParser.ConstantContext ctx);
}