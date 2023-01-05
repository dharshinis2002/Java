import java.util.Scanner;

  public class SwitchEx {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
       // System.out.println("enter the day");
      //  name.nextLine();
        String day = "Tuesday";


        switch (day){

                case "Sunday":
                System.out.println(1);
                break;
                case "Monday":
                System.out.println(2);
                break;
                case "Tuesday":
                System.out.println(3);
                break;
                case "Wednesday":
                System.out.println(4);
                break;
                case "Thursday":
                System.out.println(5);
                break;
                case "Friday":
                System.out.println(6);
                break;

            case"Saturday" :
                System.out.println(7);
                break;


    }

}}
