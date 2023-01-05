import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("enter the first number");
       int a= name.nextInt();
        System.out.println("enter the second number");
      int b=  name.nextInt();
        System.out.println("enter the third number");
       int c= name.nextInt();
        System.out.println("enter the fourth number");
       int d= name.nextInt();
        System.out.println("enter the fifth number");
       int e= name.nextInt();

        //Average
        System.out.println("Average of five number is:"+(a+b+c+d+e)/5 );

    }
}
