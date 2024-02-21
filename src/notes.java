import java.util.Scanner;



public class notes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // variables
        double myDouble;
        String trash;
        boolean done = false;

        System.out.println("Please type in a double");

        do {
            System.out.println("Please type in a double");
            if (in.hasNextDouble()) {

                myDouble = in.nextDouble();
                break;

            } else {

                trash = in.nextLine();
                System.out.println("Please enter numbers only.");

            }

        } while (true);
    }
}
