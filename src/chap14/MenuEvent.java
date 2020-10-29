package chap14;
// Menu, Label

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuEvent extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        //メニュー
        MenuBar bar = new MenuBar();
        Menu m1 = new Menu("処理");
        MenuItem menuUp = new MenuItem("立つ");
        MenuItem menuLay = new MenuItem("倒れる");
        MenuItem menuEnd = new MenuItem("終了");
        m1.getItems().addAll(menuUp, menuLay, menuEnd);
        bar.getMenus().add(m1);
        //ラベル部分
        HBox p = new HBox();
        p.setPrefSize(200, 150);
        p.setAlignment(Pos.CENTER);
        Image lay = new Image("lay.png");
        Image up = new Image("up.png");
        ImageView iv = new ImageView(lay);
        Label label = new Label("", iv);
        p.getChildren().add(label);

        VBox root = new VBox();
        root.getChildren().addAll(bar, p);
        Scene scene = new Scene(root);
        pstage.setTitle("Menu Event Sample");
        pstage.setScene(scene);
        pstage.show();

        menuUp.setOnAction((event) -> {
            iv.setImage(up);
        });
        menuLay.setOnAction((event) -> {
            iv.setImage(lay);
        });
        menuEnd.setOnAction((event) -> {
            System.exit(0);
        });
    }
}
