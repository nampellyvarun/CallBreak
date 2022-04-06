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

        HashMap<Integer,Card> cfs = new HashMap<>();
        
        ArrayList<Card> alCFSCards = new ArrayList<>();
        
        HashSet<Integer> playerNumber = new HashSet<>();
        
        GenerateCards gCards = new GenerateCards();
        
        ArrayList<Integer> cnl = gCards.cardNumberList;
        
        Collections.shuffle(cnl);




        
//Generating 4 random cards and adding it to the HashSet
        for(int i=0;i<4;i++){
            alCFSCards.add(cardsList.get(cnl.remove(0)));
        }
              
//Assigning each player with a card
        for(int i=0;i<4;i++){
            cfs.put(i+1,alCFSCards.get(i));
        }
        
        Iterator<Map.Entry<Integer, Card>> itr = cfs.entrySet().iterator();
        Map.Entry<Integer,Card> entryHigh = itr.next(); 
        Card cHigh = entryHigh.getValue();
        int player=entryHigh.getKey();
        int highCard=cHigh.getCardNumber();
        char suit = cHigh.getSuit();
        while(itr.hasNext())
        {
            entryHigh = itr.next();
            if(entryHigh.getValue().getCardNumber() > highCard){
                highCard = entryHigh.getValue().getCardNumber();
                cHigh=entryHigh.getValue();
                player = entryHigh.getKey();
            }
            else if(entryHigh.getValue().getCardNumber() == highCard){
                  if((int)entryHigh.getValue().getSuit()>(int)suit){
                      cHigh=entryHigh.getValue();
                  }
            }
        }
        
        Iterator<Map.Entry<Integer, Card>> itr2 = cfs.entrySet().iterator();
        Map.Entry<Integer,Card> entryLow = itr2.next();
        Card cLow = entryLow.getValue();
        int player2=entryLow.getKey();
        int lowCard=cLow.getCardNumber();
        char suit2 = cLow.getSuit();
        while(itr2.hasNext())
        {
            entryLow = itr2.next();
            if(entryLow.getValue().getCardNumber() < lowCard){
                lowCard = entryLow.getValue().getCardNumber();
                cLow=entryLow.getValue();
                player2 = entryLow.getKey();
            }
            else if(entryLow.getValue().getCardNumber() == lowCard){
                  if((int)entryLow.getValue().getSuit()<(int)suit2){
                      cLow=entryLow.getValue();
                  }
            }
        }

//Displaying the player who Distributes the cards and who Discards the cards
        System.out.println(cfs);
//        System.out.println(player+"-"+cHigh);
//        System.out.println(player2+"-"+cLow);
        System.out.println("Player "+player+" Distributes the cards and Player "+player2+" Discards the first Card");
        
    }
    
}
