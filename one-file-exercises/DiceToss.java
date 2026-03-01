import java.util.Random;
import java.util.Scanner;

public class DiceToss {
    /**
     * Simulates dice toss, specifying
     * number of faces and dice
     * 
     * @param args
     * @return none
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many faces should the dice have? ");
        int facesInput = input.nextInt();
        System.out.print("How many dice will you toss? ");
        int userInput = input.nextInt();
        input.close();

        Random toss = new Random();
        int Total = 0;
        int Computer_input = 0;
        for (int i = 0; i < userInput; i++) {
            Computer_input = toss.nextInt(facesInput) + 1;
            Total = Total + Computer_input;
            System.out.print(Computer_input + " ");
        }
        System.out.println(" ");
        System.out.println("Total: " + Total);
        System.out.println("Was Lady Luck on your side?");
    }
}
