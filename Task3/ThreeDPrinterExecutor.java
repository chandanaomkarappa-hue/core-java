class ThreeDPrinterExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Printer Model: " + ThreeDPrinter.getPrinterModel());
        System.out.println("----------------------------");

        System.out.println("Printer Price: " + ThreeDPrinter.getPrinterPrice());
        System.out.println("----------------------------");

        System.out.println("Print Speed: " + ThreeDPrinter.getPrintSpeed() + " mm/s");
        System.out.println("----------------------------");

        System.out.println("Multi-Color Printing Supported: " + ThreeDPrinter.supportsMultiColorPrinting());
        System.out.println("----------------------------");

        System.out.println("Build Volume: " + ThreeDPrinter.getBuildVolume() + " mm");
        System.out.println("----------------------------");

        System.out.println("Touch Screen Available: " + ThreeDPrinter.hasTouchScreen());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}