package Day_7;
import java.util.*;
public class factorialRecursion {
    static int factorial(int n){
    if(n == 0){
        return 1;
    }
    return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=scan.nextInt();
        System.out.println("Factorial of the number 5 is: "+factorial(n));
    }
}
