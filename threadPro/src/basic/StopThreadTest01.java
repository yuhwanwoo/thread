package basic;
/*
 * ������ ����
 * 1. ������ ������ �����ؼ� �����ϴ� ���
 * 	  --------
 * 		flag����
 * 		- ������ ����� ���� ���� ó���� �� �ֵ��� ����(���� or ���� - boolean)
 * 		- �������� üũ(�����ɸ��� �۾��� �ִ� ��� �߰��� �� ���� üũ�ؼ� �����带 ������ �� �ִ�.)
 * 
 */

class StopThread01 extends Thread{
	private boolean state=true;
	public void run() {
		while(state) {
			System.out.println("������ ������~~~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("�������:�������.....");
	}
	//�������� ���¸� ������ �� �ִ� ������ ���� �����ϴ� �޼ҵ�
	public void stopThread() {
		state=false;
	}
}

public class StopThreadTest01 {

	public static void main(String[] args) {
		System.out.println("main������ ����");
		StopThread01 t1=new StopThread01();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.stopThread();
		System.out.println("main������ ����");

	}

}
