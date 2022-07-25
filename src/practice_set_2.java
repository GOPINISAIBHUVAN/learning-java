class job{
    private String name ;
    private int id ;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class practice_set_2 {
    public static void main(String[] args) {
        job hari = new job();
        hari.setId(545);
        System.out.println(hari.getId());
        hari.setSalary(100000);
        System.out.println(hari.getSalary());
        hari.setName("HARI");
        System.out.println(hari.getName());
    }
}