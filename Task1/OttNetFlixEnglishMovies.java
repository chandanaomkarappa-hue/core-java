class OttNetFlixEnglishMovies {

    static String englishMovies[] = {
        "Red Notice",
        "The Gray Man",
        "Extraction",
        "Bird Box",
        "The Adam Project",
        "Enola Holmes",
        "Murder Mystery",
        "Don't Look Up",
        "6 Underground",
        "The Irishman",
        "Glass Onion",
        "The Mother",
        "Army of the Dead",
        "Triple Frontier",
        "The Old Guard",
        "Bright",
        "Damsel",
        "Rebel Moon",
        "The Kissing Booth",
        "To All the Boys I've Loved Before",
        "The Trial of the Chicago 7",
        "Purple Hearts",
        "The Platform",
        "Okja",
        "Marriage Story",
        "Tall Girl",
        "We Can Be Heroes",
        "Love and Monsters",
        "The Midnight Sky",
        "Project Power"
    };

    public static void main(String[] args) {

        getEnglishMovies();

    }

    static void getEnglishMovies() {
        System.out.println("The available Netflix English Movies are:");

        for(String movie : englishMovies) {
            System.out.println(movie);
        }
    }
}