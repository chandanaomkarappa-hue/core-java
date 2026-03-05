class RobotVacuum{

    public static String getVacuumModel() {
        System.out.println("getVacuumModel() invoked");
        System.out.println("CleanBot Z5");
        return "CleanBot Z5";
    }

    public static double getVacuumPrice() {
        System.out.println("getVacuumPrice() invoked");
        System.out.println(25999.60);
        return 25999.60;
    }

    public static int getBatteryLife() {
        System.out.println("getBatteryLife() invoked");
        System.out.println(120);
        return 120; // minutes
    }

    public static boolean supportsAutoCleaning() {
        System.out.println("supportsAutoCleaning() invoked");
        System.out.println(true);
        return true;
    }

    public static int getDustCapacity() {
        System.out.println("getDustCapacity() invoked");
        System.out.println(600);
        return 600; // ml
    }

    public static boolean hasSmartNavigation() {
        System.out.println("hasSmartNavigation() invoked");
        System.out.println(true);
        return true;
    }
}

