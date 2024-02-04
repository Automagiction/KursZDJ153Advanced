package pl.sdacademy.java.advanced.exercises.day2.Task24;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        basket.addToBasket();
        try{
            basket.addToBasket();
        } catch (BasketFullException ex) {
            System.out.println("Koszyk jest pełny: " + ex.getMessage());
        }
        //basket.addToBasket();

        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        basket.removeFromBasket();
        try{
            basket.removeFromBasket();
        } catch (BasketEmptyException ex) {
            System.out.println("Koszyk jest pusty: " + ex.getMessage());
        }
        //basket.removeFromBasket();

    }
}
