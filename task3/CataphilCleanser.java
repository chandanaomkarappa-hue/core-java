class CetaphilCleanser
{
    static String productName;
    static String brand;
    static String skinType;
    static int volumeML;
    static boolean fragranceFree;
    static String itemForm;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Gentle Skin Cleanser";
        brand = "Cetaphil";
        skinType = "All Skin Types";
        volumeML = 125;
        fragranceFree = true;
        itemForm = "Liquid";
        price = 349L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The skinType is: " + skinType);
        System.out.println("The volumeML is: " + volumeML);
        System.out.println("The fragranceFree is: " + fragranceFree);
        System.out.println("The itemForm is: " + itemForm);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
