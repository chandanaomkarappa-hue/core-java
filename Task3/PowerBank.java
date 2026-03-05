class PowerBank {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("Mi");
        return "Mi";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(1999.75);
        return 1999.75;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("Silver");
        return "Silver";
    }

    public static boolean isFastCharging() {
        System.out.println("isFastCharging() invoked");
        System.out.println(true);
        return true;
    }

    public static int getCapacity() {
        System.out.println("getCapacity() invoked");
        System.out.println(20000);
        return 20000; // mAh
    }
}

