package voedsel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Checkout1Controller {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private Button KembaliButton;

    @FXML
    private Button AmbilSendiriButton;

    @FXML
    private Button KirimButton;

    @FXML
    private Button OkeButton;

    @FXML
    private void initialize() {
    }

    @FXML
    private void handleKembaliButtonButtonAction(ActionEvent event) throws Exception{
        main.showHomeMakananPage();
    }

    @FXML
    private void handleAmbilSendiriButtonAction(ActionEvent event) throws Exception {
        main.showAmbilSendiriPage();
    }

    @FXML
    private void handleKirimButtonAction(ActionEvent event) throws Exception {
        main.showDikirimPage();
    }

    @FXML
    private void handleOkeButtonAction(ActionEvent event) throws Exception {
        main.showOrderCompletePage();
    }
    
    
  
    
}
