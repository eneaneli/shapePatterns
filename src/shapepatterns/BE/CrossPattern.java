/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns.BE;

import java.util.Random;

/**
 *
 * @author Anni
 */
public class CrossPattern implements Patterns{

    
    Random rand = new Random();

    
    
    @Override
    public double getNextX()
    {
       //return rand.nextDouble() * 321;//321
        return 100;
    }

    @Override
    public double getNextY()
    {
        //return 192; 
        return rand.nextDouble() * 385; 
    }  
  
}
