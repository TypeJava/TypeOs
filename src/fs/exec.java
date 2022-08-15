//Made By Bio Shot \\
package fs;

import java.util.ArrayList;
import java.util.List;

public class exec {
    public static void print(String output) {
        System.out.println(output);
    }

    public static void executeFile(String exec) {
        if (exec == "boot" || exec == "help" || exec == "login" || exec == "about" || exec == "register"
                || exec == "exit" || exec == "print" || exec == "add" || exec == "subtract" || exec == "multiply"
                || exec == "divide" || exec == "exec") {
            print("Invalid Command");
        } else {
            print("Valid Command");

        }

    }
}
