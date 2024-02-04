package pl.sdacademy.java.advanced.exercises.day2.Task24;

public class Basket {
    private int numberOfElements;

    public Basket() {
        this.numberOfElements = 0;
    }
    public void addToBasket() {
        if(numberOfElements >= 10){
            //excpetion
            throw new BasketFullException("Too many items in the basket");
        }
        numberOfElements++;
    }
    public void removeFromBasket() {
        if(numberOfElements == 0) {
            //exception
            throw new BasketEmptyException("Can not remove from empty basket");
        }
        numberOfElements--;
    }

}
