import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // UC7: Create list of Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Sort using Comparator
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display result
        System.out.println("\nSorted Bogies by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
            System.out.println("UC7 Running...");
        }
    }
}