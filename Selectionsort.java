// selection sorting 

public class Selectionsort {
    public static void Arrprint(int marks[]){
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
   public static void main(String[] args) {
       int marks[]={3,4,5,2,1};
       for (int i=0;i<marks.length-1;i++){
        int smallest=i;
        for (int j=i+1;j<marks.length;j++){
            if (marks[smallest]>marks[j]){
                smallest=j;
            }
        }
        int temp=marks[smallest];
        marks[smallest]=marks[i];
        marks[i]=temp;
       }
       Arrprint(marks);
   }
}
