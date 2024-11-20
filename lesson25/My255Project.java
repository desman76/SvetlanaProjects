package lesson25;

public class My255Project {
    public static void main(String[] args) {
        String[][] array = {
                {"A1", "B1", "C1"},
                {"A2", "B2", "C2"},
                {"A3", "B3", "C3"},
                {"A4", "B4", "C4"},
                {"A5", "B5", "C5"}
        };

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0]);
        }
    }
}
