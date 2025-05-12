public class Recursion1 {
    public static void Printrec(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        Printrec(n-1);

    }
    public static void main (String [] args){
        int n=5;
        Printrec(n);

    }
}
