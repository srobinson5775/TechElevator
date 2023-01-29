package com.techelevator;

public class FruitTree {

    private int piecesOfFruitLeft;
    private String typeOfFruit;

    public FruitTree( String typeOfFruit, int piecesOfFruitLeft) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruitLeft;

    }
    public String getTypeOfFruit(){
        return typeOfFruit;
    }
    public int getPiecesOfFruitLeft(){
        return piecesOfFruitLeft;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        if (numberOfPiecesToRemove > piecesOfFruitLeft && piecesOfFruitLeft> 0){
            return true;
        } else {
            if (piecesOfFruitLeft < numberOfPiecesToRemove);{
                return false;
            }
        }

    }

}
