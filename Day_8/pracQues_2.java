package Day_8;
import java.util.*;
public class pracQues_2 {
    //Question: Write a function to print the sum of all odd numbers from 1 to n.
    public static int sumOfOddNum(int n) {
        int sum=1;
        
        for( int i=1; i<=n; i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scan.nextInt();
        int sum= sumOfOddNum(n);
        System.out.println(sum-1);
    }
}
