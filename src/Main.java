import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();

        primaryStage.setTitle("NY Times Tiles Game");
        Scene gameScene = new Scene(root, 800,800, Color.MAGENTA);
        primaryStage.setScene(gameScene);
        primaryStage.show();
    }
}