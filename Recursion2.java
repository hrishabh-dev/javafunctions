public class Recursion2 {
    // print numbers from 1 to 5 
    public static void Printnum(int n){
        if (n==6){
            return ;
        }
        System.out.println(n);
        Printnum(n+1);;
    }
    public static void main(String[] args) {
        int n=1;
        Printnum(n);
    }
    
}
