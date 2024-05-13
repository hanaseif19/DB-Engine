package Main;


import java.util.ArrayList;
import java.util.Stack;

public class InfixToPostfix {
    public static int getPriority(String operator) {
        if (operator.equals("AND"))
            return 3;
        else if (operator.equals("OR") )
            return 2;
        else
            return 1;
    }
    public static ArrayList<Object> infixToPostfix(ArrayList<Object> exp) {
        ArrayList<Object> postfix= new ArrayList<>();
       Stack<Object> stack = new Stack<Object>();

        for (int i = 0; i < exp.size(); i++) {
          Object curr=exp.get(i);
            if (!curr.equals("AND") && !curr.equals("OR")&& !curr.equals("XOR")) {
                postfix.add(curr) ;
            } else { 
                if (stack.isEmpty())
                    stack.push(curr);
                else {
                    
                    int currentP = getPriority((String) curr);
                    int stackP = getPriority((String) stack.peek());

                    
                    while (stackP >= currentP) {
                        postfix.add(  stack.pop()); 
                        if (stack.isEmpty())
                            break; 
                        stackP = getPriority((String) stack.peek());
                    }
                  
                    stack.push(curr);
                }
            }
        }
       
        while (!stack.isEmpty())
            postfix .add((String) stack.pop());
        return postfix;
    }

    public static void main(String[] args) {
    	SQLTerm[] arrSQLTerms = new SQLTerm[3];
    	arrSQLTerms[0]=new SQLTerm();  
    	arrSQLTerms[1]=new SQLTerm();
    	arrSQLTerms[2]=new SQLTerm();
    	arrSQLTerms[0]._strTableName = "Student"; 
    	arrSQLTerms[0]._strColumnName= "x";
    	arrSQLTerms[0]._strOperator = "="; 
    	arrSQLTerms[0]._objValue = "5";
    	arrSQLTerms[1]._strTableName = "Student";
    	arrSQLTerms[1]._strColumnName= "y"; 
    	arrSQLTerms[1]._strOperator = "="; 
    	arrSQLTerms[1]._objValue = new Double( 2.0 );
    	arrSQLTerms[2]._strTableName = "Student";
    	arrSQLTerms[2]._strColumnName= "z"; 
    	arrSQLTerms[2]._strOperator = "="; 
    	arrSQLTerms[2]._objValue = new Integer(6);
    	
    	// x=5 or y=2.0 and z=6 
    	String[]strarrOperators = new String[2];
    	ArrayList<Object> all = new ArrayList<Object>();
    	strarrOperators[0] = "OR";
    	strarrOperators[1] = "AND";
    	
    	for(int i=0;i<strarrOperators.length;i++)
    	{
    		if(i==0)
    		{
    		all.add(arrSQLTerms[i]);
    		all.add(strarrOperators[i]);
    		all.add(arrSQLTerms[i+1]);
    		}
    		else
    		{
    			all.add(strarrOperators[i]);
        		all.add(arrSQLTerms[i+1]);
    		}
    	}


     
    }

}