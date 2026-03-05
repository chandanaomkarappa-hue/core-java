class GamingConsoleExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The GamingConsole Brand is: " + GamingConsole.getBrand());
        System.out.println("----------------------------");

        System.out.println("The GamingConsole Price is: " + GamingConsole.getPrice());
        System.out.println("----------------------------");

        System.out.println("The GamingConsole Color is: " + GamingConsole.getColor());
        System.out.println("----------------------------");

        System.out.println("Does it have VR Support? " + GamingConsole.hasVRSupport());
        System.out.println("----------------------------");

        System.out.println("The GamingConsole Storage is: " + GamingConsole.getStorage() + " GB");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}