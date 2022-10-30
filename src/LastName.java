import java.util.Scanner;
import java.util.regex.Pattern;
public class LastName {
    static boolean isValid(String regex, String userInput)
    {
        return Pattern.compile(regex).matcher(userInput).matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Registration ");
        String lastNamePattern = "^[A-Z]{1}[a-z]{4,25}$";
        System.out.println("Enter LastName:");
        String last_name = sc.next();
        System.out.println("Last Name :"+last_name);
        System.out.println(isValid(lastNamePattern,last_name));

    }
}
/*          String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";

            String input = "Rajkumar";

            String mobileNumPattern = "^[6-9]{1}[0-9]{9}$";

            String mobileNum = "9164480832";

        }

    }


 */