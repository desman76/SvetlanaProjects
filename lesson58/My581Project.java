package lesson58;

    class NewThread extends Thread {
            public NewThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + " - " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(getName() + " прерван.");
                }
            }
            System.out.println(getName() + " завершен.");
        }
    }

    public class My581Project {
        public static void main(String[] args) {
            NewThread thread1 = new NewThread("Поток 1");
            NewThread thread2 = new NewThread("Поток 2");

            thread1.start();
            thread2.start();
        }
    }

