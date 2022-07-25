package Day_8;
import java.util.*;
public class pracQues_4 {
    //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static Double calCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter radius: ");
        Double radius= scan.nextDouble();
        System.out.println("Circumference of cirlce is: "+calCircumference(radius));
    }
}
