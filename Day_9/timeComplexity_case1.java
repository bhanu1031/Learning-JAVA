package Day_9;
import java.util.*;
public class timeComplexity_case1 {
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=scan.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.println("Hello World");
            }
            //Result: worst case= O(n^2)
        }
    }
}
