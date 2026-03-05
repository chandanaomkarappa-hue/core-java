class Camera1
{
    static String productName;
    static String brand;
    static String modelNumber;
    static int resolutionMP;
    static String videoQuality;
    static float screenSize;
    static boolean wifiAvailable;
    static boolean hasFlash;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Digital Camera";
        brand = "Canon";
        modelNumber = "EOS 1500D";
        resolutionMP = 24;
        videoQuality = "Full HD";
        screenSize = 3.0f;
        wifiAvailable = true;
        hasFlash = true;
        price = 42999L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The resolutionMP is: " + resolutionMP);
        System.out.println("The videoQuality is: " + videoQuality);
        System.out.println("The screenSize is: " + screenSize);
        System.out.println("The wifiAvailable is: " + wifiAvailable);
        System.out.println("The hasFlash is: " + hasFlash);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
