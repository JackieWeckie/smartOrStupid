import java.util.Random;

public class firstVersion {
    public static int getANumber() {
        Random rnd = new Random();
        int num = 0 + rnd.nextInt(100 - 0);

        if (num % 2 == 0) {
            System.out.println("Congrats! You're smart today!");
        } else {
            System.out.println("Oh crap! You're stupid today!");
        }
        return num;
    }
}
