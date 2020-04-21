package sync;
/*
 	1. 두 계좌의 잔액을 더하는 쓰레드
 		-SharedObj객체의 계좌 잔액을 더해서 sysout으로 출력하는 쓰레드
 		-5번 출력할 수 있도록
 	2. acc1계좌에서 acc2계좌에 100만원씩 이체하는 작업을 수행하는 쓰레드
 		- 20번 이체할 수 있도록
 		   => Account클래스 활용
 		   	  sysout으로 정보출력
 		- SharedObj객체를 이용해서 작업
 		
 	3. 동기화 하지 않고 테스트
 	4. 동기화 하고 테스트
 */
public class ThreadSyncTest02 {

	public static void main(String[] args) {
		//1.공유객체 만들기
		SharedObj obj=new SharedObj();
		obj.acc1=new Account("111-222-3333",5000,"현빈");
		obj.acc2=new Account("333-555-7777",1000,"김서연");
		//2. 쓰레드 생성
		SumPrintThread t1=new SumPrintThread(obj);
		Thread t2=new Thread(new TransferThread(obj));
		
		//3. 생성한 쓰레드 start시키기
		t1.start();
		t2.start();
	}

}
