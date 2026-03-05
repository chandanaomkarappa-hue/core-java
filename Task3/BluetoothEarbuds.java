class BluetoothEarbuds {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("Sony");
        return "Sony";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(3499.99);
        return 3499.99;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("White");
        return "White";
    }

    public static boolean hasNoiseCancellation() {
        System.out.println("hasNoiseCancellation() invoked");
        System.out.println(true);
        return true;
    }

    public static int getBatteryLife() {
        System.out.println("getBatteryLife() invoked");
        System.out.println(8);
        return 8; // in hours
    }
}

