import java.util.Scanner;


public class Electricitybill {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the units");
        int unit =in.nextInt();
        int amount =0;

        if(unit<=100){
            amount=unit*5;
            System.out.println("bill amount is:"+amount);
        }
       else if(unit>=101&&unit<=200){
            amount=100*5*(unit-100)*7;
            System.out.println("bill amount is :"+amount);

        }
       else if(unit>=201&&unit<=300){
           amount=100*5*200*7+(unit-200)*10;
            System.out.println("bill amount is:"+amount);

        }
       else {
           amount=100*5*200*7+(unit-200)*10;
            System.out.println("");
        }

    }

}
