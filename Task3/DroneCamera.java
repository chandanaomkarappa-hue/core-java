class DroneCamera {
    public static String getDroneModel() {
        System.out.println("getDroneModel() invoked");
        System.out.println("SkyExplorer X9");
        return "SkyExplorer X9";
    }

    public static double getDronePrice() {
        System.out.println("getDronePrice() invoked");
        System.out.println(75999.90);
        return 75999.90;
    }

    public static int getFlightTime() {
        System.out.println("getFlightTime() invoked");
        System.out.println(35);
        return 35; // minutes
    }

    public static boolean hasGPS() {
        System.out.println("hasGPS() invoked");
        System.out.println(true);
        return true;
    }

    public static String getCameraQuality() {
        System.out.println("getCameraQuality() invoked");
        System.out.println("4K Ultra HD");
        return "4K Ultra HD";
    }

    public static int getControlRange() {
        System.out.println("getControlRange() invoked");
        System.out.println(5000);
        return 5000; // meters
    }
}

