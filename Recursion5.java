import java.util.*;

public class Recursion5 {
    // Print the fibonacci sequence till nth term
    public static void printFib(int a, int b, int n){
        if (n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFib(b, c, n-1);

    }
    public static void main(String[] args) {
        System.out.println("--------------Starting fib seires------------------");
        System.out.println("--------------------------------------------");
        System.out.print("Enter the number :-");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("--------------------------------------------");
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b,n-2);
        
        
    }
    
}
