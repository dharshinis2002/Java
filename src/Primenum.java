public class Primenum {
    public static void main(String[] args) {
        int count;

        System.out.println("1 to 100 primenumbers");
            int sum =0;
            for (int i = 2; i <= 100; i++) {
            count = 0;

            for (int j = 1; j <= 100; j++) {
            if(i%j==0) {
                count++;
            }
            }
             if(count==2){
                System.out.println(i);
              sum=sum+i;
            }
        }

        System.out.println("sum of first 1 to 100 primenum:"+sum);
    }

}