import java.util.Scanner;
public class postive {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int pc = 0;
            int nc = 0;
            int ps = 0;
            int ns= 0;

            System.out.println("Enter 10 integers:");

            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();

                if (num > 0) {
                    pc++;
                    ps += num;
                } else if (num < 0) {
                    nc++;
                    ns += num;
                }
            }

            scanner.close();

            System.out.println("Number of positive integers: " + pc);
            System.out.println("Number of negative integers: " + nc);
            System.out.println("Sum of positive integers: " + ps);
            System.out.println("Sum of negative integers: " + ns);
        }
    }


