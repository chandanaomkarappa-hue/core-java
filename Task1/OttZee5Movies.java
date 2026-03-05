class OttZee5Movies{

    static String platformName = "Zee5 Movies";

    static String movies[] = {
        "Drishyam","Uri: The Surgical Strike","K.G.F Chapter 1","K.G.F Chapter 2",
        "Bahubali: The Beginning","Bahubali: The Conclusion","Pushpa",
        "Sye Raa Narasimha Reddy","Master","Vikrant Rona","Rangasthalam",
        "Ponniyin Selvan","RRR","KGF Chapter 3","Antim","Bajrangi Bhaijaan",
        "War","Tiger Zinda Hai","Kabir Singh","Shershaah","Andhadhun",
        "Queen","Padmaavat","Dangal","PK","Chhichhore","Secret Superstar",
        "Raazi","Badhaai Ho","Stree"
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