import java.util.Scanner;

public class SurfaceAreaofCuboid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the cuboid length");
        double l=in.nextDouble();

        System.out.println("enter the cuboid breadth");
        double b=in.nextDouble();

        System.out.println("enter the cuboid height");
        double h=in.nextDouble();

        // SA=(2*((l*b)+(b*h)+(h*l)))
        double SA=2*(l*b)+(b*h)+(h*l);
        System.out.println("Surface area of cuboid is:"+SA);
    }
}
