package thread.generate;

import java.util.Iterator;

public class ThreadTest1 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i<100; i++){
			System.out.println("thread 실행"+(i+1));
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1();
		t1.start();
	}

}
