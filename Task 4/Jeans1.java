class Jeans1
{
    static String productName = "DNMX Jeans";
    static String brand = "DNMX";
    static String size = "32";
    static String color = "Blue";
    static String material = "Denim";
    static boolean isStretchable = true;
    static long price = 1499;
    static int warrantyMonths = 0;
    static String manufacturingDate = "10-02-2026";

    public static void main(String[] args)
    {
        String productName = "DNMX Slim Fit Jeans";
        String brand = "DNMX";
        String size = "34";
        String color = "Black";
        String material = "Stretch Denim";
        boolean isStretchable = false;
        long price = 1799;
        int warrantyMonths = 0;
        String manufacturingDate = "20-02-2026";

        System.out.println("Product Name: " + productName);
        System.out.println("Product Name (static): " + Jeans1.productName);

        System.out.println("Brand: " + brand);
        System.out.println("Brand (static): " + Jeans1.brand);

        System.out.println("Size: " + size);
        System.out.println("Size (static): " + Jeans1.size);

        System.out.println("Color: " + color);
        System.out.println("Color (static): " + Jeans1.color);

        System.out.println("Material: " + material);
        System.out.println("Material (static): " + Jeans1.material);

        System.out.println("Is Stretchable: " + isStretchable);
        System.out.println("Is Stretchable (static): " + Jeans1.isStretchable);

        System.out.println("Price: " + price);
        System.out.println("Price (static): " + Jeans1.price);

        System.out.println("Warranty (Months): " + warrantyMonths);
        System.out.println("Warranty (Months, static): " + Jeans1.warrantyMonths);

        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Manufacturing Date (static): " + Jeans1.manufacturingDate);
    }
}
