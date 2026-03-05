class OttNetFlixWebSeries {

    static String webSeries[] = {
        "Suzhal: The Vortex",
        "Navarasa",
        "Paava Kadhaigal",
        "Queen",
        "Kallachirippu",
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
        "Label"
    };

    public static void main(String[] args) {

        getWebSeries();

    }

    static void getWebSeries() {
        System.out.println("The available Netflix Web Series are:");

        for(String series : webSeries) {
            System.out.println(series);
        }
    }
}