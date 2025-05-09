import java.util.Scanner;

public class oddno {
    //2-write a program to print odd numbers from 1 to n
    public static void odd(int n){
        int i=1;
        for ( i=1;i<=n;i++){
            if (i%2!=0){
                System.out.println(i);
                
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        odd(n);
        sc.close();

        
    }
    
}
