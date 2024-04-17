package family_tree.family_tree;

import family_tree.human.Human;
import family_tree.human.HumanCompBD;
import family_tree.human.HumanCompName;
import family_tree.family_tree.TreeN;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends TreeN<E>> implements Serializable, Iterable<E> {
    private List<E> humanList;

    public FamilyTree(List<E> humanList) {
        this.humanList = humanList;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public boolean add(E human) {
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)) {
            humanList.add(human);

            return true;
        }
        return false;
    }

    public List<E> getByName(String name) {
        List<E> res = new ArrayList<>();
        for (E human : humanList) {
            if (human.getName().equals(name)) {
                res.add(human);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("Сейчас в древе ");
        sbuilder.append(humanList.size());
        sbuilder.append(" объектов: \n");
        for (E human : humanList) {
            sbuilder.append(human);
            sbuilder.append("\n");
        }
        return sbuilder.toString();
    }

    public void sortName() {
        humanList.sort((Comparator<? super E>) new HumanCompName());
    }

    public void sortAge() {
        humanList.sort((Comparator<? super E>) new HumanCompBD());
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new FamilyTreeIter(humanList);
    }
}