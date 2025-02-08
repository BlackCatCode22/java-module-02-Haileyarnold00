
import java.util.Scanner;

public class madnessWithMethods {
    public static void main(String[] args) {

        System.out.println("Welcome to madness with Methods!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your first int:");
        int intA = scanner.nextInt();

        System.out.println("Give me your second int:");
        int intB = scanner.nextInt();

        System.out.println(intA == intB);


        double sum = intA + intB;

        System.out.println("Sum of " + intA + " and " + intB + " equals " + sum);





    }


}