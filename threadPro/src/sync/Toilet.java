package sync;
//������ü - ��� �����尡 �����ؼ� ����ϴ� ��ü
public class Toilet {
	/*
	synchronized {
		
	}�� �̿��ؼ� �κ� �ڵ带 lock����
	*/
	public synchronized void open(String user_name) {
		System.out.println(user_name+"�� ���� ���� ����");
		for (int i = 0; i < 100000000; i++) {
			if(i==10000) {
				System.out.println("��~~~~~~~~~~��~~~~~~~~");
			}
			
		}
		System.out.println(user_name+"�� ���� �Ŀ� ����");
	}
	
}
