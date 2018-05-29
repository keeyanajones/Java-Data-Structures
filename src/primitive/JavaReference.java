/**
 * Java Reference example
 * shows how to declare and use primitive reference variable inside a 
 * java program.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package primitive;

  class Reference {
    double length;
    double breadth;
  }

public class JavaReference {     
  public static void main(String args[]) {    
  // r1 is reference variable which contain 
  // the address of Actual Reference Object.
  Reference r1 = new Reference();
      
  // r2 is another reference variable
  // r2 is initialized with r1 means:
  // r1 and r2 both are referring same object 
  // thus it does not create duplicate object 
  // nor does it allocate extra memory.
  Reference r2 = r1;
    
  r1.length = 10;
  r2.length = 20;
    
  System.out.println("Value of R1's Length : " 
                     + r1.length);
  System.out.println("Value of R2's Length : " 
                     + r2.length);

  }
}    

