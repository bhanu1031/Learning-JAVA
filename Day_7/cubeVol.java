package Day_7;
import java.util.*;
public class cubeVol {
    public static int calculateVol(int a) {
        int cubeVol= a*a*a;
        return(cubeVol);
    }
    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        int a= scan.nextInt();
        int cubeVol=calculateVol(a);
        System.out.println("Volume of cube is: "+cubeVol);
    }
}
