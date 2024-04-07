package family_tree.family_tree;

import family_tree.human.Human;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
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
    public String toString() { return getInfo(); }

    public String getInfo(){
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("Сейчас в древе ");
        sbuilder.append(humanList.size());
        sbuilder.append(" объектов: \n");
        for (Human human: humanList) {
            sbuilder.append(human);
            sbuilder.append("\n");
        }
        return sbuilder.toString();
    }
}