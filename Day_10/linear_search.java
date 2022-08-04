package Day_10;
import java.util.*;
public class linear_search {
    /*Problem: Take an array as input from the user. Search for a given number x and
        print the index at which it occurs.*/
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int  size= sc.nextInt();
        int[] marks= new int[size];
        
        //Input for array
        System.out.println("Array Input:");
        for(int i=0; i<marks.length; i++){        //we can either marks.length or size variable
            marks[i]= sc.nextInt();
        }

        int x= sc.nextInt();

        //Output
        System.out.println("Output");
        for(int i=0; i<marks.length; i++){
            if(marks[i]==x){
                System.out.println("x found at: "+ i);
            }
            System.out.println(marks[i]);
        }
    }
}
