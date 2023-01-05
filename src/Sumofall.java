import java.util.Scanner;

public class Sumofall {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("enter first num");
        int a = name.nextInt();
        System.out.println("enter the second num");
        int b = name.nextInt();
        // addition
        System.out.println("addition of two num:" + a + "+" + b + "=" + (a + b));

        //substraction
        System.out.println("substraction of two num:" + a + "-" + b + "=" + (a - b));
        //mul
        System.out.println("mul of two num:" + a + "*" + b + "=" + (a * b));
        //division
        System.out.println("division of  two num:" + a + "/" + b + (a / b));
        // modulus
        System.out.println("modulus of two num:" + a + "%" + b + (a % b));


    }

}









