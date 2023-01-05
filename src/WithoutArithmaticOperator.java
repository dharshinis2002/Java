import java.util.Scanner;

public class WithoutArithmaticOperator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("enter the first num");
        num1=in.nextInt();
        System.out.println("enter the second num");
        num2 =in.nextInt();

       int  sum =num1+num2;
        System.out.println(num1+"+"+num2+"="+sum);

    }
}
