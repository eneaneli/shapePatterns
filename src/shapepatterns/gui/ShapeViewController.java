/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
import shapepatterns.bll.DrawShape;
import shapepatterns.BE.ShapeList;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Anni
 */
public class ShapeViewController implements Initializable {
    GraphicsContext gc;
    
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
     * 1706 ellie
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
        shapeStore.setPattern(canvasList.getValue());
        shapeStore.drawShape();
    }
    
    /**
     * 
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        shapeStore = new ShapeList();;
        shape = new DrawShape(); 
        
        shapeStore.setContext(drawShapes.getGraphicsContext2D());
        
        selectChoice();
    
    }    
    
      /**
   * This is linked to the clear button right beneath the ListView, and it will clear
   * the ListView so we can add new shapes. 
   * not good enough yet, need to find a way to actually delete items from list 1706
   * @param event 
   */
   private void clearTheList ()
  {
       shapeList.getItems().clear();
       shapeStore.clearShapes();
       
 
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
     * 1706
     * @param event 
     */
     @FXML
    private void clearCanvas()
    {
        shape.clearCanvas();
       // gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }
   
     /**
    * cant make work yet 1706
    * @param event 
    */
    @FXML
    private void clearCanvasButton(ActionEvent event) {
        clearCanvas();
    }  
}