import java.util.Comparator;

public class ComparatorByAge implements Comparator<Emploee> {
    public int compare(Emploee emploee1, Emploee emploee2){
        return emploee1.getAge()-emploee2.getAge();
    }
}
