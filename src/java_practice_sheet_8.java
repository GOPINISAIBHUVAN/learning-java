// problem 1
class Employee1{
    int salary;
    public int getSalary(){
        return salary ;
    }
    String name;

    public String getName() {
        return name;
    }
    public String setName(String n){
        name = n ;
        return name;
    }
}
// problem 2
class cellphone{
    public void ringing(){
        System.out.println("ringing...");
    }
    public void silent(){
        System.out.println("silent...");
    }
    public void vibrating(){
        System.out.println("vibrating...");
    }
    public void calculating(){
        System.out.println("calculating...");
    }
    public void calling(){
        System.out.println("calling...");
    }
}
//problem 3
class square{
    int side;
    public int getArea(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}
//problem 4
class rectangle{
    int length;
    int breadth;
    public int getArea(){
        return length*breadth;
    }
    public int getPerimeter(){
        return 2*(length+breadth);
    }
}
// problem 5
class Tommy{
    public void hit(){
        System.out.println("hitting...");
    }
    public void shoot(){
        System.out.println("shooting...");
    }
    public void jump(){
        System.out.println("jumping...");
    }
    public void climb(){
        System.out.println("climbing...");
    }
    public void kill(){
        System.out.println("killing...");
    }
}
// problem 6
class circle{
    float radius;
    public float getArea(){
        return 3.14f*radius*radius ;
    }
    public float getPerimeter(){
        return 4*3.14f*radius;
    }
}
public class java_practice_sheet_8 {
    public static void main(String[] args) {

        // problem 1
Employee1 JAVA_CODER = new Employee1();
JAVA_CODER.name = "BHUVAN";
JAVA_CODER.salary = 45000;
        System.out.println(JAVA_CODER.name);
        System.out.println(JAVA_CODER.salary);
        System.out.println(JAVA_CODER.getSalary());
        System.out.println(JAVA_CODER.getName());
        System.out.println(JAVA_CODER.setName("happy"));

        // problem 2
        cellphone realme = new cellphone();
        realme.calculating();
        realme.ringing();
        realme.calling();
        realme.silent();
        realme.vibrating();

        // problem 3
        square table = new square();
        table.side = 6 ;
        System.out.println(table.side);
        System.out.println(table.getArea());
        System.out.println(table.getPerimeter());

         // problem 4
        rectangle table1 = new rectangle();
        table1.length = 20 ;
        table1.breadth = 10 ;
        System.out.println(table1.length);
        System.out.println(table1.breadth);
        System.out.println(table1.getArea());
        System.out.println(table1.getPerimeter());


        // problem 5
        Tommy vecetti = new Tommy();
        vecetti.climb();
        vecetti.hit();
        vecetti.jump();
        vecetti.kill();
        vecetti.shoot();

        //problem 6
        circle table2 = new circle();
        table2.radius = 6 ;
        System.out.println(table2.radius);
        System.out.println(table2.getArea());
        System.out.println(table2.getPerimeter());
    }
}
