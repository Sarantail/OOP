package hw1;

public class Main {
    public static void main(String[] args) {

        HotDrink coffe = new HotDrink("coffe", 0.3, true, 90, 80);
        HotDrink tea = new HotDrink("tea", 0.5, true, 70, 50);
        HotAutomat hotAu = new HotAutomat();
        hotAu.addHotDrinks(coffe);
        hotAu.addHotDrinks(tea);

        System.out.println(hotAu.getHotDrinks());

        hotAu.shopHotDrinks();
    }
}
