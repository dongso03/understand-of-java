// 영화 클래스를 작성해보기
// 제목, 평점,감독이름,발표된년도
// 모든필드를 초기화 생성자.
public class Movie {

	String titleName;
	double score;
	String directorName;
	String year;
	
	public String getTitle() {
		return titleName;
	}
	public void setTitle(String titleName) {
		this.titleName = titleName;
	}
	
	public Movie(String titleName,	double score,String directorName,String year) {
		this.titleName = titleName;
		this.score= score;
		this.directorName= directorName;
		this.year = year;
	}

	public void printAll() {
		System.out.println(titleName);
		System.out.println(score);
		System.out.println(directorName);
		System.out.println(year);
	}
	public static void main(String[] args) {
		Movie m = new Movie("재숙이의 습격", 9.5, "강서율","2023년");
				m.printAll();
	}
}
