import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length");
        double l=s.nextDouble();
        System.out.println("enter the breadth");
        double b= s.nextDouble();
        double area =l*b;
        System.out.println("Area of rectangle"+area);

    }

}
