import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        int i=1;
        int y=1;
        while(i<=x){
            y=y*i;

            i++;
        }
System.out.println("Factorial of the entered number is " +y);

    }
}
