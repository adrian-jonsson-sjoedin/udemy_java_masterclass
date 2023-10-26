import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        // The text inside """ """ will be printed exactly as it is written.
        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 Sub Point""";
        System.out.println(textBlock);
//        Print a Bulleted List:
//            • First Point
//                • Sub Point

        int age = 35;
        System.out.printf("Your age is %d\n", age);

        int dob = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d\n", age, dob);
//        Age = 35, Birth year = 1988

        System.out.printf("Your age is %.2f\n", (float) age); //make it a float and 2 decimal precision
//        Your age is 35.00

        for (int i = 1; i <= 10000; i *= 10) {
            System.out.printf("Printing %6d %n", i);//we set the width of the number to be 6, same as our largest number
            // so that the numbers become right align
//            Printing      1
//            Printing     10
//            Printing    100
//            Printing   1000
//            Printing  10000
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);//This method is equivalent to String.format(this, args)
        System.out.println(formattedString);
    }
}