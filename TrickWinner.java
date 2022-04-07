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

            Player p1 = new Player("player1",ccl.getPlayer1List());
            Player p2 = new Player("player2",ccl.getPlayer2List());
            Player p3 = new Player("player3",ccl.getPlayer3List());
            Player p4 = new Player("player4",ccl.getPlayer4List());
            
//            ArrayList<Card> trickList = getTrickCards();
            ArrayList<Card> trickList = new ArrayList<>();
            trickList.add(new Card(6,'c',false));
            trickList.add(new Card(3,'d',false));
            trickList.add(new Card(8,'h',false));
            trickList.add(new Card(9,'h',false));
            
            Card twc = trickList.get(0);
            
            for(int i=1;i<4;i++){
                Card c = trickList.get(i);
                if(c.getSuit()==twc.getSuit()){
                    if(c.getCardNumber() > twc.getCardNumber()){
                        twc=c;
                    }
                }
                else if(c.getSuit() == 's' && twc.getSuit()!='s'){
                    twc=c;
                }
            }
            int trickWinner = twc.getPlayerNo();
            System.out.println(twc);
            

//            System.out.println(p1);
//            System.out.println(p2);
//            System.out.println(p3);
//            System.out.println(p4);
        }
}
