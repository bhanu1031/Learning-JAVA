package Day_8;
import java.util.*;
public class pracQues_1 {
    //Question: Enter 3 numbers from the user & make a function to print their average.
    public static int calculateAvg(int a, int b, int c) {
        int avg= (a+b+c)/3;
        return(avg);
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        int avg=calculateAvg(a, b, c);
        System.out.println("Average of 3 numbers is: "+avg);
    }
}
