/**
 * Java Record Data Structure Example
 * shows Record data structures.
 * 
 * Record (also called tuple or structure or struct) is an aggregate data 
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

class JavaRecord {
  private final String userName;
  private final int userID;
  private final int rowID;

  public JavaRecord(String userName, int userID, int rowID) {
    this.userName = userName;
    this.userID = userID;
    this.rowID = rowID;
  }

  public String getUserName() {
    return userName;
  }
  
  public int getUserID() {
    return userID;
  }
  
  public int getRowID() {
    return rowID;
    
  }  
       public static void main(String args[]){ }
}  




