public class Batsman extends Player {
    Batsman(String name, int age) {
        super(name, age);
        setCategory("Batsman");
    }

    @Override
    public boolean isOut() {
        int chances = 20;
        return (int)(Math.random() * chances) == 0;
    }
}
