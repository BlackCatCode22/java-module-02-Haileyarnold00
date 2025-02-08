import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {

        System.out.println("Largest of Three!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your first number:");
        int A = scanner.nextInt();

        System.out.println("Give me your second number:");
        int B = scanner.nextInt();

        System.out.println("Give me your third number:");
        int C = scanner.nextInt();

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest)
                largest = numbers[i];

            System.out.println("Largest number is:" + largest);

;
        }
    }
}