class employee{
    int id;
    int salary;
    String name;
    public void details(){
        System.out.println("my name is " +name);
        System.out.println("my id is "+id);
    }

    public int  salary() {
        return salary;
    }
}
public class custom_class1 {
    public static void main(String[] args){
    employee java = new employee(); // initialising new object
        employee bhuvan = new employee();
         // setting attributes java
    java.id = 20;
    java.salary = 34000;
    java.name = "JAVA_CODER";
        // setting attributes bhuvan
    bhuvan.id = 19;
    bhuvan.salary = 12000;
    bhuvan.name="BHUVAN";

        System.out.println(java.id);
        System.out.println(java.name);
        java.details();
        bhuvan.details();
        System.out.println(bhuvan.salary);
        System.out.println(java.salary);
    }
}
