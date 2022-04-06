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
public class Player {
    private String name;
    private ArrayList<Card> playerCards;
    private int score;

    public Player(String name, ArrayList<Card> playerCards, int score) {
        this.name = name;
        this.playerCards = playerCards;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(ArrayList<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Players{" + "name=" + name + ", playerCards=" + playerCards + ", score=" + score + '}';
    }
}
