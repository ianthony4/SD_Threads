package ej5;

/**
 * Created by G5 Sistemas distribuidos
 */

import java.util.ArrayList;

public class Ej5Gestor {
    public Ej5Gestor(int numeroEtapas) {
        ArrayList<Thread> lineasProduccion = new ArrayList<>();

        for (int i = 1; i <= numeroEtapas; i++) {
            Produccion produccion = new Produccion(String.valueOf(i));
            lineasProduccion.add(new Thread(produccion, "Linea " + i));
        }

        System.out.println("Comenzando producción...");

        for (Thread linea : lineasProduccion) {
            try {
                linea.start();
                linea.join(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Producción terminada.");
    }
}
