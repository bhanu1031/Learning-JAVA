package Day_8;
import java.util.*;
public class pracQues_5 {
    //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static String voteEligible(int age) {
        if(age>18){
            return "Eligible";
        } else{
            return "Not Eligible";
        }
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age= scan.nextInt();
        System.out.println("Status for voting: "+voteEligible(age));
    }
}
