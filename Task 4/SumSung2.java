class SumSung2
{
    static String productName = "Mobile Charger";
    static String brand = "Samsung";
    static String modelNumber = "EP-TA800";
    static String color = "Black";
    static int wattage = 25;
    static int voltage = 240;
    static String cableType = "USB Type-C";
    static boolean fastCharging = true;
    static long price = 999;
    static int warrantyMonths = 6;
    static String manufacturingDate = "15-12-2025";
    static String compatibleDevices = "Android Smartphones";
    static String material = "Plastic";

    public static void main(String[] args)
    {
        String productName = "Fast Charger";
        String brand = "Samsung";
        String modelNumber = "EP-TA900";
        String color = "White";
        int wattage = 30;
        int voltage = 230;
        String cableType = "USB Type-C";
        boolean fastCharging = true;
        long price = 1299;
        int warrantyMonths = 12;
        String manufacturingDate = "01-01-2026";
        String compatibleDevices = "Android & Samsung Phones";
        String material = "Aluminium";

        // Printing local and static variables
        System.out.println("The productName is: " + productName);
        System.out.println("The productName (static) is: " + SumSung2.productName);

        System.out.println("The brand is: " + brand);
        System.out.println("The brand (static) is: " + SumSung2.brand);

        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The modelNumber (static) is: " + SumSung2.modelNumber);

        System.out.println("The color is: " + color);
        System.out.println("The color (static) is: " + SumSung2.color);

        System.out.println("The wattage is: " + wattage);
        System.out.println("The wattage (static) is: " + SumSung2.wattage);

        System.out.println("The voltage is: " + voltage);
        System.out.println("The voltage (static) is: " + SumSung2.voltage);

        System.out.println("The cableType is: " + cableType);
        System.out.println("The cableType (static) is: " + SumSung2.cableType);

        System.out.println("The fastCharging is: " + fastCharging);
        System.out.println("The fastCharging (static) is: " + SumSung2.fastCharging);

        System.out.println("The price is: " + price);
        System.out.println("The price (static) is: " + SumSung2.price);

        System.out.println("The warrantyMonths is: " + warrantyMonths);
        System.out.println("The warrantyMonths (static) is: " + SumSung2.warrantyMonths);

        System.out.println("The manufacturingDate is: " + manufacturingDate);
        System.out.println("The manufacturingDate (static) is: " + SumSung2.manufacturingDate);

        System.out.println("The compatibleDevices is: " + compatibleDevices);
        System.out.println("The compatibleDevices (static) is: " + SumSung2.compatibleDevices);

        System.out.println("The material is: " + material);
        System.out.println("The material (static) is: " + SumSung2.material);
    }
}
