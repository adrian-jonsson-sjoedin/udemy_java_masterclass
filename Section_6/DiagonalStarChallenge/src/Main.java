public class Main {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(8);
    }
//    row == 1: Top row
//    row == number: Bottom row
//    column == 1: Leftmost column
//    column == number: Rightmost column
//    column == row: Diagonal from top-left to bottom-right
//    column == number - row + 1: Diagonal from top-right to bottom-left
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                if (row == 1 || row == number || column == 1 ||
                        column == number || column == row ||
                        column == number - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}