/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CallBreak1;

import java.util.Objects;

/**
 *
 * @author srivarun
 */
public class Card implements Comparable<Card>{
    private int cardNumber;
    private char suit;
    private Boolean isFaceCard;
    int playerNo;
    


    public Card(int cardNumber, char suit, Boolean isFaceCard) {
        this.cardNumber = cardNumber;
        this.suit = suit;
        this.isFaceCard = isFaceCard;
        this.playerNo=0;
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public void setPlayerNo(int playerNo) {
        this.playerNo = playerNo;
    }
    

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public Boolean getIsFaceCard() {
        return isFaceCard;
    }

    public void setIsFaceCard(Boolean isFaceCard) {
        this.isFaceCard = isFaceCard;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cardNumber);
        hash = 97 * hash + Objects.hashCode(this.suit);
        hash = 97 * hash + Objects.hashCode(this.isFaceCard);
        hash = 97 * hash + this.playerNo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Card other = (Card) obj;
        if (this.playerNo != other.playerNo) {
            return false;
        }
        if (!Objects.equals(this.cardNumber, other.cardNumber)) {
            return false;
        }
        if (!Objects.equals(this.suit, other.suit)) {
            return false;
        }
        return Objects.equals(this.isFaceCard, other.isFaceCard);
    }

    @Override
    public String toString() {
        return ""+cardNumber+" of "+suit +" p:"+playerNo;
    }

    @Override
    public int compareTo(Card t) {
        if((int)this.suit  < (int)t.suit){
            return 1;
        }
        else if((int)this.suit  > (int)t.suit){
            return -1;
        }
        else{
            if(this.cardNumber < t.cardNumber){
                return 1;
            }
            else{
                return -1;
            }
        }
    }

}

