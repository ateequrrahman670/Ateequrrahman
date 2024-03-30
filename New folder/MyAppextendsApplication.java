import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyAppextendsApplication {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, World!");
        StackPane root = new stackPane(label);
        Scene scene = new scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}