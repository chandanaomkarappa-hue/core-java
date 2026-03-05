class VRHeadsetExecutor{

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Device Name: " + VRHeadset.getDeviceName());
        System.out.println("----------------------------");

        System.out.println("Device Price: " + VRHeadset.getDevicePrice());
        System.out.println("----------------------------");

        System.out.println("Storage Capacity: " + VRHeadset.getStorageCapacity() + " GB");
        System.out.println("----------------------------");

        System.out.println("Hand Tracking Supported: " + VRHeadset.supportsHandTracking());
        System.out.println("----------------------------");

        System.out.println("Refresh Rate: " + VRHeadset.getRefreshRate() + " Hz");
        System.out.println("----------------------------");

        System.out.println("Built-in Speakers Available: " + VRHeadset.hasBuiltInSpeakers());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}