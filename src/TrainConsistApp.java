import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Linear Search for Bogie ID ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = false;

        // Linear Search
        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // Output
        if (found) {
            System.out.println("Bogie FOUND ✅");
        } else {
            System.out.println("Bogie NOT FOUND ❌");
        }
    }
}