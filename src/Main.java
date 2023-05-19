import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String username, password, newPassword, choose, userPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        username = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();

        userPassword = "tuce123";

        if (username.equals("tuceoz") && password.equals(userPassword)) {
            System.out.print("Login successful!");
        } else {
            System.out.println("Username or password wrong. Please try again.");
            System.out.print("Would you like to reset your password? (Yes = 1, No = 2) : ");
            choose = input.nextLine();
            if (choose.equals("1")) {
                System.out.print("Please enter your new password: ");
                newPassword = input.nextLine();
                if (newPassword.equals(userPassword)){
                    System.out.print("Your password cannot be the same as your previous password. Please try again.");
                }
                else {
                    System.out.print("Your password has been changed.");
                }
            } else {
                System.out.print("Try logging into your account again.");
            }
        }
    }
}