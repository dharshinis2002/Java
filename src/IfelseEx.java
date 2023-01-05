import java.util.Scanner;
public class IfelseEx {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("i am a boy");
        int a = obj.nextInt();

        System.out.println("i am a girl");
        int b = obj.nextInt();

        if (a == 0) {
            System.out.println("boy");
        } else {
            System.out.println("girl");
        }
    }

}