class HologramProjectorExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Projector Model: " + HologramProjector.getProjectorModel());
        System.out.println("----------------------------");

        System.out.println("Projector Price: " + HologramProjector.getProjectorPrice());
        System.out.println("----------------------------");

        System.out.println("Projection Range: " + HologramProjector.getProjectionRange() + " meters");
        System.out.println("----------------------------");

        System.out.println("3D Display Supported: " + HologramProjector.supports3DDisplay());
        System.out.println("----------------------------");

        System.out.println("Brightness Level: " + HologramProjector.getBrightnessLevel() + " lumens");
        System.out.println("----------------------------");

        System.out.println("Wireless Connection Available: " + HologramProjector.hasWirelessConnection());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}