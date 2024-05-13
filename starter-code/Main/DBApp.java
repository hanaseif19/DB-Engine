package Main;

import java.util.*;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileReader.*;
import java.io.FileWriter;
import java.io.IOException;

import Pages.*;
import index.bplustree;
import index.bplustree.LeafNode;
import target.mysqlLexer;
import target.mysqlParser;

public class DBApp {
	public static File metafile = new File("C:\\Users\\Lenovo-11\\Desktop\\metadataeval.csv");
	// mennah: C:\Users\DELL\Desktop\DB II Project
	// hana /Users/hana/Downloads/metafiles1900.csv
	public static FileWriter writer;
	public boolean fileexists = false;

	public DBApp() {
		Properties properties = new Properties();
		try {
			FileInputStream fis = new FileInputStream("starter-code/resources/DBApp.config");
			properties.load(fis);
			fis.close();

			String maxRowsCountStr = properties.getProperty("MaximumRowsCountinPage");

			if (maxRowsCountStr != null) {
				Page.N = Integer.parseInt(maxRowsCountStr);
			} else {
				Page.N = 200;}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	// this does whatever initialization you would like
	// or leave it empty if there is no code you want to
	// execute at application startup

	public void init() throws IOException {

		boolean fileExists = metafile.exists();
		if (!fileExists) {
			try {
				writer = new FileWriter(metafile, true);
				writer.write("Table Name, Column Name, Column Type, ClusteringKey, IndexName,IndexType \n");
				writer.close();
			} catch (IOException e) {
				System.out.println("An error occurred while writing in the metadata file.");
				e.printStackTrace();
			}
		}

	}

	/***
	    This method updates the meta-data file to add the table details of table t 
	 * @param Table t:  the name of the table 
	 ***/

	
	public void uploadtometafile(Table t) {

		try {
			writer = new FileWriter(metafile, true);
			Enumeration<String> keys = t.getHtblColNameType().keys();
			while (keys.hasMoreElements()) {
				String colName = keys.nextElement();
				String colType = t.getHtblColNameType().get(colName);
				writer.write(t.getStrTableName() + "," + colName + "," + colType + ",");
				if (colName.equals(t.getStrClusteringKeyColumn())) {
					writer.write("True,");

				} else {
					writer.write("False,");
				}

				writer.write("null,null \n");

			}
			writer.close();
		} catch (IOException e) {
			System.out.println("An error occurred while writing in the metadata file.");
			e.printStackTrace();
		}
	}

// ----------------------------------------------------------------------------------------------	

	
	/**
	 *  This method creates a new table
	 * checks for exceptions for repeated table names,
	 * serializes the table object to disk and 
	 * updates the meta-data file accordingly
	 * @param strTableName:  the name of the table to create 
	 * @param strClusteringKeyColumn:  the name of the primary key column of the table
	 * @param Hashtable: the name of the table ***/

	public void createTable(String strTableName, String strClusteringKeyColumn,
			Hashtable<String, String> htblColNameType) throws DBAppException {
		for (String value : htblColNameType.values()) {
			if (!value.equals("java.lang.Integer") && !value.equals("java.lang.String")
					&& !value.equals("java.lang.Double")) {
				throw new DBAppException("Invalid Column Type");
			}

		}
		String fileName = strTableName + ".class";
		File file = new File(fileName);
		if (file.exists()) {
			throw new DBAppException("A table with the same name already exists");
		}
		Table x = new Table(strTableName, strClusteringKeyColumn, htblColNameType);
		uploadtometafile(x);
		x.serializeTable(strTableName + ".class");

	}

	/**
	 *  This method updates the meta data file
	 *  when creating an index to have b+tree and the 
	 *  specified index name given in the method parameters 
	 * @param strIndexName:  the name of the index to create 
	 * @param ColName:  the name of the column to create an index on
	 * @param TableName: the name of the table ***/

	public static void updateIndexMeta(String strIndexName, String ColName, String tableName)
			throws FileNotFoundException, IOException {
		try {

			BufferedReader reader = new BufferedReader(new FileReader(metafile));
			StringBuilder content = new StringBuilder();
			String line;

			while ((line = reader.readLine()) != null) {
				String[] fields = line.split(",");
				if (fields[0].equals(tableName) && fields[1].equals(ColName) && fields[4].equals("null")) {
					fields[5] = "B+ Tree";
					fields[4] = strIndexName;
				}
				String updatedLine = String.join(",", fields);
				content.append(updatedLine).append("\n");
			}
			reader.close();

			FileWriter writer = new FileWriter(metafile);
			writer.write(content.toString());
			writer.close();

			System.out.println("Index Created Successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while updating the CSV file.");
			e.printStackTrace();
		}
	}

	/**
	 * This method checks if the column in the specified table is indexed
	 * 
	 * @param ColName:  the column to check
	 * @param TableName: the name of the table 
	 * @return boolean indicating whether the column has an index
	 */
	public static boolean checkIndexed(String ColName, String TableName) throws FileNotFoundException {

		BufferedReader reader = new BufferedReader(new FileReader(metafile));

		String line;
		try {
			while ((line = reader.readLine()) != null) {
				String[] fields = line.split(",");

				if (fields[1].equals(ColName) && fields[5].equals("B+ Tree") && fields[0].equals(TableName))
					return true;
			}
			return false;
		} catch (IOException e) {
			System.out.println("An error occurred while reading from the CSV file.");
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * This method takes a column name and a table
	 *  name as parameters and gets the index name of the corresponding column 
	 * @param ColName:  the column on which the index exists 
	 * @param TableName: the name of the table 
	 * @return String indicating the suitable indexName
	 */
	
	public static String getIndexName(String ColName, String TableName) throws FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader(metafile));
		String line;
		try {
			while ((line = reader.readLine()) != null) {
				String[] fields = line.split(",");

				if (fields[1].equals(ColName) && fields[0].equals(TableName))
					return fields[4]; // index name
			}

		} catch (IOException e) {
			System.out.println("An error occurred while reading from the CSV file.");
			e.printStackTrace();
		}
		return "";

	}
	/**
	 * This method creates an index on a column by creating a b+tree object and serializing it to disk
	 * it then updates the meta data file accordingly 
	 * 
	 * @param strTableName:  the name of the table 
	 * @param strColName: the name of the column 
	 * @param strIndexName: the name of the index to create
	 */
	
	public void createIndex(String strTableName, String strColName, String strIndexName)
			throws DBAppException, FileNotFoundException, IOException {
		bplustree tree = new bplustree(3);

		Table table = Table.deserializeTable(strTableName + ".class");
		if (!table.getHtblColNameType().containsKey(strColName))
			throw new DBAppException("Invalid column Name! Cannot create an index!");
		if (checkIndexed(strColName, strTableName)) {
			throw new DBAppException("This column already has an index!");
		}
		for (int i = 0; i < table.getPageNames().size(); i++) {
			Page p = Page.deserializePage(table.getPageNames().get(i)); // we got the first page

			for (int j = 0; j < p.getTuples().size(); j++) {
				Hashtable<String, Object> hashtable = p.getTuples().get(j).getRowValues(); // loop on hashtable
				// non-existent column -> exception
				Comparable value = (Comparable) hashtable.get(strColName);
				tree.insert(value, table.getPageNames().get(i)); // page only
			}
		}
		tree.serializeIndex(strTableName + "_" + strIndexName + ".class");
		updateIndexMeta(strIndexName, strColName, strTableName);
	}
	
	/***
	 *  This method updates the corresponding indices 
	 *  following the call of the method updateTable
	 * @param pageName:  the name of the page 
	 * @param TableName: the name of the table 
	 * @param rowValues: hashtable of the old row before updating
	 * @param newValues: hashtable of the new values of the row after updating
	 ***/

	public static void UpdateIndexafterupdate(String pageName, String TableName, Hashtable<String, Object> rowValues,
			Hashtable<String, Object> newValues) throws FileNotFoundException

	{
		for (String colName : newValues.keySet()) {
			if (checkIndexed(colName, TableName)) {
				String index = getIndexName(colName, TableName);
				bplustree t = bplustree.deserializeIndex(TableName + "_" + index + ".class");
				t.delete((Comparable) (rowValues.get(colName)), pageName); // remove old value
				t.insert((Comparable) (newValues.get(colName)), pageName); // insert new value
				t.serializeIndex(TableName + "_" + index + ".class"); // return the index back to disk
			}
		}
	}

	/***
	  This method updates the row that has its clustering key value
	   equal to the parameter strClusteringKeyValue and updates 
	   the columns specified in the hashtable to their new values and updates the corresponding indices 
	  
	 * @param strTableName:  the name of the table to update 
	 * @param strClusteringLeyValue: the primary key value of the column to update
	 * @param htblColNameValue: hashtable of the new values to update the row 
	 ***/
	public void updateTable(String strTableName, String strClusteringKeyValue,
			Hashtable<String, Object> htblColNameValue) throws DBAppException, FileNotFoundException {

		Comparable pkvalue = getType(strClusteringKeyValue);
		Table table = Table.deserializeTable(strTableName + ".class");

		if (!table.getHtblColNameType().keySet().containsAll(htblColNameValue.keySet())) {
			throw new DBAppException("The column you are trying to update does not exist");
		}
		checkUpdateMatchingRow(strTableName, htblColNameValue,"You are updating with a wrong data types"); // checking the types of the columns
		String tablespk = table.getStrClusteringKeyColumn();
		String pgfilename = null;
		try {
			if (checkIndexed(tablespk, strTableName)) {
				// System.out.println("Im using the index");
				String IndexName = getIndexName(tablespk, strTableName);
				bplustree IndexTree = bplustree.deserializeIndex(strTableName + "_" + IndexName + ".class");
				if(IndexTree.search(pkvalue).size()!=0)
				   pgfilename = IndexTree.search(pkvalue).get(0);

			} else {
				ArrayList<String> Pages = table.getPageNames(); // pages of the table
				pkvalue = getType(strClusteringKeyValue);
				Hashtable<String, Vector<Comparable>> RangesPage = table.getHashtablepagenames();

				int size = Pages.size();
				int low = 0;
				int high = size - 1;
				while (low <= high) {
					int mid = low + (high - low) / 2;
					String currpage = Pages.get(mid);
					Vector current = RangesPage.get(currpage);
					if (pkvalue.compareTo(current.get(0)) >= 0 && pkvalue.compareTo(current.get(1)) <= 0) {
						pgfilename = currpage;
						break;
					} else if (pkvalue.compareTo(current.get(0)) < 0) {
						high = mid - 1;
					} else {
						low = mid + 1;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		if (pgfilename == null) {
			System.err.println("you are updating something that does not exist in the table.");
			return;
		}
		Page p = Page.deserializePage(pgfilename); // we got the right page

		Vector<Integer> v = Page.binarySearch(pgfilename, pkvalue, tablespk);
		if (v.get(0) == 1) {
			int rowindex = v.get(1);
			Hashtable<String, Object> RowToUpdate = p.getTuples().get(rowindex).getRowValues();
			UpdateIndexafterupdate(pgfilename, strTableName, RowToUpdate, htblColNameValue);

			for (String key : htblColNameValue.keySet()) {
				RowToUpdate.put(key, htblColNameValue.get(key));
			}
			p.serializePage(pgfilename);
			table.serializeTable(strTableName + ".class");
		} else {
			System.err.println("you are updating something that does not exist in the table.");
			return;

		}
	}
	/***
	  This method takes a string as input and parses it into its original type
	  Integer,Double or String 
	  
	 * @param input:  the String value to get its correct type
	 * @return Comparable value: the correct parsed output in its suitable type 
	
	 ***/
	public static Comparable getType(String input) {
		try {

			int intValue = Integer.parseInt(input);
			return intValue;
		} catch (NumberFormatException e1) {
			try {

				double doubleValue = Double.parseDouble(input);
				return doubleValue;
			} catch (NumberFormatException e2) {

				return input;
			}
		}
	}
	/***
	  This method takes checks that when updating rows in a table, 
	  we're updating the columns with the same data types and not violating any data type	  
	 * @param string 
	 * @param table:  the table we want to update 
	 * @param UpdatedVals: hashtable having (column name,new value) as its (key,value) pair 	
	 ***/
	public static void checkUpdateMatchingRow(String table, Hashtable<String, Object> UpdatedVals, String string)
			throws DBAppException {

		String line;
		try (BufferedReader br = new BufferedReader(new FileReader(metafile))) {

			while ((line = br.readLine()) != null) {

				String[] fields = line.split(",");
				if (fields[0].equals(table)) {
					if (UpdatedVals.containsKey(fields[1])) {
						if (!(fields[2].equals(UpdatedVals.get(fields[1]).getClass().getName()))) {
							throw new DBAppException(string);
						}

					}

				}

			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	/***
	  This method gets the primary key value of the input row 	  
	 * @param rows: hashtable representing the row having (column name,value) as its (key,value) pair 
	 * @param tablePk: the primary key of the table
	 * @return String: the primary key value of the row
	 ***/ 
	public static String getpkvalueofrow(Hashtable<String, Object> rows, String tablePk)

	{
		for (String key : rows.keySet()) {
			if (key.equals(tablePk)) {
				return rows.get(key).toString();
			}
		}
		return "";
	}
	/***
	  This method is a helper that is used to delete rows from the table without using an index where  
	  we delete every row that satisfies the conditions in the hashtable ANDED together
	  * it updates the corresponding indices as well 
	  * it deletes empty pages once all tuples in that page are deleted     
	  * it handles the case where the conditions involve the clustering key so we use binary search 
	  * @param strTableName: the name of the table to delete from 
	  * @param htblColNamevalue: hashtable containing (column Name,value)
	 ***/ 
	public void deleteFromTableWithoutIndex(String strTableName, Hashtable<String, Object> htblColNameValue)
			throws DBAppException, FileNotFoundException {

		Table table = Table.deserializeTable(strTableName + ".class");
		String clusteringKey = table.getStrClusteringKeyColumn(); // gets name of primary key
		if (htblColNameValue.keySet().contains(clusteringKey)) { // we're deleting smth with a condition involving
																	// primary key
			Comparable value = (Comparable) htblColNameValue.get(clusteringKey); // value of primary key
			String page = Table.binarySearchTable(strTableName, value);
			Vector<Integer> tupleIndex = Page.binarySearch(page, value, clusteringKey);

			if (tupleIndex.get(0) == 0) {
				//System.out.println("Tuple is not found");
				return;
			} else {
				//System.out.println("i found the row to dlete");
				Page p = Page.deserializePage(page);
				//System.out.println("index of the row"+ tupleIndex.get(1));
				//System.out.println("page"+page);
				//System.out.println("the row itself"+ p.getTuples().get((int) tupleIndex.get(1)).getRowValues());
				updateIndexOnDeletion(table, page, p.getTuples().get((int) tupleIndex.get(1)).getRowValues()); // review
				p.getTuples().remove((int) tupleIndex.get(1));

				if (p.getTuples().size() == 0) {
					table.getHashtablepagenames().remove(page);
					table.getPageNames().remove(page);
					File file = new File("C:\\Users\\Lenovo-11\\Desktop\\Project_1_Team_63 - Hana mohamed seif\\Trial101maven\\" + page);
					file.delete();
					//System.out.println("I deleted a page");
					// table.serializeTable(strTableName + ".class");
				} else {

					p.serializePage(page);
					// table.serializeTable(strTableName + ".class");
				}

			}

		} else {

			boolean isChanged = false;
			ArrayList<String> mypages = table.getPageNames();
			for (int i = 0; i < mypages.size(); i++) { // looping on pages
				String page = mypages.get(i);
				Page thispage = Page.deserializePage(page);
				isChanged = false;
				for (int j = 0; j < thispage.getTuples().size(); j++) { // looping on rows
					Hashtable<String, Object> myrow = thispage.getTuples().get(j).getRowValues();
					if (deleteRow(strTableName,myrow, htblColNameValue)) {
						// System.out.println("pageHII" +page);
						updateIndexOnDeletion(table, page, thispage.getTuples().get(j).getRowValues()); // review
						thispage.getTuples().remove(j);
						j--;
						isChanged = true;
						if (thispage.getTuples().size() == 0) {
							//System.out.println(" i deleted a page and theres np index");
							table.getHashtablepagenames().remove(page);
							table.getPageNames().remove(page);
							File file = new File("C:\\Users\\Lenovo-11\\Desktop\\Project_1_Team_63 - Hana mohamed seif\\Trial101maven\\" + page);
							file.delete();
							i--;
							// remove from disk
						}
					}

				}
				if (isChanged)
					thispage.serializePage(page);
			}

		}
		table.serializeTable(strTableName + ".class");
	}

	/***
	  This method is used to delete rows from the table  where  
	  we delete every row that satisfies the conditions in the hashtable ANDED together
	  it updates the corresponding indices as well 
	  it deletes empty pages once all tuples in that page are deleted     
	 * @param strTableName: the name of the table to delete from 
	 * @param htblColNamevalue: hashtable containing (column Name,value)
	 
	 ***/ 
	public void deleteFromTable(String strTableName, Hashtable<String, Object> htblColNameValue) throws Exception {
		Table table = Table.deserializeTable(strTableName + ".class");
		if (htblColNameValue.isEmpty()) { // deleting all pages
			//System.out.println("im deleting all " + table.getPageNames().size());

			for (int i = 0; i < table.getPageNames().size(); i++) {
				File file = new File("C:\\Users\\Lenovo-11\\Desktop\\Project_1_Team_63 - Hana mohamed seif\\Trial101maven\\" + table.getPageNames().get(i));
				String page = table.getPageNames().get(i);
				table.getPageNames().remove(page);
				table.getHashtablepagenames().remove(page);
				file.delete();
				i--;
			}
			table.serializeTable(strTableName + ".class");
			return;
		}
		bplustree index = null;
		Object valToSearch = null;
		boolean indexedCol = false;
		String indexName;
		ArrayList<ArrayList<String>> indicesResult = new ArrayList<ArrayList<String>>();
		for (String key : htblColNameValue.keySet()) { // looping on deletion hashtable

			try {
				if (checkIndexed(key, strTableName)) {
					indexedCol = true;
					indexName = getIndexName(key, strTableName);
					valToSearch = htblColNameValue.get(key); // jana
					index = bplustree.deserializeIndex(strTableName + "_" + indexName + ".class");
					indicesResult.add(index.search((Comparable) valToSearch)); // [[p1,p2],[p3,p2],[p1]]
//					index.serializeIndex(strTableName + "_" + indexName+".class");
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}
		if (indicesResult.size() == 1 && indicesResult.get(0) == null) // we're deleting something that doesnt exist
			return;
		// System.out.println("indices result" + indicesResult);
		if (indicesResult.size() != 0) { // we're deleting something that exists
			ArrayList<String> resultPages = new ArrayList<String>();
			for (int i = 0; i < indicesResult.get(0).size(); i++) {
				boolean isContained = true;
				String page = (indicesResult.get(0)).get(i);
				for (int j = 1; j < indicesResult.size(); j++) {
					if (!(indicesResult.get(j).contains(page))) {
						isContained = false;
						break;
					}
				}
				if (isContained)
					resultPages.add(page);
			}
			for (int i = 0; i < resultPages.size(); i++) {
				String pageName = resultPages.get(i);
				Page p = Page.deserializePage(pageName);
				for (int j = 0; j < p.getTuples().size(); j++) {
					if (deleteRow(table.getStrTableName(),p.getTuples().get(j).getRowValues(), htblColNameValue)) { // row is to be deleted
						//System.out.println("row to delete" + p.getTuples().get(j).getRowValues());
						updateIndexOnDeletion(table, pageName, p.getTuples().get(j).getRowValues()); // deletes the row
																										// from the tree
						p.getTuples().remove(j);
						j--; 
					}
				}
				if (p.getTuples().size() == 0) {
					table.getHashtablepagenames().remove(pageName);
					table.getPageNames().remove(pageName);
					//System.out.println("after removal" + table.getPageNames());
					File file = new File("C:\\Users\\Lenovo-11\\Desktop\\Project_1_Team_63 - Hana mohamed seif\\Trial101maven\\" + pageName);
					file.delete();
				} else {
					p.serializePage(pageName);
				}
			}
			table.serializeTable(strTableName + ".class"); // THE SERIALIZE WE'RE DEPENDING ON

		} else {
			//System.out.println("not using index");
			deleteFromTableWithoutIndex(strTableName, htblColNameValue); // hena feeh serialize gowa

		}
		// table.serializeTable(strTableName + ".class");

	}
	/***
	  This method is used to delete rows from the table  where  
	  we delete every row that satisfies the conditions in the hashtable ANDED together
	  it updates the corresponding indices as well 
	  it deletes empty pages once all tuples in that page are deleted     
	 * @param tableName: the name of the table to delete from 
	 * @param row: the row we want to check 
	 * @param htblColNameValue: the conditions we want to check on the row 
	 * @return boolean: returns true if the row satisfies the conditions and is to be deleted 
	 ***/ 
	public static boolean deleteRow(String tableName, Hashtable<String, Object> row, Hashtable<String, Object> htblColNameValue) throws DBAppException {

		checkUpdateMatchingRow(tableName, htblColNameValue,"The types does not match the column types");		for (String k : htblColNameValue.keySet()) {
			// System.out.println(row.get(k)+ " space "+ htblColNameValue.get(k));
			if (!((row.get(k)).equals(htblColNameValue.get(k)))) {
				return false;
			}
		}
		return true;

	}
	/***
	  This method is used to check whether the row to insert has any NULLS or inserting with different column names 
	  than the ones in the table  
	 * @param myTable: the table we're inserting into 
	 * @param myRow: the row we want to insert into the table 
	 * @param htblColNameValue: the conditions we want to check on the row 
	 * @return boolean: returns false if the inserted row contains values for all columns and can be correctly inserted into the table
	 ***/ 
	public static boolean containNulls(Table myTable, Hashtable<String, Object> myRow) throws DBAppException {
		Hashtable inputTable = myTable.getHtblColNameType();

		if (inputTable.keySet().equals(myRow.keySet()))
			return true;
		return false;
	}
	
	/***
	 * This method is used to insert a row into the table 
	 * uses either binary search to find the correct position if there's no index or uses the b+tree if there's an index 
	 * checks for repeated primary key exception
	 * updates the corresponding indices 
	 * @param strTableName: the table we're inserting into 
	 * @param htblColNameVakye: the row we want to insert into the table 
	 ***/ 

	public void insertIntoTable(String strTableName, Hashtable<String, Object> htblColNameValue)
			throws DBAppException, IOException {
		boolean flag = false; //
		String line;
		String tablesPk = null; // to get the table's primary key column name
		Object o = null; // pk of row to insert
		int tuplenumber = 0;
		String name = "";
		String indexName = "";
		String indexType = "";
		Integer indexiwant = 0;
		Table table = Table.deserializeTable(strTableName + ".class");
		if (!containNulls(table, htblColNameValue)) {
			throw new DBAppException("You're inserting with wrong/null columns");
		}
		try (BufferedReader br = new BufferedReader(new FileReader(metafile))) {
			while ((line = br.readLine()) != null) {
				flag = true;
				String[] fields = line.split(",");
				if (fields[0].equals(strTableName)) {
					if (fields[3].equals("True")) {
						tablesPk = fields[1];
						indexName = fields[4];
						indexType = fields[5];

					}

					for (String s : htblColNameValue.keySet()) {

						if (s.equals(tablesPk)) {
							o = htblColNameValue.get(s); // el pk value el hd5lha
						}
						if (s.equals(fields[1])) {
							if (!(htblColNameValue.get(s).getClass().getName()).equals(fields[2])) {
								flag = false;
							}
						}
					}
					if (!flag)
						throw new DBAppException("Invalid column  type");

				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// until here we got table's pk and checked for data types
		// ready to insert

		Hashtable tempTable = new Hashtable();
		tempTable.putAll(htblColNameValue); // inside it is the row

		if ((table.getPageNames()).size() == 0) // very new table
		{
			table.addpage(new Tuple(tempTable));

			if (checkIndexed(tablesPk, strTableName)) {
				//System.out.println("here");
				bplustree b = bplustree.deserializeIndex(strTableName + "_" + getIndexName(tablesPk, strTableName) + ".class");
				b.insert((Comparable) tempTable.get(tablesPk), table.getPageNames().get(0));
				updateIndexAfterInsert(htblColNameValue, table, table.getPageNames().get(0));
				b.serializeIndex(strTableName + "_" + getIndexName(tablesPk, strTableName) + ".class");
			}
			else 
			{
				updateIndexAfterInsert(htblColNameValue, table, table.getPageNames().get(0));
			}
				
		}
		 else if (!checkIndexed(tablesPk, strTableName)) {
			// System.out.println("hi");
			String pagename = Table.binarySearchTable(strTableName, (Comparable) o);
			//System.out.println("Page:" + pagename);
			Vector<Integer> v = Page.binarySearch(pagename, (Comparable) o, tablesPk);
			//System.out.println("V:" + v);
			//updateIndexAfterInsert(htblColNameValue, table, pagename);
			if (!v.isEmpty() && v.get(0) == 1) {
				throw new DBAppException("You're inserting a repeated primarykey");

			} else {
				if (!v.isEmpty())
					indexiwant = v.get(1);
				table.shiftPages(pagename, indexiwant, new Tuple(htblColNameValue), table, null);
				updateIndexAfterInsert(htblColNameValue, table, pagename);
				//System.out.println("i was here");

			}
			if (!pagename.equals("hi")) {
				updateIndexAfterInsert(htblColNameValue, table, pagename);
			} else {
				updateIndexAfterInsert(htblColNameValue, table, strTableName + (table.getCounter() - 1) + ".class");
			}

		}
		
		else {

			// insert with index
			bplustree t = bplustree.deserializeIndex(strTableName + "_" + indexName + ".class");
			if (!(t.search((Comparable) o).size() == 0)) {
				throw new DBAppException("already exists");
			}

			t.insert((Comparable) o, "temp");
			//System.out.println("MY TREE");
			t.print();
			//System.out.println("MY TREE done");

			LeafNode l1 = t.findLeafNode((Comparable) (o));

			LeafNode left = l1.leftSibling;
			while (left != null && left.numPairs == 0) // mawgood bas fady
				left = left.leftSibling;
			LeafNode right = l1.rightSibling;
			while (right != null && right.numPairs == 0) // mawgood bas fady
				right = right.rightSibling;

			int index = 0;
			for (int i = 0; i < l1.numPairs; i++) {
				if (l1.getDictionary()[i].getKey().equals((Comparable) o)) {
					index = i;
					break;
				}
			}
			Vector<Integer> v = new Vector<Integer>();
			String leftPage = "";
			String pagetoUse = "";
			String rightPage = "";
			if (index != 0)
				leftPage = l1.getDictionary()[index - 1].getValue().get(0); // page of the key to the left of what we
																			// want to insert
			else {
				if (left != null) {
					int leftnumpairs = left.numPairs;
					//System.out.println("left num pairs" + leftnumpairs);
					//System.out.println("leaf node below");
					bplustree.printLeafNode(left);
					if (leftnumpairs != 0 && left.getDictionary()[leftnumpairs - 1] != null) {
						leftPage = left.getDictionary()[leftnumpairs - 1].getValue().get(0);
					}
				}
			}

			if (index != l1.numPairs - 1)
				rightPage = l1.getDictionary()[index + 1].getValue().get(0);
			else {
				if (right != null && right.numPairs != 0)
					rightPage = right.getDictionary()[0].getValue().get(0);
			}
			

			if (leftPage.equals(rightPage)) {
				v = Page.binarySearch(leftPage, (Comparable) o, tablesPk); // 0 1
				pagetoUse = leftPage;
			}
			else if (!(leftPage.equals("")) && rightPage.equals(""))// case1 left mawgooda w right msh mawgooda

			{
				Page l = Page.deserializePage(leftPage);
				if (l.getTuples().size() < Page.N) // left feeha makan
				{
					v = Page.binarySearch(leftPage, (Comparable) o, tablesPk);
					pagetoUse = leftPage;
					//System.out.println("if2");
				} else {
					pagetoUse = "hi"; // left mafeehash makan w mafeesh right yb2a haye3mel page gededa
				}
			}

			else if (!(leftPage.equals("")) && !rightPage.equals("")) // case 2 we have both left and right pages
			{
				Page l = Page.deserializePage(leftPage);
				if (l.getTuples().size() < Page.N) // left feeha makan
				{
					v = Page.binarySearch(leftPage, (Comparable) o, tablesPk);
					pagetoUse = leftPage;
					//System.out.println("if2");
				} else {
					v = Page.binarySearch(rightPage, (Comparable) o, tablesPk);
					pagetoUse = rightPage;// left mafeehash makan w feeh right so we send right
				}
			} else if ((leftPage.equals("")) && !rightPage.equals("")) // case 3 : theres no left bas feeh right
			{
				//System.out.println("im in case 3");
				v = Page.binarySearch(rightPage, (Comparable) o, tablesPk);
				pagetoUse = rightPage;
			}

			if (!v.isEmpty() && v.get(0) == 1) {
				throw new DBAppException("Repeated pk");

			} else {
				if (!v.isEmpty()) {
					//System.out.println(pagetoUse + "my index" + indexiwant);
					indexiwant = v.get(1);
				}
				table.shiftPages(pagetoUse, indexiwant, new Tuple(htblColNameValue), table, indexName);

			}
//			System.out.println("rightPage" + rightPage);
//			System.out.println("leftpage" + leftPage);
//			System.out.println("pagetosend to shift " + pagetoUse);
			t.delete((Comparable) o, "temp");

			if (!pagetoUse.equals("hi")) {
				updateIndexAfterInsert(htblColNameValue, table, pagetoUse);
			} else {
				updateIndexAfterInsert(htblColNameValue, table, strTableName + (table.getCounter() - 1) + ".class");
			}
		}

	}

	public static boolean compare(Object o1, Object o2) { // returns lw el awal akbr mn el tany

		if (o1 instanceof Integer) {
			return ((Integer) o1 > (Integer) o2);
		}
		if (o1 instanceof Double) {
			return ((Double) o1 > (Double) o2);
		}

		return (((String) o1).compareTo((String) o2) > 0);

	}

	/***
	  This method is used to update the corresponding Indices after inserting a new row into the table  
	 * @param htblColNameValue: the row we're inserting into the table
	 * @param table: the table we want to insert into 
	 * @param pageName: the pageName we're inserting the new row into 
	 ***/
	public static void updateIndexAfterInsert(Hashtable<String, Object> htblColNameValue, Table table, String pageName)
			throws FileNotFoundException {
		for (String colName : htblColNameValue.keySet()) {
			if (checkIndexed(colName, table.getStrTableName())) {
				//System.out.println("column to update its index:" + colName);
				if (!(colName.equals(table.getStrClusteringKeyColumn()))) {
					String indexName = getIndexName(colName, table.getStrTableName());
					//System.out.println("index to update its index:" + indexName);
					bplustree t = bplustree.deserializeIndex(table.getStrTableName() + "_" + indexName + ".class");
					t.insert((Comparable) htblColNameValue.get(colName), pageName);
					t.serializeIndex(table.getStrTableName() + "_" + indexName + ".class");
				}
			}
		}
	}

	/***
	  This method is used to update the corresponding Indices after deleting a row from the table  
	 * @param table: the table we want to insert into 
	 * @param pageName: the pageName we're inserting the new row into 
	 * @param valueToDelete: the row we're deleting from the table
	 ***/
	public static void updateIndexOnDeletion(Table table, String pageName, Hashtable<String, Object> valueToDelete)
			throws FileNotFoundException, DBAppException {

		Hashtable<String, String> columnNames = table.getHtblColNameType();
		for (String colName : columnNames.keySet()) {
			if (checkIndexed(colName, table.getStrTableName())) {
				bplustree index = bplustree.deserializeIndex(
						table.getStrTableName() + "_" + getIndexName(colName, table.getStrTableName()) + ".class");
				index.delete((Comparable) valueToDelete.get(colName), pageName);
				index.serializeIndex(
						table.getStrTableName() + "_" + getIndexName(colName, table.getStrTableName()) + ".class");
			}
		}
	}

	//--------
	/***
	  This method is used to evaluate an expression in postfix on a certain row 
	 * @param expInPostfix: the expression we want to evaluate in postfix notation
	 * @param rowToEvaluate: the row we want to evaluate 
	 * @param valueToDelete: the row we're deleting from the table
	 * @return an integer value=1 if the row satisfies the expression and 0 if it doesnt 
	 ***/
	public static int evalExp(ArrayList<Object> expInPostfix, Hashtable<String, Object> rowToEvaluate) {
		// sql arrSQLTerms[0]._strTableName = "Student"; arrSQLTerms[0]._strColumnName=
		// "name"; arrSQLTerms[0]._strOperator = "="; arrSQLTerms[0]._objValue = "John
		// Noor";
		// string is for column name and the object is for the value of the column name
		// excutes it on row by row w accumlates the result in a stck and finally
		// returns the answer
		// isSatisfied(Hashtable<String, Object> currRow, SQLTerm sql)
		Stack<Integer> myStack = new Stack<>();

		for (Object o : expInPostfix) {
			if (o instanceof String) {
				if (o.equals("AND") || o.equals("OR") || o.equals("XOR")) {
					int mostTop = myStack.pop();
					int second = myStack.pop();
					int result = 404;
					switch ((String) o) {
					case "AND":
						result = mostTop & second;
						break;
					case "OR":
						result = mostTop | second;
						break;
					case "XOR":
						result = mostTop ^ second;
						break;

					}
					myStack.push(result);
				}
			} else if (o instanceof SQLTerm) {

				int satisfied = isSatisfied(rowToEvaluate, (SQLTerm) o) ? 1 : 0;
				myStack.push(satisfied);
			}

			//System.out.print("stack" + myStack);
		}

		return myStack.pop();

	}
	/***
	  This method is used to evaluate whether a certain row satisfies a certain sql term (=,>,<,>=,<=)
	 * @param currRow: the row that we want to evaluate
	 * @param sql: the sql term we want to evaluate  
	 * @return a boolean value = true if the row satisfies the given sql term 
	 ***/
	public static boolean isSatisfied(Hashtable<String, Object> currRow, SQLTerm sql) {
		String colName = sql._strColumnName;
		String operator = sql._strOperator;
		Comparable value = (Comparable) sql._objValue;
		Comparable currRowValue = (Comparable) currRow.get(colName);

		switch (operator) {
		case "=":
			if (!currRowValue.equals(value)) {

				return false;

			}
			break;
		case ">":
			if (!(currRowValue.compareTo(value) > 0)) {

				return false;
			}
			break;
		case ">=":
			if (!(currRowValue.compareTo(value) >= 0))
				return false;
			break;
		case "<":
			if (!(currRowValue.compareTo(value) < 0))
				return false;
			break;
		case "<=":
			if (!(currRowValue.compareTo(value) <= 0))
				return false;
			break;
		case "!=":
			//System.out.println("row"+ currRowValue);
			if (currRowValue.equals(value))
				return false;
			break;
		}
		return true;

	}
	
	/***
	  This method is used to select rows that satisfy certain conditions from a table
	 * it first estimates whether we need to go to the table or can retrieve the whole result using indices and/or binary search
	 * we evaluate using postfix to utilize the logical operator of the sql operators
	 * there's another case where we select using a primary key condition where we use binary search since its sorted 
	 * @param arrSQLTerms   
	 * @param strarrOperators such as AND,OR,XOR 
	 * @return an Iterator 
	 ***/
	public Iterator selectFromTable(SQLTerm[] arrSQLTerms, String[] strarrOperators)
			throws DBAppException, FileNotFoundException {

		if (arrSQLTerms.length == 0)
			throw new DBAppException("invalid sql input");
		// check if the number of operators is less than sql terms (tables) by 1
		if (arrSQLTerms.length - strarrOperators.length != 1)
			throw new DBAppException("number of operators does not match number of SQL terms");
		for (int i = 0; i < strarrOperators.length; i++) {
			if (!strarrOperators[i].equals("XOR") && !strarrOperators[i].equals("OR")
					&& !strarrOperators[i].equals("AND"))
				throw new DBAppException("invalid operator " + strarrOperators[i]);
		}

		// store all columns names in a vector
		Hashtable<String, String> colNames_Types = new Hashtable<>();
		try {
			Scanner myReader = new Scanner(metafile);
			myReader.nextLine();
			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				String[] arr = line.split(",");
				colNames_Types.put(arr[1], arr[2]); // kda name key type value
			}
			myReader.close();

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		for (int i = 0; i < arrSQLTerms.length; i++) {
			SQLTerm sqlInHand = arrSQLTerms[i];
			// check that all column names are valid column names that exist in the table
			if (!colNames_Types.containsKey(sqlInHand._strColumnName))
				throw new DBAppException("there is no column in the table with the name " + sqlInHand._strColumnName);
			// check that all operators are valid
			if (!sqlInHand._strOperator.equals(">") && !sqlInHand._strOperator.equals(">=")
					&& !sqlInHand._strOperator.equals("<") && !sqlInHand._strOperator.equals("<=")
					&& !sqlInHand._strOperator.equals("=") && !sqlInHand._strOperator.equals("!="))
				throw new DBAppException("invalid operator " + sqlInHand._strOperator);
			String colType = colNames_Types.get(sqlInHand._strColumnName); // raga3ly value of the key(column name)
			// check that the value entered has same type as the column .getclass btrga3
			// class space type
			if (!("class " + colType).equals(sqlInHand._objValue.getClass().toString())) {
				if (!(colType.equals("java.lang.Double")
						&& sqlInHand._objValue.getClass().toString().equals("class java.lang.Integer")))
					throw new DBAppException("invalid column type");
			}
		}

		Table table = Table.deserializeTable(arrSQLTerms[0]._strTableName + ".class"); // we got the table
		ArrayList<Object> all = new ArrayList<Object>();
		ArrayList<Tuple> results = new ArrayList<>();
		Iterator<Tuple> it = null;

		if (strarrOperators.length == 0) {
			String colName = arrSQLTerms[0]._strColumnName;
			String tableName = arrSQLTerms[0]._strTableName;

//			if (checkIndexed(colName, tableName)) {
//				System.out.println(" in line 880");
//				bplustree t = bplustree.deserializeIndex(tableName + "_" + getIndexName(colName, tableName) + ".class");
//				HashSet<Tuple> ResultRows = getRowsFromIndexPages(getIndexResult(t, arrSQLTerms[0]), arrSQLTerms[0]);
//				it = ResultRows.iterator();
//				return it;
//				
//			}
			if (indexedorpk(arrSQLTerms[0], table.getStrClusteringKeyColumn())) {
				// System.out.println("Yayyy pk");
				HashSet<Tuple> ResultRows = evalindexorpk(arrSQLTerms[0], table);
				it = ResultRows.iterator();
				return it;
			} else { // no index so go to table
						// System.out.println("yay 2");
				for (int i = 0; i < table.getPageNames().size(); i++) {
					String pageName = table.getPageNames().get(i);
					Page p = Page.deserializePage(pageName);
					for (int j = 0; j < p.getTuples().size(); j++) {
						Hashtable<String, Object> currRow = p.getTuples().get(j).getRowValues();
						
						if (evalExp(new ArrayList<>(Arrays.asList(arrSQLTerms)), currRow) == 1) {

							results.add(p.getTuples().get(j));
						}
					}
				}
				it = results.iterator();
				return it;

			}
		}
		if (!estimate(arrSQLTerms, strarrOperators, table)) { // not true means we dont need to go to the table
			//System.out.println("not using the table");
			ArrayList<SQLTerm> OrderedList = getfirstindexedand(arrSQLTerms, strarrOperators, table); // operands
			//System.out.println("Ordered list" + OrderedList);
			for (int i = 0; i < strarrOperators.length; i++) {
				if (i == 0) {
					all.add(OrderedList.get(i));
					all.add(strarrOperators[i]);
					all.add(OrderedList.get(i + 1));
				} else {
					all.add(strarrOperators[i]);
					all.add(OrderedList.get(i + 1));
				}
			}
				ArrayList<Object> Postfix = InfixToPostfix.infixToPostfix(all);
				//System.out.println("Postfix " + Postfix);

				//System.out.println("merged array" + all);
				// System.out.println("postfix array" + Postfix);
				HashSet<Tuple> ResultSet = evalExpIndexed(Postfix, table);

				//System.out.println("Result" + ResultSet);
				it = ResultSet.iterator();
			

		} else { // go to the table
			for (int i = 0; i < strarrOperators.length; i++) {
				if (i == 0) {
					all.add(arrSQLTerms[i]);
					all.add(strarrOperators[i]);
					all.add(arrSQLTerms[i + 1]);
				} else {
					all.add(strarrOperators[i]);
					all.add(arrSQLTerms[i + 1]);
				}

			}
			ArrayList<Object> Postfix = InfixToPostfix.infixToPostfix(all);
			//System.out.println(Postfix);
			for (int i = 0; i < table.getPageNames().size(); i++) {
				String pageName = table.getPageNames().get(i);
				Page p = Page.deserializePage(pageName);
				for (int j = 0; j < p.getTuples().size(); j++) {
					Hashtable<String, Object> currRow = p.getTuples().get(j).getRowValues();
					//System.out.println("curr"+currRow);
					
					if (evalExp(Postfix, currRow) == 1) {
						//System.out.println("i added"+ currRow);
						results.add(p.getTuples().get(j));
					}
				}
			}
			HashSet<Tuple> FinalResult = new HashSet<>(results);
			it = FinalResult.iterator();
		}
		ArrayList<Object> Postfix = InfixToPostfix.infixToPostfix(all);
		//System.out.println("Postfix " + Postfix);

		//System.out.println("merged array" + all);

		// System.out.println()
		return it;
	}


	/***
	 This method simulates how the conditions can be executed to find out whether this query will need to return back to the table or not.
	     * it will get the result using the index if the column is indexed
	     * if it is not indexed and the condition is on the clustering key then we will use binary search 
	     * it will return true if we will be needing to return to the table otherwise false.
		 * the idea is we iterate over the SQLTerms and the Operators and replace each operator and two SQLTerms with a boolean
		 * that represents the answer to " does evaluating them need me to return to the table or not?" till we reach an empty operator array
		  then the result will be stored in the arraylist of the SQLTerms
	 * there's another case where we select using a primary key condition where we use binary search since its sorted 
	 * @param sql : SQL terms   
	 * @param operator : SQL operators 
	 * @param Table : Table 
	 ***/
	public static boolean estimate(SQLTerm[] sql, String[] operator, Table table) throws FileNotFoundException {
		if (operator.length == 0) {
			String colName = sql[0]._strColumnName;
			String tableName = sql[0]._strTableName;
			try {
				return !checkIndexed(colName, tableName);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ArrayList<String> Operators = new ArrayList<>(Arrays.asList(operator));
	
		ArrayList<Object> retValue = new ArrayList<Object>(Arrays.asList(sql));
		int p = 0;
		while (!Operators.isEmpty()) {
			for (int i = 0; i < Operators.size(); i++) {
				
				Object firstOperand = retValue.get(i);
				Object secOperand = retValue.get(i+1);
				
				boolean result = false;
				if (Operators.get(i).equals("AND") && p == 0) {
					while (i < Operators.size() && Operators.get(i).equals("AND")) {
						firstOperand = retValue.get(i);
						secOperand = retValue.get(i + 1);
						result = estimateAND(firstOperand, secOperand, table);
						retValue.remove(i);
						retValue.remove(i);
						Operators.remove(i);
						retValue.add(i, result);
					}
					if (retValue.get(i) instanceof Boolean) {
						if ((Boolean) retValue.get(i))
							return true;
					}
				} else if (Operators.get(i).equals("OR") && p == 1) {

					result = estimateORXORCase(firstOperand, secOperand, table);
					if (result)
						return true;
					retValue.remove(i);
					retValue.remove(i);
					Operators.remove(i);
					retValue.add(i, result);
					i--;
					//System.out.println("i removed one");
					//System.out.println("retvalue"+retValue);

				} else if (Operators.get(i).equals("XOR") && p == 2) {

					result = estimateORXORCase(firstOperand, secOperand, table);
					if (result)
						return true;
					retValue.remove(i);
					retValue.remove(i);
					Operators.remove(i);
					retValue.add(i, result);
					i--;
				}

				//System.out.println("THE OPERANDS" + retValue);
				//System.out.println("the operator" + Operators);
			}
			p++;
		}

		return (Boolean) retValue.get(0);
	}

	/*This method takes as an input 3 parameter :
		 * It is a helper for estimate that simulate the query
		  and this helper mission is only to estimate the result in case of AND
		 * it returns true if evaluating these terms separated by AND require
		 * returning to the table otherwise false
		 */
	/***
	  It is a helper for estimate that simulates the query 
	   * this method helps to estimate the result in case of AND
		 it returns true if evaluating these terms separated by AND requires returning to the table otherwise false
	 * @param term1 : boolean/SQLTerm  
	 * @param term2: boolean/SQLTerm 
	 * @param Table : :the table on which the operation is done
	 * @return boolean
	 ***/
	public static boolean estimateAND(Object term1, Object term2, Table t) throws FileNotFoundException {
		boolean result = false;
		String tablePK = t.getStrClusteringKeyColumn();

		if (term1 instanceof SQLTerm && term2 instanceof SQLTerm) {
			SQLTerm sqlTerm1 = (SQLTerm) term1;
			SQLTerm sqlTerm2 = (SQLTerm) term2;
			if (indexedorpk(sqlTerm1, tablePK) || indexedorpk(sqlTerm2, tablePK)) {
				result = false;
			} else {
				result = true;
			}

		} else if (term1 instanceof Boolean) {
			boolean returnToTable1 = (Boolean) term1;
			SQLTerm sqlTerm2 = (SQLTerm) term2;
			result = returnToTable1 && !indexedorpk(sqlTerm2, tablePK);
		}
		return result;
	}

	
	/***
	 * @param term1 : the term that is needed to be checked that it is either indexed or a clustering key
	 * @param tablePk: the name of the clustering key column name
	 * @return boolean: returns true if this sqlterm columnName is indexed or a clustering key Column
	 ***/

	public static boolean indexedorpk(SQLTerm term1, String tablePK) throws FileNotFoundException {
		SQLTerm sqlTerm1 = (SQLTerm) term1;
		String colName1 = sqlTerm1._strColumnName;
		String tableName1 = sqlTerm1._strTableName;
		String operator1 = sqlTerm1._strOperator;
		return ((tablePK.equals(colName1) || DBApp.checkIndexed(colName1, tableName1)) && !operator1.equals("!="));
	}
	/***
	 * This methods checks the types of the two terms(ORed or XORed)
	 * then simulates if they need to return to the table to be executed or not
	 * it returns true if one needs to be executed by scanning the table linearly
	 * and can't be evaluated by an index or binary search in case of clustering key column otherwise false
	 * @param term1 : boolean/SQLTerm  
	 * @param term2: boolean/SQLTerm 
	 * @param Table : :the table on which the operation is done
	 * @return boolean ***/
	public static boolean estimateORXORCase(Object term1, Object term2, Table t) throws FileNotFoundException {
		boolean returnToTable1 = false;
		boolean returnToTable2 = false;
		String tablePK = t.getStrClusteringKeyColumn();

		if (term1 instanceof SQLTerm) {
			SQLTerm sqlTerm1 = (SQLTerm) term1;
			returnToTable1 = !(indexedorpk(sqlTerm1, tablePK));

			if (term2 instanceof SQLTerm) {
				SQLTerm sqlTerm2 = (SQLTerm) term2;
				returnToTable2 = !(indexedorpk(sqlTerm2, tablePK));
			} else {
				returnToTable2 = (Boolean) term2;
			}
		} else if (term1 instanceof Boolean) {
			returnToTable1 = (Boolean) term1;
			if (term2 instanceof Boolean) {
				returnToTable2 = (Boolean) term2;
			} else {

				SQLTerm secSql = (SQLTerm) term2;
				returnToTable2 = !(indexedorpk(secSql, tablePK));
			}
		}
		return returnToTable1 || returnToTable2;
	}

	/***
	 If there are consecutive ands, it reorders the conditions such that the second condition is either indexed or is a pk  
	 * @param arrSQLTerms : array of sql terms 
	 * @param strarrOperators: operators 
	 * @param Table : :the table on which the operation is done
	 * @return boolean ***/
	public static ArrayList<SQLTerm> getfirstindexedand(SQLTerm[] arrSQLTerms, String[] strarrOperators, Table t)
			throws FileNotFoundException {
		ArrayList<String> Operators = new ArrayList<>(Arrays.asList(strarrOperators));
		ArrayList<SQLTerm> Operands = new ArrayList<>(Arrays.asList(arrSQLTerms));
		for (int i = 0; i < Operators.size(); i++) {
			if (Operators.get(i).equals("AND")) {
				int j = i;
				int firstIndexedCond = -1;
				int firstpkCond = -1;
				boolean flag = false; // y3ni el index before operator

				while (j < Operators.size() && Operators.get(j).equals("AND")) {
					String colname1 = arrSQLTerms[j]._strColumnName;
					String tableName1 = arrSQLTerms[j]._strTableName;
					String operator1 = arrSQLTerms[j]._strOperator;
					String colname2 = arrSQLTerms[j + 1]._strColumnName;
					String tableName2 = arrSQLTerms[j + 1]._strTableName;
					String operator2 = arrSQLTerms[j + 1]._strOperator;
					if ((firstIndexedCond == -1) && DBApp.checkIndexed(colname1, tableName1)
							&& !operator1.equals("!=")) {
//						System.out.println("da5lt1");
						firstIndexedCond = j;
					}
					if ((firstIndexedCond == -1) && DBApp.checkIndexed(colname2, tableName2)
							&& !operator2.equals("!=")) {
//						System.out.println("da5lt2");
						flag = true;
						firstIndexedCond = j;
					}

					if ((firstpkCond == -1) && t.getStrClusteringKeyColumn().equals(colname1)
							&& !operator1.equals("!=")) {
//						System.out.println("da5lt3");
						firstpkCond = j;
					}
					if ((firstpkCond == -1) && t.getStrClusteringKeyColumn().equals(colname2)
							&& !operator2.equals("!=")) {
//						System.out.println("da5lt4");
						flag = true;
						firstpkCond = j;
					}
					j++;
				}
				// re-ordering the expression such that the non-indexed and comes first then the
				// indexed and
				// so that when pushing into the stack and then popping the indexed and is the
				// first to get popped
				if (firstIndexedCond != -1 && !flag) {
					Operands.remove(arrSQLTerms[firstIndexedCond]);
					Operands.remove(arrSQLTerms[firstIndexedCond + 1]);
					Operands.add(i, arrSQLTerms[firstIndexedCond + 1]);
					Operands.add(i + 1, arrSQLTerms[firstIndexedCond]);

				} else if (firstIndexedCond != -1 && flag) {
					Operands.remove(arrSQLTerms[firstIndexedCond]);
					Operands.remove(arrSQLTerms[firstIndexedCond + 1]);
					Operands.add(i, arrSQLTerms[firstIndexedCond]);
					Operands.add(i + 1, arrSQLTerms[firstIndexedCond + 1]);
				}

				else if (firstpkCond != -1 && !flag) {
					Operands.remove(arrSQLTerms[firstpkCond]);
					Operands.remove(arrSQLTerms[firstpkCond + 1]);
					Operands.add(i, arrSQLTerms[firstpkCond + 1]);
					Operands.add(i + 1, arrSQLTerms[firstpkCond]);

				} else if (firstpkCond != -1 && flag) {
					Operands.remove(arrSQLTerms[firstpkCond]);
					Operands.remove(arrSQLTerms[firstpkCond + 1]);
					Operands.add(i, arrSQLTerms[firstpkCond]);
					Operands.add(i + 1, arrSQLTerms[firstpkCond + 1]);
				}
				i = j - 1;
				//System.out.println(Operands);
			}
		}
		return Operands;
	}
	
	public static HashSet<Tuple> evalExpIndexed(ArrayList<Object> expInPostfix, Table t)
			throws FileNotFoundException, DBAppException {// fix
		// return
		// type
		Stack<Object> myStack = new Stack<>();
		HashSet<Tuple> result = new HashSet<Tuple>();// feh hena 2ala2

		for (Object o : expInPostfix) {
			if (o instanceof String) {
				String operator = (String) o;
				if (operator.equals("AND") || operator.equals("OR") || operator.equals("XOR")) {

					Object fstOnTop = myStack.pop();
					Object scnd = myStack.pop();
					if (fstOnTop instanceof HashSet<?> && scnd instanceof HashSet<?>) {

						switch (operator) {
						case "AND":
							result = (intersection((HashSet) fstOnTop, (HashSet) scnd));
							break;
						case "OR":
							result = (union((HashSet) fstOnTop, (HashSet) scnd));
							break;
						case "XOR":
							result = XOR((HashSet) fstOnTop, (HashSet) scnd);
							break;
						}
					} else if (fstOnTop instanceof SQLTerm && scnd instanceof SQLTerm) {
						SQLTerm term1 = (SQLTerm) fstOnTop;
						SQLTerm term2 = (SQLTerm) scnd;
						String colName1 = term1._strColumnName;
						String tableName1 = term1._strTableName;
						HashSet<String> pagesNames1 = null;
						HashSet<String> pagesNames2 = null;
						HashSet<Tuple> res1 = null;
						HashSet<Tuple> res2 = null;

						switch (operator) {
						
						case "AND":
							// ana 100% feh 3andy at least 1 indexed/pk cond\
							// index/pk 3ala awal term 100%
							//System.out.println("HELLOOO");
							res1 = evalindexorpk(term1, t);
							for (Tuple row : res1) {
								if (isSatisfied(row.getRowValues(), term2))
									result.add(row);
							}
							break;

						case "OR":
							res1 = evalindexorpk(term1, t); // this evaluates the term either using index or
															// binarysearch
							res2 = evalindexorpk(term2, t);
							result = (union(res1, res2));
							break;

						case "XOR":
							res1 = evalindexorpk(term1, t);
							res2 = evalindexorpk(term2, t);
							result = (XOR(res1, res2));
							break;
						}

					} else if ((fstOnTop instanceof SQLTerm && scnd instanceof HashSet)
							|| (scnd instanceof SQLTerm && fstOnTop instanceof HashSet)) { // and -->
						SQLTerm term1;
						HashSet<Tuple> term2;
						HashSet<Tuple> res1;
						HashSet<String> pagesNames1;
						if (fstOnTop instanceof SQLTerm) { // making term1 be the sql, and term2 be the hashtable
							term1 = (SQLTerm) fstOnTop;
							term2 = (HashSet<Tuple>) scnd;
						} else {
							term1 = (SQLTerm) scnd;
							term2 = (HashSet<Tuple>) fstOnTop;
						}

						switch (operator) {
						case "AND":
							for (Tuple row : term2) {
								if (isSatisfied(row.getRowValues(), term1)) {
									result.add(row);
								}
							}
							break;
						case "OR":
							res1 = evalindexorpk(term1, t);
							result = (union(res1, term2));
							break;

						case "XOR":
							res1 = evalindexorpk(term1, t);
							result = (XOR(res1, term2));
							break;
						}
					}
					HashSet<Tuple> ress= new HashSet<Tuple>(result);
					myStack.push(ress);
					result.clear();
					//System.out.println("MY RESULT SO FAR "+ result);
				}
			} else if (o instanceof SQLTerm) {
				SQLTerm sqlTerm = (SQLTerm) o;
				myStack.push(o);
			}
		}

		return (HashSet<Tuple>) myStack.pop();
	}

	public static HashSet<Tuple> evalindexorpk(SQLTerm term, Table t) throws FileNotFoundException, DBAppException {
		String colName = term._strColumnName;
		String tableName = term._strTableName;
		HashSet<Tuple> res1;
		if (DBApp.checkIndexed(colName, tableName)) {
			//System.out.println("INDEX");
			bplustree indexTree = bplustree.deserializeIndex(
					term._strTableName + "_" + getIndexName(term._strColumnName, term._strTableName) + ".class");
			HashSet<String> pagesNames = getIndexResult(indexTree, term);
			res1 = getRowsFromIndexPages(pagesNames, term);

		} else {
			//System.out.println("PK");

			res1 = isSatisfiedwithpk(term, t);
		}
		return res1;

	}

	/**
	 * Checks if the given SQLTerm is satisfied using the primary key index of the table.
	 * @param sql The SQLTerm containing the search condition.
	 * @param t The table for which the search is conducted.
	 * @return HashSet<Tuple> A HashSet of tuples satisfying the condition specified by the SQLTerm.
	 * @throws DBAppException If an error occurs during the search process.
	 */
	public static HashSet<Tuple> isSatisfiedwithpk(SQLTerm sql, Table t) throws DBAppException {
//		 Table t= Table.deserializeTable(sql._strTableName);
		String colName = sql._strColumnName;
		String operator = sql._strOperator;
		Comparable clusteringKey = (Comparable) sql._objValue;
		HashSet<Tuple> h = new HashSet<Tuple>();
		String pagename = Table.binarySearchTable(t.getStrTableName(), clusteringKey);
		;
		Vector<Integer> v = Page.binarySearch(pagename, clusteringKey, t.getStrClusteringKeyColumn());
		Page p = Page.deserializePage(pagename);

		switch (operator) {
		case "=":
			if (v.get(0) != 0)
				h.add(p.getTuples().get(v.get(1)));
			break;
		case ">":
			h = t.greaterthan(clusteringKey, false);
			break;
		case ">=":
			h = t.greaterthan(clusteringKey, true);
			break;
		case "<":
			h = t.lessthan(clusteringKey, false);
			break;
		case "<=":
			h = t.lessthan(clusteringKey, true);
			break;

		}
		return h;

	}
/***
	 * Retrieves the index results based on the given SQLTerm.
	 * @param b The B+ tree index.
	 * @param sql The SQLTerm containing the search condition.
	 * @return HashSet<String> A HashSet of index results satisfying the condition in the SQLTerm.
	 * @throws DBAppException If an error occurs during the retrieval process. ***/
	public static HashSet<String> getIndexResult(bplustree b, SQLTerm sql) throws DBAppException {
		HashSet<String> indexRows = new HashSet<String>();
		String operator = sql._strOperator;
		Comparable value = (Comparable) sql._objValue;
		switch (operator) {
		case "=":
			indexRows = new HashSet(b.search(value));
			// System.out.println("hi"+ indexRows);
			break;
		case ">":
			indexRows = new HashSet(bplustree.findGreaterOrEqual(b, bplustree.getNextKey(b, value)));
			break;
		case ">=":
			indexRows = new HashSet(bplustree.findGreaterOrEqual(b, value));
			break;
		case "<":
			indexRows = new HashSet(bplustree.findLessOrEqual(b, bplustree.getPreviousKey(b, value)));
			break;
		case "<=":
			indexRows = new HashSet(bplustree.findLessOrEqual(b, value));
			break;
		case "!=":
			indexRows = new HashSet(selectLinearly(sql));
			break;
		}
		return indexRows;
	}
	
	public static ArrayList<String> selectLinearly(SQLTerm sql) throws DBAppException {
		ArrayList<String> result = new ArrayList<String>();
		String tableName = sql._strTableName;
		Table table = Table.deserializeTable(tableName + ".class");
		for (int i = 0; i < table.getPageNames().size(); i++) {
			String pageName = table.getPageNames().get(i);
			HashSet<Tuple> pageResult = pageIterator(pageName, sql);
			if (!pageResult.isEmpty()) {
				result.add(pageName);
			}
		}
		return result;
	}


	/*** This method gets the rows from pages returned by searching in the index(B+ tree) for the rows that satisfy the condition 
	   
	    * @param pageName : name of the page we want to iterate over
	    * @param  h2: Hashset of tuples
	    * @return HashSet<Tuple>: returns a Hashset of tuples containing the tuples that satisfy the condition in the SQL term 
    ***/
	public static HashSet<Tuple> getRowsFromIndexPages(HashSet<String> pagenames, SQLTerm sql) {// HashSet<Tuple>
																								// pageIterator(String
																								// pageName, SQLTerm
																								// sql)
		HashSet<Tuple> resultedTuples = new HashSet<>();
		for (String p : pagenames) {
			resultedTuples.addAll(pageIterator(p, sql));
		}

		return resultedTuples;
	}

	/*** This method iterates over a page and returns a hashset of tuples that satisfy a certain sqlTerm  
	    * @param pageName : name of the page we want to iterate over
	    * @param  h2: Hashset of tuples
	    * @return HashSet<Tuple>: returns a Hashset of tuples containing the tuples that satisfy the condition in the SQL term 
    ***/
	
	public static HashSet<Tuple> pageIterator(String pageName, SQLTerm sql) {
		HashSet<Tuple> result = new HashSet<Tuple>();
		Page p = Page.deserializePage(pageName);
		for (int j = 0; j < p.getTuples().size(); j++) {
			Hashtable<String, Object> currRow = p.getTuples().get(j).getRowValues(); // loop on hashtable
			if (isSatisfied(currRow, sql)) {
				result.add(p.getTuples().get(j));
			}
		}
		return result;
	}
	
	/*** This method takes 2 inputs as a parameter
	    * @param HashSet<Tuple> h1: Hashset of tuples
	    * @param HashSet<Tuple> h2:Hashset of tuples
	    * @return : returns a Hashset of tuples containing the common tuples between the two input Hashsets (intersection)
    ***/

	public static HashSet<Tuple> intersection(HashSet<Tuple> h1, HashSet<Tuple> h2) {
		HashSet<Tuple> result = new HashSet<Tuple>(h1);
		result.retainAll(h2);
		return result;
	}

	/*** This method takes 2 inputs as a parameter
	    * @param HashSet<Tuple> h1: Hashset of tuples
	    * @param HashSet<Tuple> h2:Hashset of tuples
	    * @return : * returns a Hashset of tuples containing the union of tuples of the two input Hashsets
	 ***/

	public static HashSet<Tuple> union(HashSet<Tuple> h1, HashSet<Tuple> h2) {
		HashSet<Tuple> result = new HashSet<Tuple>(h1);
		result.addAll(h2);
		return result;
	}
	/*** This method takes 2 inputs as a parameter
	    * @param HashSet<Tuple> h1: Hashset of tuples
	    * @param HashSet<Tuple> h2:Hashset of tuples
	    * @return : Hashset of tuples contains all the elements that are either in set h1 or set h2, but not in both
	 ***/

	public static HashSet<Tuple> XOR(HashSet<Tuple> h1, HashSet<Tuple> h2) {
		HashSet<Tuple> result = new HashSet<Tuple>(union(h1, h2));
		result.removeAll(intersection(h1, h2));
		return result;
	}

	/***
	 * This method first break down inputs into tokens such as rules and literals then the parser
	 * recognize them by matching the grammar and structuring an actual query, the grammar starts
	 * with  statement (starting rule) that get matched with one of our 6 methods that our engine
	 * supports select *, create table, create index, delete, update and insert, otherwise it throws and exceptions
	 * @param strbufSQL: the SQL Query we're evaluating
	 * @return parseSQL iterator :  returns the result in case we're using select otherwise it's null 
	 *@throws RecognitionException 
	  ***/

	public Iterator parseSQL( StringBuffer strbufSQL ) throws DBAppException, IOException, RecognitionException{
		//Tokenization: Use Antlr-generated lexer/parser to tokenize the input SQL string.
		//Parsing: Parse the tokenized input to generate an abstract syntax tree (AST).
		//Execution: Execute the parsed SQL query or perform further operations based on the AST.
		
		mysqlLexer lexer = new mysqlLexer(CharStreams.fromString(strbufSQL.toString()));
       CommonTokenStream tokens = new CommonTokenStream(lexer);
       //The lexer reads characters from this character stream and tokenizes them according to the rules defined in the MySQL grammar.
       mysqlParser parser = new mysqlParser(tokens);
   
       //parser.addErrorListener(new AntlrErrorHandler());
       //parser.setErrorHandler(new ExceptionErrorStrategy());
       try {       
       mysqlParser.StatementContext context=context = parser.statement();
             
       if(context.select()!=null) {
       	String tableName = context.select().table_name().getText();
       	//System.out.println(tableName);
           List<mysqlParser.ColumnNameContext> columnNames = context.select().columnName();
           //System.out.println(columnNames);
           List<mysqlParser.OperationContext> operations = context.select().operation();
           //System.out.println(operations.get(0).getText());
           List<mysqlParser.ConstantContext> constants = context.select().constant();
           List<mysqlParser.OperatorContext> operators = context.select().operator();
          //System.out.println(operators.get(0).getText());
       	SQLTerm [] sqlTerms = new SQLTerm[columnNames.size()];
       	String [] Operators = new String[operators.size()];
       	if(Operators.length>0) {
       		for(int i=0;i<Operators.length;i++) {
       			Operators[i]=operators.get(i).getText().toUpperCase();
       		}
       	}
       	for(int i =0;i<sqlTerms.length;i++) {
       		sqlTerms[i]=new SQLTerm();
       		sqlTerms[i]._strTableName=tableName;
       		sqlTerms[i]._strColumnName =columnNames.get(i).getText();
       		//System.out.println(operations.get(i).getText());
       		sqlTerms[i]._strOperator =operations.get(i).getText();
       		//sqlTerms[i]._objValue=constants.get(i).getText();
       		if (constants.get(i).INTEGER_VALUE() != null) {
                   sqlTerms[i]._objValue = Integer.parseInt(constants.get(i).INTEGER_VALUE().getText());
               } else if (constants.get(i).DECIMAL_VALUE() != null) {
                   sqlTerms[i]._objValue = Double.parseDouble(constants.get(i).DECIMAL_VALUE().getText());
               } else if (constants.get(i).QUOTED_STRING() != null) {
                   sqlTerms[i]._objValue = constants.get(i).QUOTED_STRING().get(0).getText().substring(1,constants.get(i).QUOTED_STRING().get(0).getText().length()-1);
                   //System.out.println(('"'+constants.get(i).QUOTED_STRING().get(0).getText().substring(1,constants.get(i).QUOTED_STRING().get(0).getText().length()-1)+'"').getClass());
               }
               else throw new DBAppException("the value is of an unsupported type");
       	
       	}
       	
     
       	try {
			return selectFromTable(sqlTerms, Operators);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DBAppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
       else if (context.create_table()!=null) { //create_table
    	if (context.create_table() != null) {	
       	String tableName = context.create_table().table_name().getText();
       	Hashtable<String,String> htblColNameType = new Hashtable<>();
       	String clusteringKey= null;
       	List<mysqlParser.Create_table_columnContext> columnContexts = context.create_table().create_table_column();;
       	
       		for (mysqlParser.Create_table_columnContext columnContext : columnContexts) {
        	   String columnName = columnContext.columnName().getText();
               String columnType = columnContext.columnType().getText();
               if(columnContext.columnType().type().INT_TYPE()!=null)
               	columnType= "java.lang.Integer";
               else if(columnContext.columnType().type().FLOAT_TYPE()!=null||columnContext.columnType().type().DOUBLE_TYPE()!=null||columnContext.columnType().type().DECIMAL_TYPE()!=null)
               	columnType = "java.lang.Double";
               else if(columnContext.columnType().type().STRING_TYPE() != null||columnContext.columnType().type().VARCHAR_TYPE()!=null)
               	columnType = "java.lang.String";
               else if(columnContext.columnType().type().IDENTIFIER()!=null)
            	   throw new DBAppException("You are creating a table with an unsupported type!");
          
               htblColNameType.put(columnName, columnType);
           }
           if (context.create_table().PRIMARY_KEY() != null) {
               clusteringKey = context.create_table().clustering_key().getText();
           }
           if (clusteringKey == null) {
               throw new DBAppException("no primary key was specified");
           } 
           else {
               createTable(tableName, clusteringKey, htblColNameType);
           } 
    	}
       }
       //update: UPDATE table_name SET columnName EQUALS constant (COMMA columnName EQUALS constant)*
       //WHERE clustering_key EQUALS clustering_key_value;
       //updateTable(String strTableName, String strClusteringKeyValue, Hashtable<String,Object> htblColNameValue
       else if(context.update()!=null) {
    	   String tableName = context.update().table_name().getText();
    	   List<mysqlParser.ColumnNameContext> columnNames = context.update().columnName();
    	   List<mysqlParser.ConstantContext> constants = context.update().constant();
    	   String clusteringKey = context.update().clustering_key().getText();
    	   Object clusteringKeyVal =  context.update().clustering_key_value().getText();
    	   Hashtable<String,Object> htblColNameValue = new Hashtable<>();
    	   for(int i =0;i<columnNames.size();i++) {
    		   
    		   if(constants.get(i).INTEGER_VALUE()!=null) {
        		   htblColNameValue.put(columnNames.get(i).getText(), Integer.parseInt(constants.get(i).getText()));
    		   }
    		   else if(constants.get(i).DECIMAL_VALUE()!=null) {
        		   htblColNameValue.put(columnNames.get(i).getText(), Double.parseDouble(constants.get(i).getText()));
    		   }
    		   else if(constants.get(i).QUOTED_STRING()!=null) {
    			   int len = constants.get(i).getText().length();
        		   htblColNameValue.put(columnNames.get(i).getText(), constants.get(i).getText().substring(1,len-1));

    		   }

    	   }
    	   if(clusteringKey==null)
    		   throw new DBAppException("your primary key cant be null");
    	   

    	   updateTable(tableName,clusteringKeyVal+"",htblColNameValue);
       }
       else if(context.create_index()!=null) {
    	   //create_index: CREATE INDEX IDENTIFIER 
			//ON table_name 
			//LEFT_PARENTHESIS columnName (COMMA columnName)*RIGHT_PARENTHESIS ;
    	   //createIndex(String strTableName, String strColName, String strIndexName)
    	   String tableName= context.create_index().table_name().getText();
    	   String indexName=context.create_index().IDENTIFIER().getText();
    	   if(indexName==null)
    		   throw new DBAppException("You are not giving the index a name");
    	   String columnName= context.create_index().columnName().get(0).getText();
    	   if(columnName ==null)
    		   throw new DBAppException("Please insert a valid column name");
    	   createIndex(tableName,columnName, indexName);
    	   
       }
       else if(context.delete()!=null) {
    	   //delete: DELETE FROM table_name 
   		//(WHERE columnName EQUALS constant 
   				//(AND columnName EQUALS constant)*)? ;
    	   
    	   //deleteFromTable(String strTableName,Hashtable<String,Object> htblColNameValue) 
    	   
    	   String tableName = context.delete().table_name().getText();
    	   List<mysqlParser.ColumnNameContext> columnNames = context.delete().columnName();
    	   List<mysqlParser.ConstantContext> constants = context.delete().constant();
    	   Hashtable<String,Object> htblcolNameVal= new Hashtable<>();
    	   
    	   for(int i =0; i<columnNames.size();i++) {
    		   
    		   if(constants.get(i).INTEGER_VALUE()!=null) {
    			   htblcolNameVal.put(columnNames.get(i).getText(),Integer.parseInt(constants.get(i).getText()));
    		   }
    		   else if (constants.get(i).DECIMAL_VALUE()!=null) {
    			   htblcolNameVal.put(columnNames.get(i).getText(),Double.parseDouble(constants.get(i).getText()));
    		   }
    		   else if (constants.get(i).QUOTED_STRING()!=null) {
    			   int nada =  constants.get(i).getText().length()-1;
    			   htblcolNameVal.put(columnNames.get(i).getText(),constants.get(i).getText().substring(1, nada));

    		   }
    	   }
    	   try {
			deleteFromTable(tableName,htblcolNameVal );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
       }
       else if (context.insert()!=null) {
    	   //insert: INSERT INTO table_name LEFT_PARENTHESIS columnName (COMMA columnName)RIGHT_PARENTHESIS VALUES values (COMMA values);
    	   String tableName = context.insert().table_name().getText();
    	   
    	   //insertIntoTable(String strTableName,Hashtable<String,Object> htblColNameValue) //clustering key cant be null
    	   
    	   List<mysqlParser.ColumnNameContext> columnNames = context.insert().columnName();
    	   List<mysqlParser.ConstantContext> values =context.insert().constant();
    	   
    	   //System.out.println(columnNames);
    	   //System.out.println(values.get(0).constants().getText());
    	   Hashtable<String,Object> htblcolNameVal= new Hashtable<>();
    	   
    	   //System.out.println(values);
    	   for(int i =0;i<columnNames.size();i++) {
        	   
    		   if(values.get(i).INTEGER_VALUE()!=null)
    			   htblcolNameVal.put(columnNames.get(i).getText(),Integer.parseInt(values.get(i).getText()));
    		   else if (values.get(i).DECIMAL_VALUE()!=null)
    			   htblcolNameVal.put(columnNames.get(i).getText(),Double.parseDouble(values.get(i).getText()));
    		   else if (values.get(i).QUOTED_STRING()!=null) {
    			   int len = values.get(i).getText().length();
    			   htblcolNameVal.put(columnNames.get(i).getText(),values.get(i).getText().substring(1, len -1));
    		   }
    	   }
    	   insertIntoTable(tableName,htblcolNameVal);
       }
       else if(context.diana()!=null) {
    	   
    	   throw new DBAppException("Our engine doesn't support this query!");
       }
       }
       catch (RecognitionException  e) {
               throw new DBAppException("Invalid SQL query");
           }

      
		return null;
	}

	public static void main(String[] args) throws Exception {

		DBApp dbApp = new DBApp();
		//dbApp.init();
		//create table final (id int, name varchar(2), gpa decimal(1,2), major varchar(19), primary key (id));
		//insert  into  final( id ,name ,gpa, major) values ( 2 , 'ahmed', 2.3, 'Math'  );
		//update final set name = 'ali' , gpa = 2.6 where id = 2
		//create index idIndex on myTable (id);
		//update final set name = 'tara' , gpa = 2.0 where id = 4
		//delete from final where gpa =1.0 and name = 'aya'
          StringBuffer buf = new StringBuffer("delete from final;");
//          StringBuffer buf2 = new StringBuffer("create index gpaIndex on final(gpa);");
//          StringBuffer buf3 = new StringBuffer("create index nameIndex on final(name);");

          Iterator result = dbApp.parseSQL(buf);
       

		Hashtable htblColNameValue = new Hashtable( );
		htblColNameValue.put("id", new Integer(5 ));
        htblColNameValue.put("name", new String("Yasuo" ) ); //hytla3
        htblColNameValue.put("gpa", new Double(2.2 ) );
        //dbApp.insertIntoTable( "final" , htblColNameValue );

////		arrSQLTerms[0] = new SQLTerm();
//		//dbApp.createIndex("Doctor", "age", "ageIndex");
//		SQLTerm[] arrSQLTerms;
//		arrSQLTerms = new SQLTerm[3];
//		arrSQLTerms[0] = new SQLTerm();
//		arrSQLTerms[0]._strTableName = "Doctor";
//		arrSQLTerms[0]._strColumnName = "professeurName";
//		arrSQLTerms[0]._strOperator = ">=";
//		arrSQLTerms[0]._objValue = new String("Dalia");
//		arrSQLTerms[1] = new SQLTerm();
//		arrSQLTerms[1]._strTableName = "Doctor";
//		arrSQLTerms[1]._strColumnName = "professeurID";
//		arrSQLTerms[1]._strOperator = ">=";
//		arrSQLTerms[1]._objValue = new Integer(20);
//		arrSQLTerms[2] = new SQLTerm();
//		arrSQLTerms[2]._strTableName = "Doctor";
//		arrSQLTerms[2]._strColumnName = "age";
//		arrSQLTerms[2]._strOperator = ">";
//		arrSQLTerms[2]._objValue = new Integer(30);
//		String[] strarrOperators = new String[2]; 
//         strarrOperators[0] = "AND";
//         strarrOperators[1] = "AND";
         //Iterator resultSet = dbApp.selectFromTable(arrSQLTerms, strarrOperators);
		/*  while (result.hasNext()) {
		  
		  System.out.println("row  :" + result.next()); }*/
		
		Table hana = Table.deserializeTable("final.class");
		for (int i = 0; i < hana.getPageNames().size(); i++) {
			Page p = Page.deserializePage(hana.getPageNames().get(i));
			System.out.println(i + "page " + hana.getPageNames().get(i));
			System.out.println("\n" + p);
		}
//		
//////		System.out.println("f below");
//////        bplustree.deserializeIndex("deadline5_fIndex.class").print();

	}
}
