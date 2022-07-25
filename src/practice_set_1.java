class bhuvan {
    String name;
    int id;
    int salary;
}
class hari{
    String name;
    int id;
    int salary;
}
public class practice_set_1 {
    public static void main(String[] args) {
          bhuvan details = new bhuvan();
          details.id = 17;
          details.name = "bhuvan";
          details.salary = 100000;
        System.out.println(details.id);
        System.out.println(details.salary);
        System.out.println(details.name);
        hari details1 = new hari();
        details1.id = 16;
        details1.salary = 100000;
        details1.name = "hari";
        System.out.println(details1.id);
        System.out.println(details1.name);
        System.out.println(details1.salary);
    }
}
