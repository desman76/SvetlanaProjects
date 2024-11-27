package lesson28;

public class TextChecker {
    private String text;
    public TextChecker(String text) throws IllegalArgumentException {
        this.text = text;
        checkText();
    }
    private void checkText() {
        for (char ch : text.toCharArray()) {
            if (!isCyrillic(ch)) {
                throw new IllegalArgumentException("Обнаружена иностранная буква: " + ch);
            }
        }
    }
    private boolean isCyrillic(char ch) {
        return (ch >= 'а' && ch <= 'я') || (ch >= 'А' && ch <= 'Я') ||
                (ch >= 'ё' && ch <= 'ё') || (ch >= 'Ё' && ch <= 'Ё');
    }
    public String getText() {
        return text;
    }

    public static void main(String[] args) {
        try {
            TextChecker checker1 = new TextChecker("Привет мир");
            System.out.println("Текст проверен: " + checker1.getText());

            TextChecker checker2 = new TextChecker("Привет мир! Hello");
            System.out.println("Текст проверен: " + checker2.getText());
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

