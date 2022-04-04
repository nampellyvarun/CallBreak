/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.thighRankt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CallBreak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author srivarun
 */
public class CutForSeat {


    public void CutForSeatLogic(ArrayList<Card> cardsList) {

         
        HashMap<Integer,Integer> cfs = new HashMap<>();
        
        HashSet<Card> hsCFSCards = new HashSet<>();
        
        HashSet<Integer> playerNumber = new HashSet<>();
        
//Generating 4 random cards and adding it to the HashSet
        while(hsCFSCards.size()!=4){
            hsCFSCards.add(cardsList.get((int) (Math.random() * 52)));
        }
        
//Converting HashSet to ArrayList
        List<Card>  alCFSCards= new ArrayList(hsCFSCards);
        
//Assigning each player with a card
        for(int i=0;i<4;i++){
            cfs.put(i+1,alCFSCards.get(i).getRank());
        }
      
        int highRank=0,distributingPlayerNo=0,discardingPlayerNo=0;
        
//Finding High Rank of all cards i.e, low priority card
        for (Map.Entry element : cfs.entrySet()){
            if((int)element.getValue()> highRank){
                highRank=(int)element.getValue();
                discardingPlayerNo=(int)element.getKey();
            }
        }
        int lowRank=highRank;
        
//Finding Low Rank of all cards i.e, high priority card
        for (Map.Entry element : cfs.entrySet()){
            if((int)element.getValue() < lowRank){
                lowRank=(int)element.getValue();
                distributingPlayerNo=(int)element.getKey();
            }
        }
//Displaying the player who Distributes the cards and who Discards the cards
        System.out.println("Player "+distributingPlayerNo+" Distributes the cards and Player "+discardingPlayerNo+" Discards the first Card");
        System.out.println(cardsList.get(highRank-1).toString());
        System.out.println(cardsList.get(lowRank-1).toString());
        
    }
    
}
