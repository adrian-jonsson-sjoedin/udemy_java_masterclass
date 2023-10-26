public class Main {
    public static void main(String[] args) {
        SmartKitchen smartKitchen = new SmartKitchen();

        //Not a good way of doing it
        smartKitchen.getDishWasher().setHasWorkToDo(true);
        smartKitchen.getDishWasher().doDishes();

        //Better way
        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();
    }

}

