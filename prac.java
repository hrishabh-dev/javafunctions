import java.util.*;
public class prac {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int input=sc.nextInt();
        ArrayList<Integer> list=new ArrayList <Integer>();
         for (int i=0;i<input;i++){
            int element=sc.nextInt();
            list.add(element);
            

    }
    System.out.println(); 
    
    System.out.println(list);

    int size=list.size();
    System.out.println("Size of array list :-"+size);
    Collections.sort(list);
    System.out.println("Sorted list :-"+list);
    }
    
}
