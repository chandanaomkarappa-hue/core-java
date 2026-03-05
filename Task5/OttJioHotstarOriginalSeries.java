class OttJioHotstarOriginalSeries {

    static String originalSeries[] = {
        "Suzhal: The Vortex",
        "Navarasa",
        "Paava Kadhaigal",
        "Queen Kallachirippu",
        "Auto Shankar",
        "November Story",
        "Live Telecast",
        "The Village",
        "Vadhandhi: The Fable of Velonie",
        "Meme Boys",
        "Karoline Kamakshi",
        "Paper Rocket",
        "Anantham",
        "Mathagam",
        "Ayali",
        "Triples",
        "Time Enna Boss",
        "Iru Dhuruvam",
        "Thiravam",
        "As I'm Suffering From Kadhal",
        "Fingertip",
        "High Priestess",
        "PUBGOA",
        "Chutney Sambar",
        "Vilangu",
        "Sengalam",
        "Inspector Rishi",
        "Snakes and Ladders",
        "Label",
        "The Night Manager"
    };

    public static void main(String[] args) {

        getOriginalSeries();

    }

    static void getOriginalSeries() {
        System.out.println("The available Jio Hotstar Original Series are:");

        for(String series : originalSeries) {
            System.out.println(series);
        }
    }
}