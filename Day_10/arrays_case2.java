package Day_10;
import java.util.*;
public class arrays_case2 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter: ");
        int size= sc.nextInt();
        int[] marks= new int[size];
        
        //Input
        for(int i=0; i<size; i++){
            marks[i]= sc.nextInt();
        }
        
        //Output
        System.out.println("Output:");
        for(int i=0; i<size; i++){
            System.out.println(marks[i]);
        }
    }
}
