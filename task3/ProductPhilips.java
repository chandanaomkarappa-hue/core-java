class ProductPhilips
{
    static int productId;
    static String productName;
    static String brand;
    static double price;
    static int quantityInStock;
    static int voltage;
    static int wattage;
    static String color;
    static double weight;
    static boolean isAvailable;

    public static void main(String args[])
    {
        productId = 101;
        productName = "LED Bulb";
        brand = "Philips";
        price = 199.99;
        quantityInStock = 50;
        voltage = 220;
        wattage = 9;
        color = "White";
        weight = 0.24;
        isAvailable = true;

        System.out.println("The productId is: " + productId);
        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The price is: " + price);
        System.out.println("The quantityInStock is: " + quantityInStock);
        System.out.println("The voltage is: " + voltage);
        System.out.println("The wattage is: " + wattage);
        System.out.println("The color is: " + color);
        System.out.println("The weight is: " + weight);
        System.out.println("The isAvailable is: " + isAvailable);
    }
}
