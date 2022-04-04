/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CallBreak;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author srivarun
 */
public class CardsDistribution {
    
    public void CardsDistributionLogic(ArrayList<Card> cardsList){
        
        ArrayList<Integer> allSpadeCards = new ArrayList<>();

//Adding all Spade cards to allSpadeCards list
        for(int i=0;i<13;i++){
            allSpadeCards.add(i);
        }
        
        ArrayList<Integer> nonSpadeFaceCards = new ArrayList<>();

//Adding all Non-Spade Face Cards to nonSpadeFaceCards list      
        nonSpadeFaceCards.add(14);
        nonSpadeFaceCards.add(15);
        nonSpadeFaceCards.add(16);
        nonSpadeFaceCards.add(27);
        nonSpadeFaceCards.add(28);
        nonSpadeFaceCards.add(29);
        nonSpadeFaceCards.add(40);
        nonSpadeFaceCards.add(41);
        nonSpadeFaceCards.add(42);

        

        
        ArrayList<Integer> nonSpadeNumberCards = new ArrayList<>();
        
//Adding all Non-Spade Number Cards to nonSpadeNumberCards list                
        nonSpadeNumberCards.add(13);
        for(int i=17;i<27;i++){
            nonSpadeNumberCards.add(i);
        }
        for(int i=30;i<40;i++){
            nonSpadeNumberCards.add(i);
        }
        for(int i=43;i<=51;i++){
            nonSpadeNumberCards.add(i);
        }
        
//Creating 4 ArrayList of Card Class       
        ArrayList<Card> player1List = new ArrayList<>();
        ArrayList<Card> player2List = new ArrayList<>();
        ArrayList<Card> player3List = new ArrayList<>();
        ArrayList<Card> player4List = new ArrayList<>();

//Shuffling the arrays using Collections
        Collections.shuffle(allSpadeCards);
        Collections.shuffle(nonSpadeNumberCards);
        Collections.shuffle(nonSpadeFaceCards);

//Assigning a spade card to each player
        player1List.add(cardsList.get(allSpadeCards.remove(0)));
        player2List.add(cardsList.get(allSpadeCards.remove(0)));
        player3List.add(cardsList.get(allSpadeCards.remove(0)));
        player4List.add(cardsList.get(allSpadeCards.remove(0)));
        
        
//Assigning a face card to each player if player doesn't have a face card
        if(player1List.get(0).getIsFaceCard() == false){
            player1List.add(cardsList.get(nonSpadeFaceCards.remove(0)));
        }
        if(player2List.get(0).getIsFaceCard() == false){
            player2List.add(cardsList.get(nonSpadeFaceCards.remove(0)));
        }
        if(player3List.get(0).getIsFaceCard() == false){
            player3List.add(cardsList.get(nonSpadeFaceCards.remove(0)));
        }
        if(player4List.get(0).getIsFaceCard() == false){
            player4List.add(cardsList.get(nonSpadeFaceCards.remove(0)));
        }
        
        
        ArrayList<Integer> remainingCards = new ArrayList<>();

//Adding remaining cards to remainingCards list        
        remainingCards.addAll(allSpadeCards);
        remainingCards.addAll(nonSpadeFaceCards);
        remainingCards.addAll(nonSpadeNumberCards);

//Shuffling the remainingCardsList using Collections        
        Collections.shuffle(remainingCards);
       
        int lengthOfRemainingCards = remainingCards.size();

//Assigning player 1 with a total of 13 random cards        
        while(!remainingCards.isEmpty()){
            if(player1List.size()!=13){
                player1List.add(cardsList.get(remainingCards.remove(0)));
            }
            else{
                break;
            }
        }
        
//Assigning player 2 with a total of 13 random cards          
        while(!remainingCards.isEmpty()){
            if(player2List.size()!=13){
                player2List.add(cardsList.get(remainingCards.remove(0)));
            }
            else{
                break;
            }
        }

//Assigning player 3 with a total of 13 random cards  
        while(!remainingCards.isEmpty()){
            if(player3List.size()!=13){
                player3List.add(cardsList.get(remainingCards.remove(0)));
            }
            else{
                break;
            }
        }

//Assigning player 4 with a total of 13 random cards          
        while(!remainingCards.isEmpty()){
            if(player4List.size()!=13){
                player4List.add(cardsList.get(remainingCards.remove(0)));
            }
            else{
                break;
            }
        }

//Sorting Cards of each players according to the rank
        Collections.sort(player1List);
        Collections.sort(player2List);
        Collections.sort(player3List);
        Collections.sort(player4List);


//        for(Card c : player1List){
//            System.out.println(c.getName()+" of "+c.getSuit());
//        }
//        System.out.println();
//        System.out.println(player1List.size());
//        System.out.println();

//        for(Card c : player2List){
//            System.out.println(c.getName()+" of "+c.getSuit());
//        }
//        System.out.println();
//        System.out.println(player2List.size());
//        System.out.println();

//        for(Card c : player3List){
//            System.out.println(c.getName()+" of "+c.getSuit());
//        }
//        System.out.println();
//        System.out.println(player3List.size());
//        System.out.println();

//        for(Card c : player4List){
//            System.out.println(c.getName()+" of "+c.getSuit());
//        }
//        System.out.println();
//        System.out.println(player4List.size());
//        System.out.println();
 
//Creating 4 Player objects and adding details and assigning cards to each player 
        Player p1 = new Player("player1",player1List,0);
        Player p2 = new Player("player2",player2List,0);
        Player p3 = new Player("player3",player3List,0);
        Player p4 = new Player("player4",player4List,0);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
    }   
}
