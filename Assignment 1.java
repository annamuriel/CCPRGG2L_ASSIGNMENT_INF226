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
}
