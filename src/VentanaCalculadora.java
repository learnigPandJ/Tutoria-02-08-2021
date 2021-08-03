import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.geometry.Pos; 
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modeloCalculadora.Calculadora;

public class VentanaCalculadora extends Application{

    Label result;
    TextField num1;
    TextField num2;
    ChoiceBox <String> operaciones;
    
    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        GridPane root = new GridPane();

        for (int i=0;i<4;i++){
            root.getColumnConstraints().add(new ColumnConstraints(100));
        }
        for (int i=0;i<6;i++){
            root.getRowConstraints().add(new RowConstraints(50));
        }
        root.setPadding(new Insets(5,5,5,5));
        root.setVgap(5); 
        root.setHgap(5);
        root.setAlignment(Pos.CENTER);

        Label textInt = new Label("Calculadora");
        root.add(textInt,1,0);

        Label n1 = new Label("Num1:");
        root.add(n1,0,1);
        num1 = new TextField();
        root.add(num1,1,1);

        Label n2 = new Label("Num2:");
        root.add(n2,2,1);
        num2= new TextField();
        root.add(num2,3,1);

        Button btn_calcular =  new Button("Calcular");

        root.add(btn_calcular,1,3);

        Label rs =  new Label("Resultado:");
        root.add(rs,0,4);

        result =  new Label();

        root.add(result,1,4);

        Label ops =  new Label("Seleccione op");
        root.add(ops,0,2);

        operaciones = new ChoiceBox<>();

        operaciones.getItems().addAll("+","-","*","/");

        root.add(operaciones,1,2);
        
        btn_calcular.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calcular();
            }
        });






        Scene scene = new Scene(root,450,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculadora");
        primaryStage.show();
    }


    public void calcular(){
        Calculadora cl =  new Calculadora();
        int numero1 =  Integer.parseInt(num1.getText());
        int numero2 = Integer.parseInt(num2.getText());
        String operacion = operaciones.getValue();

        switch(operacion){
            case "+":
                result.setText(String.valueOf(cl.sumar(numero1, numero2)));
            break;
            case "-":
                result.setText(String.valueOf(cl.restar(numero1, numero2)));
            break;
            case "*":
                result.setText(String.valueOf(cl.multiplicar(numero1, numero2)));
            break;
            case "/":
                result.setText(String.valueOf(cl.dividir(numero1, numero2)));
            break;
            default:
                result.setText("Operación Invalida");

        }

        System.out.println(numero1+numero2+operacion);
    }
}
