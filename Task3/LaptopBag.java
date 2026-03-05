class LaptopBag {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("Targus");
        return "Targus";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(2999.99);
        return 2999.99;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("Dark Gray");
        return "Dark Gray";
    }

    public static boolean isWaterResistant() {
        System.out.println("isWaterResistant() invoked");
        System.out.println(true);
        return true;
    }

    public static int getCapacity() {
        System.out.println("getCapacity() invoked");
        System.out.println(20);
        return 20; // in liters
    }
}

