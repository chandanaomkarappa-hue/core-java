class ElectricKettle {

    public static String getKettleModel() {
        System.out.println("getKettleModel() invoked");
        System.out.println("HeatQuick K2");
        return "HeatQuick K2";
    }

    public static double getKettlePrice() {
        System.out.println("getKettlePrice() invoked");
        System.out.println(2499.75);
        return 2499.75;
    }

    public static boolean hasAutoShutOff() {
        System.out.println("hasAutoShutOff() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean hasTemperatureControl() {
        System.out.println("hasTemperatureControl() invoked");
        System.out.println(true);
        return true;
    }

    public static int getCapacity() {
        System.out.println("getCapacity() invoked");
        System.out.println(2);
        return 2; // Liters
    }

    public static boolean hasBoilDryProtection() {
        System.out.println("hasBoilDryProtection() invoked");
        System.out.println(true);
        return true;
    }
}

