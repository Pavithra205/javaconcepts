import java.util.Scanner;

public class fibanociseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n ");
        int n = scanner.nextInt();
        scanner.close();

        int a=0;
        int b=1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for(int i=2;i<n;i++){

                int nextTerm = a + b;
                System.out.print(", " + nextTerm);
                a = b;
                b = nextTerm;

    }
}
}
