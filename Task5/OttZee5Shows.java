class OttZee5TeluguMovies{

    static String platformName = "Zee5 Telugu Movies";

    static String movies[] = {
        "Arjun Reddy", "Geetha Govindam", "Ala Vaikunthapurramuloo", "Sarkaru Vaari Paata",
        "Pushpa: The Rise", "RRR", "Bahubali: The Beginning", "Bahubali: The Conclusion",
        "Jersey", "Fidaa", "Maharshi", "Sita Ramam", "Bhale Bhale Magadivoy",
        "Kshanam", "Eega", "Athadu", "Magadheera", "Temper", "Drushyam",
        "Rangasthalam", "Srimanthudu", "Vikramarkudu", "Ghazi", "Iddarammayilatho",
        "Seethamma Vakitlo Sirimalle Chettu", "Bommarillu", "Leader", "Okkadu", "Bomma Blockbuster"
    };

    public static void main(String[] args) {
        getMovies();
    }

    static void getMovies() {
        System.out.println("Platform Name: " + platformName);
        System.out.println("Movies List:");
        for(String movie : movies) {
            System.out.println(movie);
        }
    }
}