package Day_5;

public class patternprob_case2 {
    public static void main(String args[]) {
        /*Problem: *****
                   *   *
                   *   *
                   *****  */
        int n=4;
        int m=5;
        //Outer loop
        for(int i=1; i<=n; i++){
            //Inner loop
            for(int j=1; j<=m; j++){
                if( i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                } else{
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
