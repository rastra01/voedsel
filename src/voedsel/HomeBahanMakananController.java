package voedsel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class HomeBahanMakananController {
    private Main main;

    public void setMainApp(Main main) {
        this.main = main;
        
    }
    

    @FXML
    private Button pembeli1Button;

    @FXML
    private void handlepenjual1ButtonButtonAction(ActionEvent event) throws Exception {
        main.showAmbilSendiriPage();
    }

     @FXML
    private Button pembeli2Button;

    @FXML
    private void handlepembeli2ButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPage();
    }

     @FXML
    private Button pembeli3Button;

    @FXML
    private void handlepembeli3ButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPage();
    }

     @FXML
    private Button pembeli4Button;

    @FXML
    private void handlepembeli4ButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPage();
    }

     @FXML
    private Button pembeli5Button;

    @FXML
    private void handlepembeli5ButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPage();
    }

    @FXML
    private Button menuButton;

    @FXML
    private void handlemenuButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPage();
    }

    @FXML
    private Button LogoutButton;

    @FXML
    private void handleLogoutButtonButtonAction(ActionEvent event) throws Exception {
        main.showLogoutPage();
    }

    @FXML
    private Button riwayatButton;

    @FXML
    private void handleriwayatButtonButtonAction(ActionEvent event) throws Exception {
        main.showInformasiPage();
    }

     @FXML
    private Button makananButton;

    @FXML
    private void handlemakananButtonButtonAction(ActionEvent event) throws Exception {
        main.showHomeMakananPage();
    }

     @FXML
    private Button bahanmakananButton;

    @FXML
    private void handlebahanmakananButtonButtonAction(ActionEvent event) throws Exception {
        main.showLoginPage();
    }

    
    public void setMain(Main voedsel){
        
    }
}


