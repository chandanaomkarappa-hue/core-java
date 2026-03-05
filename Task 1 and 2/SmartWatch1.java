class SmartWatch1
{
    static String productName;
    static String brand;
    static String modelNumber;
    static String displayType;
    static boolean heartRateMonitor;
    static boolean gps;
    static int batteryLifeHours;
    static float screenSize;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Smart Watch";
        brand = "Noise";
        modelNumber = "ColorFit Pro 4";
        displayType = "AMOLED";
        heartRateMonitor = true;
        gps = true;
        batteryLifeHours = 120;
        screenSize = 1.78f;
        price = 5999L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The displayType is: " + displayType);
        System.out.println("The heartRateMonitor is: " + heartRateMonitor);
        System.out.println("The gps is: " + gps);
        System.out.println("The batteryLifeHours is: " + batteryLifeHours);
        System.out.println("The screenSize is: " + screenSize);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
