package chap14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloEvent extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        Button b1 = new Button("ごあいさつ");
        Button b2 = new Button("消去");
        Label label = new Label("　");
        BorderPane root = new BorderPane();
        root.setTop(label);
        root.setLeft(b1);
        root.setRight(b2);
        Scene scene = new Scene(root);
        pstage.setTitle("Hello");
        pstage.setScene(scene);
        pstage.sizeToScene();
        pstage.show();
        //イベントハンドラの設定
        b1.setOnAction((event) -> {
            label.setText("こんにちは");
        });
        b2.setOnAction((event) -> {
            label.setText("　");
        });
    }
}
