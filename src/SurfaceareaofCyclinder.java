import java.util.Scanner;

public class SurfaceareaofCyclinder {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
       // SC=(2*22*r)/7)*(r+h)

        System.out.println("enter the radius value of Cyclinder");
        double r=in.nextDouble();

        System.out.println("enter the height value ");
        double h=in.nextDouble();

        double v=((2*22*r)/7)*(r+h);
        System.out.println("Surface area of Cyclinder is:"+v);



    }
}
