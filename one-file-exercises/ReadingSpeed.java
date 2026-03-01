import java.util.Scanner;
import java.util.Arrays;

public class ReadingSpeed {
    /**
     * Calculates average reading time by speed category
     * 
     * @param args
     * @return none (void)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your reading speed (slow, medium, fast): ");
        String speed = input.next();
        String[] readingSpeeds = { "slow", "medium", "fast" };
        int timeSpentReading = 0;

        boolean isSpeed = Arrays.stream(readingSpeeds).anyMatch(sp -> sp.equals(speed));

        if (!isSpeed) {
            System.out.println("Reading speed must be 'slow', 'medium', or 'fast' in all lowercase.");
            input.close();
            return;
        }

        System.out.print("How many words is the text you want to read? ");
        int textLength = input.nextInt();
        input.close();

        System.out.println("Calculating...");

        if (speed.equals("slow")) {
            timeSpentReading = textLength / 150;
        } else if (speed.equals("medium")) {
            timeSpentReading = textLength / 225;
        } else if (speed.equals("fast")) {
            timeSpentReading = textLength / 300;
        }

        int hours = timeSpentReading / 60;
        int minutes = timeSpentReading - (hours * 60);

        System.out.printf("It will take around %d hours and %d minutes to read this text.\n", hours, minutes);
    }
}
