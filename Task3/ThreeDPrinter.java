class ThreeDPrinter {

    public static String getPrinterModel() {
        System.out.println("getPrinterModel() invoked");
        System.out.println("PrintMaster 3D-X");
        return "PrintMaster 3D-X";
    }

    public static double getPrinterPrice() {
        System.out.println("getPrinterPrice() invoked");
        System.out.println(125000.75);
        return 125000.75;
    }

    public static int getPrintSpeed() {
        System.out.println("getPrintSpeed() invoked");
        System.out.println(150);
        return 150; // mm per second
    }

    public static boolean supportsMultiColorPrinting() {
        System.out.println("supportsMultiColorPrinting() invoked");
        System.out.println(true);
        return true;
    }

    public static int getBuildVolume() {
        System.out.println("getBuildVolume() invoked");
        System.out.println(300);
        return 300; // mm
    }

    public static boolean hasTouchScreen() {
        System.out.println("hasTouchScreen() invoked");
        System.out.println(true);
        return true;
    }
}

