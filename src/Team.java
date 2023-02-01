import java.util.List;

public class Team {
    private String name;
    private List<Player> players;
    private int teamScore;
    private int ballsPlayed;

    Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public void play() {
        for(Player p: players) {
            while(p.bat());
            teamScore += p.getTotalRun();
            ballsPlayed += p.getBallsPlayed();
            p.display();
        }
    }

    public String getName() {
        return name;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public void display() {
        System.out.printf("Team: %s\tRuns Scored: %d\tBall Played: %d\n", name, teamScore, ballsPlayed);
    }
}
