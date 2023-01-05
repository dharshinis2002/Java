import java.util.Scanner;
public class Comparetwonum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("enter the first num");
        int a = obj.nextInt();
        System.out.println(" enter the sec num");
        int b = obj.nextInt();

        if (a == b) {
            System.out.println("a,b is equals");

        }
        if (a != b) {
            System.out.println("a,b not equals");

        }
        if (a < b) {
            System.out.println("b is the biggest num");
        }
        if (a > b) {
            System.out.println("a is the biggest num");

        }
        if (a >= b) {
            System.out.println("a,b is equals or a is biggest num ");
        }
        if (a <= b) {
            System.out.println("a,b is equals or b is biggest num");

        }

    }
}