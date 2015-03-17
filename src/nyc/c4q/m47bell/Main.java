package nyc.c4q.m47bell;
/* Marbella Vidals
* Access Code 2-1
* March 15, 2015
*/


public class Main {
    public static void main(String[] args) {

        /* .length
        String s = "Hello, World!";
        System.out.println(s.length());
        */

        /*ends with, prints out the character and declares if its present
        System.out.println(s.endsWith("!"));

        System.out.println(
                ("Hello," + "world").endsWith("world!"));
        */

        /* replaces a string NOT change a string
        System.out.println("mesquite in your cellar".replace('e', 'o'));

       //More replace examples
         char fromLetter = 'e';
         char toLetter= 'o';
         String mesq = "pineapple in your basement";
        String newMesq=mesq.replace(fromLetter,toLetter);
        System.out.println(newMesq);
        */


        String s = String.valueOf(42);
        String t = "42";
        System.out.println(t + t); //prints out two t strings together


        String fifteen = "15";
        int x = Integer.valueOf(fifteen);
        System.out.println(x+x);


       char c= 0;
        char z = Character.valueOf(c);






    }
}
