import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumber {
    static boolean isValid(String regex, String userInput)
    {
        return Pattern.compile(regex).matcher(userInput).matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Registration ");
        String mobileNumPattern = "^(91)( )[6-9]{1}[0-9]{9}$";
        //^(91)( )[6-9]{1}[0-9]{9}$
        System.out.println("Enter mobile number:");
        String mobile = sc.next();
        System.out.println("Mobile Number :"+mobile);
        System.out.println(isValid(mobileNumPattern, mobile));

    }
}
