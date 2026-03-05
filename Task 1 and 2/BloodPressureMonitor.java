class BloodPressureMonitor
{
    static String brand;
    static String includedComponents;
    static String powerSource;
    static String displayType;
    static int size;
    static String ageRange;

    public static void main(String args[])
    {
        brand = "Dr.morepen";
        includedComponents = "Automatic blood pressure monitor";
        powerSource = "Battery Powered";
        displayType = "Digital";
        size = 1;
        ageRange = "Adult";

        System.out.println("The brand is: " + brand);
        System.out.println("The includedComponents is: " + includedComponents);
        System.out.println("The powerSource is: " + powerSource);
        System.out.println("The displayType is: " + displayType);
        System.out.println("The size is: " + size);
        System.out.println("The ageRange is: " + ageRange);
    }
}
