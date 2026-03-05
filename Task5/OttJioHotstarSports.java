class OttJioHotstarSports {

    static String sports[] = {
        "Indian Premier League",
        "Pro Kabaddi",
        "FIFA World Cup",
        "NBA Live",
        "Olympics Live",
        "WWE Live",
        "Formula 1 Live",
        "Tennis Grand Slam",
        "Hockey India League",
        "ISL Football",
        "Cricket World Cup",
        "Badminton World Tour",
        "Boxing Matches",
        "Golf Tournaments",
        "ICC T20 World Cup",
        "NFL Games",
        "Kabaddi Highlights",
        "Soccer Highlights",
        "MotoGP Live",
        "Athletics Championships",
        "World Cup Qualifiers",
        "UEFA Champions League",
        "Copa America",
        "Fast5 Netball",
        "Wimbledon Matches",
        "Sports Talk Shows",
        "Live Score Updates",
        "Cricket Analysis",
        "T20 Highlights",
        "F1 Highlights"
    };

    public static void main(String[] args) {

        getSports();

    }

    static void getSports() {
        System.out.println("The available Jio Hotstar Sports are:");

        for(String sport : sports) {
            System.out.println(sport);
        }
    }
}