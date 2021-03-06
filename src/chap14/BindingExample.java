package chap14;
// Binding

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BindingExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        Slider slider = new Slider(0, 100, 0);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setPrefWidth(200);
        Label label = new Label("0.0");
        //全体の配置
        VBox root = new VBox(20);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.getChildren().addAll(slider, label);
        Scene scene = new Scene(root);
        pstage.setTitle("Bindings");
        pstage.setScene(scene);
        pstage.show();
        //イベント処理　スライダーが変化したらラベルの値を変更
        label.textProperty().bind(Bindings.convert(slider.valueProperty()));

	/*
        slider.valueProperty().addListener((ov, oldValue, newValue) -> {  //リスナーの指定
	       label.setText(String.valueOf(newValue.doubleValue()));
        });
	*/
    }
}
