class PumaBag
{
    static String productName;
    static String brand;
    static String color;
    static String material;
    static int capacityLiters;
    static boolean waterResistant;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Phase Backpack";
        brand = "Puma";
        color = "Black";
        material = "Polyester";
        capacityLiters = 22;
        waterResistant = true;
        price = 1299L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The color is: " + color);
        System.out.println("The material is: " + material);
        System.out.println("The capacityLiters is: " + capacityLiters);
        System.out.println("The waterResistant is: " + waterResistant);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
