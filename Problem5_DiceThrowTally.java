import java.util.Scanner;

public class Problem5_DiceThrowTally {

    static void diceSort(int[] rolls) {
        int[] count = new int[7];

        // Count occurrences of each dice value
        for (int i = 0; i < rolls.length; i++) {
            count[rolls[i]]++;
        }

        // Display counts
        System.out.print("Counts: ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + ":" + count[i]);
            if (i < 6) {
                System.out.print(" ");
            }
        }
        System.out.println();

        // Reconstruct sorted array
        int index = 0;

        for (int value = 1; value <= 6; value++) {
            for (int j = 0; j < count[value]; j++) {
                rolls[index] = value;
                index++;
            }
        }

        // Display sorted results
        System.out.print("Sorted: [");
        for (int i = 0; i < rolls.length; i++) {
            System.out.print(rolls[i]);
            if (i < rolls.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of throws: ");
        int n = sc.nextInt();

        int[] rolls = new int[n];

        System.out.println("Enter dice results (1 to 6):");
        for (int i = 0; i < n; i++) {
            rolls[i] = sc.nextInt();

            if (rolls[i] < 1 || rolls[i] > 6) {
                System.out.println("Invalid dice value!");
                sc.close();
                return;
            }
        }

        diceSort(rolls);
        sc.close();
    }
}
