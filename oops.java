

class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something on the pen");
    }
    public void printc(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;
    public void info(){
        System.out.println("Your name  is :"+name);
        System.out.println("Your age is :"+age);
        
    }
}


public class oops {
    public static void main(String[] args) {
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        pen pen2=new pen();
        pen2.color="red";
        pen2.type="dot";
        pen1.printc();
        pen2.printc();
        Student student=new Student();
        student.name="Johny";
        student.age=23;
        student.info();
    }
    
}
