import javafx.application.Application;
import javafx.stage.Stage;
import jdk.management.jfr.EventTypeInfo;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
public class Ventana extends Application{
    Label lb2;
    Button bt1;
    TextField textF1;
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        GridPane root = new GridPane();
        for (int i=0;i<6;i++){
            root.getColumnConstraints().add(new ColumnConstraints(133));
        }
        for (int i=0;i<6;i++){
            root.getRowConstraints().add(new RowConstraints(50));
        }
        //RowConstraints row1 = new RowConstraints(100);
        //RowConstraints row2 = new RowConstraints(100);
        //RowConstraints row3 = new RowConstraints(100);
        /*ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(100);
        ColumnConstraints column3 = new ColumnConstraints(100);
        ColumnConstraints column4 = new ColumnConstraints(100);*/
        //root.getColumnConstraints().addAll(column1, column2,column3,column4);
        //root.getRowConstraints().addAll(row1,row2,row3);

        bt1 = new Button("Saludar");
        Label lb1 =  new Label("Oprime el boton para saludar");
        lb2 =  new Label("Aquí aparecera tu nombre");
        textF1 = new TextField();
        //root.setStyle("-fx-background: blue");
        root.add(lb1,1,0);
        root.add(bt1, 0, 1);
        root.add(textF1, 1, 1);
        root.add(lb2, 1, 3);
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                saludar();
            }
        });
        


        Scene scene =  new Scene(root, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Mi Primer Escenario"); 
        primaryStage.show();
    }

    public void saludar(){
        String nombre = textF1.getText();
        lb2.setText("Hola: "+nombre);
    }
   
}
