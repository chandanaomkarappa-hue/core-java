class GamingConsole {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("Sony PlayStation");
        return "Sony PlayStation";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(49999.00);
        return 49999.00;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("White");
        return "White";
    }

    public static boolean hasVRSupport() {
        System.out.println("hasVRSupport() invoked");
        System.out.println(true);
        return true;
    }

    public static int getStorage() {
        System.out.println("getStorage() invoked");
        System.out.println(825);
        return 825; // in GB
    }
}

