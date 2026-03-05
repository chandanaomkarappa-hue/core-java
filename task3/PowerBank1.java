class PowerBank1
{
    static String itemTitle;
    static String manufacturer;
    static int batteryCapacity;
    static float outputWatt;
    static double productWeight;
    static char ratingGrade;
    static boolean supportsFastCharge;
    static byte usbPorts;
    static short modelCode;
    static long amount;
    static String surfaceFinish;
    static String originCountry;

    public static void main(String[] args)
    {
        itemTitle = "Power Bank";
        manufacturer = "Ambrane";
        batteryCapacity = 20000;
        outputWatt = 20.5f;
        productWeight = 345.75;
        ratingGrade = 'A';
        supportsFastCharge = true;
        usbPorts = 2;
        modelCode = 1150;
        amount = 1899L;
        surfaceFinish = "Matte Black";
        originCountry = "India";

        System.out.println("The itemTitle is: " + itemTitle);
        System.out.println("The manufacturer is: " + manufacturer);
        System.out.println("The batteryCapacity is: " + batteryCapacity);
        System.out.println("The outputWatt is: " + outputWatt);
        System.out.println("The productWeight is: " + productWeight);
        System.out.println("The ratingGrade is: " + ratingGrade);
        System.out.println("The supportsFastCharge is: " + supportsFastCharge);
        System.out.println("The usbPorts is: " + usbPorts);
        System.out.println("The modelCode is: " + modelCode);
        System.out.println("The amount is: " + amount);
        System.out.println("The surfaceFinish is: " + surfaceFinish);
        System.out.println("The originCountry is: " + originCountry);
    }
}
