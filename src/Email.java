import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {
    static boolean isValid(String regex, String userInput)
    {
        return Pattern.compile(regex).matcher(userInput).matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Registration ");
        String emailPattern = "^[a-zA-Z0-9#%&*_-]+[@][a-zA-Z]+[.][a-z]{2,4}([.][a-zA-Z]{2})*$";
        System.out.println("Enter email-id:");
        String email_id = sc.next();
        System.out.println("Email_Id :"+email_id);
        System.out.println(isValid(emailPattern, email_id));

    }
}
