class Cooker1
{
    static String productName = "Prestige Pressure Cooker";
    static String brand = "Prestige";
    static int capacityLiters = 5;
    static String color = "Silver";
    static String material = "Aluminium";
    static boolean isInductionBase = true;
    static long price = 2499;
    static int warrantyYears = 5;
    static String manufacturingDate = "05-01-2026";

    public static void main(String[] args)
    {
        String productName = "Prestige Deluxe Cooker";
        String brand = "Prestige";
        int capacityLiters = 3;
        String color = "Black";
        String material = "Stainless Steel";
        boolean isInductionBase = false;
        long price = 1999;
        int warrantyYears = 3;
        String manufacturingDate = "15-01-2026";

        System.out.println("Product Name: " + productName);
        System.out.println("Product Name (static): " + Cooker1.productName);

        System.out.println("Brand: " + brand);
        System.out.println("Brand (static): " + Cooker1.brand);

        System.out.println("Capacity (Liters): " + capacityLiters);
        System.out.println("Capacity (static): " + Cooker1.capacityLiters);

        System.out.println("Color: " + color);
        System.out.println("Color (static): " + Cooker1.color);

        System.out.println("Material: " + material);
        System.out.println("Material (static): " + Cooker1.material);

        System.out.println("Is Induction Base: " + isInductionBase);
        System.out.println("Is Induction Base (static): " + Cooker1.isInductionBase);

        System.out.println("Price: " + price);
        System.out.println("Price (static): " + Cooker1.price);

        System.out.println("Warranty (Years): " + warrantyYears);
        System.out.println("Warranty (static): " + Cooker1.warrantyYears);

        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Manufacturing Date (static): " + Cooker1.manufacturingDate);
    }
}
