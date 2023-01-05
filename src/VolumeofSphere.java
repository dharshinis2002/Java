import java.util.Scanner;

public class VolumeofSphere {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter the Sphere value");
        double r=in.nextDouble();
        //  formula v=4/3*22/7*r3
        double area =(4*22*r*r*r)/(3*7);
        System.out.println("volume of sphere value is:"+area);
    }
}
