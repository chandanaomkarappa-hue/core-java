class WaterHeater1
{
    static String productName;
    static String brand;
    static String modelNumber;
    static int capacityLiters;
    static int wattage;
    static int voltage;
    static String heaterType;
    static String color;
    static String tankMaterial;
    static boolean autoCutOff;
    static long price;
    static int warrantyYears;
    static String installationType;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Water Heater";
        brand = "V-Guard";
        modelNumber = "VG-25Pro";
        capacityLiters = 25;
        wattage = 1500;
        voltage = 230;
        heaterType = "Instant";
        color = "Grey";
        tankMaterial = "Copper";
        autoCutOff = true;
        price = 10500;
        warrantyYears = 3;
        installationType = "Vertical Wall Mount";
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The capacityLiters is: " + capacityLiters);
        System.out.println("The wattage is: " + wattage);
        System.out.println("The voltage is: " + voltage);
        System.out.println("The heaterType is: " + heaterType);
        System.out.println("The color is: " + color);
        System.out.println("The tankMaterial is: " + tankMaterial);
        System.out.println("The autoCutOff is: " + autoCutOff);
        System.out.println("The price is: " + price);
        System.out.println("The warrantyYears is: " + warrantyYears);
        System.out.println("The installationType is: " + installationType);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
