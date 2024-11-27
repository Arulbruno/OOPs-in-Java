  class Create_Thread extends Thread {
        public void run() {
            System.out.println("Thread is running!");
        }
    }
    
    public class ThreadExample {
        public static void main(String[] args) {
            Create_Thread t1 = new Create_Thread();
            t1.start(); // Start the thread
        }
    }
