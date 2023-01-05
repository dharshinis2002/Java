import java.util.Scanner;

public class Averagemark {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the mark 1");
       int num1=in.nextInt();

        System.out.println("enter the mark 2");
        int num2=in.nextInt();

        System.out.println("enter the mark 3");
        int num3=in.nextInt();

        System.out.println("enter the mark 4");
        int num4=in.nextInt();

        System.out.println("enter the mark 5");
        int num5=in.nextInt();

       int sum=num1+num2+num3+num4+num5;

        int average =sum/5;
        System.out.println("average of mark is:"+average);
    }
}

