public class Hello {
    public static void main(String[] arg) {
        System.out.println("Hello World");

        int myFirstNumber = (10 + 5) + (2 * 10); //it is possible to use operators when initializing variables
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;

        System.out.println("My total: " + myTotal); //Type sout for intelij to write out System.out.println() for you
        System.out.println("My last one: "+ myLastOne);
        System.out.print("" + myFirstNumber + " " + mySecondNumber);

    }
}

