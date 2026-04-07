import java.util.*;
import java.util.stream.*;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Performance Comparison ===");

        List<Bogie> bogies = new ArrayList<>();

        // Create large dataset
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie("Sleeper", i % 100));
        }

        // 🔹 Loop-based filtering
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();

        // 🔹 Stream-based filtering
        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        long endStream = System.nanoTime();

        // Results
        System.out.println("\nLoop Time: " + (endLoop - startLoop) + " ns");
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");

        System.out.println("Results Equal: " + (loopResult.size() == streamResult.size()));
    }
}