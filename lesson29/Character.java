package lesson29;

public class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Здоровье: " + health);
    }
}
