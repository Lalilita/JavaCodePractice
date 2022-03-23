package Project.CoffeeMachine.stage4of6;

public class Stage4_BuyFillTake {

    int water = 400, milk = 540, coffeeBeans = 120, disposableCup = 9;
    String action;
    int select1Espresso2Latte3Cappuccino;
    double cost = 550;


    public void displayStart() {
        System.out.println("The coffee machine has:\n" +
                this.water + " ml of water\n" +
                this.milk + " ml of milk\n" +
                this.coffeeBeans + " g of coffee beans\n" +
                this.disposableCup + " disposable cups\n$" +
                this.cost + " of money");
    }

    public void buyFillTake(int water, int milk, int coffeeBeans, int disposableCup, double cost, String action,
                            int buy1Espresso2Latte3Cappuccino) {

    }

    //Function: buy
    public void buyCoffee(int select1Espresso2Latte3Cappuccino) {
        //ingredients for Espresso
        int waterEs = 250, milkEs = 0, coffeeBeansEs = 16, disposableCupEs = 1;
        double costES = 4;
        //ingredients for Latte
        int waterLa = 350, milkLa = 75, coffeeBeansLa = 20, disposableCupLa = 1;
        double costLa = 7;
        //ingredients for Cappuccino
        int waterCap = 200, milkCap = 100, coffeeBeansCap = 12, disposableCupCap = 1;
        double costCap = 6;
        //display the remained ingredients
        displayStart();

        if (select1Espresso2Latte3Cappuccino == 1) {
            System.out.println("\n**** You want to \"buy\" a cup of Espresso *****\n");
            System.out.println("The coffee machine has:\n" +
                    (this.water - waterEs) + " ml of water\n" +
                    (this.milk - milkEs) + " ml of milk\n" +
                    (this.coffeeBeans - coffeeBeansEs) + " g of coffee beans\n" +
                    (this.disposableCup - disposableCupEs) + " disposable cups\n$" +
                    (this.cost + costES) + " of money");
        }

        if (select1Espresso2Latte3Cappuccino == 2) {
            System.out.println("\n**** You want to \"buy\" a cup of Latte *****\n");
            System.out.println("The coffee machine has:\n" +
                    (this.water - waterLa) + " ml of water\n" +
                    (this.milk - milkLa) + " ml of milk\n" +
                    (this.coffeeBeans - coffeeBeansLa) + " g of coffee beans\n" +
                    (this.disposableCup - disposableCupLa) + " disposable cups\n$" +
                    (this.cost + costLa) + " of money");
        }

        if (select1Espresso2Latte3Cappuccino == 3) {
            System.out.println("\n****** You want to \"buy\" a cup of Cappuccino *******\n");
            System.out.println("The coffee machine has:\n" +
                    (this.water - waterCap) + " ml of water\n" +
                    (this.milk - milkCap) + " ml of milk\n" +
                    (this.coffeeBeans - coffeeBeansCap) + " g of coffee beans\n" +
                    (this.disposableCup - disposableCupCap) + " disposable cups\n$" +
                    (this.cost + costCap) + " of money");
        }
    }

    //Function: fill
    public void fillCoffee(int waterAdd, int milkAdd, int coffeeBeansAdd, int disposableCupAdd) {
        //display the remained ingredients
        displayStart();
        System.out.println("\n****** You want to \"fill\" the ingredients *******\n");

        //addition detail
        System.out.println("Write how many ml of water you want to add:\n" +
                "> " + waterAdd +
                "\nWrite how many ml of milk you want to add:\n" +
                "> " + milkAdd +
                "\nWrite how many grams of coffee beans you want to add:\n" +
                "> " + coffeeBeansAdd +
                "\nWrite how many disposable cups of coffee you want to add:\n" +
                "> " + disposableCupAdd);
        //summation detail
        System.out.println("Updating ingredients .... .... .... .... .... ....");
        System.out.println("The coffee machine has:\n" +
                (this.water + waterAdd) + " ml of water\n" +
                (this.milk + milkAdd) + " ml of milk\n" +
                (this.coffeeBeans + coffeeBeansAdd) + " g of coffee beans\n" +
                (this.disposableCup + disposableCupAdd) + " disposable cups\n$" +
                this.cost + " of money");
    }
}
