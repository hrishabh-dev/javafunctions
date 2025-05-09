import java.util.*;
public class arrayquestion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        int marks[]={1,2,4,6,7};
        for (int i=0;i<5;i++){
            if (inp==marks[i]){
                System.out.println("Number found");
            }
            else{
                System.out.println("Not found");
                
            }
            break;
        }
    }
    
}
