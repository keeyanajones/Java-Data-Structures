/**
 * Java Structure Data Structure Example
 * shows structure data structures.
 * 
 * Structure (also called record or tuple or struct) is an aggregate data 
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

class JavaStructure {
  String userName;
  int userID;
  int rowID;

  public void setUserName(String data) {
    this.userName = data;
  } 
  
  public void setUserID(int data) {
    this.userID = data;
  }
  
  public void setRowID(int data) {
    this.rowID = data;
  }
  
  public String getUserName() { return userName; }
  public int getUserID() { return userID; }
  public int getRowID() { return rowID; }  
    public static void main(String args[]){ }
}       
