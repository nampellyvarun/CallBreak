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
public class TrickWinner extends CardsDistribution{
        
        public void trickWinnerCalculation(){
            
            GenerateCards gCards = new GenerateCards();
            
            CardsDistribution cdObj = new CardsDistribution();
            
            
            CreateCardsList ccl = cdObj.CardsDistributionLogic(gCards.cardsList);

            Player p1 = new Player("player1",ccl.getPlayer1List(),0);
            Player p2 = new Player("player2",ccl.getPlayer2List(),0);
            Player p3 = new Player("player3",ccl.getPlayer3List(),0);
            Player p4 = new Player("player4",ccl.getPlayer4List(),0);

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);
        }
}
