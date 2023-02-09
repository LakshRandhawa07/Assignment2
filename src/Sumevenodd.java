import java.util.Scanner;

public class Sumevenodd {
    public static void main(String[] args) {
        System.out.println("Please enter the number:");
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        int i=1;
        int sumeven=0;
        int sumodd=0;

        while(i<=x){
            if(i%2==0){
                sumeven=sumeven+i;}
                else {sumodd=sumodd+i;}
                i++;

            }System.out.println("Sum of even numbers "+sumeven);
        System.out.println("Sum of odd numbers " +sumodd);
        }
    }

