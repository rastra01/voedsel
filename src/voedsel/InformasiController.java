package voedsel;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;




public class InformasiController {
    private Main main;

    public void setMainApp(Main main) {
        this.main = main;
    }

    @FXML
    private Button belilagi1Button;

    @FXML
    private void handlebelilagi1ButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPenjualPage();
    }

    @FXML
    private Button belilagi2Button;

    @FXML
    private void handlebelilagi2ButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPage();
    }

    @FXML
    private Button menuButton;

    @FXML
    private void handlemenuButtonButtonAction(ActionEvent event) throws Exception {
        main.showHomeMakananPage();
    }

    @FXML
    private Button logoutButton;

    @FXML
    private void handleLogoutButtonButtonAction(ActionEvent event) throws Exception {
        main.showLogoutPage();
    }

    @FXML
    private Button informasiButton;

    @FXML
    private void handleinformasiButtonButtonAction(ActionEvent event) throws Exception {
        main.showInformasiPage();
    }

    public void setMain(Main voedsel) {
        this.main = voedsel;
    }
}
