import java.util.Scanner;

public class fibseries {
    //3-fib series
    public static void fib(int n){
        if (n>=0){
            System.out.println(0);
        }
        if (n>=1){
            System.out.println(1);
        }
        int f=0;
        int s=1;
        for (int i=2;i<=n;i++){
            int x=f+s;
            System.out.println(x);
            f=s;   
            s=x;
        }
    }
    public static void main(String[] args) {

        Scanner  sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.close();
        fib(n);

    }
    
}
