import java.util.Comparator;

public class ComparatorByAgeAndThenName implements Comparator<Emploee> {
    public int compare(Emploee emploee1, Emploee emploee2){

        if(emploee1.getAge()==emploee2.getAge())
            return emploee1.getName().compareTo(emploee2.getName());
        return emploee1.getAge()-emploee2.getAge();

    }
}
