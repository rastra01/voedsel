package voedsel;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class LoginPenjual implements Initializable {

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button menuButton;

    @FXML
    private Label resultLabel;

    private List<DataUser> userList;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadDataUsers();
    }

    @FXML
    private void handleLoginButtonAction(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();
        boolean found = false;
        for (DataUser user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                found = true;
                break;
            }
        }

        if (found) {
            resultLabel.setText("Login berhasil");
            main.showHomePenjualPage();
        } else {
            resultLabel.setText("Username atau password salah");
        }
    }

    private void loadDataUsers() {
        File file = new File("DataUser.xml");

        try {
            XStream xstream = new XStream(new StaxDriver());
            xstream.addPermission(AnyTypePermission.ANY);

            FileInputStream fis = new FileInputStream(file);
            userList = (List<DataUser>) xstream.fromXML(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void handlemenuButtonAction(ActionEvent event) throws Exception {
        main.showHomePage();
    }
}
