class OttZee5Sports {

    static String sportsStreaming[] = {
        "Indian Premier League",
        "FIFA World Cup",
        "NBA League Pass",
        "UEFA Champions League",
        "Olympics Live",
        "WWE Live",
        "Pro Kabaddi",
        "F1 Live",
        "IPL Highlights",
        "Cricket World Cup",
        "Tennis Grand Slam",
        "Badminton World Tour",
        "Hockey India League",
        "ISL Football",
        "NFL Games",
        "Boxing Matches",
        "Kabaddi Highlights",
        "Golf Tournaments",
        "Wimbledon",
        "ICC T20 World Cup",
        "Cricket Analysis",
        "Soccer Highlights",
        "Live Score Updates",
        "Formula 1 Highlights",
        "MotoGP Live",
        "Sports Talk Shows",
        "Athletics Championships",
        "World Cup Qualifiers",
        "UEFA Euro",
        "Copa America"
    };

    public static void main(String[] args) {

        getSportsStreaming();

    }

    static void getSportsStreaming() {

        System.out.println("Platform Name: Zee5 Sports");
        System.out.println("Sports Streaming List:");

        for(String sport : sportsStreaming) {
            System.out.println(sport);
        }
    }
}