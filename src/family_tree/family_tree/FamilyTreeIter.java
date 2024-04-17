package family_tree.family_tree;

import family_tree.human.Human;
import java.util.Iterator;
import java.util.List;

public class FamilyTreeIter implements Iterator<Human> {
    private List<Human> list;
    private int index;


    public <E extends TreeN<E>> FamilyTreeIter(List<E> humanList) {
    }

    @Override
    public boolean hasNext() {return  index < list.size(); }

    @Override
    public Human next() { return  list.get(index++); }

}
