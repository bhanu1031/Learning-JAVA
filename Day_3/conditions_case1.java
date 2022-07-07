package Day_3;
import java.util.*;
public class conditions_case1 {
//Applying Conditions 
    public static void main(String args[]) {
        //Case 1: User is adult or not
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if (age>18){
            System.out.println("Adult");
        } else{
            System.out.println("Not Adult");
        }

    }
}
