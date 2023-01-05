import java.util.Scanner;
public class IfelseEx2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("enter the first num ");
        int a = obj.nextInt();

        System.out.println("enter the second num");
        int b = obj.nextInt();

        System.out.println("enter the third num");
        int c = obj.nextInt();


        if (c < a&& a > c) {
            System.out.println("a is biggest num");

        } else if (c<b&&b>a) {
            System.out.println("b is the biggest num");

        } else {
            System.out.println("both a,b is the biggest num");
        }


    }}


