import java.util.Scanner;

public class AreaofParellelogram {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("enter the height");
        double d1=in.nextDouble();

        System.out.println("enter the breadth");
        double d2=in.nextDouble();

        double area=d1*d2;
        System.out.println("area of parellelogram is:"+area);
    }
}
