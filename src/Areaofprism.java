import java.util.Scanner;

public class Areaofprism {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the base");
        double b=in.nextDouble();

        System.out.println("enter the height");
        double h=in.nextInt();

        double area =b*h;
        System.out.println("Area of prism is"+area);

        }

    }

