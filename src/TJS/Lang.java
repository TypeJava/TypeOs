//Made By Bio Shot\\
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class App {
    public static void print(String output) {
        System.out.println(output);
    }

    String[] vars;

    public static void main(String[] args) throws Exception {
        File myObj = new File("src/script.jhing");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            if (data.contains("print")) {
                String str = data;
                if (str.contains("[username]")) {
                    str = str.replace("[username]", System.getProperty("user.name"));
                    if (str.contains("/n")) {
                        str = str.replace("/n", "\n");
                        if (str.contains("{ageScanner}")) {
                            print("Enter your age: ");
                            Scanner scanner = new Scanner(System.in);
                            int age = scanner.nextInt();
                            str = str.replace("{ageScanner}", Integer.toString(age));
                            String split[] = str.split("print", 5);
                            for (String s : split) {
                                String spacing = s.replace("-", " ");
                                print(spacing);
                            }

                        } else {
                            String split[] = str.split("print", 5);
                            for (String s : split) {
                                String spacing = s.replace("-", " ");
                                print(spacing);
                            }
                        }
                    } else {
                        if (str.contains("{ageScanner}")) {
                            print("Enter your age: ");
                            Scanner scanner = new Scanner(System.in);
                            int age = scanner.nextInt();
                            str = str.replace("{ageScanner}", Integer.toString(age));
                            String split[] = str.split("print", 5);
                            for (String s : split) {
                                String spacing = s.replace("-", " ");
                                print(spacing);
                            }
                        } else {
                            String split[] = str.split("print", 5);
                            for (String s : split) {
                                String spacing = s.replace("-", " ");
                                print(spacing);
                            }
                        }
                    }

                } else {
                    if (str.contains("/n")) {
                        str = str.replace("/n", "\n");
                        if (str.contains("{ageScanner}")) {
                            print("Enter your age: ");
                            Scanner scanner = new Scanner(System.in);
                            int age = scanner.nextInt();
                            str = str.replace("{ageScanner}", Integer.toString(age));
                            String split[] = str.split("print", 5);
                            for (String s : split) {
                                String spacing = s.replace("-", " ");
                                print(spacing);
                            }
                        } else {
                            String split[] = str.split("print", 5);
                            for (String s : split) {
                                String spacing = s.replace("-", " ");
                                print(spacing);
                            }
                        }
                    } else {
                        if (str.contains("{ageScanner}")) {
                            print("Enter your age: ");
                            Scanner scanner = new Scanner(System.in);
                            int age = scanner.nextInt();
                            str = str.replace("{ageScanner}", Integer.toString(age));
                            String split[] = str.split("print", 5);
                            for (String s : split) {
                                String spacing = s.replace("-", " ");
                                print(spacing);
                            }
                        } else {
                            String split[] = str.split("print", 5);
                            for (String s : split) {
                                String spacing = s.replace("-", " ");
                                print(spacing);
                            }
                        }
                    }

                }

            } else {
                if (data.contains("bool")) {

                }
            }
        }
        myReader.close();
    }

}
