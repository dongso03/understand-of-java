import java.util.Comparator;

public class PersonWeiComparator  implements Comparator<Person>  {

	public int compare(Person o1, Person o2) {
		return o1.getWei() - o2.getWei();
	}

}
