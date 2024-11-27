package lesson28;

public class My284Project {
    public static void main(String[] args) {
        WebSite site1 = new WebSite("Wikipedia", "https://www.wikipedia.org", 0);
        site1.display();

        WebSite site2 = new WebSite("Stack Overflow", "https://stackoverflow.com",  2008);
        site2.display();
    }
}