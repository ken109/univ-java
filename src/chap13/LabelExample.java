package chap13;
// Label

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LabelExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        Label a1 = new Label("うさぎ"); //文字のラベル
        Image image = new Image("dance.png");
        Label a2 = new Label("ダンス", new ImageView(image));  //文字とアイコンのラベル
        a2.setContentDisplay(ContentDisplay.TOP); //アイコンを上に
        HBox root = new HBox();
        root.setSpacing(20);  //ラベル間隔
        root.setPadding(new Insets(15, 10, 15, 10));  //上右下左のスペース
        root.getChildren().addAll(a1, a2);
        Scene scene = new Scene(root);
        pstage.setTitle("Label Sample");
        pstage.setScene(scene);
        pstage.show();
    }
}
