import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("enter an area");
        double r= n.nextDouble();
        double area=22*r*r/7;
        System.out.println("Area of circle is:"+area);
    }
}
