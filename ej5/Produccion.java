package ej5;

import java.util.Date;

public class Produccion implements Runnable {
    private String etapa;

    public Produccion(String etapa) {
        this.etapa = etapa;
    }

    @Override
    public void run() {
        long inicio = System.currentTimeMillis(); // Capturamos el tiempo de inicio
        System.out.println("Iniciando etapa: " + etapa + " | " + new Date());

        try {
            Thread.sleep(1000); // Simula tiempo de trabajo de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long fin = System.currentTimeMillis(); // Capturamos el tiempo al terminar
        long duracion = fin - inicio; // Calculamos duración

        System.out.println("Etapa " + etapa + " finalizada. Tomó " + duracion + " ms");
    }
}
