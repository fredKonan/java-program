package com.techelevator;

public class FruitTree {
    private String typeOfFruit;
    private int piecesOfFruitLeft;


    public FruitTree(String typeOfFruit, int startingPiecesOfFruit){
        this.piecesOfFruitLeft = startingPiecesOfFruit;
        this.typeOfFruit=typeOfFruit;
    }
    public String getTypeOfFruit(){
        return this.typeOfFruit;
    }
    public int getPiecesOfFruitLeft(){
       return this.piecesOfFruitLeft;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        if(this.piecesOfFruitLeft - numberOfPiecesToRemove>=0){
            this.piecesOfFruitLeft = getPiecesOfFruitLeft()-numberOfPiecesToRemove;
            return true;
        }
        else
            return false;
    }
}
