package family_tree.human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    public String name;
    public LocalDate dob, dad;
    public Gender gender;
    public List<Human>children;
    public int age;
    public String mother;
    public String father;

    public Human(String name, LocalDate dob, LocalDate dad, Gender gender, int age, String mother, String father) {
        this.name = name;
        this.dob = dob;
        this.dad = dad;
        this.gender = gender;
        this.age = age;
        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
    }
    public boolean addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
            return true;
        }
        return false;
    }

    public boolean addParent(Human parent) {
        if (parent.getGender().equals(Gender.Male)) {
            setFather(parent);
        } else if (parent.getGender().equals(Gender.Female)){
            setMother(parent);
        }
        return true;
    }

    private void setMother(Human parent) {
    }

    private void setFather(Human parent) {
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDad() {
        return dad;
    }

    public void setDad(LocalDate dad) {
        this.dad = dad;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getParents() {
        List<String> list = new ArrayList<>(2);
        if (father != null) {
            list.add(father);
        }
        if (mother != null) {
            list.add(mother);
        }
        return list;
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        StringBuilder sbuild = new StringBuilder();
        sbuild.append("Имя: ");
        sbuild.append(name);
        sbuild.append(", дата рождения: ");
        sbuild.append(dob);
        sbuild.append(", дата смерти: ");
        sbuild.append(dad);
        sbuild.append(", пол: ");
        sbuild.append(getGender());
        sbuild.append(", возраст: ");
        sbuild.append(age);
        sbuild.append(", имя матери: ");
        sbuild.append(mother);
        sbuild.append(", имя отца: ");
        sbuild.append(father);
        return sbuild.toString();
    }

}