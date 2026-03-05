class SimpleFaceWash
{
    static String productName;
    static String brand;
    static String skinType;
    static int volumeML;
    static boolean soapFree;
    static String itemForm;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Kind to Skin Refreshing Face Wash";
        brand = "Simple";
        skinType = "Sensitive Skin";
        volumeML = 150;
        soapFree = true;
        itemForm = "Gel";
        price = 399L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The skinType is: " + skinType);
        System.out.println("The volumeML is: " + volumeML);
        System.out.println("The soapFree is: " + soapFree);
        System.out.println("The itemForm is: " + itemForm);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
