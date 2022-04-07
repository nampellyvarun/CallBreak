/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.thighRankt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CallBreak1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author srivarun
 */
public class CutForSeat {


    public void CutForSeatLogic(ArrayList<Card> cardsList) {
        
        ArrayList<Card> alCFSCards = new ArrayList<>();
        
        GenerateCards gCards = new GenerateCards();
        
        ArrayList<Integer> cnl = gCards.cardNumberList;
        
        Collections.shuffle(cnl);




        
//Generating 4 random cards and adding it to the HashSet
        for(int i=1;i<=4;i++){
            Card c = cardsList.get(cnl.remove(0));
            c.setPlayerNo(i);
            alCFSCards.add(c);
        }
              
        Iterator<Card> itr1 = alCFSCards.iterator();
        Card cDistributor = itr1.next();
                
        int highCard=cDistributor.getCardNumber();
        char suit = cDistributor.getSuit();
        while(itr1.hasNext()){
            Card c = itr1.next();
            if(c.getCardNumber() > highCard){
                highCard = c.getCardNumber();
                cDistributor = c;
            }
            else if(c.getCardNumber() == highCard){
                  if((int)c.getSuit()>(int)suit){
                      cDistributor = c;
                  }
            }
        }
        
        Iterator<Card> itr2 = alCFSCards.iterator();
        Card cDiscarder = itr2.next();
        
        int lowCard=cDistributor.getCardNumber();
        suit = cDistributor.getSuit();
        
        while(itr2.hasNext()){
            Card c = itr2.next();
            if(c.getCardNumber() < lowCard){
                lowCard = c.getCardNumber();
                cDiscarder = c;
            }
            else if(c.getCardNumber() == lowCard){
                  if((int)c.getSuit()>(int)suit){
                      cDiscarder = c;
                  }
            }
        }
        
        System.out.println(alCFSCards);
        ArrayList<Card> alSeatArrangement = new ArrayList<>();
        alSeatArrangement.add(cDistributor);
        alSeatArrangement.add(cDiscarder);
        alCFSCards.remove(cDistributor);
        alCFSCards.remove(cDiscarder);
        
        Iterator<Card> itr3 = alCFSCards.iterator();
        Card c2 = itr3.next();
        
        lowCard=c2.getCardNumber();
        suit = c2.getSuit();
        
        while(itr3.hasNext()){
            Card c = itr3.next();
            if(c.getCardNumber() < lowCard){
                lowCard = c.getCardNumber();
                c2 = c;
            }
            else if(c.getCardNumber() == lowCard){
                  if((int)c.getSuit()>(int)suit){
                      c2 = c;
                  }
            }
        }
        alSeatArrangement.add(c2);
        alCFSCards.remove(c2);
        alSeatArrangement.add(alCFSCards.remove(0));
        


//Displaying the player who Distributes the cards and who Discards the cards

        System.out.println(alSeatArrangement);
        
//        System.out.println(player+"-"+cDistributor);
//        System.out.println(player2+"-"+cDiscarder);
        System.out.println("Player "+cDistributor.getPlayerNo()+" Distributes the cards and Player "+cDiscarder.getPlayerNo()+" Discards the first Card");
        
    }
    
    
    
}
