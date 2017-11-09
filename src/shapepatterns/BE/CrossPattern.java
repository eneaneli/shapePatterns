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
