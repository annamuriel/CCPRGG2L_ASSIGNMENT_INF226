import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        testing("Driving Lesson");
        scan.close();
    }

    static void testing(String driving) {

        System.out.println("Driving!");
        test(driving);

        String feedback = getFeedback(driving);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            retakeDriving(driving);

            // Recursive call
            testing(driving);
        } else if (feedback.equals("yes")) {
            pass(driving);
        }
    }


    static void test(String driving) {
        System.out.println("Testing Skills");
    }

    static String getFeedback(String driving) {
        System.out.println("Do you want to practice more? (Enter \"yes\" or \"no\")");
        String feedback = scan.next();
        return feedback;
    }

    static void retakeDriving(String driving) {
        System.out.print("What skills do you want to add:");
        String improved = scan.next();
        System.out.println("Adding Skills. Added " + improved);
    }

    static void pass(String driving) {
        System.out.println("Student passed. Earned a certificate! ");
    }

}