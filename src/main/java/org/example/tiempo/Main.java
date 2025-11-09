import org.example.tiempo.modelo.hiloControl;
import javafx.application.Application;
import javafx.stage.Stage;
import org.example.tiempo.vista.aplicacion;


public class Main extends Application {

        @Override
        public void start(Stage stage) throws Exception{
            try {
                aplicacion.getInstance();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        /*System.out.println("mensaje de main");
        //hiloRun run = new hiloRun();
        hiloControl thread = new hiloControl();
        thread.setDaemon(true);
        thread.start();

        System.out.println(thread.getState());
        System.out.println(thread.getPriority());
        System.out.println(thread.isDaemon());*/


}