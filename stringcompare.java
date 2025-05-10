public class stringcompare {
    public static void main(String[] args) {
        //comparison function
        String a="Hello";
        String b="Welcome";
        if (a.compareTo(b)==0){
            System.out.println("Strings are equal");

        }
        else{
            System.out.println("Strings are not equal");
        }
        // substring function

        String name="Hello welcome peter";
        String s=name.substring(14,name.length());
        System.out.println("Substring :-"+s);
    }

}
