public class Bowler extends Player {
    Bowler(String name, int age) {
        super(name, age);
        setCategory("Bowler");
    }

    @Override
    public boolean isOut() {
        int chances = 10;
        return (int) (Math.random() * chances) == 0;
    }
}
