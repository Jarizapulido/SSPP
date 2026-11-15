package Semaforos;

import java.util.concurrent.Semaphore;

public class Buffer {
    private int contenido;
    private Semaphore semaforoGet = new Semaphore(0);
    private Semaphore semaforoPut = new Semaphore(1);

    public int get() {
        try {
            semaforoGet.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int valor = contenido;
        semaforoPut.release();
        return valor;
    }

    public void put(int valor) {
        try {
            semaforoPut.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        contenido = valor;
        semaforoGet.release();
    }
}