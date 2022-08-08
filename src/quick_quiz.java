class employee_salary {
    private int salary;

    public employee_salary() {
           salary = 10000;
    }
    public employee_salary(int  p) {
         salary = p ;
    }
    public void setSalary(int n){
        salary = n ;
    }
    public int getSalary(){
        return salary ;
    }

}
public class quick_quiz {
    public static void main(String[] args) {
        employee_salary bhuvan = new employee_salary(19999);
       // bhuvan.setSalary(67000);
        System.out.println(bhuvan.getSalary());
    }
}
