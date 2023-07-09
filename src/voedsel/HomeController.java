package voedsel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {

    private Main main;

    public void setMainApp(Main main) {
        this.main = main;
    }

     @FXML
    private Button KonsumenButton;

    @FXML
    private void handleKonsumenButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPage();

    }

     @FXML
    private Button ProdusenButton;

    @FXML
    private void handleProdusenButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPenjualPage();

    }

    @FXML
    private Button daftarButton;

    @FXML
    private void handledaftarButtonButtonAction(ActionEvent event) throws Exception {
        main.showSignInPage();

    }

    public void setMain(Main voedsel) {
    }

}

