import java.util.Scanner;
import java.util.regex.Pattern;

public class Password4 {
    static boolean isValid(String regex, String userInput)
    {
        return Pattern.compile(regex).matcher(userInput).matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Registration ");
        String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[@!#%&_|';:><]).{8,}$";
        System.out.println("Enter password:");
        String password = sc.next();
        System.out.println("Password :"+password);
        System.out.println(isValid(passwordPattern,password));

    }
}
