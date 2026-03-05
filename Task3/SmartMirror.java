class SmartMirror {

    public static String getMirrorModel() {
        System.out.println("getMirrorModel() invoked");
        System.out.println("ReflectPro M1");
        return "ReflectPro M1";
    }

    public static double getMirrorPrice() {
        System.out.println("getMirrorPrice() invoked");
        System.out.println(29999.90);
        return 29999.90;
    }

    public static boolean hasWeatherDisplay() {
        System.out.println("hasWeatherDisplay() invoked");
        System.out.println(true);
        return true;
    }

    public static boolean supportsVoiceControl() {
        System.out.println("supportsVoiceControl() invoked");
        System.out.println(true);
        return true;
    }

    public static int getScreenSize() {
        System.out.println("getScreenSize() invoked");
        System.out.println(32);
        return 32; // inches
    }

    public static boolean hasTouchControl() {
        System.out.println("hasTouchControl() invoked");
        System.out.println(true);
        return true;
    }
}

