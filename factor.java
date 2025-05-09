import java.util.*;

public class factor {
    public static int fact(int n){
        int b=1;
        for (int i=n;i>=1;i--){
            b=b*i;
        }
        int f=b;
        return f;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=fact(n);
        System.out.println("factorial is :-"+f);
    }
    
}
