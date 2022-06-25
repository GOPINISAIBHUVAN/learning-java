import java.util.*;
public class getting_input_from_user {
    public static void main(String[] args) {
        System.out.println("taking input from user:");
        Scanner s = new Scanner(System.in);
//            System.out.println("Enter number 1: ");
//            float b = s.nextFloat();
//            int b = s.nextInt();
//
//            System.out.println("Enter number 1: ");
//             float a = s.nextFloat();
//            int a = s.nextInt();
//            int c = a+b;
//              float c = a+b;
//            System.out.println(c);
//           boolean b1 = s.hasNextInt();
//           System.out.println(b1);
//         String r = s.next(); prints one word of the sentence
        String r = s.nextLine(); // prints whole line given by the user
        System.out.println(r);

    }
}
