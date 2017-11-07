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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
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
    private AnchorPane AnchorPane;
    @FXML
    private Button drawButton;
    @FXML
    private TextArea canvas;
    @FXML
    private ListView<?> shapeList;
    @FXML
    private ChoiceBox shapeChoice;
    @FXML
    private ChoiceBox canvasList;
    @FXML
    private Button addButton;
    @FXML
    private TextField sizeField;
    @FXML
    private Button clearButtonShape;
    @FXML
    private Button clearButtonCanvas;
    
    
    ObservableList<String> shapes = FXCollections.observableArrayList("Triangle","Circle");
    ObservableList<String> canvaslist = FXCollections.observableArrayList("Grid","Cross","Random");
   
    private void choiceBoxMenu(){
    shapeChoice.setValue("Triangle");
    shapeChoice.setItems(shapes);
    
    canvasList.setValue("Grid");
    canvasList.setItems(canvaslist);
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
