package com.cejv416.jdbc1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class SimpleJDBCGUI extends Application {

    private final FishDAO_01 fishDAO;

    /**
     * This is the default constructor
     */
    public SimpleJDBCGUI() {
        super();
        fishDAO = new FishDAOImpl_01();
        //initialize();
    }

    /**
     * @param args
     */
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple JDBC");

        GridPane p = new GridPane();
        p.setHgap(10);
        p.setVgap(10);

        TextArea text = new TextArea();
        text.setDisable(false);
        text.setEditable(false);

        p.add(text, 0, 0, 2, 1);

        TextField tf = new TextField();
        p.add(tf, 0, 1);

        Button btn = new Button("Submit");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        p.add(hbBtn, 1, 1);

        btn.setOnAction(e -> {
            String data;
            try {
                data = fishDAO.retrievSspeciesOrigin(tf.getText());
                text.setText(data);
            } catch (SQLException ex) {
                Logger.getLogger(SimpleJDBCGUI.class.getName()).log(Level.SEVERE, null, ex);
                data = "Error loading data";
            }
        });

        Scene scene = new Scene(p, 500, 300);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
