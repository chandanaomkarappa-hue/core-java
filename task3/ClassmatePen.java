class ClassmatePen
{
    static String productName;
    static String brand;
    static String inkColor;
    static String bodyMaterial;
    static boolean refillable;
    static int packSize;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Octane Ball Pen";
        brand = "Classmate";
        inkColor = "Blue";
        bodyMaterial = "Plastic";
        refillable = false;
        packSize = 10;
        price = 120L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The inkColor is: " + inkColor);
        System.out.println("The bodyMaterial is: " + bodyMaterial);
        System.out.println("The refillable is: " + refillable);
        System.out.println("The packSize is: " + packSize);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
