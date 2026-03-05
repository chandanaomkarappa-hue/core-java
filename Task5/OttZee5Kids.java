class OttZee5Kids {

    static String platformName = "Zee5 Kids";

    static String kids[] = {
        "Motu Patlu","Chhota Bheem","Paw Patrol","Shiva","Roll No 21",
        "Little Singham","Adventures of Little Krishna","Super Bheem",
        "Tom and Jerry","Doraemon","Pokemon","My Little Pony",
        "PJ Masks","Miraculous Ladybug","The Loud House",
        "Big Hero 6: The Series","Kung Fu Panda Legends",
        "Oggy and the Cockroaches","Mighty Little Bheem","Go Jetters",
        "Chip and Potato","Inspector Chingum","Cocomelon",
        "Tayo the Little Bus","Peppa Pig","Masha and the Bear",
        "DuckTales","Caillou","Franklin and Friends","Arthur"
    };

    public static void main(String[] args) {

        getKidsShows();

    }

    static void getKidsShows() {

        System.out.println("Platform Name: " + platformName);
        System.out.println("Kids Shows List:");

        for(String show : kids) {
            System.out.println(show);
        }
    }
}