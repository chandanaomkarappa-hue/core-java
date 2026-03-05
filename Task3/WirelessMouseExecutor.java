class WirelessMouseExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The WirelessMouse Brand is: " + WirelessMouse.getBrand());
        System.out.println("----------------------------");

        System.out.println("The WirelessMouse Price is: " + WirelessMouse.getPrice());
        System.out.println("----------------------------");

        System.out.println("The WirelessMouse Color is: " + WirelessMouse.getColor());
        System.out.println("----------------------------");

        System.out.println("Is it Rechargeable? " + WirelessMouse.isRechargeable());
        System.out.println("----------------------------");

        System.out.println("The WirelessMouse DPI is: " + WirelessMouse.getDPI());
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}