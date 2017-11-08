/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;



/**
 *
 * @author Michael
 */
public class FXMLDocumentController implements Initializable {
    
     @FXML
    private Label label;
    @FXML
    private ListView<String> shapeList;
    @FXML
    private ComboBox<String> shapeChoice;
    @FXML
    private ComboBox<String> canvasList;
    @FXML
    private Button addButton;
    @FXML
    private TextField shapeSize;
    
    
    private ShapeList shapeStore;
    private DrawShape shape;
    @FXML
    private Canvas drawShapes;
    @FXML
    private Button drawButton;
    @FXML
    private Canvas canvas;
  
    private void selectChoice(){
        
        
        shapeChoice.getItems().addAll(shapeStore.getShapes());
        shapeChoice.getSelectionModel().selectFirst();
        
        canvasList.getItems().addAll(shapeStore.getCanvaslist());
        canvasList.getSelectionModel().selectFirst();
}

    
    
    
    @FXML
    private void addShapeButton(ActionEvent event) {
        
        shapeStore.addShapesInLine(shapeChoice.getValue(), Integer.parseInt(shapeSize.getText()));
        shapeList.getItems().clear();
        shapeList.getItems().addAll(shapeStore.getShapesInLine());
        
    }
    @FXML
    private void clearCanvas(ActionEvent event)
    {
        shape.clearCanvas();
    }
    @FXML
    private void drawShape()
    {
        shapeStore.drawShape();
    }
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        shapeStore = new ShapeList();;
        shape = new DrawShape(); 
        
        shapeStore.setContext(canvas.getGraphicsContext2D());
        
        selectChoice();
    
         
         
    }    
    
}