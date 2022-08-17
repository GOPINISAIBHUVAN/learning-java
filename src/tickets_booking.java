import java.util.*;
public class tickets_booking {
    public static void main(String[] args) {
        int tickets = 100;
        Scanner sc =  new Scanner(System.in);
        int buyers = 0;
        while (tickets>0) {
            System.out.println("enter number of tickets needed...");
            int booked_tickets = sc.nextInt();
            if(tickets<booked_tickets){
                System.out.format("remaining tickets are %d",tickets);
            }
            else if(0<booked_tickets && booked_tickets<=4){
                System.out.format("your %d tickets are booked...enjoy ur day.!!",booked_tickets);
                System.out.println(" ");
                buyers++;
                tickets = tickets - booked_tickets;
                System.out.format("tickets remaining are %d",tickets);
                System.out.println(" ");
                continue;
            }
            if (booked_tickets == 0  || booked_tickets>4) {
                System.out.println("invalid input...!!!!");
            }
        }
        System.out.format("no of buyers are %d",buyers);
    }
}
