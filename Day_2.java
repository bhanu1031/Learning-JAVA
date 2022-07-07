import java.util.*;
public class Day_2 {
    public static void main(String args[]) {
        //Varibales
        int a=23;
        int b=45;
        int sum=a+b;
        System.out.println(sum);
        String name="Bhanu";
        int age=19;
        Double marks=83.2;
        System.out.println(name);
        System.out.println(age);
        System.out.println(marks);

        //Input
        Scanner sc= new Scanner(System.in);
        //sc.next() will only print one word as it takes only single token
        String name1= sc.next();
        System.out.println(name1);
        //sc.nextLine() will print multiple words
        String name2= sc.nextLine();
        System.out.println(name2);
        //sc.nextInt() used for storing integers
        //sc.nextFloat() used for stroing decimal values

    }
}
