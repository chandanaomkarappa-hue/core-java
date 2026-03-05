class PumaBag
{
    
    static String productName = "Runner Sling Bag";
    static String brand = "Adidas";
    static String color = "Blue";
    static String material = "Nylon";
    static int capacityLiters = 18;
    static boolean waterResistant = false;
    static long price = 999L;
    static String countryOfOrigin = "USA";

    public static void main(String[] args)
    {
        
        String productName = "Phase Backpack";
        String brand = "Puma";
        String color = "Black";
        String material = "Polyester";
        int capacityLiters = 22;
        boolean waterResistant = true;
        long price = 1299L;
        String countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The productName is: " + PumaBag.productName);

        System.out.println("The brand is: " + brand);
        System.out.println("The brand is: " + PumaBag.brand);

        System.out.println("The color is: " + color);
        System.out.println("The color is: " + PumaBag.color);

        System.out.println("The material is: " + material);
        System.out.println("The material is: " + PumaBag.material);

        System.out.println("The capacityLiters is: " + capacityLiters);
        System.out.println("The capacityLiters is: " + PumaBag.capacityLiters);

        System.out.println("The waterResistant is: " + waterResistant);
        System.out.println("The waterResistant is: " + PumaBag.waterResistant);

        System.out.println("The price is: " + price);
        System.out.println("The price is: " + PumaBag.price);

        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
        System.out.println("The countryOfOrigin is: " + PumaBag.countryOfOrigin);
    }
}
