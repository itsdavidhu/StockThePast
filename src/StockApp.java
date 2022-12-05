import javafx.application.Application;
import javafx.stage.Stage;
import views.StockView;
import LoginSystem.LoginSystem;

public class StockApp extends Application{
    StockView view;
    LoginSystem loginSystem;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.loginSystem = new LoginSystem();
        this.view = new StockView(primaryStage, loginSystem); //tie the model to the view
    }
}
