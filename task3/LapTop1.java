class LapTop1
{
    static String productName;
    static String brand;
    static String modelNumber;
    static String processor;
    static int ramGB;
    static int storageGB;
    static String operatingSystem;
    static float screenSize;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Laptop";
        brand = "HP";
        modelNumber = "15s";
        processor = "Intel i5";
        ramGB = 16;
        storageGB = 512;
        operatingSystem = "Windows 11";
        screenSize = 15.6f;
        price = 58999L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The processor is: " + processor);
        System.out.println("The ramGB is: " + ramGB);
        System.out.println("The storageGB is: " + storageGB);
        System.out.println("The operatingSystem is: " + operatingSystem);
        System.out.println("The screenSize is: " + screenSize);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
