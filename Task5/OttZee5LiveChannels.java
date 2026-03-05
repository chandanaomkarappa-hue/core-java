class OttZee5LiveChannels {

    static String platformName = "Zee5 Live Channels";

    static String liveChannels[] = {
        "Zee TV","Sony TV","Star Plus","Colors TV","Sony SAB",
        "Star Bharat","DD National","ETV Telugu","Sun TV","KTV",
        "MTV India","Nickelodeon India","Disney Channel India",
        "Cartoon Network India","Pogo","Hungama TV","AXN India",
        "Fox Life","History TV18","Discovery Channel",
        "National Geographic","Zee Cinema","Sony Max","Star Gold",
        "Movies OK","Romedy Now","AXN Movies","Colors Cineplex",
        "UTV Movies","Big Magic"
    };

    public static void main(String[] args) {

        getLiveChannels();

    }

    static void getLiveChannels() {

        System.out.println("Platform Name: " + platformName);
        System.out.println("Live Channels List:");

        for(String channel : liveChannels) {
            System.out.println(channel);
        }
    }
}