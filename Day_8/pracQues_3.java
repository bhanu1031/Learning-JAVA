package Day_8;
import java.util.*;
public class pracQues_3 {
    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static int greaterAmong2(int a, int b) {

        if(a>b){
            return a;
        } else{
            return b;
        }

    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a= scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int b= scan.nextInt();
        System.out.println("Greatest number is: "+greaterAmong2(a, b));
    }
}
