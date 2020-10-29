package chap16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        Button b1 = new Button("ボタン1");  //ボタン生成
        Button b2 = new Button("ボタン２");  //ボタン生成
        Label label = new Label("こんにちは");  //ラベル生成
        BorderPane root = new BorderPane();  //レイアウトコンテナ生成
        root.setTop(label);   //レイアウトコンテナへ配置
        root.setLeft(b1);
        root.setRight(b2);
        Scene scene = new Scene(root);  //シーンに入れる
        pstage.setScene(scene); //ステージ(ウィンドウ)にシーンを入れる
        pstage.setTitle("Hello"); //ウィンドウタイトルの設定
        pstage.sizeToScene();  //ウィンドウサイズをシーンに合わせる
        pstage.show();  //ウィンドウを表示
    }
}
