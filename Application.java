/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CallBreak;

import java.util.ArrayList;

/**
 *
 * @author srivarun
 */
public class Application {
    
    public static void main(String []args){

        GenerateCards gCards = new GenerateCards();
        ArrayList<Card> cardsList;
        
        cardsList = gCards.CreateCards();
        
        CutForSeat cfsObj = new CutForSeat();
        cfsObj.CutForSeatLogic(cardsList);
        
        CardsDistribution cdObj = new CardsDistribution();
        cdObj.CardsDistributionLogic(cardsList);
        
        
    }
    
}
