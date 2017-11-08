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
public class Shape {
    
    private int Size;
    private String Name;

    /**
     * 1706 whatt
     * @param Name
     * @param Size 
     */
    public Shape(String Name, int Size){
        this.Name = Name;
        this.Size = Size;
        
    }

  

    /**
     * 1706
     * @return 
     */
    public int getSize() {
        return Size;
    }

    /**
     * 1706
     * @return 
     */
    public String getName() {
        return Name;
    }
    
    
    
}
