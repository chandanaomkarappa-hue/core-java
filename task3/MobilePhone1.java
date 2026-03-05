class MobilePhone1
{
    static String productName;
    static String brand;
    static String modelNumber;
    static String operatingSystem;
    static int storageGB;
    static int ramGB;
    static float screenSize;
    static int batteryMAh;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Smartphone";
        brand = "Samsung";
        modelNumber = "Galaxy M34";
        operatingSystem = "Android";
        storageGB = 128;
        ramGB = 8;
        screenSize = 6.5f;
        batteryMAh = 6000;
        price = 18999L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The operatingSystem is: " + operatingSystem);
        System.out.println("The storageGB is: " + storageGB);
        System.out.println("The ramGB is: " + ramGB);
        System.out.println("The screenSize is: " + screenSize);
        System.out.println("The batteryMAh is: " + batteryMAh);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
