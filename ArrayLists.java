import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<Integer>();
    //add elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);
        list.add(1,123);
        System.out.println(list);
        list.set(2, 5656);
        System.out.println(list);
        list.add(9);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        int size=list.size();
        System.out.println(size);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        // sorting
        Collections.sort(list);
        System.out.println(list);
        
    }

    

    
}
