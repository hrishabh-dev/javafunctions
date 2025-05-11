public class insertion {
    public static void Printarr(int [] mark){
        for (int i=0;i<mark.length;i++){
            System.out.println(mark[i]);
        }
    }
    public static void main(String[] args) {
        int [] mark={7,8,3,2,1};
        for (int i=1;i<mark.length;i++){
            int current = mark[i];
            int j=i-1;
            while ( j>=0 && current <mark[j]){
                mark[j+1]=mark[j];
                j--;
            }
            mark[j+1]=current;
        }
        Printarr(mark);
    }
    
}
