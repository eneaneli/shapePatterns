/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns.BE;

import javafx.scene.canvas.GraphicsContext;
import shapepatterns.BE.RandomPattern;
import shapepatterns.BE.Shape;
import shapepatterns.bll.DrawShape;
import java.util.ArrayList;
import java.util.Arrays;







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
     * For the choiceboxes for choosing shape and pattern.
     */
    public ShapeList()
    {
        shapes.addAll(Arrays.asList("Triangle", "Circle", "Rectangle"));
        canvaslist.addAll(Arrays.asList("Grid", "Cross", "Random"));
    }
    
    /**
     * getShapesInLine is a method for getting shapesInLine as a String.
     */
    public ArrayList<String> getShapesInLine()
    {
        ArrayList<String> shapesAsString = new ArrayList();
            for(Shape shape : shapesInLine){
                shapesAsString.add(shape.getName() + " " + shape.getSize());
                 
            }
            return shapesAsString;
            }
    
    public void clearShapes()
    {
        shapesInLine.clear();
    }
    
    
    /**
     * here we draw the shapes as well
     */
    public void drawShape()
    {
        for (Shape shape: shapesInLine)
        {
            double x = pattern.getNextX();
            double y = pattern.getNextY();
            
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
     *  adds shapes to the listView
     * @param shape
     * @param size 
     */
    public void addShapesInLine(String shape, int size)
    {
        this.shapesInLine.add(new Shape(shape, size));
    }
   
    public void setContext(GraphicsContext context)
    {
        drawShape.setContext(context);
    }

    public ArrayList<String> getShapes() {
        return shapes;
    }


    public ArrayList<String> getCanvaslist() {
        return canvaslist;
    }


    
    /**
     * the pattern is set.
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

