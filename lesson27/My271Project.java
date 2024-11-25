package lesson27;

public class My271Project {
    public static void main(String[] args) {
       MainCharacter main = new MainCharacter("Cara Conner","Terminator", "Linda Hemilton", "Female");
       main.display();

        Villain villain = new Villain("Terminator","Terminator", "Arnold Schwarzenegger", "Male" );
        villain.display();

        Friend friend = new Friend("Kail Rise","Terminator", "Makl Bin", "Male"  );
        friend.display();
    }

}
