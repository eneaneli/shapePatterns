/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Michael
 */
public class DrawShape {
    GraphicsContext gc ;
    
    public void drawCircle(double x, double y, int Size)
    {
        gc.strokeOval(x, y, Size, Size);
    }
  
    public void drawRectangle(double x, double y, int Size)
    {
        gc.strokeRect(x, y, Size, Size);
    }
 
    public void drawTriangle(double x, double y, int size)
    {
        double[] xPoints = {x, x + size, x + size / 2};
        double[] yPoints = {y, y, y + size};
        gc.beginPath();
        gc.fillPolygon(xPoints, yPoints, 3);
    }
 
    public void setContext(GraphicsContext gc)
    {
        this.gc = gc;
    }

    public void clearCanvas()
    {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
    }
    
}
