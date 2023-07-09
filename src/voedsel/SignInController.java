package voedsel;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SignInController implements Initializable {

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    private Button daftarButton;

    @FXML
    private Button menuButton;

    @FXML
    private Label resultLabel;

    public void handleDaftarButtonButtonAction(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String role = roleComboBox.getValue();
        if (username.isEmpty() || password.isEmpty() || role == null) {
            resultLabel.setText("Mohon Isi Semua !");
            return;
        }
        XStream xstream = new XStream(new StaxDriver());
        xstream.addPermission(AnyTypePermission.ANY);

        File file = new File("DataUser.xml");
        List<DataUser> userList;

        if (file.exists()) {
            userList = (List<DataUser>) xstream.fromXML(file);
        } else {
            userList = new ArrayList<>();
        }
        DataUser newUser;
        if (role.equals("Produsen")) {
            newUser = new DataUser(username, password);
            main.showLoginPenjualPage();
        } else {
            newUser = new DataUser(username, password);

            main.showLoginPage();
        }
        userList.add(newUser);
        try {
            xstream.toXML(userList, new FileOutputStream(file));
            resultLabel.setText("Pendaftaran berhasil");
        } catch (IOException e) {
            resultLabel.setText("Terjadi kesalahan saat menyimpan data");
            e.printStackTrace();
        }
    }

    public void handlemenuButtonAction(ActionEvent event) throws Exception {
        main.showHomePage();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> roleOptions = FXCollections.observableArrayList("Produsen", "Konsumen");
        roleComboBox.setItems(roleOptions);
    }
}
