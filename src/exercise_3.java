import java.util.Random;
import java.util.*;
class game {
    public int number;
    public int inputNumber;
    public int numberOfGuesses = 0;

    public void setNumberOfGuesses(int numberOfGuesses) {

        this.numberOfGuesses = numberOfGuesses;
    }

    public int getNumberOfGuesses() {

        return numberOfGuesses;
    }

    game(){
       System.out.println("hi..welcome to guess number game..!!");
    Random rand = new Random() ;
    this.number = rand.nextInt(100);
}
void takeUserInput(){
Scanner sc = new Scanner(System.in);
    System.out.println("Enter number:");
this.inputNumber = sc.nextInt();

}
boolean isCorrectNumber() {
        numberOfGuesses++;
    if (inputNumber == number) {
        System.out.format("you and computer guess the same value.the value is %d and u find the value in this number of %d times",number,numberOfGuesses);
        return true;
    }
    else if (inputNumber > number) {
        System.out.println("your number is too high");
    }
    else if (inputNumber < number) {
        System.out.println("your number is too low");
    }
    return false;
}
}
public class exercise_3 {
    public static void main(String[] args) {
game sc = new game();
       boolean s = false ;
while(!s){
sc.takeUserInput();
s= sc.isCorrectNumber();
    }
    }
}
