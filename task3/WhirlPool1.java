class Microwave1
{
    static String itemTitle;
    static String makerName;
    static short modelSeries;
    static int capacityLitres;
    static float powerLevel;
    static double weightKg;
    static char energyClass;
    static boolean hasGrill;
    static boolean childLockEnabled;
    static byte autoCookMenus;
    static long costRupees;
    static String bodyFinish;
    static String manufacturedIn;

    public static void main(String[] args)
    {
        itemTitle = "Microwave Oven";
        makerName = "IFB";
        modelSeries = 25;
        capacityLitres = 23;
        powerLevel = 800.5f;
        weightKg = 12.75;
        energyClass = 'B';
        hasGrill = true;
        childLockEnabled = true;
        autoCookMenus = 71;
        costRupees = 12500L;
        bodyFinish = "Black";
        manufacturedIn = "India";

        System.out.println("The itemTitle is: " + itemTitle);
        System.out.println("The makerName is: " + makerName);
        System.out.println("The modelSeries is: " + modelSeries);
        System.out.println("The capacityLitres is: " + capacityLitres);
        System.out.println("The powerLevel is: " + powerLevel);
        System.out.println("The weightKg is: " + weightKg);
        System.out.println("The energyClass is: " + energyClass);
        System.out.println("The hasGrill is: " + hasGrill);
        System.out.println("The childLockEnabled is: " + childLockEnabled);
        System.out.println("The autoCookMenus is: " + autoCookMenus);
        System.out.println("The costRupees is: " + costRupees);
        System.out.println("The bodyFinish is: " + bodyFinish);
        System.out.println("The manufacturedIn is: " + manufacturedIn);
    }
}
