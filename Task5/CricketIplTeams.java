class CricketIplTeams {

    static String iplTeamNames[] = {
        "Royal Challengers Bengaluru",
        "Chennai Super Kings",
        "Mumbai Indians",
        "Kolkata Knight Riders",
        "Delhi Capitals",
        "Rajasthan Royals",
        "Sunrisers Hyderabad",
        "Punjab Kings",
        "Gujarat Titans",
        "Lucknow Super Giants"
    };

    public static void main(String[] args) {

        getIplTeamNames();

    }

    static void getIplTeamNames() {
        System.out.println("The available IPL Teams are:");

        for(String team : iplTeamNames) {
            System.out.println(team);
        }
    }
}