package sync;

public class ThreadSyncTest01 {

	public static void main(String[] args) {
		//��� �����尡 �����ؼ� ����� ��ü
		Toilet toilet =new Toilet();
		
		//������ü�� ����ϴ� ������ ��ü�� ����
		User user1=new User("�嵿��", toilet);
		User user2=new User("����", toilet);
		User user3=new User("������", toilet);
		User user4=new User("����", toilet);
		User user5=new User("���ؿ�", toilet);
		User user6=new User("����ȯ", toilet);
		User user7=new User("�̵���", toilet);
		
		//���������
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();
		user6.start();
		user7.start();

	}

}
