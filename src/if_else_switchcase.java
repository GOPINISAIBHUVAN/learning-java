import java.util.*;
public class if_else_switchcase {
    public static void main(String[] args) {
        // tax calculation
        System.out.println("Enter your salary :");
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
        float tax = 0.0f;
        if (salary <= 2.5) {
            tax = tax + 0;
        } else if (2.5 < salary && salary <= 5.0) {
            tax = tax + (0.05f * (salary - 2.5f));  // 5% tax
        } else if (5.0 < salary && salary <= 10.0) {
            tax = tax + (0.05f * (5.0f - 2.5f));
            tax = tax + (0.1f * (salary - 5.0f)); // 10% tax
        } else {
            tax = tax + (0.05f * (5.0f - 2.5f));
            tax = tax + (0.1f * (10.0f - 5.0f));
            tax = tax + (0.2f * (salary - 10.0f)); // 20% tax
        }
        System.out.print("The tax that you meed to pay is :");
        System.out.println(tax);

        // pass or fail calculation
        int maths, physics, chemistry;
        Scanner s = new Scanner(System.in);
        System.out.println("enter physics marks");
        physics = s.nextInt();
        System.out.println("enter maths marks");
        maths = s.nextInt();
        System.out.println("enter chemistry marks");
        chemistry = s.nextInt();
        float avg = (maths + physics + chemistry) / 3.0f;
        System.out.print("your avg marks are:");
        System.out.println(avg);
        if (avg > 40 && maths > 33 && physics > 33 && chemistry > 33) {
            System.out.println("you are pass");
        } else {
            System.out.println("you are fail");
            // priniting day
            Scanner y = new Scanner(System.in);
            System.out.println("Enter date :");
            int date = y.nextInt();
            switch (date) {
                case 1 -> System.out.println("MONDAY");
                case 2 -> System.out.println("TUESDAY");
                case 3 -> System.out.println("WEDNESDAY");
                case 4 -> System.out.println("THURSDAY");
                case 5 -> System.out.println("FRIDAY");
                case 6 -> System.out.println("SATURDAY");
                case 7 -> System.out.println("SUNDAY");
            }

            // defining what type of website it is???
            System.out.println("Enter website name :");
            Scanner z = new Scanner(System.in);
            String website = z.nextLine();

            if (website.endsWith(".com")) {
                System.out.println("the website is commercial website");
            }
            if (website.endsWith(".org")) {
                System.out.println("the website is organisation website");
            }
            if (website.endsWith(".in")) {
                System.out.println("the website is indian website");
            }
        }

    }
}






































