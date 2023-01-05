import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter any char");

        char c =in.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
            System.out.println("vowel char is:" + c);

        }else {
            System.out.println("consonant char is:"+c);

        }


    }

}
