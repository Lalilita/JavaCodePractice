package Project.CoffeeMachine.stage3of6;

public class Stage3_EstimateNumberOfServing {

    int water, milk, coffeeBeans, cup;

    public void estimateNumberOfServing(int water, int milk, int coffeeBeans, int cup) {
        System.out.println("Write how many ml of water the coffee machine has: " + water);
        System.out.println("Write how many ml of milk the coffee machine has: " + milk);
        System.out.println("Write how many grams of coffee beans the coffee machine has: " + coffeeBeans);
        System.out.println("Write how many cups of coffee you will need: " + cup);

        int waterRemainForCup = water / 200;
        int milkRemainForCup = milk / 50;
        int coffeeRemainForCup = coffeeBeans / 15;
        int cupRemain = waterRemainForCup;

        if (milkRemainForCup < cupRemain) cupRemain = milkRemainForCup;
        if (coffeeRemainForCup < cupRemain) cupRemain = coffeeRemainForCup;

        if (cupRemain < cup) {
            System.out.println("> No, I can make only " + cupRemain + " cup(s) of coffee");
        } else if (cupRemain > cup) {
            System.out.println("> Yes, I can make that amount of coffee (and even " + (cupRemain - cup) + " more than that)");
        } else {
            System.out.println("> Yes, I can make that amount of coffee");
        }
    }
}
