class ProductPhilips
{
    static int productId = 102;
    static String productName = "Ceiling Fan";
    static String brand = "Havells";
    static double price = 2499.99;
    static int quantityInStock = 30;
    static int voltage = 230;
    static int wattage = 75;
    static String color = "Brown";
    static double weight = 4.5;
    static boolean isAvailable = false;

    public static void main(String args[])
    {
        int productId = 101;
        String productName = "LED Bulb";
        String brand = "Philips";
        double price = 199.99;
        int quantityInStock = 50;
        int voltage = 220;
        int wattage = 9;
        String color = "White";
        double weight = 0.24;
        boolean isAvailable = true;

        System.out.println("The productId is: " + productId);
        System.out.println("The productId is: " + ProductPhilips.productId);

        System.out.println("The productName is: " + productName);
        System.out.println("The productName is: " + ProductPhilips.productName);

        System.out.println("The brand is: " + brand);
        System.out.println("The brand is: " + ProductPhilips.brand);

        System.out.println("The price is: " + price);
        System.out.println("The price is: " + ProductPhilips.price);

        System.out.println("The quantityInStock is: " + quantityInStock);
        System.out.println("The quantityInStock is: " + ProductPhilips.quantityInStock);

        System.out.println("The voltage is: " + voltage);
        System.out.println("The voltage is: " + ProductPhilips.voltage);

        System.out.println("The wattage is: " + wattage);
        System.out.println("The wattage is: " + ProductPhilips.wattage);

        System.out.println("The color is: " + color);
        System.out.println("The color is: " + ProductPhilips.color);

        System.out.println("The weight is: " + weight);
        System.out.println("The weight is: " + ProductPhilips.weight);

        System.out.println("The isAvailable is: " + isAvailable);
        System.out.println("The isAvailable is: " + ProductPhilips.isAvailable);
    }
}
