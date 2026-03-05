class DigitalCamera {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("Canon");
        return "Canon";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(35999.75);
        return 35999.75;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("Black");
        return "Black";
    }

    public static boolean hasWifi() {
        System.out.println("hasWifi() invoked");
        System.out.println(true);
        return true;
    }

    public static int getMegapixels() {
        System.out.println("getMegapixels() invoked");
        System.out.println(24);
        return 24; // in MP
    }
}

