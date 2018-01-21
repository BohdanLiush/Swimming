import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer(5, 0, false);
        Swimmer swimmer1 = new Swimmer(15, 0, false);

        while (swimmer1.swimUntilFail() <= swimmer.swimUntilFail()) {
            System.out.println(swimmer1.currentDistance + " " + swimmer.currentDistance);
                swimmer1.clean();
                swimmer.clean();
        }
            System.out.println(swimmer1.currentDistance + " " + swimmer.currentDistance);
        }
    }

