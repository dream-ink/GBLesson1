package family_tree.presenter;

import family_tree.model.family_tree.FamilyTree;
import family_tree.view.View;

public class Presenter {
    private View view;
    private FamilyTree familyTree;

    public Presenter(View view) {
        this.view = view;
        familyTree = new FamilyTree();
    }

}