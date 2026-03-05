class ExternalHardDrive {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("Seagate");
        return "Seagate";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(6999.99);
        return 6999.99;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("Black");
        return "Black";
    }

    public static boolean isPortable() {
        System.out.println("isPortable() invoked");
        System.out.println(true);
        return true;
    }

    public static int getCapacity() {
        System.out.println("getCapacity() invoked");
        System.out.println(2000);
        return 2000; // in GB
    }
}

