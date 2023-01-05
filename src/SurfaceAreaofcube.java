import java.util.Scanner;

public class SurfaceAreaofcube {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // lateral surface area=4*a*a

        System.out.println("enter the length of cube");
        double a=in.nextDouble();

        double area=4*a*a;
        System.out.println("Surface area of cube is:"+area);

    }
}
