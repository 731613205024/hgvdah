/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi8;

/**
 *
 * @author Student
 */
public class Guvi8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String str = "This is an example string.";
        System.out.println("Is this string starts with \"This\"? "
                        +str.startsWith("This"));
        System.out.println("Is this string starts with \"is\"? "
                        +str.startsWith("is"));
        System.out.println("Is this string starts with \"is\" after index 5? "
                        +str.startsWith("is", 5));
}
    }

