import java.util.Scanner;
public class Squareroot {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = num.nextInt();

        double squareroot=Math.pow(number,0.5);
        System.out.println("Square root of integer is" + number+"="+squareroot);

    }
}
