/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promillerechner;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author rwuer
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private CheckBox mann;
    @FXML
    private CheckBox frau;
    @FXML
    private Button berechnen;
    @FXML
    private Label ausgabe;
    @FXML
    private TextField kilogramm;
    @FXML
    private TextField liter;
    @FXML
    private TextField zeit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void mannAction(ActionEvent event) {
        frau.setSelected(false);
    }

    @FXML
    private void frauAction(ActionEvent event) {
        mann.setSelected(false);
    }

    @FXML
    private void berechnenAction(ActionEvent event) {
        String k = kilogramm.getText();
        String l = liter.getText();
        String m = zeit.getText();
        double snup = 0;
        double minuten = 0;
        double literino = 0;
        double resultat = 0;

        snup = Double.parseDouble(k);
        literino = Double.parseDouble(l);
        minuten = Double.parseDouble(m);

        if (mann.isSelected()) {
            resultat =  (literino * 40) / (snup * 0.7);
        }
        
        else{
            resultat =  (literino * 40) / (snup * 0.6);
        }
        
        //0.0025 promille pro minute werden abgebaut
        
        minuten = minuten * 0.0025;
        resultat = resultat - minuten; 
        
        ausgabe.setText("Promille im Blut: " + resultat );
        
        
        
        

    }

}
