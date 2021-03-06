package chap15;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimelineExample2 extends Application {
    Pane root;
    Circle cir;
    double w = 400, h = 400;

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        root = new Pane();
        root.setPrefSize(w, h);
        Scene scene = new Scene(root);
        makeShapes();
        pstage.setTitle("Timeline Example");
        pstage.setScene(scene);
        pstage.show();
    }

    void makeShapes() {
        cir = new Circle(w / 2, h / 2, 5);
        root.getChildren().add(cir);
        Timeline tline = new Timeline(  //3つのキーフレームを設定
                new KeyFrame(Duration.seconds(0),
                        new KeyValue(cir.radiusProperty(), 5),
                        new KeyValue(cir.fillProperty(), Color.WHITE)),
                new KeyFrame(Duration.seconds(1), //１秒後のフレーム，塗りを黄色
                        new KeyValue(cir.fillProperty(), Color.YELLOW)),
                new KeyFrame(Duration.seconds(2), //2秒後のフレーム，塗りを赤，半径w/2(200)
                        (event) -> {
                            cir.setCenterX(Math.random() * w);
                            cir.setCenterY(Math.random() * h);
                        }, //位置を変えるイベント処理
                        new KeyValue(cir.radiusProperty(), w / 2, Interpolator.EASE_IN),
                        new KeyValue(cir.fillProperty(), Color.RED))
        );
        tline.setCycleCount(Animation.INDEFINITE);
        tline.setAutoReverse(true);
        tline.play();
    }
}
