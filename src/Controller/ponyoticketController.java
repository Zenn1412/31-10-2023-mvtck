package Controller;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ponyoticketController {


    @FXML
    private Label selectedSeatLabel;

    public void setSelectedSeatLabel(String text) {
        selectedSeatLabel.setText(text);
        selectedSeatLabel.setVisible(true); // Make the label visible when a seat is selected
    }

    //     public void setSelectedTimeLabel(String text) {
    //         selectedTimeLabel.setText(text);
    // }

    
  
}