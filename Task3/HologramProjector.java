class HologramProjector {

    public static String getProjectorModel() {
        System.out.println("getProjectorModel() invoked");
        System.out.println("HoloVision X");
        return "HoloVision X";
    }

    public static double getProjectorPrice() {
        System.out.println("getProjectorPrice() invoked");
        System.out.println(175000.50);
        return 175000.50;
    }

    public static int getProjectionRange() {
        System.out.println("getProjectionRange() invoked");
        System.out.println(10);
        return 10; // meters
    }

    public static boolean supports3DDisplay() {
        System.out.println("supports3DDisplay() invoked");
        System.out.println(true);
        return true;
    }

    public static int getBrightnessLevel() {
        System.out.println("getBrightnessLevel() invoked");
        System.out.println(5000);
        return 5000; // lumens
    }

    public static boolean hasWirelessConnection() {
        System.out.println("hasWirelessConnection() invoked");
        System.out.println(true);
        return true;
    }
}

