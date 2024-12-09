package lesson37;

public class My372Project {
    public static void main(String[] args) {
        try {
          causeException();
        } catch (Exception e) {
             e.printStackTrace();
        }
    }
    public static void causeException() {
      throw new NullPointerException("Это пример исключения");
    }
}
