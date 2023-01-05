import java.util.Arrays;
public class SwapArray {
    public static void main(String[] args) {
        int[] arraynum={14,04,02};
        System.out.println("original array"+Arrays.toString(arraynum));

        int x=arraynum[0];
        arraynum[0]=arraynum[arraynum.length-1];
        System.out.println("Arrays to swap the first and last num:"+Arrays.toString(arraynum));


    }
}
