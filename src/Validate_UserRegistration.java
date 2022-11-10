import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface Validate{
    String check(String input);
}
public class Validate_UserRegistration {
    public static void main(String[] args) {
        // declare a reference to MyInterface
        // assign a lambda expression to the reference
        //Validation of FirstName
        Validate firstname = (first_name)->{
            String firstNamePattern = "^[A-Z]{1}[a-z]{3,25}$";
            Pattern pattern = Pattern.compile(firstNamePattern);//. represents single character
            Matcher m = pattern.matcher(first_name);
            if(m.matches()){
                return "Valid FirstName ";
            }else {
                return "Invalid FirstName";
            }
        };
        System.out.println(firstname.check("Aoshin"));

        //Validation of LastName
        Validate lastname = (last_name)->{
            String lastNamePattern = "^[A-Z]{1}[a-z]{3,25}$";
            Pattern pattern = Pattern.compile(lastNamePattern);//. represents single character
            Matcher m = pattern.matcher(last_name);
            if(m.matches()){
                return "Valid LastName";
            }else {
                return "Invalid LastName";
            }
        };
        System.out.println(lastname.check("Manjuran"));

        //Validation of Mobile number
        Validate mobile = (mobile_no)->{
            String mobileNumPattern = "^(91)( )[6-9]{1}[0-9]{9}$";
            Pattern pattern = Pattern.compile(mobileNumPattern);//. represents single character
            Matcher m = pattern.matcher(mobile_no);
            if(m.matches()){
                return "Valid Mobile number";
            }else {
                return "Invalid Mobile number";
            }
        };
        System.out.println(mobile.check("789456321"));

        //Validation of Email-Id
        Validate email = (email_id)->{
            String emailPattern = "^[a-zA-Z0-9#%&*_-]+[@][a-zA-Z]+[.][a-z]{2,4}([.][a-zA-Z]{2})*$";
            Pattern pattern = Pattern.compile(emailPattern);//. represents single character
            Matcher m = pattern.matcher(email_id);
            if(m.matches()){
                return "Valid Email-Id";
            }else {
                return "Invalid Email-Id";
            }
        };
        System.out.println(email.check("abc@mail.co"));

        //Validation of Mobile number
        Validate pass = (password)->{
            String passwordPattern = "^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$";
            Pattern pattern = Pattern.compile(passwordPattern);//. represents single character
            Matcher m = pattern.matcher(password);
            if(m.matches()){
                return "Valid Password ";
            }else {
                return "Invalid Password";
            }
        };
        System.out.println(pass.check("#aoshin"));

    }
}
