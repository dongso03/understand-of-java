import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	// 왼쪽 오른쪽 개체를 대소 비교해서
	// 왼쪽이 크면 양수
	// 오른쪽이 크면 음수
	// 대소가 같은경우 0을반환한다
	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getHei() > o2.getHei()) {
			return 1;
		} else if (o1.getHei() < o2.getHei()) {
			return -1;
		}
		return 0;
	}
}
