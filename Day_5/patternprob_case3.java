package Day_5;

public class patternprob_case3 {
    public static void main(String args[]) {
        /*Problem: *
                   **
                   ***
                   **** 
         */
        int n=4;
        //outer loop
        for(int i=1; i<=n; i++){
            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
