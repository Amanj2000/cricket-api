public class Bowler extends Player {
    Bowler(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean isOut() {
        int chances = 10;

        if((int)(Math.random() * chances) == 0) return true;
        else return false;
    }

    @Override
    public void display() {
        System.out.printf("Player: %s\tage: %d\tcategory: %s\truns scored: %d\tballs played: %d\n", getName(), getAge(), "Bowler", getTotalRun(), getBallsPlayed());
    }
}
