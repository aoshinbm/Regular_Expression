import java.util.Scanner;
import java.util.regex.Pattern;

public class MultipleEmails {
    static boolean isValid(String regex, String userInput)
    {
        return Pattern.compile(regex).matcher(userInput).matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Registration ");
        String emailidPattern ="^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        System.out.println("Enter email-id:");
        String email_id = sc.next();
        System.out.println("Email_Id :"+email_id);
        System.out.println(isValid(emailidPattern, email_id));

    }
}
