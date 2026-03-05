class SmartTV {
    public static String getBrand() {
        System.out.println("getBrand() invoked");
        System.out.println("Samsung");
        return "Samsung";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(84999.50);
        return 84999.50;
    }

    public static String getColor() {
        System.out.println("getColor() invoked");
        System.out.println("Black");
        return "Black";
    }

    public static boolean is4KSupported() {
        System.out.println("is4KSupported() invoked");
        System.out.println(true);
        return true;
    }

    public static int getScreenSize() {
        System.out.println("getScreenSize() invoked");
        System.out.println(55);
        return 55; // in inches
    }
}

