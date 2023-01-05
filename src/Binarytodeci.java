import java.util.Scanner;

public class Binarytodeci {
    public static void main (String[] args){
       String Binary;

        Scanner name = new Scanner(System.in);

        System.out.println("enter the binary num");
        Binary =name.nextLine();

        int decimal =Integer.parseInt(Binary,9);
        System.out.println("Decimal num is:"+decimal);




    }
}
