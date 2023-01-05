import java.util.Scanner;
public class SecondstoHourmin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter an seconds");

        int seconds=scanner.nextInt();
        int a=seconds%60;
        int b=seconds/60;
        int c=b%60;
        b=b/60;
        System.out.println(b+":"+c+"="+a);



    }
}
