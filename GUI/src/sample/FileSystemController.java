package sample;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TreeView;
        import javafx.scene.layout.AnchorPane;
        import javafx.stage.Stage;

        import java.io.IOException;

public class FileSystemController {

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnSettings;

    @FXML
    private Label lblAdmin;

    @FXML
    private AnchorPane gob_rootPane;

    @FXML
    private TreeView<?> tvFiles;

    @FXML
    void handleButtonAction(ActionEvent event) throws IOException {
        FXMLLoader lob_loader = new FXMLLoader(Main.class.getResource("SettingsScreen.fxml"));
        AnchorPane lob_pane = lob_loader.load();
        Scene lob_scene = new Scene(lob_pane);
        Stage lob_stage = new Stage();
        lob_stage.setTitle("Settings");
        lob_stage.setResizable(false);
        lob_stage.setScene(lob_scene);
        lob_stage.show();
    }

}
