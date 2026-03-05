class ClassmatePen
{
 
    static String productName = "Gel Writer Pen";
    static String brand = "Reynolds";
    static String inkColor = "Black";
    static String bodyMaterial = "Metal";
    static boolean refillable = true;
    static int packSize = 5;
    static long price = 150L;
    static String countryOfOrigin = "USA";

    public static void main(String[] args)
    {

        String productName = "Octane Ball Pen";
        String brand = "Classmate";
        String inkColor = "Blue";
        String bodyMaterial = "Plastic";
        boolean refillable = false;
        int packSize = 10;
        long price = 120L;
        String countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The productName is: " + ClassmatePen.productName);

        System.out.println("The brand is: " + brand);
        System.out.println("The brand is: " + ClassmatePen.brand);

        System.out.println("The inkColor is: " + inkColor);
        System.out.println("The inkColor is: " + ClassmatePen.inkColor);

        System.out.println("The bodyMaterial is: " + bodyMaterial);
        System.out.println("The bodyMaterial is: " + ClassmatePen.bodyMaterial);

        System.out.println("The refillable is: " + refillable);
        System.out.println("The refillable is: " + ClassmatePen.refillable);

        System.out.println("The packSize is: " + packSize);
        System.out.println("The packSize is: " + ClassmatePen.packSize);

        System.out.println("The price is: " + price);
        System.out.println("The price is: " + ClassmatePen.price);

        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
        System.out.println("The countryOfOrigin is: " + ClassmatePen.countryOfOrigin);
    }
}
