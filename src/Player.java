abstract public class Player {
    private String name;
    private int age;
    private int totalRun;
    private int ballsPlayed;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
        this.totalRun = 0;
        this.ballsPlayed = 0;
    }

    abstract public boolean isOut();
    abstract public void display();

    private int scoreRun() {
        return (int)(Math.random() * 7);
    }

    public boolean bat() {
        ballsPlayed += 1;
        if(isOut()) return false;
        totalRun += scoreRun();
        return true;
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
}
