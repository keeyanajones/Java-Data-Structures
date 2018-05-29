/**
 * Java integer example
 * shows how to declare and use primitive integer variable inside a java class.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package primitive;

import java.util.*;

public class JavaInteger {
  public static void main(String[] args) {
  /**
   * integer is 32 bit signed type ranges from –2,147,483,648
   * to 2,147,483,647. 
   * NOTE: Integer is also most commonly used integer type in Java.
   **/
    int i = 0;
    int j = 100;
    // byte
    byte b1 = 100;
    byte b2 = 20;
    // The number 26, in decimal
    int decVal = 26;
    // The number 26, in hexadecimal
    int hexVal = 0x1a;
    // The number 26, in binary
    int binVal = 0b11010;
    // short
    short s1 = 50;
    short s2 = 42;
    // long
    long timeInMilliseconds = new Date().getTime();
    long creditCardNumber = 1234_5678_9012_3456L;


    System.out.println("Value of int variable i is : " + i);
    System.out.println("Value of int variable j is : " + j);    
    
    System.out.println("Value of int variable b1 is : " + b1);
    System.out.println("Value of int variable b2 is : " + b2);
    
    System.out.println("Value of int variable decVal is : " + decVal);
    System.out.println("Value of int variable hexVal is : " + hexVal);
    System.out.println("Value of int variable binVal is : " + binVal);
    
    System.out.println("Value of int variable s1 is : " + s1);
    System.out.println("Value of int variable s2 is : " + s2);
    
    System.out.println("Value of int variable timeInMilliseconds is : " + timeInMilliseconds);

    System.out.println("Value of int variable creditCardNumber is : " + creditCardNumber);

  }
}

