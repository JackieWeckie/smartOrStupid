import java.util.Random;

/**
 * This program will help you to get an answer are you smart today or not
 * Just run this code and you'll see some ~MAGIIIIC~<3
 * It's not a seriously project. It's just for fun:D
 */

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = 0 + rnd.nextInt(100 - 0);

        if (num % 2 == 0) {
            System.out.println("Congrats! You're smart today!");
        } else {
            System.out.println("Oh crap! You're stupid today!");
        }
    }
}