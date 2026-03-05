class Printer {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("HP");
        return "HP";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(8999.90);
        return 8999.90;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("White");
        return "White";
    }

    public static boolean isWireless() {
        System.out.println("isWireless() invoked");
        System.out.println(true);
        return true;
    }

    public static int getPrintSpeed() {
        System.out.println("getPrintSpeed() invoked");
        System.out.println(20);
        return 20; // pages per minute
    }
}
