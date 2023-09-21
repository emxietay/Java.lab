package vn.funix.fx22541.lab14_1;

public class Main {
    public static void main(String[] args) {
        FootballPlayer nam = new FootballPlayer("Nam");
        FootballPlayer nam1 = new FootballPlayer("Nam1");
        FootballPlayer nam2 = new FootballPlayer("Nam2");
        FootballPlayer nam3 = new FootballPlayer("Nam3");

        FootballPlayer bac = new FootballPlayer("Bac");
        FootballPlayer bac1 = new FootballPlayer("Bac1");
        FootballPlayer bac2 = new FootballPlayer("Bac2");
        FootballPlayer bac3 = new FootballPlayer("Bac3");

        var manchesterUtd = new Team<FootballPlayer>("MU");
        manchesterUtd.addPlayer(nam);
        manchesterUtd.addPlayer(nam1);
        manchesterUtd.addPlayer(nam2);
        manchesterUtd.addPlayer(nam3);

        var manchesterCity = new Team<FootballPlayer>("MC");
        manchesterCity.addPlayer(bac);
        manchesterCity.addPlayer(bac1);
        manchesterCity.addPlayer(bac2);
        manchesterCity.addPlayer(bac3);

        League<Team<FootballPlayer>> premierLeague = new League<>("Premier League");
        premierLeague.add(manchesterUtd);
        premierLeague.add(manchesterCity);

        manchesterUtd.matchResult(manchesterCity, 5, 0);

        premierLeague.showLeagueTable();


    }
}

