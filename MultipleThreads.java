class CreateMultiThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        }
    }
    
    public class MultipleThreads {
        public static void main(String[] args) {
            CreateMultiThread thread1 = new CreateMultiThread();
            CreateMultiThread thread2 = new CreateMultiThread();
    
            thread1.start();
            thread2.start();
        }
    }
