import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the width of triangle");
        double b=s.nextDouble();
        System.out.println("enter the height of triangle");
        double h=s.nextInt();

        double area=b*h/2;
        System.out.println("Area of triangle:"+area);
        }
    }

