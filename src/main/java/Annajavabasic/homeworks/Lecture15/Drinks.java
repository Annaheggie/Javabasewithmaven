package Annajavabasic.homeworks.Lecture15;


public class Drinks {
    public static final double COFFEE_PRICE = 2.50;
    public static final double TEA_PRICE = 1.80;
    public static final double LEMONADE_PRICE = 2.00;
    public static final double MOJITO_PRICE = 3.00;
    public static final double MINERAL_PRICE = 1.50;
    public static final double COCACOLA_PRICE = 2.20;

    public static int totalDrinksProduced = 0;
    public static double totalAmountPaid = 0.0;

    public static void prepareCoffee() {
        // Code to prepare coffee
        totalDrinksProduced++;
        totalAmountPaid += COFFEE_PRICE;
    }

    public static void prepareTea() {
        // Code to prepare tea
        totalDrinksProduced++;
        totalAmountPaid += TEA_PRICE;
    }

    public static void prepareLemonade() {
        // Code to prepare lemonade
        totalDrinksProduced++;
        totalAmountPaid += LEMONADE_PRICE;
    }

    public static void prepareMojito() {
        // Code to prepare mojito
        totalDrinksProduced++;
        totalAmountPaid += MOJITO_PRICE;
    }

    public static void prepareMineral() {
        // Code to prepare mineral water
        totalDrinksProduced++;
        totalAmountPaid += MINERAL_PRICE;
    }

    public static void prepareCocacola() {
        // Code to prepare Coca-Cola
        totalDrinksProduced++;
        totalAmountPaid += COCACOLA_PRICE;
    }

    public static void makeDrink(DrinksMachine choice) {
        switch (choice) {
            case COFFEE:
                prepareCoffee();
                break;
            case TEA:
                prepareTea();
                break;
            case LEMONADE:
                prepareLemonade();
                break;
            case MOJITO:
                prepareMojito();
                break;
            case MINERAL:
                prepareMineral();
                break;
            case COCACOLA:
                prepareCocacola();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid drink.");
        }
    }
    public enum DrinksMachine {
        COFFEE, TEA, LEMONADE, MOJITO, MINERAL, COCACOLA;
    }

    public static void main(String[] args) {
        makeDrink(DrinksMachine.COFFEE);
        makeDrink(DrinksMachine.TEA);
        makeDrink(DrinksMachine.LEMONADE);
        makeDrink(DrinksMachine.MOJITO);
        makeDrink(DrinksMachine.MINERAL);
        makeDrink(DrinksMachine.COCACOLA);

        System.out.println("Total drinks produced: " + totalDrinksProduced);
        System.out.println("Total amount to be paid: $" + totalAmountPaid);
    }

}
