package voedsel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LogoutController {
    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }
    
    @FXML
    private Button menuButton;

    @FXML
    private void handlemenuButtonAction(ActionEvent event) throws Exception {
        main.showHomePage();
    }

}



