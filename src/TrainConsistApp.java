import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Search with Validation ===");

        String[] bogieIds = {}; // Empty array (test case)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // 🔥 UC20: Fail-fast check
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search!");
        }

        // Linear search (only runs if valid)
        boolean found = false;

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