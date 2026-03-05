class OttNetFlixTeluguMovies {

    static String teluguMovies[] = {
        "Pushpa",
        "RRR",
        "K.G.F Chapter 2",
        "Vikrant Rona",
        "Sye Raa Narasimha Reddy",
        "Rangasthalam",
        "Arjun Reddy",
        "Ala Vaikunthapurramuloo",
        "Maharshi",
        "Sarileru Neekevvaru",
        "Eega",
        "Baahubali: The Beginning",
        "Baahubali: The Conclusion",
        "Geetha Govindam",
        "Fidaa",
        "Attarintiki Daredi",
        "Magadheera",
        "Jersey",
        "Aravinda Sametha",
        "Spyder",
        "Sarrainodu",
        "Bhale Bhale Magadivoy",
        "Adhurs",
        "Dhruva",
        "Ok Bangaram",
        "Kshanam",
        "Goodachari",
        "Nannaku Prematho",
        "Manam",
        "RRR 2"
    };

    public static void main(String[] args) {

        getTeluguMovies();

    }

    static void getTeluguMovies() {
        System.out.println("The available Netflix Telugu Movies are:");

        for(String movie : teluguMovies) {
            System.out.println(movie);
        }
    }
}