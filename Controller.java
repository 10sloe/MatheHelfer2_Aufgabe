import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.text.NumberFormat;
import javafx.event.ActionEvent;

public class Controller {

     Dreieck dreieck;
    @FXML
    private TextField txtA;

    @FXML
    private TextField txtC;

    @FXML
    private Label lblErg;
    
    @FXML
    void initialize() {
        dreieck = new Dreieck();

    }

    

    @FXML
    void berechne_a_c(ActionEvent event) {
        try{
            dreieck.setA(Double.parseDouble(txtA.getText()));
            dreieck.setC(Double.parseDouble(txtC.getText()));

            double erg = dreieck.berechne_A_C();
            NumberFormat n = NumberFormat.getInstance();
            n.setMaximumFractionDigits(2);

            lblErg.setText("Die Steigung der Geraden AC beträgt "+ n.format(erg));
        } catch(Exception ex){}
    }

    @FXML
    void berechne_alpha(ActionEvent event) {
        try{
            dreieck.setA(Double.parseDouble(txtA.getText()));
            dreieck.setC(Double.parseDouble(txtC.getText()));

            double erg = dreieck.berechneAlpha();
            NumberFormat n = NumberFormat.getInstance();
            n.setMaximumFractionDigits(2);

            lblErg.setText("Der Winkel alpha beträgt "+ n.format(erg) + "°");
        } catch(Exception ex){
        }

    }

    @FXML
    void berechneb(ActionEvent event) {
        try{
            dreieck.setA(Double.parseDouble(txtA.getText()));
            dreieck.setC(Double.parseDouble(txtC.getText()));

            double erg = dreieck.berechneB();
            NumberFormat n = NumberFormat.getInstance();
            n.setMaximumFractionDigits(2);

            lblErg.setText("Die Länge der Hypotenuse beträgt "+ n.format(erg));
        }
        catch(Exception ex)
        {}
    }

}
