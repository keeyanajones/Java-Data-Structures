/**
 * Java String example
 * shows how to declare and use primitive string variable inside a java class.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package primitive;

public class JavaString {    
  public static void main(String args[]) {                
    int i = 11;               
    float pi =  3.14_15F;
    
    String fs;
    String str = Integer.toString(i);
    String greeting = "Hello world!"; 
    int len = greeting.length();

      System.out.println("int to String : " + i);

      System.out.println("Welcome! " + greeting + 
                       " My Name is Keeyana");
                  
      System.out.printf("Via Print Function: The value of the float " +
                      "variable is %f, while " +
                      "the value of the " + 
                      "integer variable is %d, " +
                      " and the string is %s", 
                      pi, i, str); 
      
      
      fs = String.format("Via String Format: The value of the float " +
                       "variable is %f, while " +
                       "the value of the " + 
                       "integer variable is %d, " +
                       " and the string is %s",
                       pi, i, str);
      
      System.out.println(fs);

    }
}