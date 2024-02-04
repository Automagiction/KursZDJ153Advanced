package pl.sdacademy.java.advanced.exercises.day2.Task25;

public class Basket {
    private int numberOfElements;

    public Basket() {
        this.numberOfElements = 0;
    }
    public void addToBasket() throws BasketFullExceptionChecked {
        if(numberOfElements >= 10){
            //excpetion
            throw new BasketFullExceptionChecked("Too many items in the basket");
        }
        numberOfElements++;
    }
    public void removeFromBasket() throws BasketEmptyExceptionChecked {
        if(numberOfElements == 0) {
            //exception
            throw new BasketEmptyExceptionChecked("Can not remove from empty basket");
        }
        numberOfElements--;
    }

}
