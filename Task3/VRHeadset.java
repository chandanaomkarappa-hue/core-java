class VRHeadset {

    public static String getDeviceName() {
        System.out.println("getDeviceName() invoked");
        System.out.println("VisionPlay VR");
        return "VisionPlay VR";
    }

    public static double getDevicePrice() {
        System.out.println("getDevicePrice() invoked");
        System.out.println(55999.90);
        return 55999.90;
    }

    public static int getStorageCapacity() {
        System.out.println("getStorageCapacity() invoked");
        System.out.println(256);
        return 256; // GB
    }

    public static boolean supportsHandTracking() {
        System.out.println("supportsHandTracking() invoked");
        System.out.println(true);
        return true;
    }

    public static int getRefreshRate() {
        System.out.println("getRefreshRate() invoked");
        System.out.println(120);
        return 120; // Hz
    }

    public static boolean hasBuiltInSpeakers() {
        System.out.println("hasBuiltInSpeakers() invoked");
        System.out.println(true);
        return true;
    }
}

