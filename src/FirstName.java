import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {
    static boolean isValid(String regex, String userInput)
    {
        return Pattern.compile(regex).matcher(userInput).matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Registration ");
        String firstNamePattern = "^[A-Z]{1}[a-z]{3,25}$";
        System.out.println("Enter firstname:");
        String first_name = sc.next();
        System.out.println("First Name :"+first_name);
        System.out.println(isValid(firstNamePattern, first_name));

    }
}
