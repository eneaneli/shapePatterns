/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns.BE;

import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Anni
 */
public class Shape {
    
    private int Size;
    private String Name;

    /**
     * Shape with parameters String Name and int Size
     */
    public Shape(String Name, int Size){
        this.Name = Name;
        this.Size = Size;      
    }

    /**
     * getter
     * @return 
     */
    public int getSize() {
        return Size;
    }

    /**
     * getter
     * @return 
     */
    public String getName() {
        return Name;
    }
      
}
