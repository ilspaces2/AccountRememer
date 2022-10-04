package ru.accountremember;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class AccountRememberApp extends Application {

    public static final Logger LOG = LoggerFactory.getLogger(AccountRememberApp.class.getName());

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AccountRememberApp.class.getResource("login_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.setTitle("Welcome to account remember!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}