class IplExecutor
{
	public static void main(String[] ie)
	{
		String rr[]={"won","won","won","won","no"};
		String pbks[]={"won","won","draw","won","not played"};
		String rcb[]={"won","won","loss","won","not played"};
		String srh[]={"loss","won","loss","loss","won"};
		String dc[]={"won","won","loss","loss","not played"};
		String gt[]={"loss","loss","won","won","not played"};
		String lsg[]={"loss","won","won","loss","not played"};
		String mi[]={"won","loss","loss","loss","not played"};
		String csk[]={"loss","loss","loss","won","not played"};
		String kkr[]={"loss","loss","draw","loss","not played"};
			
		Team teamOne=new Team();
		teamOne.name="RR";
		teamOne.playedMatches=5;
		teamOne.won=4;
		teamOne.loss=1;
		teamOne.nrr=0.889;
		teamOne.points=8;
		teamOne.last5=rr;
		
		Team teamTwo=new Team();
		teamTwo.name="PBKS";
		teamTwo.playedMatches=4;
		teamTwo.won=3;
		teamTwo.loss=0;
		teamTwo.nrr=0.720;
		teamTwo.points=7;
		teamTwo.last5=pbks;
		
		Team teamThree=new Team();
		teamThree.name="RCB";
		teamThree.playedMatches=4;
		teamThree.won=3;
		teamThree.loss=1;
		teamThree.nrr=1.148;
		teamThree.points=6;
		teamThree.last5=rcb;
		
		Team teamFour=new Team();
		teamFour.name="SRH";
		teamFour.playedMatches=5;
		teamFour.won=2;
		teamFour.loss=3;
		teamFour.nrr=0.576;
		teamFour.points=4;
		teamFour.last5=srh;
		
		Team teamFive=new Team();
		teamFive.name="DC";
		teamFive.playedMatches=4;
		teamFive.won=2;
		teamFive.loss=2;
		teamFive.nrr=0.322;
		teamFive.points=4;
		teamFive.last5=dc;
		
		Team teamSix=new Team();
		teamSix.name="GT";
		teamSix.playedMatches=4;
		teamSix.won=2;
		teamSix.loss=2;
		teamSix.nrr=0.029;
		teamSix.points=4;
		teamSix.last5=gt;
		
		Team teamSeven=new Team();
		teamSeven.name="LSG";
		teamSeven.playedMatches=4;
		teamSeven.won=2;
		teamSeven.loss=2;
		teamSeven.nrr=0.427;
		teamSeven.points=4;
		teamSeven.last5=lsg;
		
		Team teamEight=new Team();
		teamEight.name="MI";
		teamEight.playedMatches=4;
		teamEight.won=1;
		teamEight.loss=3;
		teamEight.nrr=0.772;
		teamEight.points=2;
		teamEight.last5=mi;
		
		Team teamNine=new Team();
		teamNine.name="CSK";
		teamNine.playedMatches=4;
		teamNine.won=1;
		teamNine.loss=3;
		teamNine.nrr=1.532;
		teamNine.points=2;
		teamNine.last5=csk;
		
		Team teamTen=new Team();
		teamTen.name="KKR";
		teamTen.playedMatches=4;
		teamTen.won=0;
		teamTen.loss=3;
		teamTen.nrr=1.315;
		teamTen.points=1;
		teamTen.last5=kkr;
		
		Team teams[]=new Team[10];
		teams[0]=teamOne;
		teams[1]=teamTwo;
		teams[2]=teamThree;
		teams[3]=teamFour;
		teams[4]=teamFive;
		teams[5]=teamSix;
		teams[6]=teamSeven;
		teams[7]=teamEight;
		teams[8]=teamNine;
		teams[9]=teamTen;
		 
		Table table =new Table();
		table.teams = teams;
		
		Season season=new Season();
		season.table = table;
			
		Ipl ipl=new Ipl();
		ipl.season = season;
		 
		ipl.getIplDetails();
	}
}








