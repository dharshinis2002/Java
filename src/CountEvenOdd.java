import java.util.Arrays;

public class CountEvenOdd {
    public static void main(String[] args) {

     int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("odd Numbers:");
        for(int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }

        int b[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("even numbers");
        for (int j=0;j<b.length;j++){
            if(b[j]%2==0){
                System.out.println(b[j]);

            }
        }
    }}