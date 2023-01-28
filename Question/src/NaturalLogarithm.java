import java.util.Scanner;

public class NaturalLogarithm {
    public static void main(String[] args) {
        /*Compute the natural logarithm of 2, by adding up to n terms in the series
    1-1/2 + 1/3 - 1/4 + 1/5 -... 1/n where n is a positive integer and input by user.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        double log = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                log -= 1.0 / i;
            } else {
                log += 1.0 / i;
            }
        }
        System.out.println("Natural logarithm of 2: " + log);
    }
}
