import java.util.Comparator;

public class ComparatorBySalary implements Comparator<Emploee> {
    public int compare(Emploee emploee1, Emploee emploee2){
        return emploee1.getSalary()-emploee2.getSalary();
    }
}
