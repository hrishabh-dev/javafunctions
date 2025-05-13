import java.util.*;;
public class backtrack {
    static int counter =1;

    public static void printPerm(String str,String perm,int idx){

        if (str.length()==0){

            System.out.println(perm+" "+counter);
            counter++;
            return ;

        }

        for (int i=0;i<str.length();i++){

            char x=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);
            printPerm(newstr, perm+x,idx+1);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string :-");
        String str=sc.nextLine();
        printPerm(str, "", 0);
        
    }
    
}
