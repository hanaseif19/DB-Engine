package Pages;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Vector;

public class Page implements Serializable {

	private static final long serialVersionUID = -1758436761679629653L;
	private Vector<Tuple> tuples;
	public static int N;
	
	public Page() {
		tuples = new Vector<Tuple>();	
	}
	
	

	public int getN() {
		return N;
	}



	public static void setN(int n) {
		N = n;
	}

	public String toString() {
	    String output = "My page \n";
	    output += "-------------------------\n";

	    for (Tuple t : tuples) {
	        output += t.toString() + ", ";
	        //output += t.toString() + ",\n";

	    }

	    // Remove the trailing comma and newline character
	    if (!tuples.isEmpty()) {
	        output = output.substring(0, output.length() - 2); // Remove last comma and newline
	    }

	    output += "\n-------------------------\n";
	    return output;
	}

/*
	public String toString() {
		String output="";
		for(Tuple t :tuples) {
			output += t.toString() + ",\n"; 
		}
		
		output = output.substring(0,output.length()-1);
		return output;
	}
	*/
	
	public void serializePage(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this); // Serialize the current Page object
          //  System.out.println("Page serialized successfully.");
        } catch (Exception e) {
            System.err.println("Error serializing page: " + e.getMessage());
        }
    }
	public static Page deserializePage(String fileName) {
		Page p=null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
             p= (Page)ois.readObject(); // deserialize the current Page object
           // System.out.println("Page deserialized successfully.");
        } catch (Exception e) {
            System.err.println("Error deserializing page: " + e.getMessage());
        }
        return p;
    }

	public static Vector<Integer> binarySearch(String pageName, Comparable clusteringKey, String pKColName) {
		if (!pageName.equals("hi")) {
			System.out.println("page" +pageName);
		Page p = Page.deserializePage(pageName);
		//System.out.println("page to delete from inside binary search"+p);
		int leftPointer = 0;
		int rightPointer = p.getTuples().size() - 1;
		boolean found = false;
		int mid = leftPointer + ((rightPointer - leftPointer) / 2);
		Vector<Tuple> tuples = p.getTuples();
		while (leftPointer <= rightPointer) {
			mid = leftPointer + ((rightPointer - leftPointer) / 2);
			Comparable pkValue = (Comparable) (Page.getPKofRow(tuples.get(mid).getRowValues(), pKColName));
			if (pkValue.compareTo(clusteringKey) < 0) {
				leftPointer = mid + 1;
			} else if (pkValue.compareTo(clusteringKey) > 0) {
				rightPointer = mid - 1;
			} else {
				found = true;
				break;
			}
		}
		//System.out.println("Search2 RightPtr:"+rightPointer);
		//System.out.println("Search2 LeftPtr:"+leftPointer);
		Vector v= new Vector<Integer>() ;
		if (rightPointer<0) {
			v.add(0, 0);
			v.add(1, 0);
			return v;
		}
		Comparable pkValue = (Comparable) (Page.getPKofRow(tuples.get(rightPointer).getRowValues(), pKColName));
		
		if (found) {
			v.add(0, 1);
			v.add(1, mid);
		} else if (pkValue.compareTo(clusteringKey) > 0) {
			v.add(0, 0);
			v.add(1, rightPointer);
		} else {
			v.add(0, 0);
			v.add(1, leftPointer);
			
		}
		return v;
		}
		else return (new Vector <Integer>());
	}
	public void insertTuple(Tuple t) {
		tuples.add(t);
	
}
	public static Object getPKofRow(Hashtable<String,Object> h,String tablepk)
	{
		for (String s: h.keySet())
		{
			if (s.equals(tablepk))
			{
				return h.get(s);
			}
			
			
		}
		return null;
	}
	public void insertintopage(Tuple t) {
		
	}
	
	public Vector<Tuple> getTuples() {
		return tuples;
	}



	public void setTuples(Vector<Tuple> tuples) {
		this.tuples = tuples;
	}



	public static void main(String[] args) {
		System.out.println(N);
	}
}



