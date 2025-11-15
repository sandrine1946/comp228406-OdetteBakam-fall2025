package com.exercise1.exercise1fx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class StudentController {

    // Form fields
    private final TextField nameTF = new TextField();
    private final TextField addressTF = new TextField();
    private final TextField cityTF = new TextField();
    private final TextField provinceTF = new TextField();
    private final TextField postalTF = new TextField();
    private final TextField phoneTF = new TextField();
    private final TextField emailTF = new TextField();

    // Majors
    private final RadioButton csRB = new RadioButton("Computer Science");
    private final RadioButton busRB = new RadioButton("Business");

    // Activities
    private final CheckBox councilCB = new CheckBox("Student Council");
    private final CheckBox volunteerCB = new CheckBox("Volunteer Work");

    // Courses
    private final ComboBox<String> courseCombo = new ComboBox<>();
    private final ObservableList<String> csCourses = FXCollections.observableArrayList("Java", "Python", "C#", "C++");
    private final ObservableList<String> busCourses = FXCollections.observableArrayList("Accounting", "Marketing", "Finance");
    private final ListView<String> courseList = new ListView<>();

    // Output
    private final TextArea outputArea = new TextArea();

    public BorderPane buildUI() {

        // Toggle group for majors
        ToggleGroup majorGroup = new ToggleGroup();
        csRB.setToggleGroup(majorGroup);
        busRB.setToggleGroup(majorGroup);

        // Update courses when major changes
        majorGroup.selectedToggleProperty().addListener((obs, oldV, newV) -> {
            if (newV == csRB) courseCombo.setItems(csCourses);
            else if (newV == busRB) courseCombo.setItems(busCourses);
            courseCombo.getSelectionModel().clearSelection();
        });

        // Add course to list
        courseCombo.setOnAction(e -> {
            String selected = courseCombo.getValue();
            if (selected != null && !courseList.getItems().contains(selected)) {
                courseList.getItems().add(selected);
            }
        });

        // Form layout
        GridPane form = new GridPane();
        form.setPadding(new Insets(10));
        form.setHgap(10);
        form.setVgap(10);

        form.add(new Label("Name:"), 0, 0); form.add(nameTF, 1, 0);
        form.add(new Label("Address:"), 0, 1); form.add(addressTF, 1, 1);
        form.add(new Label("Province:"), 0, 2); form.add(provinceTF, 1, 2);
        form.add(new Label("City:"), 0, 3); form.add(cityTF, 1, 3);
        form.add(new Label("Postal Code:"), 0, 4); form.add(postalTF, 1, 4);
        form.add(new Label("Phone Number:"), 0, 5); form.add(phoneTF, 1, 5);
        form.add(new Label("Email:"), 0, 6); form.add(emailTF, 1, 6);

        form.add(councilCB, 2, 1);
        form.add(volunteerCB, 2, 5);

        // Right side (majors & courses)
        VBox rightSide = new VBox(10);
        rightSide.setPadding(new Insets(10));
        HBox majors = new HBox(10, csRB, busRB);
        rightSide.getChildren().addAll(majors, courseCombo, courseList);

        // Display button
        Button displayBtn = new Button("Display");
        displayBtn.setOnAction(e -> showStudentInfo());
        form.add(displayBtn, 3, 7);

        // Root layout
        BorderPane root = new BorderPane();
        root.setLeft(form);
        root.setRight(rightSide);
        root.setBottom(outputArea);

        return root;
    }

    private void showStudentInfo() {
        Student s = new Student();
        s.setName(nameTF.getText());
        s.setAddress(addressTF.getText());
        s.setCity(cityTF.getText());
        s.setProvince(provinceTF.getText());
        s.setPostalCode(postalTF.getText());
        s.setPhone(phoneTF.getText());
        s.setEmail(emailTF.getText());

        if (csRB.isSelected()) s.setMajor("Computer Science");
        if (busRB.isSelected()) s.setMajor("Business");

        s.getCourses().addAll(courseList.getItems());

        if (councilCB.isSelected()) s.addActivity("Student Council");
        if (volunteerCB.isSelected()) s.addActivity("Volunteer Work");

        outputArea.setText(
                s.getName() + ", " + s.getAddress() + ", " +
                        s.getCity() + ", " + s.getProvince() + ", " +
                        s.getPostalCode() + ", " + s.getPhone() + ", " + s.getEmail() +
                        "\nMajor: " + s.getMajor() +
                        "\nCourses: " + String.join(", ", s.getCourses()) +
                        "\nActivities: " + String.join(", ", s.getActivities())
        );
    }
}