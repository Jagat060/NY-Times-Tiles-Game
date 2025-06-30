import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Display extends Stage {
    public Display(int w, int h) {
        this.setTitle("NY Times Tiles Game");
        Board board = new Board(6, 6, w,h);

        Scene scene = new Scene(board, w, h);
        this.setScene(scene);
        this.show();
    }

}
