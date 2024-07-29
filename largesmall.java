
import java.util.Scanner;
public class largesmall {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int large, small;

        System.out.println("Enter 5 integers:");

        int num = scanner.nextInt();
        large = small = num;
        for (int i = 1; i < 5; i++) {
            num = scanner.nextInt();

            if (num > large) {
                large = num;
            }

            if (num < small) {
                small = num;
            }
        }

        scanner.close();

        System.out.println("The largest number is: " + large);
        System.out.println("The smallest number is: " + small);
    }
}

