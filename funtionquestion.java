import java.util.*;


public class funtionquestion {
    public static int sums(int a,int b){
        int sum=a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int s=sums(a,b);
        System.out.println("sum is :-"+s);
        
    }
    
}
