package voedsel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.net.URL;

public class InformasiPenjualController implements Initializable {

    Series<String, Integer> StokMakanan = new XYChart.Series<>();

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    private BarChart<String, Integer> BarChart;


    @FXML
    private Button menuButton;

    @FXML
    private Button InformasiButton;

    @FXML
    private Button logoutButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        File file = new File("src/voedsel/StockMakanan.xml");

        XStream xstream = new XStream(new StaxDriver());
        xstream.addPermission(AnyTypePermission.ANY);
        xstream.alias("StokMakanan", StokMakanan.class);

        List<StokMakanan> stokMakananList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            stokMakananList = (List<StokMakanan>) xstream.fromXML(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (StokMakanan stokMakanan : stokMakananList) {
            String nama = stokMakanan.getNama();
            int stok = Integer.parseInt(stokMakanan.getStok());
            StokMakanan.getData().add(new XYChart.Data<>(nama, stok));
        }

        BarChart.getData().add(StokMakanan);
    }

    @FXML
    private void handlemenuButtonButtonAction(ActionEvent event) throws Exception {
        main.showHomePenjualPage();
    }

    @FXML
    private void handleInformasiButtonAction(ActionEvent event) throws Exception {
        main.showInformasiPenjualPage();
    }

    @FXML
    private void handlelogoutButtonButtonAction(ActionEvent event) throws Exception {
        main.showLogoutPage();
    }
}
