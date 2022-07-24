package Day_7;
import java.util.*;
public class factorial {
    public static int calculateFactorial(int a) {
        int factorial=1;
        for(int i=a; i>=1; i--){
            factorial=factorial*i;
        }
        //System.out.println(factorial);
        return(factorial);
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        int factorial=calculateFactorial(a);
        System.out.println("Factorial of a is: "+factorial);
    }
}
