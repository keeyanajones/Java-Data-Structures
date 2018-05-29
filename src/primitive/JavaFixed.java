/**
 * Java fixed example
 * shows how to declare and use primitive fixed variable inside a java class.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package primitive;

import java.math.*;

public class JavaFixed {
  public static void main(String[] args) {
    /**
     * fixed point (BigDecimal) is 32 bit arbitrary precision integer unscaled 
     * value.  
     *   - If zero or positive, the scale is the number of digits to the right 
     *    of the decimal point.      
     *   - If negative, the unscaled value of the number is multiplied by ten 
     *     to the power of the negation of the scale. 
     **/
    BigDecimal a = new BigDecimal("31234"); 
    BigDecimal b = new BigDecimal("215.87");
    // We can also initialize using MathContext.
    MathContext mc = new MathContext(2, RoundingMode.CEILING);
    BigDecimal c = new BigDecimal("215.87", mc); 
    
    System.out.println("Value of fixed variable a is : " + a);                
    System.out.println("Value of fixed variable b is : " + b);                
    System.out.println("Value of fixed variable c is : " + c);                
  }
}
