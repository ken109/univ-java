package kadai.kadai11;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Kadai11_2_App extends Application {
    @Override
    public void start(Stage pstage) {
        FlowPane btns = new FlowPane();  //レイアウトコンテナ生成

        btns.setAlignment(Pos.CENTER);
        btns.setOrientation(Orientation.VERTICAL);

        btns.getChildren().addAll(
                new Button("ボタン1"),
                new Button("ボタン2"),
                new Button("ボタン3"),
                new Button("ボタン4"),
                new Button("ボタン5")
        );

        BorderPane root = new BorderPane();

        root.setCenter(btns);

        Scene scene = new Scene(root);  //シーンに入れる
        pstage.setScene(scene); //ステージ(ウィンドウ)にシーンを入れる
        pstage.setTitle("Hello"); //ウィンドウタイトルの設定
        pstage.sizeToScene();  //ウィンドウサイズをシーンに合わせる
        pstage.show();  //ウィンドウを表示
    }
}
