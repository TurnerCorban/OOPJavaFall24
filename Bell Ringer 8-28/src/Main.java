import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Please Enter 3 real numbers");
        System.out.println("Num 1:");
        int num1 = in.nextInt();
        System.out.println("Num 2:");
        int num2 = in.nextInt();
        System.out.println("Num 3:");
        int num3 = in.nextInt();
        double avg = (double) (num1 + num2 + num3) /3;
        System.out.println("The average is " + avg);
    }
}