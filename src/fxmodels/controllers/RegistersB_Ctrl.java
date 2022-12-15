package fxmodels.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import lib.RegisterObj;

public class RegistersB_Ctrl implements Initializable {
    @FXML
    private TextArea infoArea;
    @FXML
    private Label userLabel,objectLabel,materialLabel,dateLabel,idLabel,
                  placeLabel,detectorLabel,descriptionLabel,imagesLabel;
    @FXML
    private ImageView img1,img2,img3;

    public void initialize(URL url, ResourceBundle resources){
        RegisterObj obj = Controllers.getRegisterObj();

        //Init images
        img1.setImage(new Image(obj.getImagesPath()[0]));
        img2.setImage(new Image(obj.getImagesPath()[1]));
        img3.setImage(new Image(obj.getImagesPath()[2]));

        //put data
        userLabel.setText("Usuario: "+obj.getUser());
        objectLabel.setText("Objeto: "+obj.getObject());
        materialLabel.setText("Material: "+obj.getMaterial());
        dateLabel.setText("Fecha: "+obj.getHour() + "  " + obj.getDate());
        idLabel.setText("ID: "+obj.getId());
        placeLabel.setText("Lugar: "+obj.getPlace());
        detectorLabel.setText("Detector: "+obj.getDetector());
        descriptionLabel.setText("Descripción: "+obj.getDescription());
        imagesLabel.setText("Imágenes");
    }

    public void goBackB(ActionEvent ev){ Controllers.switchTo("../RegistersA.fxml", ev); }
}
