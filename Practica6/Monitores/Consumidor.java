package Monitores;

public class Consumidor extends Thread {
    private Buffer almacen;
    private int dormir;

    public Consumidor(Buffer almacen, int dormir) {
        this.almacen = almacen;
        this.dormir = dormir;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            int valor = almacen.get();
            System.out.println("Consumidor saca: " + valor);
            try {
                sleep(dormir);
            } catch (Exception e) {
                System.out.println("Error en el consumidor " + e.toString());
            }
        }
    }
}