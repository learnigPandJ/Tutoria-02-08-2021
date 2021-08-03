import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
/*
Metodo que conforman el ciclo de vida de una aplicación java fx
Metodo init() --> Es el primer metodo que se ejecuta cuando se ejecuta la application
metodo Start() --> Se ejecuta luego de ejecutado el init y en este se construyen todos los
                    componentes graficos
metodo Stop() --> Se ejecuta cuando de finaliza el application
*/
public class App2 extends Application{

    public static void main(String [] args){
        //El metodo launch llama de manera interna al metodo start cuando se inicia
        //a ejecutar el programa
        launch(args);
    }

    @Override
    public void init(){
        System.out.println("Se inicio a Ejecuta la aplicación");
    }

    //En el metodo start se construyen los elementos que componen la interfaz grafica
    //Este metodo start recibe como parametro el escenario (Stage)
    @Override
    public void start(Stage primaryStage){
        //Creamos la escena, esta es la que contiene los elementos o nodos que
        //forman nuestra GUI, (paneles, botones,labels, textfield, etc)
        //Usamos el contructor que recibe 3 parametros, en este caso el nodo raiz, el ancho y el alto
        StackPane root =  new StackPane();

        //Creamos un boton
        Button bt1 = new Button("Hola");
        //Agregamos el boton al nodo raiz
        root.getChildren().add(bt1);

        //Agregamos el nodo raiz a la escena
        Scene scene =  new Scene(root,400,250);
        //Agregamos la escena al escenario
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bienvenidos");

        //Mostramos el escenario
        primaryStage.show();
    }

    @Override
    public void stop(){
        System.out.println("Se dejo de ejecutar la aplicación");
    }
    
}
