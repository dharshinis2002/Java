import  java.util.Scanner;
public class Scannertwonumbers {
    public static void main(String[] args) {

        Scanner name=new Scanner(System.in);
        System.out.println("enter the first number");
        int a= name.nextInt();
        System.out.println("enter the second number");
        int b= name.nextInt();

        System.out.println("product of two number:"+a+ "x"+b+"="+a*b);

    }
}
