/**
 * Java Tuple Data Structure Example
 * shows Tuple data structures.
 * 
 * Tuple (also called record or structure or struct) is an aggregate data 
 * structure. A record is a value that contains other values, typically in 
 * fixed number and sequence and typically indexed by names. The elements of 
 * records are usually called fields or members. 
 * 
 * NOTE: In its simplest form, not in a try block, no database connection, no
 *       sql statements, catch or exceptions.  
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */

package composite;

public class JavaTuple {    
// data in an instance 
  private String userName;
  private int userID;
  private int rowID;
  
 public void setUserName(String data) {
    userName = data;
  } 
 
  public void setUserID(int data) {
    userID = data;
  }
  
  public void setRowID(int data) {
    rowID = data;
  }
  
  public String getUserName() { return userName; }
  public int getUserID() { return userID; }
  public int getRowID() { return rowID; }  
  
       public static void main(String args[]){ }
}



