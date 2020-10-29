package chap15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShapeEventExample extends Application {
    Pane root;

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        root = new Pane();
        root.setPrefSize(200, 200);
        makeShapes();
        Scene scene = new Scene(root);
        pstage.setTitle("Shape Event");
        pstage.setScene(scene);
        pstage.show();
    }

    void makeShapes() {
        ImagePattern ip = new ImagePattern(new Image("goldfish.jpg"));
        ImagePattern ip2 = new ImagePattern(new Image("nofish.jpg"));
        Circle cir = new Circle(100, 100, 75, ip2);
        root.getChildren().add(cir);
        cir.setOnMouseClicked((event) -> {
            if (cir.getFill() == ip) {
                cir.setFill(ip2);
            } else if (cir.getFill() == ip2) {
                cir.setFill(ip);
            }
        });
    }
}
