class SmartDoorLockExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Lock Model: " + SmartDoorLock.getLockModel());
        System.out.println("----------------------------");

        System.out.println("Lock Price: " + SmartDoorLock.getLockPrice());
        System.out.println("----------------------------");

        System.out.println("Fingerprint Supported: " + SmartDoorLock.supportsFingerprint());
        System.out.println("----------------------------");

        System.out.println("Mobile App Supported: " + SmartDoorLock.supportsMobileApp());
        System.out.println("----------------------------");

        System.out.println("Maximum User Access: " + SmartDoorLock.getMaxUserAccess());
        System.out.println("----------------------------");

        System.out.println("Alarm System Available: " + SmartDoorLock.hasAlarmSystem());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}