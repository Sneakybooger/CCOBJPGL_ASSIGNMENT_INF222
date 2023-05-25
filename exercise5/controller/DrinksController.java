package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import model.Milktea;
import model.Moutaindew;
import model.RootBeer;
import model.Soju;
import model.Yakult;

public class DrinksController{
    
    @FXML
    ImageView milktea, moutaindew, rootbeer, soju, yakult;

    @FXML
    Button milkteabtn, moutaindewbtn, rootbeerbtn, sojubtn, yakultbtn;

    Yakult ya = new Yakult();
    Milktea mi = new Milktea();
    Moutaindew mo = new Moutaindew();
    RootBeer ro = new RootBeer();
    Soju so = new Soju();

    public void initialize(){
        ya.setName("Yakult ni ate");
        ya.setRating("8/10");

        mi.setName("Milktea sa tabi");
        mi.setRating("6/10");

        mo.setName("Moutaindew");
        mo.setRating("8/10");

        ro.setName("Rootbeer na may bulldog");
        ro.setRating("9/10");

        so.setName("Soju ni IU");
        so.setRating("9/10");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(milkteabtn)) {
            alert.setContentText("Drink name: " + mi.getName() + " Rating: " + mi.getRating());
        }

        if (sourceButton == moutaindewbtn) {
            alert.setContentText("Drink name: " + mo.getName() + " Rating: " + mo.getRating());
        }

        if (sourceButton == rootbeerbtn) {
            alert.setContentText("Drink name: " + ro.getName() + " Rating: " + ro.getRating());
        }

        if (sourceButton == sojubtn) {
            alert.setContentText("Drink name: " + so.getName() + " Rating: " + so.getRating());
        }

        if (sourceButton == yakultbtn) {
            alert.setContentText("Drink name: " + ya.getName() + " Rating: " + ya.getRating());
        }

        alert.showAndWait();

    }



}