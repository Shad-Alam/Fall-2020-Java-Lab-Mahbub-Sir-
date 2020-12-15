package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    public TextField tf_login_username;
    public PasswordField pf_login_password;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void login(ActionEvent actionEvent) throws IOException {
        String username = tf_login_username.getText();
        String password = pf_login_password.getText();

        if(username.equals("admin") && password.equals("123")){
            Parent homepage =
                    FXMLLoader.load(getClass().getResource("homepage.fxml"));
            Scene homeScene =
                    new Scene(homepage,600,400);
            Stage homeStage =
                    (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            homeStage.setScene(homeScene);
            homeStage.show();

        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login alert");
            alert.setContentText("Invalid username and password");
            alert.show();
        }
    }

    public void forgetPassword(ActionEvent actionEvent) throws IOException {
        Parent forgetpage =
                FXMLLoader.load(getClass().getResource("forgetPassword.fxml"));
        Scene forgetScene =
                new Scene(forgetpage,600,400);
        Stage forgetStage =
                (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        forgetStage.setScene(forgetScene);
        forgetStage.show();
    }

    public void hyperlink(ActionEvent actionEvent) throws IOException {
        Parent registrationPage =
                FXMLLoader.load(getClass().getResource("registration.fxml"));
        Scene registrationScene =
                new Scene(registrationPage,600,400);
        Stage registrationStage =
                (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        registrationStage.setScene(registrationScene);
        registrationStage.show();
    }
}
