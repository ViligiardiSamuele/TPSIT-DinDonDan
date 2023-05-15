public class Main {
    public static void main(String[] args) throws InterruptedException {
        Campana campana = new Campana();
        ThreadSuono TS_din = new ThreadSuono("din", campana);
        ThreadSuono TS_don = new ThreadSuono("don", campana);
        ThreadSuono TS_dan = new ThreadSuono("dan", campana);

        TS_din.start();
        TS_don.start();
        TS_dan.start();
        Thread.sleep(10000);
        System.exit(0);
    }
}