package lesson58;

    class NewThread2 extends Thread {
        private char symbol;
        public NewThread2(char symbol) {
            this.symbol = symbol;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    public class My582Project {
        public static void main(String[] args) {
            NewThread2 thread = new NewThread2('*');
            thread.start();
        }
    }

