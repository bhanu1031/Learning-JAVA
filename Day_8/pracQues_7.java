package Day_8;

public class pracQues_7 {
    //Fibonacci series 
    public static void main(String args[]) {
        int firstTerm=0;
        int secondTerm=1;
        
        for(int i=1;i<=10;i++){
            System.out.println(firstTerm);
            int newTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = newTerm;    
        }  
    }
}
