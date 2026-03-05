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

        getIplTeams();

    }

    static void getIplTeams() {

        System.out.println("Category Name: Cricket IPL Teams");
        System.out.println("IPL Teams List:");

        for(String team : iplTeamNames) {
            System.out.println(team);
        }
    }
}