package Day_5;

public class patternprob_case6 {
    public static void main(String args[]) {
        /*Problem: 1
                   12
                   123
                   1234
                   12345
         */
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
