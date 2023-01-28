public class Ques13{
    public static void main(String[] args) {
        /*Write a program to print out all Armstrong
        numbers between 1 and 500. If sum of cubes of each
        digit of the number is equal to the number itself,
        then the number is called an Armstrong number.*/
        for (int i = 1; i <= 500; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " is an Armstrong number");
            }
        }

               // static int a=0 ->special
        //a=10
    }

    public static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit * lastDigit * lastDigit;
            num /= 10;
        }
        return sum == originalNum;
    }
}
