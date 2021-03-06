package chap15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.stage.Stage;

public class CanvasExample extends Application {
    Canvas canvas;

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        Pane root = new Pane();
        canvas = new Canvas(250, 400);
        root.getChildren().add(canvas);
        drawCanvas();
        Scene scene = new Scene(root);
        pstage.setTitle("Canvas Example");
        pstage.setScene(scene);
        pstage.show();
    }

    void drawCanvas() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.RED);
        gc.setLineWidth(3);
        gc.strokeRect(50, 50, 150, 150);   // 四角
        gc.strokeLine(50, 200, 200, 50);   // 直線
        gc.strokeLine(50, 50, 200, 200);
        ImagePattern ip = new ImagePattern(new Image("goldfish.jpg"));
        gc.setFill(ip);                    //塗りを設定
        gc.fillOval(50, 225, 150, 150);   //円
    }
}
