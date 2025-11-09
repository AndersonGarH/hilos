package org.example.tiempo.modelo;
import java.util.Timer;
/**
 *
 */
public class hiloControl extends Thread {
    private int contador;

    public void parar(){
        timer.stop();
    }

    public void setContador(int contador){
        this.contador = contador;
    }
    public void consulta(){
        setContador(contador);
    }

    public void run() {

            try {
                Timer timer = new Timer();


            } catch (Exception e) {
                String mensaje = e.getMessage();
                System.out.println(mensaje);
            }

    }
}
/*
hiloRun hilo = hiloRun();
new Thread(hilo).start();*/
