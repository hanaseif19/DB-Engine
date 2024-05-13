package Pages;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Objects;


public class Tuple implements Serializable{
	 private static final long serialVersionUID = 1L;
	Hashtable<String, Object> rowValues=new Hashtable<String,Object>(); //string is for column name and the object is for the value of the column name
	
	public Tuple(Hashtable<String, Object>  x){
		rowValues.putAll(x);
	}
	public String toString() {
		//if tuple consist of name="Ahmed", age=20, address="Zamalek". //Calling toString() returns "Ahmed,20,Zamalek".
		String res="";
		for(Object o : rowValues.values()) {
			res+= o.toString()+",";
		}
		res=res.substring(0,res.length()-1);
		return res;
	}
	
	@Override
    public boolean equals(Object obj) {
    return this.toString().equals(((Tuple)(obj)).toString());
    }
	@Override
	 public int hashCode() {
	        return Objects.hash(rowValues);
	    }
	
	public Hashtable<String, Object> getRowValues() {
		return rowValues;
	}
	public void setRowValues(Hashtable<String, Object> rowValues) {
		this.rowValues = rowValues;
	}
	public static void main(String[] args) {
		File x=new File("/Users/hana/Downloads/newFile.txt");
		 try (FileWriter writer = new FileWriter(x)) {
	            writer.write("hi");
	            System.out.println("Metadata file created successfully at " + "Users/hana/Downloads");
	        } catch (IOException e) {
	            System.out.println("An error occurred while writing in the metadata file.");
	            e.printStackTrace();
	        }
	
	
	
	}
}