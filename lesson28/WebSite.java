package lesson28;

public class WebSite {
    private String name;
    private String url;
    private int age;
    public WebSite(String name, String url, int age) {
        this.name = name;
        this.url = url;
        this.age = age;
            }
            public void display() {
        System.out.println("Название сайта: " + name);
        System.out.println("Адрес: " + url);
        System.out.println("Год создания: " + age);
            }

}
