import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String validUsername = "Coded";
        String validPassword = "Coded123";

        try {
            System.out.println("Enter your username");
            String username = scanner.nextLine();

            System.out.println("Enter your password");
            String password = scanner.nextLine();

            if (!username.equals(validUsername) || !password.equals(validPassword)) {
                throw new Exception("Invalid credentials ");
            }

            System.out.println("login Successful");

        } catch (Exception e) {
//            The e.getMessage gets the desctipion of an error from an exception
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();


    }


}
