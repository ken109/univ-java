package chap13;
// Button

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        Image image1 = new Image("dance.png");
        Image image2 = new Image("lay.png");
        Button b1 = new Button("立つ", new ImageView(image1));  //文字とアイコンのボタン
        Button b2 = new Button("倒れる", new ImageView(image2));  //文字とアイコンのボタン
        b1.setContentDisplay(ContentDisplay.BOTTOM); //アイコンを下に
        b2.setContentDisplay(ContentDisplay.BOTTOM); //アイコンを下に
        HBox root = new HBox();
        root.setSpacing(20);  //ボタン間隔
        root.setPadding(new Insets(15, 10, 15, 10));  //上右下左のスペース
        root.getChildren().addAll(b1, b2);

        Scene scene = new Scene(root);
        pstage.setTitle("Button Sample");
        pstage.setScene(scene);
        pstage.show();
    }
}
