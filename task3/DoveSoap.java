class DoveSoap
{
    static String productName;
    static String brand;
    static String skinType;
    static int weightGrams;
    static String scent;
    static boolean moisturizing;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Beauty Bathing Bar";
        brand = "Dove";
        skinType = "All Skin Types";
        weightGrams = 125;
        scent = "Mild";
        moisturizing = true;
        price = 75L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The skinType is: " + skinType);
        System.out.println("The weightGrams is: " + weightGrams);
        System.out.println("The scent is: " + scent);
        System.out.println("The moisturizing is: " + moisturizing);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
