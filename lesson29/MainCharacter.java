package lesson29;

public class MainCharacter extends Character {
    private String specialAbility;
    public MainCharacter(String name, int health, String specialAbility) {
        super(name, health);
        this.specialAbility = specialAbility;
    }
        public void displayInfo () {
            super.displayInfo();
            System.out.println("Специальная способность: " + specialAbility);
        }
    }

