import java.util.Scanner;

public class Addalldigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the num");
        int num= in.nextInt();
        for (int i=0;i<num;i++){
            if (i%num==0) {
            }
            System.out.println("sum of digit :" + i+num);

        }
    }}
