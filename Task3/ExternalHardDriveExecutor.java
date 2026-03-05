class ExternalHardDriveExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The ExternalHardDrive Brand is: " + ExternalHardDrive.getBrand());
        System.out.println("----------------------------");

        System.out.println("The ExternalHardDrive Price is: " + ExternalHardDrive.getPrice());
        System.out.println("----------------------------");

        System.out.println("The ExternalHardDrive Color is: " + ExternalHardDrive.getColor());
        System.out.println("----------------------------");

        System.out.println("Is it Portable? " + ExternalHardDrive.isPortable());
        System.out.println("----------------------------");

        System.out.println("The ExternalHardDrive Capacity is: " + ExternalHardDrive.getCapacity() + " GB");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}