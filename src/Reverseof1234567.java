public class Reverseof1234567 {
    public static void main(String[] args) {
        int x = 1234567;
        int first = x % 10;
        int second = (x / 10) % 10;
        int third = (x / 100) % 10;
        int forth = (x / 1000) % 10;
        int fifth = (x / 10000) % 10;
        int sixth = (x / 100000) % 10;
        int seventh = (x / 1000000) % 10;
        int y = (first * 1000000) + (second * 100000) + (third * 10000) + (forth * 1000) + (fifth * 100) + (sixth * 10) + (seventh * 1);
        System.out.println(y);
    }
}