class SmartMirrorExecutor {

    public static void main(String[] args) {

        System.out.println("main started");

        System.out.println("Mirror Model: " + SmartMirror.getMirrorModel());
        System.out.println("----------------------------");

        System.out.println("Mirror Price: " + SmartMirror.getMirrorPrice());
        System.out.println("----------------------------");

        System.out.println("Weather Display Available: " + SmartMirror.hasWeatherDisplay());
        System.out.println("----------------------------");

        System.out.println("Voice Control Supported: " + SmartMirror.supportsVoiceControl());
        System.out.println("----------------------------");

        System.out.println("Screen Size: " + SmartMirror.getScreenSize() + " inches");
        System.out.println("----------------------------");

        System.out.println("Touch Control Available: " + SmartMirror.hasTouchControl());
        System.out.println("----------------------------");

        System.out.println("main ended");
    }
}