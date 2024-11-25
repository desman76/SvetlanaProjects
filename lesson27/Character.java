package lesson27;

public class Character {
    String name;
    String film;
    String actor;
    String gender;
    public Character (String name, String film, String actor, String gender) {
        this.name = name;
        this.film = film;
        this.actor = actor;
        this.gender = gender;
    }
    public void display() {
        System.out.println("Имя персонажа " + name);
        System.out.println("Название фильма " + film);
        System.out.println("Актер " + actor);
        System.out.println("Пол " + gender);
                   }
}
