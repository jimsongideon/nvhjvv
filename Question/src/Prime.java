import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int c=2;
        while(c*c <= n){
            if (n%c==0){
                System.out.println("Not a Prime");
                break;
            }
            c++;
        }
        if (c*c > n){
            System.out.println("Prime");
        }
    }
}
