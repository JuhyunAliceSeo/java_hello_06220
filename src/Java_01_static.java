// 먼저(new 객체생성보다 먼저) 한번 올려 공유(어디에나 method area에다)
// static 변수 = 공유 변수 = class변수 = 정적변수

class InstCnt{
	static int instNum=0; // 클래스 변수(static 변수)	
	
	public InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}

public class Java_01_static{
	public static void main(String[] args) {
		
		System.out.println(InstCnt.instNum++); //0이나옴. //InstCnt의 클래스를 스캔함(static)
		System.out.println(InstCnt.instNum++);
//		InstCnt cnt1 = new InstCnt(); //class InstCnt를 한번 스캔한다.new InstCnt() 생성전에  스캔하면서 static이 있는지 check한다.
//		InstCnt cnt2 = new InstCnt();
//		InstCnt cnt3 = new InstCnt();
		
		
	}
}


