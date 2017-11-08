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

    private ShapeList shapeStore = new ShapeList();
    
    private DrawShape shape = new DrawShape();
    @FXML
    private Canvas drawShapes;
    @FXML
    private Button drawButton;
    @FXML
    private Canvas canvas;
    @FXML
    private Button clearList;
    @FXML
    private Button clearCanvasButton;
  
    
    /**
     * 1706
     */
    private void selectChoice(){
        
        
        shapeChoice.getItems().addAll(shapeStore.getShapes());
        shapeChoice.getSelectionModel().selectFirst();
        
        canvasList.getItems().addAll(shapeStore.getCanvaslist());
        canvasList.getSelectionModel().selectFirst();
}
    
    /**
     * 1706 why fxml here?
     * @param event 
     */
    @FXML
    private void addShapeButton(ActionEvent event) {
        
        shapeStore.addShapesInLine(shapeChoice.getValue(), Integer.parseInt(shapeSize.getText()));
        shapeList.getItems().clear();
        shapeList.getItems().addAll(shapeStore.getShapesInLine());
        
    }


    /**
     * fxml? 1706
     */
    @FXML
    private void drawShape()
    {
        shapeStore.drawShape();
    }
    
    /**
     * 1706 fxml?
     * @param event 
     */
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    /**
     * override? 1706
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        shapeStore = new ShapeList();;
        shape = new DrawShape(); 
        
        shapeStore.setContext(canvas.getGraphicsContext2D());
        
        selectChoice();
    
        
    }    
      /**
   * This is linked to the clear button right beneath the ListView, and it will clear
   * the ListView so we can add new shapes. 1706 1706, how does it work
   * @param event 
   */
   private void clearTheList ()
  {
       shapeList.getItems().clear();

  }     

   /**
    * comment 1706
    * @param event 
    */
    @FXML
    private void clearListButton(ActionEvent event) {
        clearTheList();
    }

    /**
     * 1706 again why fxml, not sure we need this, not implemented yet
     * @param event 
     */
     @FXML
    private void clearCanvas()
    {
        shape.clearCanvas();
    }
   
     /**
    * comment 1706, not sure we need this, not implemented yet
    * @param event 
    */
    @FXML
    private void clearCanvasButton(ActionEvent event) {
        clearCanvas();
    }  
}