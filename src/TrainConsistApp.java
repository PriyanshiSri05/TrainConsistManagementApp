import java.util.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Binary Search for Bogie ID ===");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Ensure sorted (important)
        Arrays.sort(bogieIds);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
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