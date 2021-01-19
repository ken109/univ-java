package kadai.kadai11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Kadai11_1_App extends Application {
    @Override
    public void start(Stage pstage) {
        BorderPane root = new BorderPane();  //レイアウトコンテナ生成

        root.setTop( new Button("ボタン1"));
        root.setLeft( new Button("ボタン1"));
        root.setRight(new Button("ボタン3"));
        root.setBottom(new Button("ボタン4"));
        root.setCenter(new Button("ボタン5"));

        Scene scene = new Scene(root);  //シーンに入れる
        pstage.setScene(scene); //ステージ(ウィンドウ)にシーンを入れる
        pstage.setTitle("Hello"); //ウィンドウタイトルの設定
        pstage.sizeToScene();  //ウィンドウサイズをシーンに合わせる
        pstage.show();  //ウィンドウを表示
    }
}
