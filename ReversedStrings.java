import java.util.Scanner;
public class ReversedStrings {
    public static void main(String[] args) {
        System.out.print("\n\n Welcome to my reverse string code!!\n\n");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something!");
        int originalStr = scanner.nextInt();

        for (int i = 0; < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("You said:  " + reversedStr);





    }

}
