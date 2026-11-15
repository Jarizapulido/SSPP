package Monitores;

public class Productor extends Thread {
    private Buffer almacen;
    private int dormir;

    public Productor(Buffer almacen, int dormir) {
        this.almacen = almacen;
        this.dormir = dormir;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            almacen.put(i);
            System.out.println("Productor pone: " + i);
            try {
                sleep(dormir);
            } catch (Exception e) {
                System.out.println("Error en el productor " + e.toString());
            }
        }
    }
}