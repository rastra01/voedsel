package voedsel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        showHomePage();
    }

    public void showHomePage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Homepage.fxml"));
        Parent root = loader.load();
        HomeController controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home Page");
        primaryStage.show();
    }

    public void showLoginPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPembeli.fxml"));
        Parent root = loader.load();
        LoginPengguna controller = loader.getController();
        controller.setMain(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login pembeli");
        primaryStage.show();
    }

     public void showSignInPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignIn.fxml"));
        Parent root = loader.load();
        SignInController controller = loader.getController();
        controller.setMain(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login pembeli");
        primaryStage.show();
    }

    public void showLoginPenjualPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPenjual.fxml"));
        Parent root = loader.load();
        LoginPenjual controller = loader.getController();
        controller.setMain(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login penjual");
        primaryStage.show();
    }

     public void showHomeMakananPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeMakanann.fxml"));
        Parent root = loader.load();
        HomeMakananController controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home makanan");
        primaryStage.show();
    }

    public void showHomeBahanMakananPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomeBahanMakanan.fxml"));
        Parent root = loader.load();
        HomeBahanMakananController controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home bahan makanan");
        primaryStage.show();
    }


    public void showHomePenjualPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePenjual.fxml"));
        Parent root = loader.load();
        HomePenjual controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home Penjual");
        primaryStage.show();
    }

     public void showLogoutPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Logout.fxml"));
        Parent root = loader.load();
        LogoutController controller = loader.getController();
        controller.setMain(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login penjual");
        primaryStage.show();
    }

    
    public void showInformasiPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("InformasiPembeli.fxml"));
        Parent root = loader.load();
        InformasiController controller = loader.getController();
        controller.setMain(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rieayat Penjualan");
        primaryStage.show();
    }

    public void showAmbilSendiriPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("checkoutAmbilSendiri.fxml"));
        Parent root = loader.load();
        Checkout1Controller controller = loader.getController();
        controller.setMain(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkout Ambil Sendiri");
        primaryStage.show();
    }

    public void showDikirimPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("checkoutkirim2.fxml"));
        Parent root = loader.load();
        Checkout2Controller controller = loader.getController();
        controller.setMain(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkout Kirim");
        primaryStage.show();
    }

    public void showOrderCompletePage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OrderComplete.fxml"));
        Parent root = loader.load();
        OrderCompleteController controller = loader.getController();
        controller.setMain(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Order Complete");
        primaryStage.show();
    }

     public void showInformasiPenjualPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("InformasiPenjual.fxml"));
        Parent root = loader.load();
        InformasiPenjualController controller = loader.getController();
        controller.setMain(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Informasi Penjual");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
