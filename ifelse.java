public class ifelse {
    public static void main (String[] args){
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of even numbers from 1 to 50 is: " + sum);
    }
}
