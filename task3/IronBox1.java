class IronBox1
{
    static String itemName;
    static String companyName;
    static String productId;
    static String bodyColor;
    static int powerConsumption;
    static int ratedVoltage;
    static String plateMaterial;
    static boolean hasSteam;
    static boolean hasSpray;
    static boolean supportsVerticalIroning;
    static String tankSize;
    static long cost;
    static int guaranteePeriod;
    static String wireLength;
    static String madeIn;

    public static void main(String[] args)
    {
        itemName = "Electric Iron";
        companyName = "Prestige";
        productId = "PI-2026";
        bodyColor = "Red";
        powerConsumption = 1200;
        ratedVoltage = 230;
        plateMaterial = "Stainless Steel";
        hasSteam = true;
        hasSpray = true;
        supportsVerticalIroning = false;
        tankSize = "200 ml";
        cost = 2100L;
        guaranteePeriod = 2;
        wireLength = "1.8 meters";
        madeIn = "India";

        System.out.println("The itemName is: " + itemName);
        System.out.println("The companyName is: " + companyName);
        System.out.println("The productId is: " + productId);
        System.out.println("The bodyColor is: " + bodyColor);
        System.out.println("The powerConsumption is: " + powerConsumption);
        System.out.println("The ratedVoltage is: " + ratedVoltage);
        System.out.println("The plateMaterial is: " + plateMaterial);
        System.out.println("The hasSteam is: " + hasSteam);
        System.out.println("The hasSpray is: " + hasSpray);
        System.out.println("The supportsVerticalIroning is: " + supportsVerticalIroning);
        System.out.println("The tankSize is: " + tankSize);
        System.out.println("The cost is: " + cost);
        System.out.println("The guaranteePeriod is: " + guaranteePeriod);
        System.out.println("The wireLength is: " + wireLength);
        System.out.println("The madeIn is: " + madeIn);
    }
}
