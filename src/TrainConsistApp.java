import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Sort Bogie Names ===");

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        // Display result
        System.out.println("\nSorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
    }
}