/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CallBreak1;

import java.util.ArrayList;

/**
 *
 * @author srivarun
 */
public class Application {
    
    public static void main(String []args){

        GenerateCards gCards = new GenerateCards();
        
        CutForSeat cfsObj = new CutForSeat();
        cfsObj.CutForSeatLogic(gCards.cardsList);
        
//        CardsDistribution cdObj = new CardsDistribution();
//        cdObj.CardsDistributionLogic(gCards.cardsList);
        
        TrickWinner tw = new TrickWinner();
        tw.trickWinnerCalculation();
        
    }
    
}
