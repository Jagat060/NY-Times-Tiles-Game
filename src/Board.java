import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Board extends GridPane{
    public Board(int rows, int cols, int width, int height) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Rectangle rect = new Rectangle(width/rows, height/cols);
                rect.setFill(Color.LIGHTBLUE);
                rect.setStroke(Color.BLACK);
                Rectangle rect1 = new Rectangle(0.7* width/rows, 0.7*height/cols);
                rect1.setFill(Color.YELLOW);
                rect1.setStroke(Color.BLACK);
                Rectangle rect2 = new Rectangle(0.45*width/rows, 0.45*height/cols);
                rect2.setFill(Color.GREEN);
                rect2.setStroke(Color.BLACK);

                StackPane tile = new StackPane();
                tile.getChildren().addAll(rect, rect1, rect2);
                this.add(tile, col, row);
            }
        }
}}
