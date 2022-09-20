package Day_7;
import java.util.*;
public class rectarea {
    public static int calculateArea(int l, int b) {
        int area= l*b;
        return(area);
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        int l= scan.nextInt();
        int b= scan.nextInt();
        int product=calculateArea(l, b);
        System.out.println("Area of rectangle is: "+product);
    }
}
