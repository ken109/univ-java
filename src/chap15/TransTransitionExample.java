package chap15;

import javafx.animation.Interpolator;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TransTransitionExample extends Application {
    Pane root;
    Circle cir;
    double w = 400, h = 400;
    TranslateTransition trans;

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        root = new Pane();
        root.setPrefSize(w, h);
        Scene scene = new Scene(root);
        makeShapes();
        pstage.setTitle("TranslateTransition Example");
        pstage.setScene(scene);
        pstage.show();

        scene.setOnMousePressed((MouseEvent event) -> {
            trans.setToX(event.getX() - cir.getCenterX());  //クリックした位置へ遷移
            trans.setToY(event.getY() - cir.getCenterY());
            trans.play();
        });
    }

    void makeShapes() {
        cir = new Circle(w / 2, h / 2, 10, Color.RED);
        root.getChildren().add(cir);
        trans = new TranslateTransition(); //移動遷移生成
        trans.setNode(cir);   //変化の対象ノードの設定
        trans.setDuration(Duration.seconds(0.5));  //500ミリ秒で遷移
        trans.setInterpolator(Interpolator.EASE_IN);  //最初ゆっくり変化
    }
}
