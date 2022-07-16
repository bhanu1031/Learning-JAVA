package Day_6;

public class patternprob_case7 {
    public static void main(String args[]) {
        /*Problem: 12345
                   1234
                   123
                   12
                   1
         */
        int n=5;
        for(int i=1; i<=n; i++){
            
            for(int j=1; j>=n; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
