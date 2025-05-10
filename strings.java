public class strings {
    public static void main(String[] args) {
        String name="Iron";
        String name1="Man";
        String c=name+name1;
        System.out.println("Name :-"+c);

        System.out.println("Length of string is :-"+c.length());

        for (int i=0;i<c.length();i++){
            System.out.println(c.charAt(i));
        }
    }
    
}
