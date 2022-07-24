package Day_7;
import java.util.*;
//Problem: Add 2 number and print their sum
public class functions_case2 {
    public static int printSum(int a, int b) {
        int sum= a+b;
        return(sum);
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int sum= printSum(a,b);

        System.out.println("Sum of a and b is: "+sum);
    }
}
