package Pages;
//import Pages.Page;
import index.bplustree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Vector;

import Main.DBApp;
import Main.DBAppException;



public class Table implements Serializable {
	private static final long serialVersionUID = 1L;
	private int counter=0; 
	private String strTableName;
	private ArrayList<String> pageNames;
	private Hashtable <String,Vector<Comparable>> hashtablepagenames;
	private String strClusteringKeyColumn;
	private Hashtable<String,String> htblColNameType;
	
	
	public int getCounter()
	{
		return counter;
	}
	
	public static String binarySearchTable(String tableName, Comparable clusteringKey) throws DBAppException {
		Table t = Table.deserializeTable(tableName+".class");
		int leftPointer = 0;
		int rightPointer = t.getHashtablepagenames().size()-1;
		boolean found = false;
		int mid = leftPointer + ((rightPointer - leftPointer) / 2);
		ArrayList pagesName = t.getPageNames();
		Hashtable pageRange= t.getHashtablepagenames();
		String mypage="";
		while (leftPointer <= rightPointer) {
			mid = leftPointer + ((rightPointer - leftPointer) / 2);
			mypage=(String)(pagesName.get(mid));
		    Vector<Comparable> myrange= ( Vector<Comparable>)( pageRange.get(mypage));
			if (withinrange(myrange,clusteringKey)==0){
		    	found = true;
				break;
		    }
			else if (withinrange(myrange,clusteringKey)==1) {
				leftPointer = mid + 1;
			} else if (withinrange(myrange,clusteringKey)==-1) {
				rightPointer = mid - 1;
			} 
		}
//		Vector<Comparable> range = ( Vector<Comparable>)( pageRange.get((String)(pagesName.get(rightPointer))));
//		Vector v= new Vector<Integer>() ;
		if (found) {
			return mypage;
		} 
		else {
		    //System.out.println("Right:" + rightPointer);
		    //System.out.println("Left:" + leftPointer);

		    if (rightPointer >= 0) {
		        Page option1 = Page.deserializePage((String) pagesName.get(rightPointer));
		        if (option1.getTuples().size() < Page.N) {
		            return (String) pagesName.get(rightPointer);
		        }
		    
		        else if (leftPointer < pagesName.size()) { // Use "else if" here
		        Page option2 = Page.deserializePage((String) pagesName.get(leftPointer));
		        return (String) pagesName.get(leftPointer);
		        }
		        return "hi";
		    }
		    else {
		        return (String) pagesName.get(0); // lw rptr be -1 y3ni ana 3ayza ad5l feh awal page
		    }
		}
		
		
		
	}
	
	public static int withinrange(Vector<Comparable> range, Comparable pk ) {
		
		if (pk.compareTo(range.get(0))<0) {
			return -1;
		}
		else if (pk.compareTo(range.get(1))>0)   {
			return 1;
		}
		else {
			return 0;
		}
		
			

	}
	
	public Hashtable<String, Vector<Comparable>> getHashtablepagenames() {
		return hashtablepagenames;
	}

	public void setHashtablepagenames(Hashtable<String, Vector<Comparable>> hashtablepagenames) {
		this.hashtablepagenames = hashtablepagenames;
	}

	public void setHtblColNameType(Hashtable<String, String> htblColNameType) {
		this.htblColNameType = htblColNameType;
	}

	public Table(String strTableName, String strClusteringKeyColumn, Hashtable<String, String> htblColNameType) {
		pageNames = new ArrayList<String>();
		hashtablepagenames= new Hashtable <>();
		this.strTableName = strTableName;
        this.strClusteringKeyColumn = strClusteringKeyColumn;
        this.htblColNameType = htblColNameType;
      	}
	
	public void serializeTable(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this); // Serialize the current Table object
       
        } catch (Exception e) {
            System.err.println("Error serializing Table: " + e.getMessage());
        }
    }
	
	public static Table deserializeTable(String fileName) throws DBAppException{
		Table t=null;
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
            t= (Table)ois.readObject(); 
		}
		catch(FileNotFoundException e) {
			if (t==null)
				throw new DBAppException("Table name not found");
			}
		 catch (Exception  e) {
			e.printStackTrace();
		} 
        return t;
    }
   
	
	public Page addpage(Tuple x)
	{
	Page p=new Page();
	String name= strTableName+counter+".class";
	counter++;
	pageNames.add(name);
	p.insertTuple(x);
	Comparable primarykey= (Comparable) Page.getPKofRow( p.getTuples().get(0).getRowValues(),this.strClusteringKeyColumn);
	Vector<Comparable> v= new Vector<Comparable>();
	v.add(primarykey);
	v.add(primarykey);
	hashtablepagenames.put(name, v);
	p.serializePage(name);
this.serializeTable(this.strTableName+".class");
	return p;
	}
	// Checks if a column has a valid data type 
	public boolean checkcoltype() {
		for (String value : htblColNameType.values()) {
           if (!value.equals("java.lang.Integer") || !value.equals("java.lang.String") || !value.equals("java.lang.Double"))
        	   return false;
		}
		return true;
	}
	
	public ArrayList<String> linearsearch(Hashtable <String,Object> cell){ //hena badwr 3ala a single instance 
		String mykey = null;
		Object myvalue = null;
		ArrayList <String> resultpages = new ArrayList<String>();
		for (String key : cell.keySet()) {
			mykey=key;
			myvalue=cell.get(mykey);
		}
		
		for(int i=0; i<pageNames.size();i++) { // looping over pages 
			Page page1= Page.deserializePage(pageNames.get(i)); // getting page 
			Vector<Tuple> array= page1.getTuples();// getting vector of tuples 
			for(int j=0;j<array.size();j++) // looping over the vector of tuples 
			{
				Hashtable<String,Object > myrow=array.get(j).getRowValues();
				for( String s:myrow.keySet()) { //  s el column type 
					
					{
						if (s.equals(mykey) && myrow.get(s).equals(myvalue)) 
						{
							// we found a correct row 
							resultpages.add(pageNames.get(i));
							
							 
						}
					}
		        
				}
			}
			page1.serializePage(pageNames.get(i));
		}
		return resultpages;
		
	}
	
	

	
	public ArrayList<String> getPageNames() {
		return pageNames;
	}
	public void setPageNames(ArrayList<String> pageNames) {
		this.pageNames = pageNames;
	}
	public String getStrClusteringKeyColumn() {
		return strClusteringKeyColumn;
	}
	public void setStrClusteringKeyColumn(String strClusteringKeyColumn) {
		this.strClusteringKeyColumn = strClusteringKeyColumn;
	}
	public Hashtable<String, String> getHtblColNameType() {
		return htblColNameType;
	}
	public Hashtable<String, String> getHtblColNameType(Hashtable<String, String> htblColNameType) {
		return htblColNameType;
	}
	public String getStrTableName() {
		return strTableName;
	}
	
	public void shiftPages(String pagefilename, int indexiwant, Tuple row,Table table, String indexName) throws FileNotFoundException, DBAppException { // ana fein feh el page
		//System.out.println("index:"+indexiwant);
		//System.out.println("filename"+pagefilename);
		bplustree t=null;
		boolean indexed;
		if(indexName==null)
			indexed=false;
		else {
			indexed=true;
		    t= bplustree.deserializeIndex(table.strTableName+"_"+indexName+".class");
		}

		int position= this.pageNames.indexOf(pagefilename); // makan el page (-1 law page msh mawgooda) 
		System.out.println("position"+position);
		if(position != -1 ) {
		Tuple insertedtuple = null;
		Page deserializedpage = Page.deserializePage(pagefilename);
		if (deserializedpage.getTuples().size()<Page.N) { // lw size a2l mn N hazwd makan ma ana 3ayza wa howa hay-shift lewahdo
			deserializedpage.getTuples().add(indexiwant, row);
		    table.updateHash(pagefilename,deserializedpage);
			if (indexed) {
				t.insert((Comparable) Page.getPKofRow(row.getRowValues(),table.strClusteringKeyColumn), pagefilename);
			    t.serializeIndex(table.strTableName+"_"+indexName+".class");
			}
		    
		    deserializedpage.serializePage(pagefilename); // RETURNED TO DISK 
			table.serializeTable(table.strTableName+".class");
			
			return;
		}
		else {
			
			 insertedtuple = deserializedpage.getTuples().remove( deserializedpage.getTuples().size()-1); //mafrood asheel akher element; wa azwd makan ma ana 3ayza wa howa hy-shift lewahdo
			 deserializedpage.getTuples().insertElementAt(row, indexiwant);
			 if (indexed) {
					t.insert((Comparable) Page.getPKofRow(row.getRowValues(), table.strClusteringKeyColumn), pagefilename); //12
				}
			 table.updateHash(pagefilename,deserializedpage);

		}
		deserializedpage.serializePage(pagefilename); // SHELNA wa7da w da5alna wa7da makanha 
		if(insertedtuple != null) {
	    	//System.out.println("PRINT HERE IN 267");

		boolean done=false;
		for (int i =position +1 ;i< pageNames.size();i++) {
			String current = this.pageNames.get(i); // holds page name 
			Page p= Page.deserializePage(current); // gets page object 
			if(p.getTuples().size()< p.getN()) {
		    	//System.out.println("index shifting old page"+ this.pageNames.get(i-1)+"new page"+current+"level2");

				p.getTuples().insertElementAt(insertedtuple, 0);
				done=true;
			    table.updateHash(current,p);
			    if (indexed) {
			    	//System.out.println("index shifting old page"+ this.pageNames.get(i-1)+"new page"+current+"level3");
					bplustree.shiftKeyPage(t, (Comparable) Page.getPKofRow(insertedtuple.getRowValues(), table.strClusteringKeyColumn), this.pageNames.get(i-1), current);
				    t.serializeIndex(table.strTableName+"_"+indexName+".class");
				}
				updateIndexOnDeletion(this.strTableName, this.pageNames.get(i-1), insertedtuple.getRowValues());
				DBApp.updateIndexAfterInsert(insertedtuple.rowValues,this,current);
			    p.serializePage(current);
			    table.serializeTable(table.strTableName+".class");
				return;
			}
			else {
				Tuple tmp=p.getTuples().remove(p.getN()-1);
				p.getTuples().insertElementAt(insertedtuple, 0);
				if (indexed) {
					bplustree.shiftKeyPage(t, (Comparable) Page.getPKofRow(insertedtuple.getRowValues(), table.strClusteringKeyColumn), this.pageNames.get(i-1), current);
				}
				updateIndexOnDeletion(this.strTableName,this.pageNames.get(i-1) , insertedtuple.getRowValues());
				DBApp.updateIndexAfterInsert(insertedtuple.rowValues,this,current);
			    table.updateHash(current,p);
				insertedtuple= tmp;
			}
			p.serializePage(current);
		}
		
		if(!done) {
			Page newPage = this.addpage(insertedtuple);	
			
			if (indexed) {			    
			    bplustree.shiftKeyPage(t, (Comparable)Page.getPKofRow(insertedtuple.getRowValues(),table.strClusteringKeyColumn),this.pageNames.get(this.getPageNames().size()-2),this.pageNames.get(this.getPageNames().size()-1) );
				
			    t.serializeIndex(table.strTableName+"_"+indexName+".class");

			}
			updateIndexOnDeletion(this.strTableName,this.pageNames.get(this.getPageNames().size()-2) , insertedtuple.getRowValues());
		    DBApp.updateIndexAfterInsert(insertedtuple.rowValues,this,this.getPageNames().get(this.getPageNames().size()-1));
				
		}
		}
		}
		else {
			Page newPage = this.addpage(row);
			if (indexed) {
			    t.insert((Comparable) Page.getPKofRow(row.getRowValues(), table.strClusteringKeyColumn), strTableName+(counter-1)+".class");
			    t.serializeIndex(table.strTableName+"_"+indexName+".class");
			}		
		}
		
	}
	
	public static void updateIndexOnDeletion(String tableName, String pageName, Hashtable<String, Object> valueToDelete)
			throws FileNotFoundException, DBAppException {
		Table t = Table.deserializeTable(tableName + ".class");
		Hashtable<String, String> columnNames = t.getHtblColNameType();
		for (String colName : columnNames.keySet()) {
			if (!(colName.equals(t.getStrClusteringKeyColumn()))) {
			if (DBApp.checkIndexed(colName, tableName)) {
				bplustree index = bplustree.deserializeIndex(tableName + "_" + DBApp.getIndexName(colName, tableName) + ".class");
				index.delete((Comparable) valueToDelete.get(colName), pageName);
				index.serializeIndex(tableName + "_" + DBApp.getIndexName(colName, tableName) + ".class");
			}
		}
		}
	}

	public int binarySearch(ArrayList<String> arr,int l,int r, Object myvalue) // myvalue must be the pk
    { 
		
        if (r >= l)
        { 
            int mid = l + (r - l) / 2; 
 
            // If the element is present at the  middle itself 
            Page p= Page.deserializePage(arr.get(mid));
            Object x= Page.getPKofRow(p.getTuples().get(0).getRowValues(),this.strClusteringKeyColumn);
            if (l == r) 
                return mid; 
 
            // If element is smaller than mid, then  it can only be present in left subarray 
            if (compare(x,myvalue)) {
                return binarySearch(arr, l, mid - 1, x); 
            }
            // Else the element can only be present in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
 
        // We reach here when element is not present  in array 
        return -1; 
    } 
	
	public static  boolean compare(Object o1,Object o2) { //returns lw el awal akbr mn el tany

		if (o1 instanceof Integer)
		{
			return ((Integer) o1 > (Integer ) o2);
		}
		if (o1 instanceof Double)
		{
			return ((Double) o1 > (Double ) o2);
		}
		
			return (   ((String) o1 ).compareTo(   (String) o2 )>0 )   ;
		
	}
	
	
	
	public  void addintoHash(String s, Vector v)
	{
	 hashtablepagenames.put(s,v);
	}
	
	
	public void updateHash(String pagename,Page p) {
		Comparable min=(Comparable) Page.getPKofRow(p.getTuples().get(0).getRowValues(),this.strClusteringKeyColumn);
    	Comparable max= (Comparable) Page.getPKofRow(p.getTuples().get(p.getTuples().size()-1).getRowValues(),this.strClusteringKeyColumn);
		
Vector<Comparable> v= new Vector();
v.add(min);
v.add(max);
	    addintoHash(pagename,v);
	}
	
	public HashSet<Tuple> greaterthan(Comparable clusteringKey,Boolean equal) throws DBAppException{
	    System.out.println("GREATER:)");
		String pagename=Table.binarySearchTable(this.getStrTableName(), clusteringKey);
	    Vector<Integer> v= Page.binarySearch(pagename, clusteringKey, this.getStrClusteringKeyColumn());
	    Page p= Page.deserializePage(pagename);
	    HashSet<Tuple> h= new HashSet<Tuple>();
		int index= this.getPageNames().indexOf(pagename);
	    if(!equal && v.get(0)==1){  // m3andesh equal fa lw equal 1 i dont want to add this row
			if(v.get(1)!=p.getTuples().size()-1)
				v.add(1,v.get(1)+1);
			else { //what if deh akher page  
				if (index+1<=this.getPageNames().size()-1) {
					  v.add(1,0);
					  p= Page.deserializePage(this.getPageNames().get(index+1));
				      index++;
			    }
				else {
					return h;
				}
				
		}
	    }
		for (int j=index; j<this.getPageNames().size();j++) {
			p=Page.deserializePage(this.getPageNames().get(j));
			if (j!=index)
				for (int i =0; i < p.getTuples().size(); i++) {
					h.add(p.getTuples().get(i));
				}
			else
				for (int i = v.get(1); i < p.getTuples().size(); i++) {
					h.add(p.getTuples().get(i));
			    }
	}			
		return h;			
}
// lw msh mawgooda wa >  => habd2 3and v.get(1)
// lw mawgooda wa >  => habd2 3and v.get(1)+1
// lw msh mawgooda wa >=  => habd2 3and v.get(1)
//lw mawgooda wa >=  => habd2 3and v.get(1)



public HashSet<Tuple> lessthan(Comparable clusteringKey,Boolean equal) throws DBAppException{
	//System.out.println("LESS");

    String pagename=Table.binarySearchTable(this.getStrTableName(), clusteringKey);
    Vector<Integer> v= Page.binarySearch(pagename, clusteringKey, this.getStrClusteringKeyColumn());
    Page p= Page.deserializePage(pagename);
	int index= this.getPageNames().indexOf(pagename);
	HashSet<Tuple> h= new HashSet<Tuple>();
	if(!(equal && v.get(0)==1)){  // m3andesh equal fa lw equal 1 i dont want to add this row
		//System.out.println(v.get(1));

		if(v.get(1)!=0) {
			v.add(1,v.get(1)-1);}
		else {
			//what if deh awal page??
			if(index-1>=0) {
		     p= Page.deserializePage(this.getPageNames().get(index-1));
		     v.add(1,p.getTuples().size()-1);
		     index--;
			}
			else
				return h;
		}
	}
	//System.out.println(index + ","+pagename);
	//System.out.println("hii" +v.get(1));
	for (int j=0; j<=index;j++) {
		p=Page.deserializePage(this.getPageNames().get(j));
		if(j!=index)
		for (int i =0; i < p.getTuples().size(); i++) {
			//System.out.println("if" +p.getTuples().get(i));

			h.add(p.getTuples().get(i));
	    }
		else
			for (int i = 0; i <=v.get(1); i++) {
				//System.out.println("else" +p.getTuples().get(i));
				h.add(p.getTuples().get(i));  // do i need to maintain the order?? 
		    }
	}

	return h;			
}
	
	public static void main(String[] args) {
		
		
	}
}


