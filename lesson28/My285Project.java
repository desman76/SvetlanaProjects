package lesson28;

public class My285Project {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 (пустой): " + sb1);

        StringBuilder sb2 = new StringBuilder(50);
        System.out.println("sb2 (емкость 50): " + sb2);

        StringBuilder sb3 = new StringBuilder("Привет, мир!");
        System.out.println("sb3 (содержит текст): " + sb3);

        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println("sb4 (копия sb3): " + sb4);

        sb1.append("Это первый экземпляр.");
        sb2.append("Это второй экземпляр.");
        sb3.append(" Как дела?");
        sb4.append(" Копия изменена.");

        System.out.println("Измененный sb1: " + sb1);
        System.out.println("Измененный sb2: " + sb2);
        System.out.println("Измененный sb3: " + sb3);
        System.out.println("Измененный sb4: " + sb4);
    }
}
