package lesson25;

public class My254Project {
    public static void main(String[] args) {
        String[][] array = {
                {"A1", "B1", "C1"},
                {"A2", "B2", "C2"},
                {"A3", "B3", "C3"},
                {"A4", "B4", "C4"},
                {"A5", "B5", "C5"}
        };

        int secondLastRowIndex = array.length - 2;
        if (secondLastRowIndex >= 0) {
            for (String element : array[secondLastRowIndex]) {
                System.out.print(element + " ");
            }
        } else {
            System.out.println();
        }
        }
    }


