import java.util.Scanner;

public class Compoundinterest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("enter the principle");
        double p=in.nextDouble();

        System.out.println("enter the rate");
        double r=in.nextDouble();

        System.out.println("enter the time");
        double t=in.nextDouble();

        System.out.println("enter the numbers of compound that interest per unit t");
        double n=in.nextInt();

        //calculated the compound interest
        double amound=p* Math.pow(1+(r/n),n*t);
        double interest =amound-p;

        System.out.println("compound interest is:"+interest);
    }
}