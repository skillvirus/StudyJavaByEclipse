package threadEx;

public class ThreadEx2 implements Runnable {
	
    int seq;
    
    public ThreadEx2(int seq) {
        this.seq = seq;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(1);
        }catch(Exception e) {
        }
        System.out.println(this.seq + " 쓰레드 실행");
    }

    public static void main(String[] args) {
    	
        for(int i = 0; i < 10; i++) {
            Thread thread = new Thread(new ThreadEx2(i));
            thread.start();
        }
    }
}
