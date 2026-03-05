class CeilingFan1
{
    static String productName;
    static String brand;
    static String modelNumber;
    static String color;
    static int numberOfBlades;
    static double bladeSize;
    static int wattage;
    static int voltage;
    static String material;
    static long price;
    static int warrantyYears;
    static String manufacturingDate;
    static String energyRating;
    static boolean remoteControl;

    public static void main(String[] args)
    {
        productName = "Ceiling Fan";
        brand = "Usha";
        modelNumber = "CF-1201";
        color = "White";
        numberOfBlades = 3;
        bladeSize = 48.0;
        wattage = 75;
        voltage = 230;
        material = "Aluminium";
        price = 2500;
        warrantyYears = 2;
        manufacturingDate = "10-01-2026";
        energyRating = "5 Star";
        remoteControl = false;

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The modelNumber is: " + modelNumber);
        System.out.println("The color is: " + color);
        System.out.println("The numberOfBlades is: " + numberOfBlades);
        System.out.println("The bladeSize is: " + bladeSize);
        System.out.println("The wattage is: " + wattage);
        System.out.println("The voltage is: " + voltage);
        System.out.println("The material is: " + material);
        System.out.println("The price is: " + price);
        System.out.println("The warrantyYears is: " + warrantyYears);
        System.out.println("The manufacturingDate is: " + manufacturingDate);
        System.out.println("The energyRating is: " + energyRating);
        System.out.println("The remoteControl is: " + remoteControl);
    }
}
