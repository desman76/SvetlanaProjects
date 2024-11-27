package lesson29;

public class Friend extends Character {
    private String loyaltyLevel;
    public Friend(String name, int health, String loyaltyLevel) {
        super(name, health);
        this.loyaltyLevel = loyaltyLevel;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Уровень лояльности: " + loyaltyLevel);
    }
}



