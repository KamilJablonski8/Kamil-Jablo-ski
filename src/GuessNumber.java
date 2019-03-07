import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    int theNumber;
    int max;

    Scanner scanner = new Scanner(System.in);

    public GuessNumber() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (80);
    }

    public void play() {
        while (true) {
            int number = scanner.nextInt();
            if (number > theNumber) {
                System.out.println("Your number is too big");
            } else if (number < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("YOU GOT IT !!!");
                break;
            }
        }
    }
    public static void howBigIsMyNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println("Out number is preety small");
        } else if (x >= 11 && x <= 100) {
            System.out.println("Our number is preety big");
        } else if (x > 100 && x < 200 ){
            System.out.println("Too many");
        } else {
            System.out.println("Our number is out of range");
        }
    }
    public static void main(String[] args) {
        howBigIsMyNumber(0);
        howBigIsMyNumber(10);
        howBigIsMyNumber(20);
        howBigIsMyNumber(100);
        howBigIsMyNumber(5);
        howBigIsMyNumber(75);
        howBigIsMyNumber(-1);
        howBigIsMyNumber(105);
        GuessNumber guessGame = new GuessNumber();
        System.out.println("Welcome to my game. Try and guess my imposible " +
                "number. It's beetween 0 and 100 inclusive. "
                + "Just type a number to get started.");
        guessGame.play();
    }
}