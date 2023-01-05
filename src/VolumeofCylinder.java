import java.util.Scanner;

public class VolumeofCylinder {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

   //     V=22*r*r*h/7

        System.out.println("enter the radius");
        double r=in.nextDouble();

        System.out.println("enter the height");
        double h =in.nextDouble();

      double  area =22*r*r*h;
        System.out.println("volume of cyclinder is:"+area);
    }
}
