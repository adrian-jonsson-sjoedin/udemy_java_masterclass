public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    //    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
//        this.brewMaster = brewMaster;
//        this.dishWasher = dishWasher;
//        this.iceBox = iceBox;
//    }
    private void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    private void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    private void loadDishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean addWater, boolean pourMilk, boolean loadDishWasher) {
//        if (addWater) {
//            addWater();
//            brewMaster.brewCoffee();
//        }
//        if (pourMilk) {
//            pourMilk();
//            iceBox.orderFood();
//        }
//        if (loadDishWasher) {
//            loadDishWasher();
//            dishWasher.doDishes();
//        }
        brewMaster.setHasWorkToDo(true);
        iceBox.setHasWorkToDo(true);
        dishWasher.setHasWorkToDo(true);

    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

//    public Refrigerator(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering food now.");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

//    public DishWasher(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Washing the dishes.");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

//    public CoffeeMaker(boolean hasWorkToDo) {
//        this.hasWorkToDo = hasWorkToDo;
//    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing a can of coffee.");
            hasWorkToDo = false;
        }
    }
}