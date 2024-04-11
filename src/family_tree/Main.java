package family_tree;

import family_tree.family_tree.FamilyTree;
import family_tree.human.Gender;
import family_tree.human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        FamilyTree tree = new FamilyTree();

        Human singal = new Human("Синельникова Галина", LocalDate.of(1963, 11, 3),
                LocalDate.of(1999, 4, 2), Gender.Female, 36, null, null);
        Human sinvas = new Human("Синельников Василий", LocalDate.of(1954, 12, 5),
                LocalDate.of(1999, 4, 2), Gender.Male, 47, null, null);
        tree.add(singal);
        tree.add(sinvas);
        Human sinlid = new Human("Синельникова Галина", LocalDate.of(1980, 11, 5), null, Gender.Female, 44, singal, sinvas);
        tree.add(sinlid);
        System.out.println(tree.getInfo());
    }
}