import java.util.Comparator;

public class EMailComparator implements Comparator<onePerson>{
	
	public int compare(onePerson p1, onePerson p2) {
		if (p1.getEmail() == null && p2.getEmail() == null) {
            return 0;
        } else if (p1.getEmail() == null) {
            return -1;
        } else if (p2.getEmail() == null) {
            return 1;
        }
        return p1.getEmail().compareTo(p2.getEmail());
    }
	
}



