import java.util.regex.Pattern;
public class Main {
        static boolean validate(String regex, String input) {
            return Pattern.compile(regex).matcher(input).matches();
        }

        public static void main(String[] args) {

            // Pattern
            // binary
            String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";

            // Input
            // binary
            String input = "Rajkumar";

            String mobileNumPattern = "^[6-9]{1}[0-9]{9}$";

            String mobileNum = "9164480832";

            System.out.println(validate(firstNamePattern, input));

            System.out.println(validate(mobileNumPattern, mobileNum));

        }

    }