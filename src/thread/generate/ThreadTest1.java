package thread.generate;

import java.util.Iterator;

public class ThreadTest1 extends Thread {
	
	public ThreadTest1(String name) {
		super(name);//thread 이름 설정
	}
	
	@Override
	public void run() {
		for(int i = 0; i<100; i++){
			System.out.println(getName()+"thread 실행"+(i+1));
			try {
				sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1("첫번째 ");
		t1.start();
		
		ThreadTest1 t2 = new ThreadTest1("두번째 ");
		t2.start();
	}

}
