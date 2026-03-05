class WashingMachine {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("Samsung");
        return "Samsung";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(32999.80);
        return 32999.80;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("Silver");
        return "Silver";
    }

    public static boolean isFullyAutomatic() {
        System.out.println("isFullyAutomatic() invoked");
        System.out.println(true);
        return true;
    }

    public static int getCapacity() {
        System.out.println("getCapacity() invoked");
        System.out.println(7);
        return 7; // in kg
    }
}

