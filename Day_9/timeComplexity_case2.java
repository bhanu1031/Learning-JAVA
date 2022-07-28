package Day_9;
import java.util.*;
public class timeComplexity_case2 {
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=scan.nextInt();
        System.out.print("Enter m: ");
        int m=scan.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("Hello World");
            }
            //Result: Time complexity= O(n*m)
        }
    }
}
