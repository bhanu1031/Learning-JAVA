package Day_5;

public class patternprob_case5 {
    public static void main(String args[]) {
        /* Problem:    *
                      **
                     ***
                    ****
         */
        int n=4;
        //Outer loop
        for(int i=1; i<=n; i++){
            //inner loop -> space print
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            //inner loop -> star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
        }
    }
}