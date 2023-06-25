//함수 오버로딩 = 같은 함수 이름을 쓸수 있다.(파라미터 데이터 타입 또는 개수를 달리해서);
class A{
	public void a() {
		System.out.println("함수 a");
	}
	public void a(int a) {
		System.out.println("함수 a" + a);
	}
	public void a(double a) {
		System.out.println("함수 a double" + a);
	}
	public void a(int a, int b) {
		System.out.println("함수 a" + ( a + b ));
	}
}

class Person{
	private int regiNum;
	private int passNum;
	
	Person(int rnum, int pnum){
		this.regiNum = rnum;
		this.passNum = pnum;
	}
	
	Person(int rnum){
		regiNum = rnum;
		passNum = 0;
		this.showPersonalInfo();
	}
	
	void showPersonalInfo() {
		System.out.println("주민등록 번호 : " + regiNum);
		
		if(passNum != 0)
			System.out.println("여권번호 : " + passNum + '\n');
		else
			System.out.println("여권을 가지고 있지 않습니다. \n");
	}
}


public class Java_03_methodOverloading {

	public static void main(String[] args) {
		A a = new A();
		a.a();
		a.a(7);
		a.a(7.7);
		a.a(10.0);
		
		System.out.println(100); //int
		System.out.println(true); //boolean
		System.out.println(10.0); //double
		
		System.out.println(a); //주소값
		System.out.println("아아아"); //string
		
		Person jung = new Person(335577, 112233);
		Person hong = new Person(775544);
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();

	}

}
