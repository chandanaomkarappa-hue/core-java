class BluetoothEarbudsExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The BluetoothEarbuds Brand is: " + BluetoothEarbuds.getBrand());
        System.out.println("----------------------------");

        System.out.println("The BluetoothEarbuds Price is: " + BluetoothEarbuds.getPrice());
        System.out.println("----------------------------");

        System.out.println("The BluetoothEarbuds Color is: " + BluetoothEarbuds.getColor());
        System.out.println("----------------------------");

        System.out.println("Has Noise Cancellation? " + BluetoothEarbuds.hasNoiseCancellation());
        System.out.println("----------------------------");

        System.out.println("The BluetoothEarbuds Battery Life is: " + BluetoothEarbuds.getBatteryLife() + " hours");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}