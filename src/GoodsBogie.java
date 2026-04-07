class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {

        try {
            // Unsafe condition
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.");
        }
    }

    public String toString() {
        return type + " - " + cargo;
    }
}