package lesson35;

public class ExceptionArrayExample {
    public static void main(String[] args) {
        My353Project[] checkedExceptions = new My353Project[10];
        MyUncheckedException2[] uncheckedExceptions = new MyUncheckedException2[10];

        for (int i = 0; i < checkedExceptions.length; i++) {
            checkedExceptions[i] = new My353Project("Проверяемое исключение #" + (i + 1));
        }

        for (int i = 0; i < uncheckedExceptions.length; i++) {
            uncheckedExceptions[i] = new MyUncheckedException2("Непроверяемое исключение #" + (i + 1));
        }

        System.out.println("Проверяемые исключения:");
        for (My353Project e : checkedExceptions) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nНепроверяемые исключения:");
        for (MyUncheckedException2 e : uncheckedExceptions) {
            System.out.println(e.getMessage());
        }
    }
}
