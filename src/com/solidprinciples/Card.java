package com.solidprinciples;

public class Card {

    protected int cardId;
    protected int atmPin;
    protected int cvv;
    public String userName;
    public String expiryDate;
    Card(int cardId)
    {
        this.cardId = cardId;
    }

}
