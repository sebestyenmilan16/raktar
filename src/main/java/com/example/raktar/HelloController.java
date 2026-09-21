package com.example.raktar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class HelloController {


    @FXML public Button b_raktar1;
    @FXML public Button b_raktar2;
    @FXML public ListView lv_rak1;
    @FXML public ListView lv_rak2;
    @FXML public TextField tf_bemezo;
    @FXML public Button b_balra;
    @FXML public Button b_jobbra;
    @FXML public ImageView iv_torolbal;
    @FXML public ImageView iv_toroljobb;
    @FXML public Button b_mentes;

    ArrayList raktar1 = new ArrayList<String>();
    ArrayList raktar2 = new ArrayList<String>();



    public void initialize() {

        raktar1.add("Alma");
        raktar1.add("Banán");
        raktar1.add("Narancs");
        raktar2.add("Gerebje");
        raktar2.add("Fúró");
        raktar2.add("Csavar");

        lv_rak1.getItems().clear();
        for (int i=0;i<raktar1.size();i++) {
            lv_rak1.getItems().add(raktar1.get(i));
        }
        lv_rak2.getItems().clear();
        for (int i=0;i<raktar2.size();i++) {
            lv_rak2.getItems().add(raktar2.get(i));
        }

    }

    public void raktarhozad1(ActionEvent actionEvent) {

        String adat = tf_bemezo.getText();
        raktar1.add(adat);

        lv_rak1.getItems().clear();
        for (int i=0;i<raktar1.size();i++) {
            lv_rak1.getItems().add(raktar1.get(i));
        }


    }

    public void raktarhozad2(ActionEvent actionEvent) {

        String adat = tf_bemezo.getText();
        raktar2.add(adat);

        lv_rak2.getItems().clear();
        for (int i=0;i<raktar2.size();i++) {
            lv_rak2.getItems().add(raktar2.get(i));
        }

    }

    public void balroljobbra(ActionEvent actionEvent) {

        int id = lv_rak1.getSelectionModel().getSelectedIndex();
        String adat = raktar1.get(id).toString();
        raktar1.remove(id);
        lv_rak1.getItems().clear();
        lv_rak1.getItems().clear();
        for (int i=0;i<raktar1.size();i++) {
            lv_rak1.getItems().add(raktar1.get(i));
        }

        raktar2.add(adat);
        lv_rak2.getItems().clear();
        for (int i=0;i<raktar2.size();i++) {
            lv_rak2.getItems().add(raktar2.get(i));
        }
        lv_rak2.getSelectionModel().select(raktar2.size()-1);


    }

    public void jobbrolbalra(ActionEvent actionEvent) {

        int id = lv_rak2.getSelectionModel().getSelectedIndex();
        String adat = raktar2.get(id).toString();
        raktar2.remove(id);
        lv_rak2.getItems().clear();
        lv_rak2.getItems().clear();
        for (int i=0;i<raktar2.size();i++) {
            lv_rak2.getItems().add(raktar2.get(i));
        }

        raktar1.add(adat);
        lv_rak1.getItems().clear();
        for (int i=0;i<raktar1.size();i++) {
            lv_rak1.getItems().add(raktar1.get(i));
        }
        lv_rak1.getSelectionModel().select(raktar1.size()-1);

    }

    public void torolbal(MouseEvent mouseEvent) {

        int id = lv_rak1.getSelectionModel().getSelectedIndex();



    }

}