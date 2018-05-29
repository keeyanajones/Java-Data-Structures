/**
 * Java character example
 * shows how to declare and use primitive character variable inside a java 
 * class.
 * 
 * @author Keeyana Jones <keeyanajones@yahoo.com>
 * 
 **/
package primitive;

public class JavaCharacter {
  public static void main(String[] args) {
    /**
     * char is 16 bit type and used to represent Unicode characters.
     * Range of char is 0 to 65,536.
     **/       
    char capitalC = 'C';
    char ch1 = 'a';
    char ch2 = 65; /* ASCII code of 'A'*/

    System.out.println("Value of char variable capitalC is : " + capitalC);   
    System.out.println("Value of char variable ch1 is : " + ch1);   
    System.out.println("Value of char variable ch2 is : " + ch2);             
  }
}

