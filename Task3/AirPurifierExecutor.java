class AirPurifierExecutor{

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Model Name: " + AirPurifier.getModelName());
        System.out.println("---------------------------");

        System.out.println("Price: " + AirPurifier.getPrice());
        System.out.println("---------------------------");

        System.out.println("Coverage Area: " + AirPurifier.getCoverageArea() + " sq.ft");
        System.out.println("---------------------------");

        System.out.println("HEPA Filter Available: " + AirPurifier.hasHEPAFilter());
        System.out.println("---------------------------");

        System.out.println("Fan Speed Levels: " + AirPurifier.getFanSpeedLevels());
        System.out.println("---------------------------");

        System.out.println("Auto Mode Supported: " + AirPurifier.supportsAutoMode());
        System.out.println("---------------------------");

        System.out.println("main ended");
    }
}