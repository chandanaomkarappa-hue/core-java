class OttHotstarKannadaMovies {

    static String movies[] = {
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

        getMovies();

    }

    static void getMovies() {
        System.out.println("The available Hotstar Kannada Movies are:");

        for(String movie : movies) {
            System.out.println(movie);
        }
    }
}