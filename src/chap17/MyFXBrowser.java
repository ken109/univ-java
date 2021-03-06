package chap17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MyFXBrowser extends Application {
    WebEngine engine;
    TextField tf;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pStage) {
        pStage.setTitle("My Browser");
        // 垂直方向にレイアウトするコンテナ
        VBox vbox = new VBox(10);
        vbox.setLayoutY(10);

        // テキスト入力域とボタンをHBoxに配置
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);
        tf = new TextField();
        tf.setPrefColumnCount(40);
        hbox.getChildren().add(tf);
        Button button = new Button("Load");
        hbox.getChildren().add(button);
        // ボタンアクション
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // テキストボックスから取得した文字列をWebEngine でロードする
                String url = tf.getText();
                //System.out.println(url);
                engine.load(url);
            }
        });

        // ブラウザ部分
        WebView view = new WebView();
        engine = view.getEngine();

        // テキストフィールド,ボタンが載ったHBoxと，WebViewをVBoxに貼る
        vbox.getChildren().add(hbox);
        vbox.getChildren().add(view);

        // VBox をルートとする
        Scene scene = new Scene(vbox, 800, 600);
        pStage.setScene(scene);
        pStage.show();
    }
}