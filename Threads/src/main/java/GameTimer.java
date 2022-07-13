public class GameTimer extends Thread {

    public static void main(String[] args) throws InterruptedException {
        GameTimer turn = new GameTimer();
        turn.start();

        for (int i = 1; i <= 10; i++) {
            turn.sleep(750);
            System.out.println(i);
        }
    }

    public void run() {
        System.out.println("Game Timer running...");
    }

}
