/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapepatterns.BE;

import java.util.Random;

/**
 *
 * @author Michael
 */
public class RandomPattern implements Patterns {
    
    Random rand = new Random();

    
    
    @Override
    public double getNextX()
    {
        return rand.nextDouble() * 321;
    }

    @Override
    public double getNextY()
    {
        return rand.nextDouble() * 385;
    }
    
}
