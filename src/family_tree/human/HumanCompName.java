package family_tree.human;

import family_tree.family_tree.TreeN;

import java.util.Comparator;

public class HumanCompName< T extends TreeN <T>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) { return  o1.getName().compareTo(o2.getName()); }

}
