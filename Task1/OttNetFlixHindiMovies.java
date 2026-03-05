class OttNetFlixHindiMovies {

    static String hindiMovies[] = {
        "3 Idiots",
        "Dangal",
        "PK",
        "Bajrangi Bhaijaan",
        "Chennai Express",
        "War",
        "Pathaan",
        "Jawan",
        "Tiger Zinda Hai",
        "Sultan",
        "Kabir Singh",
        "Shershaah",
        "Drishyam",
        "Andhadhun",
        "Queen",
        "Zindagi Na Milegi Dobara",
        "Dilwale Dulhania Le Jayenge",
        "Kuch Kuch Hota Hai",
        "Kal Ho Naa Ho",
        "Yeh Jawaani Hai Deewani",
        "Gully Boy",
        "Barfi",
        "Article 15",
        "Uri: The Surgical Strike",
        "Tanhaji",
        "Brahmastra",
        "Don",
        "Raees",
        "Kesari",
        "Padmaavat"
    };

    public static void main(String[] args) {

        getHindiMovies();

    }

    static void getHindiMovies() {
        System.out.println("The available Netflix Hindi Movies are:");

        for(String movie : hindiMovies) {
            System.out.println(movie);
        }
    }
}