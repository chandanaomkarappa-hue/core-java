class SmartHelmetExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Helmet Model: " + SmartHelmet.getHelmetModel());
        System.out.println("----------------------------");

        System.out.println("Helmet Price: " + SmartHelmet.getHelmetPrice());
        System.out.println("----------------------------");

        System.out.println("Bluetooth Connectivity: " + SmartHelmet.hasBluetoothConnectivity());
        System.out.println("----------------------------");

        System.out.println("Navigation Display Supported: " + SmartHelmet.supportsNavigationDisplay());
        System.out.println("----------------------------");

        System.out.println("Battery Backup: " + SmartHelmet.getBatteryBackup() + " hours");
        System.out.println("----------------------------");

        System.out.println("Accident Alert Available: " + SmartHelmet.hasAccidentAlert());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}