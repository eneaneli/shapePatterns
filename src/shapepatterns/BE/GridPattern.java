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
public class GridPattern implements Patterns{

    
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
//    private void displayWinner(int winner)
//    {
//        String message = "";
//        switch (winner)
//        {
//            case -1:
//                message = "It's a draw :-(";
//                break;
//            default:
//                message = "Player " + winner + " wins!!!";
//                break;
//        }
//        lblPlayer.setText(message);
//    }

//
//public class SwitchDemo {
//    public static void main(String[] args) {
//
//      ;
//        switch (NextX) {
//            case 1:  10;
//                     break;
//            case 2:  30 ;
//                     break;
//            case 3:  50;
//                     break;
//            case 4:  70;
//                     break;
//            case 5:  90;
//                     break;
//
//            default: 200;
//                     break;
//        }
//        return(NextX);
//    }
//}