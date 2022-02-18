package Homework2;

public class Main {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"3", "8", "3", "1"},
                {"1", "4", "0", "6"},
                {"0", "9", "7", "2"},
                {"1", "2", "3", "8"}
        };
        String[][] wrongSizeMatrix = {
                {"1", "2", "9", "3"},
                {"0", "4", "2", "1"},
                {"5", "8", "3", "2"},
                {"0"}
        };
        String[][] wrongCharMatrix = {
                {"A", "5", "8", "I"},
                {"6", "1", "5", "7"},
                {"2", "Z", "4", "6"},
                {"1", "B", "4", "7"}
        };

        try {
            System.out.println("Вариант 1:");
            System.out.println("Сумма всех элементов массива равна " + Convert.strConverter(correctMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println (e.getMessage());
        }

        try {
            System.out.println("Вариант 2:");
            System.out.println("Сумма всех элементов массива равна " + Convert.strConverter(wrongSizeMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Вариант 3:");
            System.out.println("Сумма всех элементов массива равна " + Convert.strConverter(wrongCharMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
