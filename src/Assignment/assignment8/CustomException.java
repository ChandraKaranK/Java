package Assignment.assignment8;

import java.util.Scanner;

public class CustomException{

    String username;
    String email;
    String password;

    public void signUp()
    {
        System.out.println("SIGN UP");
        System.out.println("Enter the username:");
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();
        System.out.println("Enter the Email address");
        email = sc.nextLine();
        System.out.println("Enter the Password");
        password = sc.nextLine();

    }

    public boolean isValidEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9+_.-]+[a-zA-Z0-9+.-]+$";
        return email.matches(emailRegex);

    }

    public void validateSignUp() throws InvalidEmailException, InvalidPasswordLength, UsernameEmptyException
    {
        String name = null; // Used to throw null pointer exception
        try {
           // if(name.equals(username))
           //     System.out.println("User name is null"); //throws null pointer exception
            if (username.isEmpty())
                throw new UsernameEmptyException("Username can't be empty");
            if(isValidEmail(email))
                throw new InvalidEmailException("Email is not valid");
            if(password.length()<8)
                throw new InvalidPasswordLength("Choose a proper password with atleast 8 characters");
            }
        catch(Exception e){System.out.println(e);}
        finally
        {
        System.out.println("Executes all the time irrespective of the occurrence of exception");
        }
    }


    public static void main(String []args) throws UsernameEmptyException, InvalidPasswordLength, InvalidEmailException
    {
        CustomException c = new CustomException();
        c.signUp();
        c.validateSignUp();
    }
}
