import java.util.*;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
        System.out.println("rock = 0");
        System.out.println("paper = 1");
        System.out.println("scissor = 2");
        int rock = 0;
        int paper = 1;
        int scissor =2;
        System.out.println("Enter input :");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        System.out.println("Computer  input :");
        Random r = new Random();
        int computer = r.nextInt(2);
        System.out.println(computer);
        if(computer == 0 && input == 1){
            System.out.println("you win");
        }
        else if(computer == 0 && input == 2){
            System.out.println("computer win");
        }
        else if(computer == 0 && input == 0){
            System.out.println("match draw");
        }
        else if(computer == 1 && input == 0){
            System.out.println("computer win");
        }
        else if(computer == 1 && input == 1){
            System.out.println("match draw");
        }
        else if(computer == 1 && input == 2){
            System.out.println("you win");
        }
        else if(computer == 2 && input == 0){
            System.out.println("you win");
        }
        else if(computer == 2 && input == 1){
            System.out.println("computer win");
        }
        else if(computer == 2 && input == 2){
            System.out.println("match draw");
        }
        else if(input >= 3){
            System.out.println("input invalid");
        }
    }
}
