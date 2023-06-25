class AccessWay{
	static int num = 0;
	
	AccessWay(){ incrCnt(); }
	void incrCnt() {
		num++;
	}
}

class Card{
	public static final int WIDTH = 100; //바뀌면 안되서 final붙임.
	public static final int HEIGHT = 100; //위치는 상관없음.
	
	private String kind;
	private int num;
	
}

class NumberPrinter {
	private int myNum = 0; //(myNum = 인스턴스 변수)
	// 인스턴스 라면(변수 또는 함수)가 static 냄비(함수)안에 못들어가는 이유 = 메모리 생성 시간차가 나기때문
	

	static void showInt(int n) {
		//myNum=10;
		//setMyNumber(10);
		System.out.println(n);
	}
	static void showDouble(double n) {
		System.out.println(n);
	}
	
	void setMyNumber(int n) {
		myNum = 10; //객체생성했을때 올라감
		myNum = n;
	}
	void showMyNumber(int n) {
		setMyNumber(10);
	}
	
}

public class Java_02_static2 {

	public static void main(String[] args) {
		int num = 0;
		String str = "AAA";//static을 안붙이는 이유 : 지역변수는 STATIC과 아무론 상관이 없다.
		
		
		
		AccessWay way = new AccessWay();
		way.num++;
		AccessWay.num++;
		System.out.println("num = " + AccessWay.num);

	}
	
}
