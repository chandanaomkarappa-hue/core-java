class SumSung1
{
    static String productName;
    static String brand;
    static String modelNumber;
    static String color;
    static int wattage;
    static int voltage;
    static String cableType;
    static boolean fastCharging;
    static long price;
    static int warrantyMonths;
    static String manufacturingDate;
    static String compatibleDevices;
    static String material;

    public static void main(String[] args)
    {
        productName = "Mobile Charger";
        brand = "Samsung";
        modelNumber = "EP-TA800";
        color = "Black";
        wattage = 25;
        voltage = 240;
        cableType = "USB Type-C";
        fastCharging = true;
        price = 999;
        warrantyMonths = 6;
        manufacturingDate = "15-12-2025";
        compatibleDevices = "Android Smartphones";
        material = "Plastic";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The color is: " + color);
        System.out.println("The wattage is: " + wattage);
        System.out.println("The voltage is: " + voltage);
        System.out.println("The cableType is: " + cableType);
        System.out.println("The fastCharging is: " + fastCharging);
        System.out.println("The price is: " + price);
        System.out.println("The warrantyMonths is: " + warrantyMonths);
        System.out.println("The manufacturingDate is: " + manufacturingDate);
        System.out.println("The compatibleDevices is: " + compatibleDevices);
        System.out.println("The material is: " + material);
    }
}
