import java.util.Scanner;
public class StringanInteger {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter an integer(String):");
        String s=obj.nextLine();
        int result=Integer.parseInt(s);
        System.out.println("the integer value is :"+result);




    }
}
