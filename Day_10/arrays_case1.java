package Day_10;

public class arrays_case1 {
    public static void main(String args[]) {
        int[] marks= new int[3];
        marks[0]= 98; //physics
        marks[1]= 97; //maths
        marks[2]= 96; //chem
        System.out.println(marks[1]);
        //or we can also use for loop too print all elements.
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
            }
    }
}
