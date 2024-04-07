package family_tree;

import family_tree.family_tree.FamilyTree;
import family_tree.human.Gender;
import family_tree.human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        FamilyTree tree = new FamilyTree();

        tree.add(new Human("Синельникова Галина", LocalDate.of(1963, 11, 3),
                LocalDate.of(1999, 4, 2), Gender.Female, 36,
                "Синельникова Светлана", "Синельников Геннадий"));

        System.out.println(tree.getInfo());
    }
}