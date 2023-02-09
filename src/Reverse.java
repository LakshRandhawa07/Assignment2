import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        int reverse = 0;
        while (x != 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }
        System.out.println("Reverse of the entered number is " + reverse);
    }
}
