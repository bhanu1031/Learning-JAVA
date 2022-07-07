package Day_3;
import java.util.*;
public class conditions_case3 {
    public static void main(String args[]) {
        //Case 3: Comparison between two numbers (using- elif if)
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a==b){
            System.out.println("a is equal to b");
        } else if(a>b){
            System.out.println("a is greater");
        } else{
            System.out.println("b is greater");
        }
    }
}
