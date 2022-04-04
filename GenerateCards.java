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
public class GenerateCards {
    
    public ArrayList CreateCards(){
        
        ArrayList<Card> cardsList = new ArrayList<>();
    
        cardsList.add(new Card("A","spade",false,1));
        cardsList.add(new Card("K","spade",true,2));
        cardsList.add(new Card("Q","spade",true,3));
        cardsList.add(new Card("J","spade",true,4));
        cardsList.add(new Card("10","spade",false,5));
        cardsList.add(new Card("9","spade",false,6));
        cardsList.add(new Card("8","spade",false,7));
        cardsList.add(new Card("7","spade",false,8));
        cardsList.add(new Card("6","spade",false,9));
        cardsList.add(new Card("5","spade",false,10));
        cardsList.add(new Card("4","spade",false,11));
        cardsList.add(new Card("3","spade",false,12));
        cardsList.add(new Card("2","spade",false,13));
        
        cardsList.add(new Card("A","heart",false,14));
        cardsList.add(new Card("K","heart",true,15));
        cardsList.add(new Card("Q","heart",true,16));
        cardsList.add(new Card("J","heart",true,17));
        cardsList.add(new Card("10","heart",false,18));
        cardsList.add(new Card("9","heart",false,19));
        cardsList.add(new Card("8","heart",false,20));
        cardsList.add(new Card("7","heart",false,21));
        cardsList.add(new Card("6","heart",false,22));
        cardsList.add(new Card("5","heart",false,23));
        cardsList.add(new Card("4","heart",false,24));
        cardsList.add(new Card("3","heart",false,25));
        cardsList.add(new Card("2","heart",false,26));
        
        cardsList.add(new Card("A","diamond",false,27));
        cardsList.add(new Card("K","diamond",true,28));
        cardsList.add(new Card("Q","diamond",true,29));
        cardsList.add(new Card("J","diamond",true,30));
        cardsList.add(new Card("10","diamond",false,31));
        cardsList.add(new Card("9","diamond",false,32));
        cardsList.add(new Card("8","diamond",false,33));
        cardsList.add(new Card("7","diamond",false,34));
        cardsList.add(new Card("6","diamond",false,35));
        cardsList.add(new Card("5","diamond",false,36));
        cardsList.add(new Card("4","diamond",false,37));
        cardsList.add(new Card("3","diamond",false,38));
        cardsList.add(new Card("2","diamond",false,39));
        
        cardsList.add(new Card("A","club",false,40));
        cardsList.add(new Card("K","club",true,41));
        cardsList.add(new Card("Q","club",true,42));
        cardsList.add(new Card("J","club",true,43));
        cardsList.add(new Card("10","club",false,44));
        cardsList.add(new Card("9","club",false,45));
        cardsList.add(new Card("8","club",false,46));
        cardsList.add(new Card("7","club",false,47));
        cardsList.add(new Card("6","club",false,48));
        cardsList.add(new Card("5","club",false,49));
        cardsList.add(new Card("4","club",false,50));
        cardsList.add(new Card("3","club",false,51));
        cardsList.add(new Card("2","club",false,52));
        
        return cardsList;
    } 
    
}
