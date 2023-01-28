import java.util.Scanner;

public class Ques12{
public static void main(String[] args) {
        /*a program to enter the numbers till the user wants and at the
         end the program should display the largest
         and smallest numbers entered.*/
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println(min);
        System.out.println(max);
        while (true) {
        System.out.print("Enter a number or 'done' to stop: ");
        String input = scanner.nextLine();
        //
        if (input.equals("done")) {
        break;
        }
        int num = Integer.parseInt(input);
        min = Math.min(min, num);
        max = Math.max(max, num);
        }
        //here
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        }
        }
