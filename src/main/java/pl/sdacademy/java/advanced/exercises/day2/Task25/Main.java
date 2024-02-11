package pl.sdacademy.java.advanced.exercises.day2.Task25;

public class Main {
    public static void main(String[] args)  {  // można wpisać throws BasketFullExceptionChecked, BasketEmptyExceptionChecked co pozwoli przejść przez Exception np. do testu!
        Basket basket = new Basket();

        try{
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
            //basket.addToBasket();
        } catch (BasketFullExceptionChecked ex) {
            System.out.println("Koszyk jest pełny: " + ex.getMessage());
        }

        try{
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
            //basket.removeFromBasket();
        } catch (BasketEmptyExceptionChecked ex) {
            System.out.println("Koszyk jest pusty: " + ex.getMessage());
        }

    }
}
