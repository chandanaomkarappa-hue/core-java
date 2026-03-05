class SmartBoard1
{
    static String productName = "Smart Interactive Board";
    static String brand = "BenQ";
    static String screenSize = "75 inches";
    static String resolution = "4K UHD";
    static String connectivity = "WiFi + HDMI + USB";
    static boolean isTouchEnabled = true;
    static long price = 125000;
    static int warrantyYears = 3;
    static String manufacturingDate = "10-02-2026";

    public static void main(String[] args)
    {
        String productName = "SmartBoard Pro";
        String brand = "BenQ";
        String screenSize = "86 inches";
        String resolution = "Full HD";
        String connectivity = "WiFi + HDMI";
        boolean isTouchEnabled = false;
        long price = 110000;
        int warrantyYears = 2;
        String manufacturingDate = "25-02-2026";

        System.out.println("Product Name: " + productName);
        System.out.println("Product Name (static): " + SmartBoard1.productName);

        System.out.println("Brand: " + brand);
        System.out.println("Brand (static): " + SmartBoard1.brand);

        System.out.println("Screen Size: " + screenSize);
        System.out.println("Screen Size (static): " + SmartBoard1.screenSize);

        System.out.println("Resolution: " + resolution);
        System.out.println("Resolution (static): " + SmartBoard1.resolution);

        System.out.println("Connectivity: " + connectivity);
        System.out.println("Connectivity (static): " + SmartBoard1.connectivity);

        System.out.println("Touch Enabled: " + isTouchEnabled);
        System.out.println("Touch Enabled (static): " + SmartBoard1.isTouchEnabled);

        System.out.println("Price: " + price);
        System.out.println("Price (static): " + SmartBoard1.price);

        System.out.println("Warranty (Years): " + warrantyYears);
        System.out.println("Warranty (Years, static): " + SmartBoard1.warrantyYears);

        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Manufacturing Date (static): " + SmartBoard1.manufacturingDate);
    }
}
