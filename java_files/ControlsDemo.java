import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlsDemo extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("User Registration");

        TextField nameField = new TextField();
        nameField.setPromptText("Enter Name");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");

        TextArea comments = new TextArea();
        comments.setPromptText("Enter Comments");

        Button submit = new Button("Submit");
        Label output = new Label();

        submit.setOnAction(e -> {
            output.setText("Name: " + nameField.getText());
        });

        VBox layout = new VBox(10,
                title,
                nameField,
                passwordField,
                comments,
                submit,
                output
        );

        Scene scene = new Scene(layout, 400, 350);

        stage.setTitle("Basic Controls Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
