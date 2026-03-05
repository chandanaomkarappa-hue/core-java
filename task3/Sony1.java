class Sony1
{
    static String productName;
    static String brand;
    static String modelNumber;
    static int screenSize;
    static String displayType;
    static String resolution;
    static boolean smartFeatures;
    static String operatingSystem;
    static int wattage;
    static int voltage;
    static long price;
    static int warrantyYears;
    static String soundOutput;
    static String connectivity;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Smart TV";
        brand = "Sony";
        modelNumber = "KD-55X74K";
        screenSize = 55;
        displayType = "LED";
        resolution = "4K Ultra HD";
        smartFeatures = true;
        operatingSystem = "Android";
        wattage = 150;
        voltage = 240;
        price = 65000L;
        warrantyYears = 1;
        soundOutput = "20W";
        connectivity = "WiFi, Bluetooth, HDMI, USB";
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The screenSize is: " + screenSize);
        System.out.println("The displayType is: " + displayType);
        System.out.println("The resolution is: " + resolution);
        System.out.println("The smartFeatures is: " + smartFeatures);
        System.out.println("The operatingSystem is: " + operatingSystem);
        System.out.println("The wattage is: " + wattage);
        System.out.println("The voltage is: " + voltage);
        System.out.println("The price is: " + price);
        System.out.println("The warrantyYears is: " + warrantyYears);
        System.out.println("The soundOutput is: " + soundOutput);
        System.out.println("The connectivity is: " + connectivity);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
