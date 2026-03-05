class SmartHelmet {

    public static String getHelmetModel() {
        System.out.println("getHelmetModel() invoked");
        System.out.println("SafeRide H1");
        return "SafeRide H1";
    }

    public static double getHelmetPrice() {
        System.out.println("getHelmetPrice() invoked");
        System.out.println(12999.95);
        return 12999.95;
    }

    public static boolean hasBluetoothConnectivity() {
        System.out.println("hasBluetoothConnectivity() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean supportsNavigationDisplay() {
        System.out.println("supportsNavigationDisplay() invoked");
        System.out.println(true);
        return true;
    }

    public static int getBatteryBackup() {
        System.out.println("getBatteryBackup() invoked");
        System.out.println(10);
        return 10; // hours
    }

    public static boolean hasAccidentAlert() {
        System.out.println("hasAccidentAlert() invoked");
        System.out.println(true);
        return true;
    }
}

