import java.util.Scanner;

public class VolumeofCone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //V=22*r*r*h/3*7

        System.out.println("enter the radius of cone");
        double r=in.nextDouble();

        System.out.println("enter the height of cone");
        double h=in.nextDouble();

        double v=22*r*r*h/3*7;
        System.out.println("volume of cone is :"+v);
    }
}
