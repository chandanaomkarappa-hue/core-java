class OttZee5News {

    static String news[] = {
        "Zee News",
        "India Today",
        "Aaj Tak",
        "NDTV India",
        "Republic TV",
        "Times Now",
        "CNN News18",
        "BBC World News",
        "Al Jazeera",
        "Fox News",
        "Sky News",
        "Economic Times News",
        "NDTV 24x7",
        "Zee Business",
        "News18 India",
        "ABP News",
        "CNN International",
        "India TV",
        "India Today English",
        "Reuters",
        "Bloomberg",
        "WION",
        "CNBC TV18",
        "ANI News",
        "News Nation",
        "India TV Live",
        "DD News",
        "Lok Sabha TV",
        "Rajya Sabha TV",
        "Mirror Now"
    };

    public static void main(String[] args) {

        getNewsChannels();

    }

    static void getNewsChannels() {

        System.out.println("Platform Name: Zee5 News");
        System.out.println("News Channels List:");

        for(String channel : news) {
            System.out.println(channel);
        }
    }
}