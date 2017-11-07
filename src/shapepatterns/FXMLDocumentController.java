/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Anni
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
<<<<<<< HEAD
    private ChoiceBox<?> shape;
=======
    private AnchorPane AnchorPane;
    @FXML
    private Button drawButton;
    @FXML
    private TextArea canvas;
    @FXML
    private ListView<?> shapeList;
    @FXML
    private ChoiceBox shapeChoice;
>>>>>>> 3f9c78a1676bd33d8138aa819318a5e31f36a257
    @FXML
    private Button addButton;
    @FXML
    private Button button;
    @FXML
    private Canvas canvas;
    
    
    ObservableList<String> shapes = FXCollections.observableArrayList("Triangle","Circle");
   
    private void choiceBoxMenu(){
    shapeChoice.setValue("Triangle");
    shapeChoice.setItems(shapes);
    }
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        choiceBoxMenu();
    }    
    
    
    /**
     * draws shapes, hopefully.. in the future
     */
//     public void draw(int x, int y, GraphicsContext context) {
//      context.setFill(Color.BLACK);
//      context.setStroke(Color.BLACK);
//      context.setLineWidth(1);
//
//      double[] xPoints = {x,x+50,x-50};
//      double[] yPoints = {y,y+50,y+50};
//
//      context.beginPath();
//      context.strokePolygon(xPoints, yPoints, 3);
// }
}
