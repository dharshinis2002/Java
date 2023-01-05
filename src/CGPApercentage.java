import java.util.Scanner;

public class CGPApercentage {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the total sub");
        double sub= in.nextDouble();

        System.out.println("enter the english mark");
        double a= in.nextDouble();

        System.out.println("enter the maths mark");
        double b= in.nextDouble();

        System.out.println("enter the science mark");
        double c= in.nextDouble();

        System.out.println("enter the social mark");
        double d= in.nextDouble();

        System.out.println("enter the gk mark");
        double e= in.nextDouble();

         double CGPA =(a+b+c+d+e)/(5.0);

          double CGPAper =9.5*(CGPA);
        System.out.println("CGPA percentage is:"+CGPAper);


    }
}
