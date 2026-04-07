public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Cargo Assignment System ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Program continues
        System.out.println("\nProgram continues safely...");
    }
}