package family_tree.family_tree;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public interface TreeN<T> extends Serializable {
    String getName();
    boolean addChild(T human);
    boolean addParent(T human);
    int getAge();
    LocalDate getDob();
    LocalDate getDad();
    List<T> getChildren();
    List<T> getParents();
}
