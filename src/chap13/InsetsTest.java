package chap13;
// 

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class InsetsTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage pstage) {
        Label label = new Label("こんにちは");
        FlowPane root = new FlowPane();
        root.setPrefWrapLength(150);

        root.getChildren().add(label);
        root.getStyleClass().add("pane");
        Scene scene = new Scene(root);
        scene.getStylesheets().add("InsetsTest.css");

        pstage.setTitle("Hello");
        pstage.setScene(scene);
        pstage.sizeToScene();
        pstage.show();
        System.out.println("width : " + root.getWidth());
        System.out.println("height : " + root.getHeight());
    }
}
