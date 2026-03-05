class MiCharger
{
    
    static String productName = "Quick Charge Adapter";
    static String brand = "Realme";
    static String connectorType = "Micro USB";
    static int wattage = 20;
    static int voltage = 220;
    static boolean fastCharging = false;
    static long price = 999L;
    static String countryOfOrigin = "China";

    public static void main(String[] args)
    {
        
        String productName = "Fast Wall Charger";
        String brand = "Mi";
        String connectorType = "USB Type-C";
        int wattage = 33;
        int voltage = 240;
        boolean fastCharging = true;
        long price = 1299L;
        String countryOfOrigin = "India";

        System.out.println("The productName is: " + productName);
        System.out.println("The productName is: " + MiCharger.productName);

        System.out.println("The brand is: " + brand);
        System.out.println("The brand is: " + MiCharger.brand);

        System.out.println("The connectorType is: " + connectorType);
        System.out.println("The connectorType is: " + MiCharger.connectorType);

        System.out.println("The wattage is: " + wattage);
        System.out.println("The wattage is: " + MiCharger.wattage);

        System.out.println("The voltage is: " + voltage);
        System.out.println("The voltage is: " + MiCharger.voltage);

        System.out.println("The fastCharging is: " + fastCharging);
        System.out.println("The fastCharging is: " + MiCharger.fastCharging);

        System.out.println("The price is: " + price);
        System.out.println("The price is: " + MiCharger.price);

        System.out.println("The countryOfOrigin is: " + countryOfOrigin);
        System.out.println("The countryOfOrigin is: " + MiCharger.countryOfOrigin);
    }
}
