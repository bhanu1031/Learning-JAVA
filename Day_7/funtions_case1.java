package Day_7;
import java.util.*;
//Problem: Print name
public class funtions_case1 {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        String name= scan.nextLine();
        printMyName("My name is "+ name);
    }
}
