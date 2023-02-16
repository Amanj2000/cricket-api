import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricketGame {
    public static void main(String[] args) {
        Batsman virat = new Batsman("Virat Kohli", 25);
        Batsman abd = new Batsman("AB de villiers", 30);
        Batsman plussis = new Batsman("F du Plessis", 30);
        Batsman dhoni = new Batsman("MS Dhoni", 28);

        Bowler yuvi = new Bowler("Yuvi Chahal", 25);
        Bowler harshal = new Bowler("Harshal patel", 30);
        Bowler bravo = new Bowler("Dwayne Bravo", 30);
        Bowler chahar = new Bowler("Deepak Chahar", 28);

        List<Player> rcbPlayers = new ArrayList<>(Arrays.asList(virat, abd, yuvi, harshal));
        List<Player> cskPlayers = new ArrayList<>(Arrays.asList(plussis, dhoni, bravo, chahar));

        Team rcb = new Team("RCB", rcbPlayers);
        Team csk = new Team("CSK", cskPlayers);

        Match match = new Match(rcb, csk, 10);
        match.startMatch();
        match.displayResult();
    }
}