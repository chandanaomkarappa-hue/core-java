class AirPurifier{

    public static String getModelName() {
        System.out.println("getModelName() invoked");
        System.out.println("PureAir Max");
        return "PureAir Max";
    }

    public static double getPrice() {
        System.out.println("getPrice() invoked");
        System.out.println(18999.80);
        return 18999.80;
    }

    public static int getCoverageArea() {
        System.out.println("getCoverageArea() invoked");
        System.out.println(400);
        return 400; // square feet
    }

    public static boolean hasHEPAFilter() {
        System.out.println("hasHEPAFilter() invoked");
        System.out.println(true);
        return true;
    }

    public static int getFanSpeedLevels() {
        System.out.println("getFanSpeedLevels() invoked");
        System.out.println(3);
        return 3;
    }

    public static boolean supportsAutoMode() {
        System.out.println("supportsAutoMode() invoked");
        System.out.println(true);
        return true;
    }
}

