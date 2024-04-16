package family_tree.family_tree;

import family_tree.human.Human;
import family_tree.human.HumanCompBD;
import family_tree.human.HumanCompName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class FamilyTree implements Serializable, Iterable<Human> {
    private List<Human> humanList;

    public FamilyTree(List<Human> humanList) {
        this.humanList = humanList;
    }

    public FamilyTree() {
        this(new ArrayList<>());
    }

    public boolean add(Human human) {
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)) {
            humanList.add(human);

            return true;
        }
        return false;
    }

    public List<Human> getByName(String name) {
        List<Human> res = new ArrayList<>();
        for (Human human : humanList) {
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
        for (Human human : humanList) {
            sbuilder.append(human);
            sbuilder.append("\n");
        }
        return sbuilder.toString();
    }

    public void sortName() {
        humanList.sort(new HumanCompName());
    }

    public void sortAge() {
        humanList.sort(new HumanCompBD());
    }

    @Override
    public Iterator<Human> iterator() {
        return new FamilyTreeIter(humanList);
    }
}