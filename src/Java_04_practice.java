class TV2{
	String brand;
	int year;
	int inch;
	
	TV2(String brand, int year, int inch){
		this.brand= brand;
		this.year=year;
		this.inch=inch;
		
	}
	void show(){
		System.out.println(brand + " 에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}

class Song2 {
	String title;
	String artist;
	int year;
	String country;
	
	Song2(String title,	String artist, int year, String country){
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show(){
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}
public class Java_04_practice {
	
	public static void main(String[] args) {
		TV2 myTV = new TV2("LG", 2017, 32);
		myTV.show();	
		
		Song2 mySong = new Song2("Dancing Queen", "ABBA", 1978, "스웨덴"); 
		mySong.show();
		
		
	}

}
