package lesson20;

public class My202Project {
    String str1;
    String str2;
    String str3;

    public My202Project(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    public String joinStrings() {
        return this.str1 + " " + this.str2 + " " + this.str3;
    }

    public static void main(String[] args) {
        My202Project longStr = new My202Project("в лесу", "родилась", "елочка");
        System.out.print(longStr.joinStrings());
    }
}