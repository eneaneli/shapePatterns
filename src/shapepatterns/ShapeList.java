/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns;


import java.util.ArrayList;
import java.util.Arrays;
import javafx.event.ActionEvent;



/**
 *
 * @author Michael
 */
public class ShapeList {
    
    private DrawShape shape = new DrawShape();
    private ArrayList<String> shapes = new ArrayList();
    private ArrayList<String> canvaslist = new ArrayList();
    private ArrayList<Shape> shapesInLine = new ArrayList();
    
    
    public ShapeList()
    {
        shapes.addAll(Arrays.asList("Triangle", "Circle", "Rectangle"));
        canvaslist.addAll(Arrays.asList("Grid", "Cross", "Random"));
    }
    
    
    public ArrayList<String> getShapesInLine()
    {
        ArrayList<String> shapesAsString = new ArrayList();
            for(Shape shape : shapesInLine){
                shapesAsString.add(shape.getName() + " " + shape.getSize());
                 
            }
            return shapesAsString;
            }
    
    
    public void drawShape()
    {
        
    }

    
   public void addShapesInLine(String shape, int size)
    {
        this.shapesInLine.add(new Shape(shape, size));
    }

    public ArrayList<String> getShapes() {
        return shapes;
    }


    public ArrayList<String> getCanvaslist() {
        return canvaslist;
    }

    /**
     * This is linked to the clear button beneath the canvas, and it clears the canvas
     */
    public void clearCanvas()
    {
      shape.clearCanvas();
    }


  /**
   * This is linked to the clear button right beneath the ListView, and it will clear
   * the ListView so we can add new shapes. 1706
   * @param event 
   */
//       private void clearTheList (ActionEvent event)
//    {
//        asiLogsListView.getItems().clear();
//    }     

    
        
    }

