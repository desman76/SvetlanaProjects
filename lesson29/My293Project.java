package lesson29;

public class My293Project {
    public static void main(String[] args) {
        MainCharacter hero = new MainCharacter("Алекс", 100, "Суперсила");
        Villain villain = new Villain("Злодей", 80, "Захват мира");
        Friend friend = new Friend("Друг", 90, "Высокий");

        hero.displayInfo();
        villain.displayInfo();
        friend.displayInfo();
    }
}
