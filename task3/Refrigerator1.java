class Refrigerator1
{
    static String productName;
    static String brand;
    static String modelNumber;
    static int capacityLiters;
    static String energyRating;
    static String doorType;
    static String defrostSystem;
    static String color;
    static int voltage;
    static long price;
    static int warrantyYears;
    static boolean inverterCompressor;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Refrigerator";
        brand = "LG";
        modelNumber = "GL-B201";
        capacityLiters = 260;
        energyRating = "4 Star";
        doorType = "Double Door";
        defrostSystem = "Frost Free";
        color = "Shiny Steel";
        voltage = 230;
        price = 32000L;
        warrantyYears = 1;
        inverterCompressor = true;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The capacityLiters is: " + capacityLiters);
        System.out.println("The energyRating is: " + energyRating);
        System.out.println("The doorType is: " + doorType);
        System.out.println("The defrostSystem is: " + defrostSystem);
        System.out.println("The color is: " + color);
        System.out.println("The voltage is: " + voltage);
        System.out.println("The price is: " + price);
        System.out.println("The warrantyYears is: " + warrantyYears);
        System.out.println("The inverterCompressor is: " + inverterCompressor);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
