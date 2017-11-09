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
    boolean xIsNotRandom=true;
    boolean yIsNotRandom=true;
    
    /**
     * Here is a method for getting the next x, in it is a boolean so it switches
     * between a set number and a random number in order to get the cross pattern.
     * @return 
     */
    @Override
    public double getNextX()
    {     
       if(xIsNotRandom)
       {
        xIsNotRandom=false;
       return 160;
       }
       else
       {
       xIsNotRandom=true;
       return rand.nextDouble() * 321;
             
       }                       
    }
   /**
     * Here is a method for getting the next y, in it is a boolean so it switches
     * between a set number and a random number in order to get the cross pattern.
     * @return 
     */
    @Override
    public double getNextY()
    {   
        if(yIsNotRandom)
        {
        yIsNotRandom=false;
        
        return rand.nextDouble() * 385;
        }
        else
        {
        yIsNotRandom=true;
        return 192;
        }
    }  
 
   
          
}
