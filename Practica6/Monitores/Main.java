package Monitores;

public class Main {
    public static void main(String[] args) {
        final int DORMIR_PRODUCTOR = 1000;
        final int DORMIR_CONSUMIDOR = 2000;

        Buffer almacen = new Buffer();

        Productor productor = new Productor(almacen, DORMIR_PRODUCTOR);
        Consumidor consumidor = new Consumidor(almacen, DORMIR_CONSUMIDOR);

        productor.start();
        consumidor.start();
    }
}