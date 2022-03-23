package Project.CoffeeMachine;


import Project.CoffeeMachine.stage1of6.Stage1_MakingCoffee;
import Project.CoffeeMachine.stage2of6.Stage2_IngredientCalculator;
import Project.CoffeeMachine.stage3of6.Stage3_EstimateNumberOfServing;
import Project.CoffeeMachine.stage4of6.Stage4_BuyFillTake;

public class Main {

    public static void main(String[] args) {

        Stage1_MakingCoffee mk = new Stage1_MakingCoffee();
        System.out.println("-------Stage 1 of 6-------");
        mk.start();
        mk.grind();
        mk.boilWater();
        mk.brew();
        mk.pourCoffee();
        mk.pourMilk();
        mk.ready();

        Stage2_IngredientCalculator igCal = new Stage2_IngredientCalculator();
        System.out.println("\n-------Stage 2 of 6-------");
        igCal.ingredientCalculate(25);

        Stage3_EstimateNumberOfServing esServe = new Stage3_EstimateNumberOfServing();
        System.out.println("\n-------Stage 3 of 6-------");
        esServe.estimateNumberOfServing(200,50,15,0);

        Stage4_BuyFillTake bft = new Stage4_BuyFillTake();
        System.out.println("\n-------Stage 4 of 6-------");
//        bft.displayStart();
//        bft.buyCoffee(3);
        bft.fillCoffee(2000,500,100,10);
    }
}
