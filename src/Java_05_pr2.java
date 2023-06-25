class Accumulator {
	
	private static int sum = 0;
	public static void add(int i) {
        sum += i;
    }
	public static void showResult() {
        System.out.println("sum : " + sum);
    }
}
public class Java_05_pr2 {
	public static void main(String[] args) {
		Accumulator acc = new Accumulator();
		
		 for (int i = 0; i <= 10; i++) {
	            acc.add(i);
	        }
	        acc.showResult();
	}

}
