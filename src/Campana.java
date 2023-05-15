public class Campana {
    //RISORSA

    boolean din, don;

    public Campana() {
        this.din = false;
        this.don = false;
    }

    public synchronized void emettiSuono(){
        String suono = Thread.currentThread().getName();

        switch (suono){
            case "din" -> {
                if(!din){
                    System.out.print(suono);
                    din = true;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            case "don" -> {
                if(din && !don){
                    System.out.print(", " + suono);
                    don = true;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            case "dan" -> {
                if(din && don){
                    System.out.print(", " + suono+"\n");
                    din = false;
                    don = false;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        notify();
    }
}
