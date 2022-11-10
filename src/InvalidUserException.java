import java.util.regex.Matcher;
import java.util.regex.Pattern;

//custom exception by creatting a class that extends it with exception
public class InvalidUserException extends Exception {
    //parameter constructor
    String message;
    InvalidUserException(String message) {
        //passing the parameter to the super class constructor
        super(message);
        this.message = message;
    }
    @Override
    public String toString() {
        return "InvalidUserException{" +
                "message='" + message + '\'' +
                '}';
    }
}
class UserDetails{
    static boolean isValidFirstName(String first_name) throws InvalidUserException {
        String firstNamePattern = "^[A-Z]{1}[a-z]{3,25}$";
        Pattern pattern = Pattern.compile(firstNamePattern);//. represents single character
        Matcher m = pattern.matcher(first_name);
        if(m.matches()){
            System.out.println("Valid FirstName Input");
        }else {
            throw new InvalidUserException("Invalid User Detail Exception");
        }
        return m.matches();
    }
    static boolean isValidLastName(String last_name) throws InvalidUserException {
        String lastNamePattern = "^[A-Z]{1}[a-z]{3,25}$";
        Pattern pattern = Pattern.compile(lastNamePattern);//. represents single character
        Matcher m = pattern.matcher(last_name);
        if(m.matches()){
            System.out.println("Valid LastName Input");
        }else {
            throw new InvalidUserException("Invalid User Detail Exception");
        }
        return m.matches();
    }
    static boolean isValidMobile(String mobile_no) throws InvalidUserException {
        String mobileNumPattern = "^(91)( )[6-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(mobileNumPattern);//. represents single character
        Matcher m = pattern.matcher(mobile_no);
        if(m.matches()){
            System.out.println("Valid Mobile Number Input");
        }else {
            throw new InvalidUserException("Invalid User Detail Exception");
        }
        return m.matches();
    }
    static boolean isValidEmail(String email_id) throws InvalidUserException {
        String emailPattern = "^[a-zA-Z0-9#%&*_-]+[@][a-zA-Z]+[.][a-z]{2,4}([.][a-zA-Z]{2})*$";
        Pattern pattern = Pattern.compile(emailPattern);//. represents single character
        Matcher m = pattern.matcher(email_id);
        if(m.matches()){
            System.out.println("Valid Email-Id Input");
        }else {
            throw new InvalidUserException("Invalid User Detail Exception");
        }
        return m.matches();
    }
    static boolean isValidPassword(String password) throws InvalidUserException {
        String passwordPattern = "^(?=.{8,}$)(?=.*\\d)(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$";
        Pattern pattern = Pattern.compile(passwordPattern);//. represents single character
        Matcher m = pattern.matcher(password);
        if(m.matches()){
            System.out.println("Valid Password Input");
        }else {
            throw new InvalidUserException("Invalid User Detail Exception");
        }
        return m.matches();
    }

    public static void main(String[] args) {
        System.out.println("User Registration ");
        //Check First Name
        try {
            isValidFirstName("Aoshin");
            isValidFirstName("Aos");
        } catch (Exception e) {
            System.out.println("Invalid FirstName");
        }
        //Check Last Name
        try {
            isValidLastName("Manjuran");
            isValidLastName("Ma");
        } catch (Exception e) {
            System.out.println("Invalid LastName");
        }
        //Check Mobile Number
        try {
            isValidMobile("91 789456123");
            isValidMobile("45618923");
        } catch (Exception e) {
            System.out.println("Invalid Mobile Number!!");
        }
        //Check Email
        try {
            isValidEmail("abc.xyz@bl.co.in");
            isValidEmail("a@ail.com");
        } catch (Exception e) {
            System.out.println("Invalid Email-Id!!");
        }
        //Check Password
        try {
            isValidPassword("#28Aoshin");
            isValidPassword("#aoshin");
        } catch (Exception e) {
            System.out.println("Invalid Password!!");
        }

    }
}