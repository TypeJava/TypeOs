import java.util.Scanner;
import java.io.IOException;
import java.util.*;

public class App {
    static String username = "";
    static String password = "";

    public static void print(String output) {
        System.out.println(output);
    }

    public static void main(String[] args) throws Exception {
        bootloader();
    }

    public static void bootloader() throws InterruptedException {
        print("Loaded bootloader");
        print("Enter Username: ");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        print("Enter Password: ");
        String password = input.next();
        print("Loading TypeOS!...");
        Load();
    }

    public static void Load() throws InterruptedException {
        print("Loaded TypeOS!");
        print("Welcome to TypeOS!");
        print("Type 'help' for a list of commands");
        print("Type 'exit' to exit TypeOS!");
        print("Type 'login' to login to your account");
        print("Type 'register' to register a new account");
        print("Type 'about' to learn more about TypeOS!");
        print("Type 'help' to see this list of commands again");
        print("Type 'exit' to exit TypeOS!");
        print("Or Type 'boot' to boot into TypeOS!");
        Scanner input = new Scanner(System.in);
        String command = input.next();
        if (command.equals("login")) {
            print("logging in");
        } else if (command.equals("register")) {
            bootloader();
        } else if (command.equals("about")) {
            print("TypeOS is a simple OS designed to be a simple and easy to use OS. Made in java by the TypeJava team.");
        } else if (command.equals("help")) {
            Load();
        } else if (command.equals("exit")) {
            System.exit(0);
        } else if (command.equals("boot")) {
            os.Load();
        } else {
            print("Invalid command");
            Load();
        }
    }

    public class os {
        public static void Load() throws InterruptedException {
            print("Welcome to TypeOS! Please Enter Any Command to continue.");
            Scanner input = new Scanner(System.in);
            String command = input.next();
            if (command.equals("print")) {
                print("Enter Text To Print");
                Scanner text = new Scanner(System.in);
                print(text.nextLine());
                os.Load();

            } else if (command.equals("add")) {
                print("Enter Number 1");
                Scanner nu1 = new Scanner(System.in);
                int num1 = nu1.nextInt();
                print("Enter Number 2");
                Scanner nu2 = new Scanner(System.in);
                int num2 = nu2.nextInt();
                print(Integer.toString(num1 + num2));
            } else if (command.equals("subtract")) {
                print("Enter Number 1");
                Scanner nu1 = new Scanner(System.in);
                int num1 = nu1.nextInt();
                print("Enter Number 2");
                Scanner nu2 = new Scanner(System.in);
                int num2 = nu2.nextInt();
                print(Integer.toString(num1 - num2));
            } else if (command.equals("multiply")) {
                print("Enter Number 1");
                Scanner nu1 = new Scanner(System.in);
                int num1 = nu1.nextInt();
                print("Enter Number 2");
                Scanner nu2 = new Scanner(System.in);
                int num2 = nu2.nextInt();
                print(Integer.toString(num1 * num2));
            } else if (command.equals("divide")) {
                print("Enter Number 1");
                Scanner nu1 = new Scanner(System.in);
                int num1 = nu1.nextInt();
                print("Enter Number 2");
                Scanner nu2 = new Scanner(System.in);
                int num2 = nu2.nextInt();
                print(Integer.toString(num1 / num2));

            } else if (command.equals("desktop")) {
                Process p;
                try {

                    p = Runtime.getRuntime().exec("\"src/rdk/Desktop/desktop.bat\"");
                } catch (IOException e1) {

                    Process e;
                    try {

                        e = Runtime.getRuntime().exec("\"TypeOs/src/rdk/Desktop/desktop.bat\"");
                    } catch (IOException e2) {

                        e2.printStackTrace();
                    }
                }
            } else if (command.equals("flask")) {
                print("Enter Width of the flask: ");
                Scanner nu1 = new Scanner(System.in);
                int num1 = nu1.nextInt();
                print("Enter Height of the flask: ");
                Scanner nu2 = new Scanner(System.in);
                int num2 = nu2.nextInt();
                print("Enter Height of the times to build: ");
                Scanner nu3 = new Scanner(System.in);
                int num3 = nu3.nextInt();
                if (num3 > 5) {
                    print("The minimum times repeat is 5");
                } else {
                    framework.Type.mview.view.Flask(num1, num2, 200, num3);
                }

            } else if (command.equals("flaskoverflow")) {
                print("Enter Width of the flask: ");
                Scanner nu1 = new Scanner(System.in);
                int num1 = nu1.nextInt();
                print("Enter Height of the flask: ");
                Scanner nu2 = new Scanner(System.in);
                int num2 = nu2.nextInt();
                print("Enter Height of the times to build: ");
                Scanner nu3 = new Scanner(System.in);
                int num3 = nu3.nextInt();
                if (num3 < 5) {
                    print("The minimum times repeat is 5");
                } else {
                    framework.Type.mview.view.Flask(num1, num2, 0, num3);
                }

            }
        }
    }
}
