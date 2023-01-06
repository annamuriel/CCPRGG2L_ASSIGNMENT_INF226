import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {

     // Java program to check if a student number is valid
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter student e-mail: ");
    String studentMail = scan.nextLine();

    // Long method
    Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
    Matcher matcher = pattern.matcher(studentMail);

    boolean match = matcher.matches();

    if (match) {
        System.out.println("valid student e-mail");
    } else {
        System.out.println("invalid student e-mail");
    }
    }


    Scanner scan = new Scanner(System.in);
        System.out.print("Enter phone number: ");
    String PhoneNum = scan.nextLine();

    // Long method
    Pattern pattern = Pattern.compile("\\+63\\d{10}");
    Matcher matcher = pattern.matcher(PhoneNum);

    boolean match = matcher.matches();

    if (match) {
        System.out.println("valid phone number");
    } else {
        System.out.println("invalid phone number");
}
}


    Scanner scan = new Scanner(System.in);
        System.out.print("Enter your birthday: ");
        String Birthday = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(Birthday);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid date of birth");
        } else {
            System.out.println("invalid date of birth");
        }
        }
    }

