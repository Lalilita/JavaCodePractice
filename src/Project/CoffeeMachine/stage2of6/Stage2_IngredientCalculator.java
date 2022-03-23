package Project.CoffeeMachine.stage2of6;

public class Stage2_IngredientCalculator {

    public void ingredientCalculate(int cup){

        System.out.println("Write how many cups of coffee you will need: " + cup +" cups");
        System.out.println("For "+ cup + " cups of coffee you will need:");
        System.out.println((cup * 200) + " ml of water");
        System.out.println((cup * 50) + " ml of milk");
        System.out.println((cup * 15) + " g of coffee beans");
    }
}
