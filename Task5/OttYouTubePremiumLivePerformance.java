class OttYouTubePremiumLivePerformance {

    static String livePerformances[] = {
        "Kannada Folk Dance Live",
        "Carnatic Music Live",
        "Kannada Rock Concert",
        "Street Performance Kannada",
        "Live Magic Show Kannada",
        "Standup Comedy Live Kannada",
        "Live Drama Kannada",
        "Kannada Poetry Live",
        "Live Orchestra Kannada",
        "Kannada DJ Night",
        "Classical Singing Live Kannada",
        "Live Theatre Kannada",
        "Kannada Band Performance",
        "Live Instrumental Kannada",
        "Live Cultural Event Kannada",
        "Live Solo Singer Kannada",
        "Live Rap Kannada",
        "Live Dance Show Kannada",
        "Kannada Comedy Stage Live",
        "Live Quiz Show Kannada",
        "Live Art Performance Kannada",
        "Magic & Illusion Live Kannada",
        "Kannada Puppet Show Live",
        "Live Beatboxing Kannada",
        "Live Violin Kannada",
        "Live Tabla Kannada",
        "Live Guitar Kannada",
        "Kannada Music Festival Live",
        "Live Storytelling Kannada",
        "Live Traditional Dances Kannada"
    };

    public static void main(String[] args) {

        getLivePerformances();

    }

    static void getLivePerformances() {
        System.out.println("The available YouTube Premium Live Performances are:");

        for(String performance : livePerformances) {
            System.out.println(performance);
        }
    }
}