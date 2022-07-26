package Day_4;

public class for_loop {
    public static void main(String args[]) {
        for (int counter=0; counter<3; counter=counter+1){
            System.out.println("Hello World");
        }
        //To print numbers from 1-10
        for (int count=1; count<11; count=count+1){
            System.out.println(count);
        }
        //To print sum of n numbers
        int n=6;
        int sum=0;
        for(int i=1; i<=n; i=i+1){
            sum=sum+i;
        }
        System.out.println(sum);

        //To print table of 3
        int m=3;
        for (int x=m; x<=m*10; x=x+m){
            System.out.println(x);
        }

    }
}
