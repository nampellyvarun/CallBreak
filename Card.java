/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CallBreak;

import java.util.Objects;

/**
 *
 * @author srivarun
 */
public class Card implements Comparable<Card>{
    private String name;
    private String suit;
    private Boolean isFaceCard;
    private int rank;


    public Card(String name, String suit, Boolean isFaceCard, int rank) {
        this.name = name;
        this.suit = suit;
        this.isFaceCard = isFaceCard;
        this.rank = rank;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public Boolean getIsFaceCard() {
        return isFaceCard;
    }

    public void setIsFaceCard(Boolean isFaceCard) {
        this.isFaceCard = isFaceCard;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.suit);
        hash = 83 * hash + Objects.hashCode(this.isFaceCard);
        hash = 83 * hash + this.rank;
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
        if (this.rank != other.rank) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.suit, other.suit)) {
            return false;
        }
        return Objects.equals(this.isFaceCard, other.isFaceCard);
    }

    @Override
    public String toString() {
        return name+" of "+suit+" Rank is "+rank;   
    }

    @Override
    public int compareTo(Card t) {
        if(this.rank < t.rank){
            return -1;
        }
        else if(this.rank > t.rank){
            return 1;
        }
        else{
            return 0;
        }
    }
}

