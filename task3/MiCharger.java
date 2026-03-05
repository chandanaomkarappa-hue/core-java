class MiCharger
{
    static String productName;
    static String brand;
    static String connectorType;
    static int wattage;
    static int voltage;
    static boolean fastCharging;
    static long price;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "Fast Wall Charger";
        brand = "Mi";
        connectorType = "USB Type-C";
        wattage = 33;
        voltage = 240;
        fastCharging = true;
        price = 1299L;
        countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The brand is: " + brand);
        System.out.println("The connectorType is: " + connectorType);
        System.out.println("The wattage is: " + wattage);
        System.out.println("The voltage is: " + voltage);
        System.out.println("The fastCharging is: " + fastCharging);
        System.out.println("The price is: " + price);
        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
    }
}
