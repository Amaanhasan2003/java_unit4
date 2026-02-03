import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class LayoutDemo extends Application {
@Override
public void start(Stage stage) {
Button top = new Button("Top");

Button bottom = new Button("Bottom");
Button left = new Button("Left");
Button right = new Button("Right");
Button center = new Button("Center");
BorderPane borderPane = new BorderPane();
borderPane.setTop(top);
borderPane.setBottom(bottom);
borderPane.setLeft(left);
borderPane.setRight(right);
borderPane.setCenter(center);
Scene scene = new Scene(borderPane, 400, 300);
stage.setTitle("Layout Panes Demo");
stage.setScene(scene);
stage.show();
}
public static void main(String[] args) {
launch(args);
}
}
