import java.util.*;
public class jav_practice_sheet_3 {
    public static void main(String[] args) {
         //problem 1
        String name = "JAVACODER";
        System.out.println(name.toLowerCase());

        //problem 2
        String replace = " hi my name is java coder";
        System.out.println(replace.replace(" ","_"));

        //problem 3
        System.out.println("Enter Name ");
        Scanner s = new Scanner(System.in);
        String Name =s.nextLine();
        System.out.printf(" \" Dear %s , Thanks a lot \" ",Name);
        System.out.println();

        //problem 4
        String detect = " in this sentence we have  double and   triple spaces";
        System.out.println(detect.indexOf("  "));
        System.out.println(detect.indexOf("   "));

        //problem 5
        System.out.println("\"Dear javacoder, This\tjava\tinformation\tis\tnice.Thanks\"");

    }
}
