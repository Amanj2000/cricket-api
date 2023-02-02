import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricketGame {
    public static void main(String[] args) {
        Batsman virat = new Batsman("Virat", 25);
        Batsman abd = new Batsman("AB Devilers", 30);
        Batsman rohit = new Batsman("Rohit Sharma", 30);
        Batsman gill = new Batsman("Gill", 28);

        Bowler bumrah = new Bowler("Bumrah", 25);
        Bowler bolt = new Bowler("Bolt", 30);
        Bowler malinga = new Bowler("Malinga", 30);
        Bowler ashwin = new Bowler("Ashwin", 28);

        List<Player> rcbPlayers = new ArrayList<>(Arrays.asList(virat, abd, bumrah, bolt));
        List<Player> cskPlayers = new ArrayList<>(Arrays.asList(rohit, gill, malinga, ashwin));

        Team rcb = new Team("RCB", rcbPlayers);
        Team csk = new Team("CSK", cskPlayers);

        Match match = new Match(rcb, csk);
        match.startMatch();
        match.displayResult();
    }
}