import java.util.Scanner;
public  class Decimaltobinary {

public  static void main(String[] args){


        int decimal;
        Scanner name = new Scanner(System.in);


        System.out.println("enter the decimal num");
        decimal = name.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("decimal num is" + binary);


    }



    }
