import java.util.Scanner;

public class AreaofCuboid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the length of cuboid");
        double l=in.nextDouble();

        System.out.println("enter the breadth of cuboid");
        double b=in.nextDouble();

        System.out.println("enter the height of cuboid");
        double h=in.nextDouble();

        //V=l*b*h
        double v =l*b*h;

        System.out.println(" volume of cuboid is: "+v);
    }
}
