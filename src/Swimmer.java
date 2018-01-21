import java.util.Random;

public class Swimmer {

    public Swimmer(int failRate, int currentDistance, boolean isDead) {
        this.failRate = failRate;
        this.currentDistance = currentDistance;
        this.isDead = isDead;
    }

    private int failRate = 30;
    public int currentDistance = 0;
    private boolean isDead = false;

    public int swimUntilFail() {
        while (!this.isDead) {
                Random random = new Random();
                int a = random.nextInt(100);
                if (a <= failRate) {
                    isDead = true;
                } else {
                    currentDistance += 50;
                }
            }
        return currentDistance;
    }

    public void swimUntilFailInTenAttempt() {
        int totalDistance = 0;
        for (int i = 0; i < 10; i++) {
            this.swimUntilFail();
            totalDistance += this.currentDistance;
            this.currentDistance = 0;
            this.isDead = false;
        }
        System.out.println("Average distance for 10 attempts: " + (totalDistance / 10));
    }

    public void clean(){
        this.isDead = false;
        this.currentDistance = 0;
    }



}

