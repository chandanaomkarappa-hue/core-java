class CetaphilCleanser
{
   
    static String productName = "Daily Gentle Cleanser";
    static String brand = "Neutrogena";
    static String skinType = "Sensitive Skin";
    static int volumeML = 100;
    static boolean fragranceFree = false;
    static String itemForm = "Foam";
    static long price = 299L;
    static String countryOfOrigin = "USA";

    public static void main(String[] args)
    {
        
        String productName = "Gentle Skin Cleanser";
        String brand = "Cetaphil";
        String skinType = "All Skin Types";
        int volumeML = 125;
        boolean fragranceFree = true;
        String itemForm = "Liquid";
        long price = 349L;
        String countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The productName is: " + CetaphilCleanser.productName);

        System.out.println("The brand is: " + brand);
        System.out.println("The brand is: " + CetaphilCleanser.brand);

        System.out.println("The skinType is: " + skinType);
        System.out.println("The skinType is: " + CetaphilCleanser.skinType);

        System.out.println("The volumeML is: " + volumeML);
        System.out.println("The volumeML is: " + CetaphilCleanser.volumeML);

        System.out.println("The fragranceFree is: " + fragranceFree);
        System.out.println("The fragranceFree is: " + CetaphilCleanser.fragranceFree);

        System.out.println("The itemForm is: " + itemForm);
        System.out.println("The itemForm is: " + CetaphilCleanser.itemForm);

        System.out.println("The price is: " + price);
        System.out.println("The price is: " + CetaphilCleanser.price);

        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
        System.out.println("The countryOfOrigin is: " + CetaphilCleanser.countryOfOrigin);
    }
}
