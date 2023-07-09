package voedsel;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;


public class HomePenjual implements Initializable {
     private ObservableList<StokMakanan> data = FXCollections.observableArrayList();
     private Array makanan = new Array();
    private Main main;

    public void setMainApp(Main main) {
        this.main = main;
    }

    @FXML
    private TextField textField1;

    @FXML
    private TextField textField2;

    @FXML
    private TextField textField3;

    @FXML
    private Button menuButton;

    @FXML
    private Button infoButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button editButton;

    @FXML
    private TableView<StokMakanan> TV;

    @FXML
    private TableColumn<StokMakanan, String> namacolumn;

    @FXML
    private TableColumn<StokMakanan, String> stokcolumn;

    @FXML
    private TableColumn<StokMakanan, String> tanggalpegambilancolumn;

    @FXML
    private Text textJumlahMakanan;
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tampilkanMakanan();
        namacolumn.setCellValueFactory(new PropertyValueFactory<StokMakanan, String>("nama"));
        stokcolumn.setCellValueFactory(new PropertyValueFactory<StokMakanan, String>("stok"));
        tanggalpegambilancolumn.setCellValueFactory(new PropertyValueFactory<StokMakanan, String>("tanggal"));
        TV.setItems(data);
        updateJumlahMakanan();
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String A = textField1.getText();
        String B = textField2.getText();
        String C = textField3.getText();
        makanan.addStokMakanan(A, B, C);
        StokMakanan newMakanan = new StokMakanan(A, B, C);
        data.add(newMakanan);
        Array.simpan(makanan.getStokMakananList());

        textField1.clear();
        textField2.clear();
        textField3.clear();
        updateJumlahMakanan();
    }

    public void tampilkanMakanan(){
        for (int i = 0; i < makanan.getStokMakananList().size(); i++) {
            data.add(makanan.getStok(i));
        }
    } 

    @FXML
    private void ButtonHapusData(ActionEvent event) {
       int selectedIndex = TV.getSelectionModel().getSelectedIndex();
       if (selectedIndex >= 0) {
        StokMakanan selectedMakanan = TV.getItems().get(selectedIndex);
        TV.getItems().remove(selectedIndex);
        makanan.getStokMakananList().remove(selectedMakanan);
        Array.simpan(makanan.getStokMakananList());
        updateJumlahMakanan();
       }
       
    }

    @FXML 
    private void Buttonedit(ActionEvent event) {
        
        StokMakanan selectedMakanan = TV.getSelectionModel().getSelectedItem();

        if (selectedMakanan != null){

            String name = selectedMakanan.getNama();
            String stock = selectedMakanan.getStok();
            String date = selectedMakanan.getTanggal();

            
            String nama = textField1.getText();
            String stok = textField2.getText();
            String tanggal = textField3.getText();

            if(nama.isEmpty()){
                selectedMakanan.setNama(name);
            } else {
                selectedMakanan.setNama(nama);
            }

            if(stok.isEmpty()){
                selectedMakanan.setStock(stock);
            }else {
                selectedMakanan.setStock(stok);
            }
            if(tanggal.isEmpty()){
                selectedMakanan.settanggal(date);
            }else {
                selectedMakanan.settanggal(tanggal);
            }
          
            TV.refresh();
            Array.simpan(makanan.getStokMakananList());
            textField1.clear();
            textField2.clear();
            textField3.clear();
        }
    }

    private void updateJumlahMakanan(){
        int JumlahMakanan = TV.getItems().size();
        textJumlahMakanan.setText(Integer.toString(JumlahMakanan));
    }

    @FXML
    private void handlemenuButtonButtonAction(ActionEvent event) throws Exception{
        main.showHomeMakananPage();
    }

    @FXML
    private void handleinfoButtonButtonAction(ActionEvent event) throws Exception{
        main.showInformasiPenjualPage();
    }

    @FXML
    private void handlelogoutButtonButtonAction(ActionEvent event) throws Exception{
        main.showLogoutPage();
    }
}
