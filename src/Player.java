abstract public class Player {
    private final String name;
    private final int age;
    private int totalRun;
    private int ballsPlayed;
    private String category;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
        this.totalRun = 0;
        this.ballsPlayed = 0;
    }

    abstract public boolean isOut();

    private int scoreRun() {
        return (int)(Math.random() * 7);
    }

    public int bat() {
        ballsPlayed += 1;
        if(isOut()) return -1;

        int run = scoreRun();
        totalRun += run;
        return run;
    }

    public void display() {
        System.out.printf("%15s (%s) : %3d (%d)\n", getName(), getCategory(), getTotalRun(), getBallsPlayed());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getTotalRun() {
        return totalRun;
    }

    public int getBallsPlayed() {
        return ballsPlayed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
