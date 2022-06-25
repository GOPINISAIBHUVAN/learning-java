import java.util.*;

public class exercise_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = s.nextLine();
        System.out.println("Enter marks of sub1:");
        float sub1 = s.nextFloat();
        System.out.println("Enter marks of sub2:");
        float sub2 = s.nextFloat();
        System.out.println("Enter marks of sub3:");
        float sub3 = s.nextFloat();
        System.out.println("Enter marks of sub4:");
        float sub4 = s.nextFloat();
        System.out.println("Enter marks of sub5:");
        float sub5 = s.nextFloat();
        System.out.println("total marks:");
        float total = sub1+sub2+sub3+sub4+sub5;
        System.out.println(total);
        System.out.println("percentage got by student " + name + " :");
        float perc = (total*100/500);
        System.out.println(perc);
    }
}
