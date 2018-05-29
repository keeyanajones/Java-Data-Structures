/**
 * Java Enumeration example
 * shows how to declare and use primitive enumeration variable inside a 
 * java program.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/

package primitive;

// A simple enum example where enum is declared
// outside any class (Note enum keyword instead of
// class keyword)
enum Color {
    Red, Orange, Yellow,
    Green, Blue, Purple,
    White, Black;
}
 
public class JavaEnumeration { 
 // Driver method
 public static void main(String[] args) {
   Color c1 = Color.Red;
     System.out.println("Value of c1 is : " + c1);
 }
}
