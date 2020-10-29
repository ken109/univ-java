package chap14;
// CheckBox　バインディングによる応答

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Standup2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        Image lay = new Image("lay.png");
        Image up = new Image("up.png");
        ImageView iv = new ImageView(lay);
        Label label = new Label("", iv);
        CheckBox cbox = new CheckBox("立つ");  //チェックボックス
        iv.imageProperty().bind(Bindings.createObjectBinding(
                () -> {
                    if (cbox.isSelected()) {
                        return up;
                    } else {
                        return lay;
                    }
                },
                cbox.selectedProperty()));
		/*
		cbox.setOnAction((ActionEvent event)-> {
			if(cbox.isSelected()) {
				iv.setImage(up);
			} else {
				iv.setImage(lay);
			}
		});
		*/
        HBox root = new HBox();
        root.getStyleClass().add("hbox");
        root.getChildren().addAll(label, cbox);
        Scene scene = new Scene(root);
        scene.getStylesheets().add("standup.css");
        pstage.setTitle("Stand up");
        pstage.setScene(scene);
        pstage.show();
    }
}
