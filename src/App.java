import javax.swing.GroupLayout;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.Group;
import javafx.stage.Stage;
public class App extends Application {
public static void main(String[] args) {
launch(args);
}
@Override
public void start(Stage primaryStage) {
primaryStage.setTitle("Hello World!");

Label lb1 = new Label();
lb1.setText("Esto es solo una prueba para que miren bien");
lb1.setLayoutX(105);
lb1.setLayoutY(110);
Button btn = new Button();
btn.setText("Say 'Hello World'");
btn.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent event) {
System.out.println("Hello World!");
}
});
Group root = new Group();
root.getChildren().add(btn);
root.getChildren().add(lb1);
primaryStage.setScene(new Scene(root, 300, 250));
primaryStage.show();
}
}
