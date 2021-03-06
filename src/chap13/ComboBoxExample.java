package chap13;
//ComboBoxの例

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ComboBoxExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        ComboBox<String> cb = new ComboBox<String>();
        cb.getItems().addAll("立つ", "踊る", "倒れる", "立ち上がる");
        //cb.getSelectionModel().selectFirst();  //先頭を選択
        cb.setValue(cb.getItems().get(0)); //選択項目の先頭を設定
        cb.setPrefWidth(150);  //幅を150に
        VBox root = new VBox();   //コンテナを用意
        root.setPadding(new Insets(15, 10, 15, 10));  //上右下左のスペース
        root.getChildren().add(cb);  //コンテナに配置
        Scene scene = new Scene(root);
        pstage.setTitle("ComboBox Sample");
        pstage.setScene(scene);
        pstage.show();
    }
}

