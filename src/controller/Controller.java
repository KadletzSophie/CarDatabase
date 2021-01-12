package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import model.CarDatabase;
import model.Vehicle;

/**
 * @author Sophie Kadletz
 * @version 12.01.2021
 */

public class Controller {
    CarDatabase cd;

    @FXML
    private TextArea eingabe_txtf;

    @FXML
    private Button search_bt;

    @FXML
    private Button searchex_bt;  //searchex = search exact

    @FXML
    private TextArea ausgabe_txta;

    @FXML
    void searchVehicle(ActionEvent event) {
        String licencePlate = eingabe_txtf.getText();
        ausgabe_txta.clear();
        Vehicle[] v = cd.search(licencePlate,false);
        for(Vehicle tmp : v){
            ausgabe_txta.appendText(tmp.toString());
            ausgabe_txta.appendText("\n \n");
        }
    }

    @FXML
    void searchVehicleExact(ActionEvent event) {
        String licencePlate = eingabe_txtf.getText();
        ausgabe_txta.clear();
        Vehicle[] v = cd.search(licencePlate,true);
        for(Vehicle tmp : v){
            ausgabe_txta.appendText(tmp.toString());
        }
    }

    public void initialize() {
        cd = new CarDatabase();
    }
}
