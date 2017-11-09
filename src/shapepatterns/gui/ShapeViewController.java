/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns.gui;

import java.net.URL;
import javafx.scene.canvas.GraphicsContext;
import shapepatterns.BE.RandomPattern;
import shapepatterns.BE.Shape;
import shapepatterns.bll.DrawShape;

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
    @FXML
    private Canvas drawShapes;
    @FXML
    private Button drawButton;
    @FXML
    private Button clearList;
    @FXML
    private Button clearCanvasButton;
    
    private ShapeList shapeStore = new ShapeList();
    
    private DrawShape shape = new DrawShape();
    
    private DrawShape drawShape = new DrawShape();
    
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
     * adds shapes to the list
     * @param event 
     */
    @FXML
    private void addShapeButton(ActionEvent event) {
        
        shapeStore.addShapesInLine(shapeChoice.getValue(), Integer.parseInt(shapeSize.getText()));
        shapeList.getItems().clear();
        shapeList.getItems().addAll(shapeStore.getShapesInLine());       
    }


    /**
     * this draws a shape.
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
     * 1706
     * @param event 
     */
    private void clearCanvas()
    {
      GraphicsContext gc = drawShapes.getGraphicsContext2D();
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }
   
     /**
    * This is for the clear button underneath the canvas "drawShapes", 
    * it clears the canvas.
    * @param event 
    */
    @FXML
    private void clearCanvasButton(ActionEvent event) {
        clearCanvas();     
    }  

   /**
   * This is linked to the clear button right beneath the ListView, 
   * and it clears the ListView so we can add new shapes. 
   * @param event 
   */
   private void clearTheList ()
  {
       shapeList.getItems().clear();
       shapeStore.clearShapes();
  }     

   /**
    * @param event, this is for the FXML document so that when the clear button is clicked
    * it actually clears something.
    */
    @FXML
    private void clearListButton(ActionEvent event) {
        clearTheList();     
    }     
    
}