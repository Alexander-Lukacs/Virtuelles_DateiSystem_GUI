package sample;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Scene;
        import javafx.scene.layout.AnchorPane;
        import javafx.stage.Stage;

        import java.io.IOException;

public class Main extends Application{

    private Stage gob_primaryStage;


    @Override
    public void start(Stage primaryStage) throws Exception {
        this.gob_primaryStage = primaryStage;
        mainWindow();
    }

    public void mainWindow() throws IOException {
        try {
            FXMLLoader lob_loader = new FXMLLoader(Main.class.getResource("FileSystem.fxml"));
            AnchorPane lob_pane = lob_loader.load();

            gob_primaryStage.setMinHeight(400.00);
            gob_primaryStage.setMinWidth(550.00);

            Scene lob_scene = new Scene(lob_pane);
            gob_primaryStage.setTitle("FileSystem");
            gob_primaryStage.setResizable(false);
            gob_primaryStage.setScene(lob_scene);
            gob_primaryStage.show();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
