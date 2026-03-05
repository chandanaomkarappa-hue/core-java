class DigitalCameraExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The DigitalCamera Brand is: " + DigitalCamera.getBrand());
        System.out.println("----------------------------");

        System.out.println("The DigitalCamera Price is: " + DigitalCamera.getPrice());
        System.out.println("----------------------------");

        System.out.println("The DigitalCamera Color is: " + DigitalCamera.getColor());
        System.out.println("----------------------------");

        System.out.println("Does it have Wifi? " + DigitalCamera.hasWifi());
        System.out.println("----------------------------");

        System.out.println("The DigitalCamera Megapixels are: " + DigitalCamera.getMegapixels() + " MP");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}