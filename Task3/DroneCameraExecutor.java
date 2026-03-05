class DroneCameraExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Drone Model: " + DroneCamera.getDroneModel());
        System.out.println("----------------------------");

        System.out.println("Drone Price: " + DroneCamera.getDronePrice());
        System.out.println("----------------------------");

        System.out.println("Flight Time: " + DroneCamera.getFlightTime() + " minutes");
        System.out.println("----------------------------");

        System.out.println("GPS Available? " + DroneCamera.hasGPS());
        System.out.println("----------------------------");

        System.out.println("Camera Quality: " + DroneCamera.getCameraQuality());
        System.out.println("----------------------------");

        System.out.println("Control Range: " + DroneCamera.getControlRange() + " meters");
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}