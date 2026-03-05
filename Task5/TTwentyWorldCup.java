class TTwentyWorldCup {

    static String groupA[] = { "IND", "USA", "PAK", "NED", "NAM" };
    static String groupB[] = { "SL", "ZIM", "AUS", "IRE", "OMA" };
    static String groupC[] = { "WI", "ENG", "SCO", "ITA", "NEP" };
    static String groupD[] = { "SA", "NZ", "AFG", "UAE", "CAN" };

    public static void main(String[] args) {

        getTeams();

    }

    static void getTeams() {

        System.out.println("Tournament Name: T20 World Cup");

        System.out.println("\nGroup A Teams:");
        for(String team : groupA) {
            System.out.println(team);
        }

        System.out.println("\nGroup B Teams:");
        for(String team : groupB) {
            System.out.println(team);
        }

        System.out.println("\nGroup C Teams:");
        for(String team : groupC) {
            System.out.println(team);
        }

        System.out.println("\nGroup D Teams:");
        for(String team : groupD) {
            System.out.println(team);
        }
    }
}