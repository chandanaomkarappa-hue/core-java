class PrinterExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The Printer Brand is: " + Printer.getBrand());
        System.out.println("----------------------------");

        System.out.println("The Printer Price is: " + Printer.getPrice());
        System.out.println("----------------------------");

        System.out.println("The Printer Color is: " + Printer.getColor());
        System.out.println("----------------------------");

        System.out.println("Is it Wireless? " + Printer.isWireless());
        System.out.println("----------------------------");

        System.out.println("The Printer Print Speed is: " + Printer.getPrintSpeed() + " pages per minute");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}