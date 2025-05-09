import java.util.*;

public class arrayquestion_2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][] numbers=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter number to search in array :");
        int x=sc.nextInt();
        boolean found=false;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (numbers[i][j]==x){
                    System.out.println("Number found at"+"("+i+","+j+")");
                    found=true;
                    break;

                }    
            }
            if (found==true){
                break;
            }
        }
        if (found==false){
            System.out.println("Number not found in array");
        }
            
        
    }

    
}
