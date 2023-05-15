public class ThreadSuono extends Thread{
    Campana campana;

    public ThreadSuono(String name, Campana campana) {
        super(name);
        this.campana = campana;
    }

    @Override
    public void run() {
        while (true)
            campana.emettiSuono();
    }
}
