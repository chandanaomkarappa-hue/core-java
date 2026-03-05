class OttJioHotstarKannada1 {

    static String realityShows[] = {
        "Bigg Boss Kannada",
        "Super Singer",
        "Dancing Star",
        "Comedy Khiladigalu",
        "Sa Re Ga Ma Pa",
        "Cook with Comedians",
        "Family Challenge",
        "Star Quest",
        "Sing & Win",
        "Fun Fiesta",
        "Talent Hunt",
        "Superstar Juniors",
        "Laugh Out Loud",
        "Kannada Idol",
        "Reality Raja",
        "Rising Stars Kannada",
        "Dance Karnataka",
        "Singing Superstars",
        "Comedy Express",
        "Star Chef",
        "Life Super Guru",
        "Chota Champion",
        "Raja Rani",
        "Kutumba",
        "Namma Ooru Reality",
        "Reality Hunt",
        "Kannada Game Show",
        "Super Comedy Challenge",
        "Sing & Dance",
        "Junior Stars"
    };

    public static void main(String[] args) {

        getRealityShows();

    }

    static void getRealityShows() {
        System.out.println("The available Jio Hotstar Kannada Reality Shows are:");

        for(String show : realityShows) {
            System.out.println(show);
        }
    }
}