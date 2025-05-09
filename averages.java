import java.util.*;
public class averages {
    
    //1-enter 3 numbers from user and print their average
    public static double aveg(int a,int b, int c){
        double sum=(a+b+c)/3.0;
        return sum;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double x=aveg(a,b,c);
        System.out.println("Average :-"+x);

    }


        
    
    
}
