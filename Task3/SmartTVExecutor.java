class SmartTVExecutor {
    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("The SmartTV Brand is: " + SmartTV.getBrand());
        System.out.println("----------------------------");

        System.out.println("The SmartTV Price is: " + SmartTV.getPrice());
        System.out.println("----------------------------");

        System.out.println("The SmartTV Color is: " + SmartTV.getColor());
        System.out.println("----------------------------");

        System.out.println("Is 4K Supported? " + SmartTV.is4KSupported());
        System.out.println("----------------------------");

        System.out.println("The SmartTV Screen Size is: " + SmartTV.getScreenSize() + " inches");
        System.out.println("----------------------------");

        System.out.println("main ended");
        return;
    }
}