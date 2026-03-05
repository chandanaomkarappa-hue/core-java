class SmartRefrigerator {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("LG");
        return "LG";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(89999.50);
        return 89999.50;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("Silver");
        return "Silver";
    }

    public static boolean hasSmartFeatures() {
        System.out.println("hasSmartFeatures() invoked");
        System.out.println(true);
        return true;
    }

    public static int getCapacity() {
        System.out.println("getCapacity() invoked");
        System.out.println(450);
        return 450; // in liters
    }
}

