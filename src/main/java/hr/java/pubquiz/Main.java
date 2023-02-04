package hr.java.pubquiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Index extends Application {
    private static Stage mainStage;
    @Override
    public void start(Stage stage) throws IOException {
        mainStage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Index.class.getResource("pocetna.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static Stage dohvatiMainStage(){
        return mainStage;
    }

    public static void noviProzor(String fxml){
        FXMLLoader fxmlLoader = new FXMLLoader(Index.class.getResource(fxml));
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 400, 500);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Index.dohvatiMainStage().setScene(scene);
        Index.dohvatiMainStage().show();
    }

    public static void main(String[] args) {
        launch();
    }
}