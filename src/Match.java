public class Match {
    private Team team1;
    private Team team2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void startMatch() {
        System.out.println("Team batting: " + team1.getName());
        team1.play();
        team1.display();
        System.out.println();
        System.out.println("Team batting: " + team2.getName());
        team2.play();
        team2.display();
        System.out.println();
    }

    public void displayResult() {
        if(team1.getTeamScore() > team2.getTeamScore()) {
            System.out.printf("%s won!\n", team1.getName());
        } else if(team1.getTeamScore() < team2.getTeamScore()) {
            System.out.printf("%s won!\n", team2.getName());
        } else {
            System.out.printf("Draw\n");
        }
    }
}
