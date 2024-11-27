package lesson29;

public class Villain extends Character {
    private String evilPlan;
    public Villain(String name, int health, String evilPlan) {
        super(name, health);
        this.evilPlan = evilPlan;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Злой план: " + evilPlan);
    }
}



