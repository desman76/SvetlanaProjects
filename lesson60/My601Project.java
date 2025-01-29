package lesson60;





public class My601Project {
    public static void main(String[] args) {
        Store store = new Store();
        new Producer(store).start();
        new Consumer(store).start();
            }
}
class Store {
    private int maxProductCount = 3;
    private int product = 0;
    public synchronized void get() {
        while (product < 1) {
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
        }
        product--;
        System.out.println("Покупатель купил 1 продукт");
        System.out.println("Осталось на складе: " + product);
        notify();
    }
    public synchronized void put() {
        while (product >= maxProductCount) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("Завод поставил 1 продукт");
        System.out.println("Осталось на складе: " + product);
        notify();
    }
}
class Producer extends Thread {
    final Store store;
    Producer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 6; i++) {
            store.put();
        }
    }
}
class Consumer extends Thread {
    final Store store;
    Consumer(Store store) {
        this.store = store;
            }
            @Override
    public void run() {
        super.run();
        for (int i = 0; i < 6; i++) {
            store.get();
        }
            }
}