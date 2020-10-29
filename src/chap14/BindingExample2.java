package chap14;
// Binding

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class BindingExample2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        Slider slider = new Slider(0, 100, 0);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setPrefWidth(200);
        TextField tf = new TextField("0.0");
        //全体の配置
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.getChildren().addAll(slider, tf);
        Scene scene = new Scene(root);
        pstage.setTitle("Bindings");
        pstage.setScene(scene);
        pstage.show();

        //スライダーとテキストフィールドの双方向のバインディング
        tf.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());

        //小数点以下2桁の表示
        //tf.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter("#.##"));

        //双方向のバインディングは次のようにも書ける
        //Bindings.bindBidirectional(tf.textProperty(), slider.valueProperty(), new NumberStringConverter());
    }
}
