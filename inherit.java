class shape{
    public void area(){
        System.out.print("Area is :-");
    }
}

class Triangle extends shape {
    public void area(int l, int h){
        double total=(0.5*l*h);
        super.area();
        System.out.println(total);
    }
}

class eqtriangle extends Triangle{
    public void area(int l, int h){
        super.area();
        double total=(0.5*l*h);
        System.out.println(total);
    }
}

public class inherit {
    public static void main(String[] args) {
        Triangle tri=new Triangle();
        tri.area(1,2);
        eqtriangle etri=new eqtriangle();
        etri.area(23,32);
        
    }
    
}


