import java.util.*;

public class Recursion3 {
    public static void Printsum(int i, int n ,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        i=i+1;
        Printsum(i, n, sum);
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number :");
            int n=sc.nextInt();
            Printsum(1,n, 0);
        
    }
    
}
