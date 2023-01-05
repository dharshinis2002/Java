import  java.util.Scanner;
public class biggestnum {
    public static void main(String[] args) {
        Scanner name =new Scanner(System.in);
       /* int a=10;
        int b=10;
        int c=9;*/
        System.out.println("enter the first num");
         int  a = name.nextInt();
        System.out.println("enter the second num");
        int b=name.nextInt();
        System.out.println("enter the third num");
        int c=name.nextInt();

        if(a>b&&a>c)
            System.out.println("a is the biggest num");

        else if(c>a&&c<a)
            System.out.println("b is the biggest num");
        else {
            System.out.println("both a,b is the biggest num");
        }


    }

}
