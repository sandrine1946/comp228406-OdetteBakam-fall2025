package com.exercise1.exercise1fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentApp extends Application {

    @Override
    public void start(Stage stage) {
        com.exercise1.exercise1fx.StudentController controller = new com.exercise1.exercise1fx.StudentController();
        Scene scene = new Scene(controller.buildUI(), 900, 500);

        stage.setTitle("Student Information Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
