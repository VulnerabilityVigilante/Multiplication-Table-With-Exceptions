import java.util.Scanner;


public class MultWException {
    public static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        //Header
        System.out.println();
        System.out.println();
        
        //Establish Variables
        System.out.print("Enter the base number (bn): ");
        int bn = CONSOLE.nextInt();

        System.out.print("Enter the first number (fn): ");
        int fn = CONSOLE.nextInt();

        System.out.print("Enter the last number (ln): ");
        int ln = CONSOLE.nextInt();

        System.out.print("Enter the increment number (inc): ");
        int inc = CONSOLE.nextInt();

        System.out.print("Enter the multiple(s) to skip (ms): ");
        int ms = CONSOLE.nextInt();

        //Header
        System.out.println();
        System.out.println("- Multiplication Table With Exception -");
        System.out.println();
        System.out.println("Values\tResults");
        
        //The Juicy Stuff
        int i = fn; //set the variable i for the loop equal to the first number
        while (i <= ln) {
            if (i % ms == 0) {
                System.out.println(i + "\t" + "\t" + "-> Skipped - " + i * bn + " <-"); //if i is a multiple of ms, it puts i on the values side and says skipped on the results side
            } else {
                System.out.println(i + "\t" + "\t" + i * bn); //if i is not a multiple of ms, it puts i on the values side and i * the multiplication factor for the results side

            }
            i += inc; //turns i into the next increment needed
        }
        System.out.println();
        System.out.println("Thank you for using this software.");


    }
}












