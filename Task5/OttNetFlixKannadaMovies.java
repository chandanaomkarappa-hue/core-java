class OttNetFlixKannadaMovies {

    static String kannadaMovies[] = {
        "K.G.F Chapter 1",
        "K.G.F Chapter 2",
        "Kirik Party",
        "Love Mocktail",
        "Dia",
        "Avane Srimannarayana",
        "U-Turn",
        "Bell Bottom",
        "Godhi Banna Sadharana Mykattu",
        "RangiTaranga",
        "Charlie 777",
        "Vikrant Rona",
        "Mufti",
        "Tagaru",
        "Roberrt",
        "Yuvarathnaa",
        "Raajakumara",
        "James",
        "Kotigobba 3",
        "Masterpiece",
        "Googly",
        "Gaalipata",
        "Drama",
        "Natasaarvabhowma",
        "Ranna",
        "Hebbuli",
        "Addhuri",
        "Milana",
        "Simple Agi Ondh Love Story",
        "Thithi"
    };

    public static void main(String[] args) {

        getKannadaMovies();

    }

    static void getKannadaMovies() {
        System.out.println("The available Netflix Kannada Movies are:");

        for(String movie : kannadaMovies) {
            System.out.println(movie);
        }
    }
}