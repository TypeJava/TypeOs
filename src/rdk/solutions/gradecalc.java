package rdk.solutions;

import java.util.Scanner;

public class gradecalc {

    public static void startInterface() {

        Scanner input = new Scanner(System.in);

        System.out.println("Grade one: ");
        float gradeOne = input.nextFloat();
        System.out.println();
        System.out.println("Grade two: ");
        float gradeTwo = input.nextFloat();
        System.out.println();
        System.out.println("Grade three: ");
        float gradeThree = input.nextFloat();
        System.out.println();

        System.out.println();
        System.out.println("Final grade: ");
        System.out.println();
        System.out.println(average(gradeOne, gradeTwo, gradeThree));
    }

    public static float average(float one, float two, float three) {

        float combination = one + two + three;

        float average = (one + two + three) / 3;

        return average;
    }
}
