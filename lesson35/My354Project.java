package lesson35;


import java.util.Random;

public class My354Project {
    private static final Random random = new Random();

    public static void main(String[] args) {
        My353Project[] checkedExceptions = new My353Project[10];
        MyUncheckedException[] uncheckedExceptions = new MyUncheckedException[10];

        for (int i = 0; i < checkedExceptions.length; i++) {
            checkedExceptions[i] = new My353Project("Проверяемое исключение #" + (i + 1));
        }

        for (int i = 0; i < uncheckedExceptions.length; i++) {
            uncheckedExceptions[i] = new MyUncheckedException("Непроверяемое исключение #" + (i + 1));
        }
        Exception randomException = getRandomException(checkedExceptions, uncheckedExceptions);
        System.out.println("Случайное исключение: " + randomException.getMessage());
    }

    public static Exception getRandomException(My353Project[] checked, MyUncheckedException[] unchecked) {
         if (random.nextBoolean()) {
             return checked[random.nextInt(checked.length)];
        } else {
             return unchecked[random.nextInt(unchecked.length)];
        }
    }
}