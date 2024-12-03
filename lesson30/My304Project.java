package lesson30;

public class My304Project {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = getParent(child);

        System.out.println(parent.getName());
    }
    public static Parent getParent(Parent obj) {
        return new Parent();
    }
}


