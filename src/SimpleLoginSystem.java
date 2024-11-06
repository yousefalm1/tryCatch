import java.util.Scanner;

public class SimpleLoginSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String validUsername = "Coded";
        String validPassword = "Coded123";

        boolean userIsAuthenticated = false;


        for (int attempts = 1; attempts <= 5; attempts++) {
            try {
                System.out.println("Enter your username");
                String username = scanner.nextLine();

                System.out.println("Enter your password");
                String password = scanner.nextLine();

                if (!username.equals(validUsername) || !password.equals(validPassword)) {
                    if (attempts == 5) {
                        throw new Exception("Maximum attempts exceeded");
                    } else {
                        throw new Exception("Invalid credentials please try again");
                    }
                }
                userIsAuthenticated = true;
                System.out.println("login Successful");

            } catch (Exception e) {
//            The e.getMessage gets the desctipion of an error from an exception
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        scanner.close();


    }


}
