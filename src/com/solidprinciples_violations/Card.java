package com.solidprinciples_violations;

class Card{
    protected int cardId;
    protected int atmPin;
    protected int cvv;
    public String userName;
    public String expiryDate;

    Card(int id)
    {
        this.cardId = id;
    }

}
