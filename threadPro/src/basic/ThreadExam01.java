package basic;


class DigitThread extends Thread{
	public DigitThread(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.print(i+"("+getName()+")");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class AlphaThread extends Thread{
	public AlphaThread(String name) {
		super(name);
	}
	public void run() {
		for(char c='A'; c<='Z';c++) {
			System.out.print(c);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadExam01 {

	public static void main(String[] args) {
		System.out.println("main시작");
		DigitThread th1=new DigitThread("digit");
		AlphaThread th2=new AlphaThread("alpha");
		th1.start();
		th2.start();
		System.out.println("main종료");
		
	}

}
