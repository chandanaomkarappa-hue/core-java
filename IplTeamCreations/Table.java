class Table
{
	Team teams[];
	
	public void getTableDetails()
	{
		for(Team t : teams)
		{
			System.out.println("-----IPL Details-----");
			System.out.print("Name of the team: "+t.name );
            System.out.print("Number of matches played: "+t.playedMatches);
            System.out.print("Won Matches: "+t.won);
            System.out.print("Lost Matches: "+t.loss);
            System.out.print("Team Nrr: "+t.nrr);
            System.out.print("Team points: "+t.points);
            
            System.out.print("Last 5 matches: ");
            for(String s : t.last5)
            {
                System.out.print(s+" ");
            }
            System.out.println("\n");
		}
	}
}
