public class Recursion4 {
    public static void Printfac(int i, int n,int f){
        if (i==n){
            f*=i;
            System.out.println(f);
            return;

        }
        f*=i;
        i=i+1;
        Printfac(i, n,f);

    }
    public static void main(String[] args) {
        int f=1;
        Printfac(1, 5,f);
        

    }
    
}
