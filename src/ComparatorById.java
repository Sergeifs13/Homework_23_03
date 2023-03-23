import java.util.Comparator;

public class ComparatorById implements Comparator<Emploee> {
    public int compare(Emploee emploee1, Emploee emploee2){
        return emploee1.getId()-emploee2.getId();
    }
    
}
