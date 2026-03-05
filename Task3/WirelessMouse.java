class WirelessMouse {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("Logitech");
        return "Logitech";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(1499.50);
        return 1499.50;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("Black");
        return "Black";
    }

    public static boolean isRechargeable() {
        System.out.println("isRechargeable() invoked");
        System.out.println(true);
        return true;
    }

    public static int getDPI() {
        System.out.println("getDPI() invoked");
        System.out.println(1600);
        return 1600; // DPI setting
    }
}

