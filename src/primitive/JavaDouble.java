/**
 * Java double example
 * shows how to declare and use primitive double variable inside a java class.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package primitive;

public class JavaDouble {
  public static void main(String[] args) {
    /**
     * double is 64 bit double precision type and used when fractional 
     * precision calculation is required.
     **/
    double d = 1232.44;
    double d1 = 123.4;
    // same value as d1, but in scientific notation
    double d2 = 1.234e2;

    System.out.println("Value of double variable d is : " + d);               
    System.out.println("Value of double variable d1 is : " + d1);               
    System.out.println("Value of double variable d2 is : " + d2);                   
  }
}
