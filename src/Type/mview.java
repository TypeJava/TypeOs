package framework.Type;

import java.util.*;
import java.lang.*;

public class mview {
    public static void print(String output) {
        System.out.println(output);
    }

    public class view {
        public static void Flask(int width, int hight, int waitTime, int times) throws InterruptedException {
            int s = 0;
            while (s < times) {
                for (int i = 0; i < hight; i++) {
                    for (int j = 0; j < width; j++) {
                        if (i == 0 || i == hight - 1 || j == 0 || j == width - 1) {
                            System.out.print("*");

                        } else {
                            System.out.print(" ");

                        }
                    }
                    Thread.sleep(waitTime);
                    System.out.println();
                }
                s++;

            }
        }

        public static int getRandomNumber(int min, int max) {
            return (int) ((Math.random() * (max - min)) + min);
        }

        public static void printTheNameLeviIn3D(int width, int hight) {
            for (int i = 0; i < hight; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == 0 || i == hight - 1 || j == 0 || j == width - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

}
