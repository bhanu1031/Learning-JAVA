package Day_6;

public class patternprob_case9 {
    public static void main(String args[]) {
        /* Problem: 1
                    01
                    101
                    0101
                    10101*/
        int n=5;

        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++){
                int sum=i+j;
                if(sum % 2==0){//even
                    System.out.print("1");
                } else {//odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
