import javax.sound.midi.Soundbank;

public class Patten {
    public static void main(String[] args) {
        System.out.println("1");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2");
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("3");
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //logic
                if (j + i >= n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("4");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n + i; j++) {
                    if (j + i >= n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        System.out.println("5");

        }
    }

