package family_tree.human;

import family_tree.family_tree.TreeN;

import java.util.Comparator;

public class HumanCompBD< T extends TreeN> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {return o1.getDob().compareTo(o2.getDob()); }
}
