import java.util.Comparator;

public class ComparatorByName implements Comparator<Emploee> {
    public int compare(Emploee emploee1, Emploee emploee2){
        return emploee1.getName().compareTo(emploee2.getName());
}}
