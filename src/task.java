import java.util.Scanner;



public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        double inputtedDouble;
        String trash;
        Boolean done = false;
        // outputs
        do {
            System.out.println("Please enter a number");
            if (in.hasNextDouble()) {

                inputtedDouble = in.nextDouble();
                done = true;
            }
        }
            while (done == false) ;
            if (inputtedDouble == 0) {
                System.out.println("Zero");
            }
            if (inputtedDouble >= 0) {
                System.out.println("Positive");
            }
            if (inputtedDouble <= 0) {
                System.out.println("Negative");
            }
            if (inputtedDouble >= 1||-1)
    }
}