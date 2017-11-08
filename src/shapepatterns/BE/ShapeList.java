/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns.BE;


import shapepatterns.BE.RandomPattern;
import shapepatterns.BE.Shape;
import shapepatterns.bll.DrawShape;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.event.ActionEvent;

import javafx.scene.canvas.GraphicsContext;



/**
 *
 * @author Michael
 */
public class ShapeList {
    
    private DrawShape drawShape = new DrawShape();
    private Patterns pattern;
    private ArrayList<String> shapes = new ArrayList();
    private ArrayList<String> canvaslist = new ArrayList();
    private ArrayList<Shape> shapesInLine = new ArrayList();
    
    /**
     * Write stuff 1706
     */
    public ShapeList()
    {
        shapes.addAll(Arrays.asList("Triangle", "Circle", "Rectangle"));
        canvaslist.addAll(Arrays.asList("Grid", "Cross", "Random"));
    }
    
    /**
     * Write stuff 1706
     * @return 
     */
    public ArrayList<String> getShapesInLine()
    {
        ArrayList<String> shapesAsString = new ArrayList();
            for(Shape shape : shapesInLine){
                shapesAsString.add(shape.getName() + " " + shape.getSize());
                 
            }
            return shapesAsString;
            }
    
    /**
     * write stuff 1706
     */
    public void drawShape()
    {
        for (Shape shape: shapesInLine)
        {
            double x = pattern.getNextX();
            double y = pattern.getNextX();
            
            if(shape.getName() == "Triangle"){
                drawShape.drawTriangle(x, y, shape.getSize());
            }
            if(shape.getName() == "Rectangle"){
                drawShape.drawRectangle(x, y, shape.getSize());
            }
            if(shape.getName() == "Circle"){
                drawShape.drawCircle(x, y, shape.getSize());
            }
            
        }
    }

    /**
     * 
     * @param shape
     * @param size 
     */
    public void addShapesInLine(String shape, int size)
    {
        this.shapesInLine.add(new Shape(shape, size));
    }
   
    /**
     * what does it do 1706
     * @param context 
     */
    public void setContext(GraphicsContext context)
    {
        drawShape.setContext(context);
    }

    /**
     * what goin on hier 1706
     * @return 
     */
    public ArrayList<String> getShapes() {
        return shapes;
    }

    /**
     * 1706 a getter for the canvaslist
     * @return 
     */
    public ArrayList<String> getCanvaslist() {
        return canvaslist;
    }

    /**
     * This is linked to the clear button beneath the canvas, and it clears the canvas.
     * is also in the controller
     */
    public void clearCanvas()
    {
        drawShape.clearCanvas();
    }
    
    /**
     * here's a setter
     * @param pattern 
     */
    public void setPattern(String pattern)
    {
        if (pattern == "Random")
        {
            this.pattern = new RandomPattern();
        }
      
        if (pattern == "Grid")
        {
            this.pattern = new GridPattern();
        }
        
        if (pattern == "Cross")
        {
            this.pattern = new CrossPattern();
        }
        
    }

     
    }

