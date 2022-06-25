import java.util.*;
public class string_methods {
    public static void main(String[] args) {
        System.out.println("enter marks of the student");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        int mark1 = 5 - (mark%5);
        int mark2 = mark+mark1;
        if( mark1<3){
            System.out.println("Student got"+mark+"marks" );
        }
        else{
            System.out.println("Student got"+mark2+"marks");
        }
    }
}
