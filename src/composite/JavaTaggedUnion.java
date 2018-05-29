/**
 * Java Tagged Union Data Structure Example
 * shows Tagged Union data structures.
 * 
 * A tagged union (also called variant, variant record, discriminated union, or 
 * disjoint union) contains an additional field indicating its current type, 
 * for enhanced type safety.
 *
 * NOTE: I know union types were specifically not included in Java, due to the 
 *       security and type-safety issues. I wanted a complete journal though 
 *       so I added the following.
 *
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 */
package composite;

enum Type {
 // base case the union of two types: 
 BASECASE, //some and none 
 // next case is Either the next case: 
 NEXTCASE, //a, b or t , exception
 // last case type arbitrary types: 
 LASTCASE //right, left or success, failure 
}

public class JavaTaggedUnion {
 Type type;
  
 JavaTaggedUnion(Type type) {
    this.type = type;
 }   
      
 public void getMyType() {
  switch (type) {
   case BASECASE:
    System.out.println("Is there a Base Type?");
    System.out.println("Yes");
    break;                    
   case NEXTCASE:
    System.out.println("What is the Next Type?");
    System.out.println(" Yes - a, b or t, exception");
    break;
   case LASTCASE: 
    System.out.println("What are the last Types?");
    System.out.println("Yes - right, left or "); 
    System.out.println("success, failure");
    break;
   default:
    System.out.println("In Base Type was NONE");
    break;
   }
 }
   
 public static void main(String[] args) {
   JavaTaggedUnion obj1 = new JavaTaggedUnion(Type.NEXTCASE);
   obj1.getMyType();
   JavaTaggedUnion obj2 = new JavaTaggedUnion(Type.LASTCASE);
   obj2.getMyType();
 }
}