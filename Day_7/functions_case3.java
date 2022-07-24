package Day_7;
import java.util.*;
public class functions_case3 {
    public static int calculateProduct(int a, int b) {
        int product= a*b;
        return(product);
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int product=calculateProduct(a, b);
        System.out.println("Product of a and b is: "+product);
    }
}
