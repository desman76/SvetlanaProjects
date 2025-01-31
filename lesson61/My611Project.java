package lesson61;

import java.util.concurrent.Semaphore;

public class My611Project {
    public static void main(String[] args) {
        final int n = 4;
        final Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < n; i++) {
            new Train (semaphore, i).start();
        }
    }
}

class Train extends Thread {
    final Semaphore semaphore;
    final int id;

    int count = 0;

    Train(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }
    @Override
    public void run() {
    try {
        while (count < 2) {
            semaphore.acquire();
            System.out.println("Поезд " + id + "заехал в депо");
            sleep(500);
            System.out.println("Поезд " + id + "выехал из депо");
            semaphore.release();
            sleep(500);
            count++;
        }
    } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}