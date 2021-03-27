package threadEx;

public class ThreadEx extends Thread {

    public void run() {
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
    	ThreadEx threadEx = new ThreadEx();
    	threadEx.start();
    }

}
