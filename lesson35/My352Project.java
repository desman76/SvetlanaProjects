package lesson35;

public class My352Project extends Exception{
    public My352Project(String message) {
        super(message);
    }
}
class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
class ExceptionExample {
    public static void main(String[] args) {
        try {
           throwCheckedException();
        } catch (My352Project e) {
            System.out.println("Проверяемое исключение: " + e.getMessage());
        }
        try {
            throwUncheckedException();
        } catch (MyUncheckedException e) {
            System.out.println("Непроверяемое исключение: " + e.getMessage());
        }
    }
    static void throwCheckedException() throws My352Project {
        throw new My352Project("Это проверяемое исключение.");
    }
    static void throwUncheckedException() {
        throw new MyUncheckedException("Это непроверяемое исключение.");
    }
}
