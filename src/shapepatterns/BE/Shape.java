/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns.BE;

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

    public int getSize() {
        return Size;
    }

    public String getName() {
        return Name;
    }
      
}
