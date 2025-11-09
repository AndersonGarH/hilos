package org.example.tiempo.modelo;
import java.lang.Exception;

public class hiloRun implements Runnable {
    private int contador;

    @Override
    public void run() {
            while (true) {
                try {
                    contador++;


                }catch ( Exception e){
                    String mensaje = e.getMessage();
                    System.out.println(mensaje);
                }




            }
        /*catch (Exception e){
            String mensaje2 = e.getMessage();
            System.out.println(mensaje2);
        */}
    }

