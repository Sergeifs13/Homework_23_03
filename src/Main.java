import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Emploee emploee1 = new Emploee(130, "Alexa", 20, 1500);
        Emploee emploee2 = new Emploee(126, "Michaela", 20, 1800);
        Emploee emploee3 = new Emploee(128, "Andreas", 20, 2020);
        Emploee emploee4 = new Emploee(131,"Niko",19,1700);
        Emploee emploee5 = new Emploee(133,"Aahor",20,1900);
        System.out.println("------------before Sort------------ ");
        Emploee[] emploees = {emploee1, emploee2, emploee3,emploee4,emploee5};

        for (Emploee a : emploees) {
            System.out.println(a);
        }
        System.out.println("-------------sort by ID----------------");
        Arrays.sort(emploees, new ComparatorById());
        for (Emploee e : emploees) {
            System.out.println(e);
        }
        System.out.println("-------------sort by Salary----------------");
        Arrays.sort(emploees, new ComparatorBySalary());
        for (Emploee e : emploees) {
            System.out.println(e);
        }
        System.out.println("-------------sort by Name----------------");
        Arrays.sort(emploees, new ComparatorByName());
        for (Emploee e : emploees) {
            System.out.println(e);
        }
        System.out.println("-------------sort by Age----------------");
        Arrays.sort(emploees, new ComparatorByAge());
        for (Emploee e : emploees) {
            System.out.println(e);
        }
        System.out.println("-------------sort by AgeAndThenName----------------");
        Arrays.sort(emploees, new ComparatorByAgeAndThenName());
        for (Emploee e : emploees) {
            System.out.println(e);
        }

    }
    /*
    ------------before Sort------------
Emploee{id=130, name='Alexa', age=20, salary=1500}
Emploee{id=126, name='Michaela', age=20, salary=1800}
Emploee{id=128, name='Andreas', age=20, salary=2020}
Emploee{id=131, name='Niko', age=19, salary=1700}
Emploee{id=133, name='Aahor', age=20, salary=1900}
-------------sort by ID----------------
Emploee{id=126, name='Michaela', age=20, salary=1800}
Emploee{id=128, name='Andreas', age=20, salary=2020}
Emploee{id=130, name='Alexa', age=20, salary=1500}
Emploee{id=131, name='Niko', age=19, salary=1700}
Emploee{id=133, name='Aahor', age=20, salary=1900}
-------------sort by Salary----------------
Emploee{id=130, name='Alexa', age=20, salary=1500}
Emploee{id=131, name='Niko', age=19, salary=1700}
Emploee{id=126, name='Michaela', age=20, salary=1800}
Emploee{id=133, name='Aahor', age=20, salary=1900}
Emploee{id=128, name='Andreas', age=20, salary=2020}
-------------sort by Name----------------
Emploee{id=133, name='Aahor', age=20, salary=1900}
Emploee{id=130, name='Alexa', age=20, salary=1500}
Emploee{id=128, name='Andreas', age=20, salary=2020}
Emploee{id=126, name='Michaela', age=20, salary=1800}
Emploee{id=131, name='Niko', age=19, salary=1700}
-------------sort by Age----------------
Emploee{id=131, name='Niko', age=19, salary=1700}
Emploee{id=133, name='Aahor', age=20, salary=1900}
Emploee{id=130, name='Alexa', age=20, salary=1500}
Emploee{id=128, name='Andreas', age=20, salary=2020}
Emploee{id=126, name='Michaela', age=20, salary=1800}
-------------sort by AgeAndThenName----------------
Emploee{id=131, name='Niko', age=19, salary=1700}
Emploee{id=133, name='Aahor', age=20, salary=1900}
Emploee{id=130, name='Alexa', age=20, salary=1500}
Emploee{id=128, name='Andreas', age=20, salary=2020}
Emploee{id=126, name='Michaela', age=20, salary=1800}
     */
}
