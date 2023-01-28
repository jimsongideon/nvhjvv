import java.util.Scanner;

public class Ques14{
    public static void main(String[] args) {
        /*Write a program to print Fibonacci series of n
         terms where n is input by user: 0 1 1 2 3 5 8 13 24.....*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;
        int next;

        System.out.print("Fibonacci series: " + first + " " + second);
//0,1,2 to n-1
        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
