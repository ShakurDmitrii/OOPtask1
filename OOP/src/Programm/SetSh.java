package Programm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetSh {
    private int size;
    private int x, y;
    private List<Integer> arraylist;

    public SetSh(int x, int y) {
        this.x = x;
        this.y = y;
        this.size = y - x + 1;
        arraylist = new ArrayList<>(y);
        for (int i = x; i <= y; i++) {
            arraylist.add(i);
        }
    }

    public List<Integer> getArray() {
        return arraylist;
    }

    public boolean check(int z) {
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) == z) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> remove(int d) {
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) == d) {
                arraylist.remove(arraylist.get(i));
            }
        }
        return arraylist;
    }

    public List<Integer> add(int x) {
        arraylist.add(x);
        Collections.sort(arraylist);
        return arraylist;
    }

    public int min() {
        return arraylist.get(0);
    }

    public int max() {
        return arraylist.get(arraylist.size() - 1);
    }

    public List<Integer> sum(SetSh arraylist2) {
        List<Integer> element = arraylist2.getArray();
        arraylist.addAll(element);
        return arraylist;
    }

    public List<Integer> subtract(SetSh arraylist2) {
        List<Integer> element = arraylist2.getArray();
        arraylist.removeAll(element);
        return arraylist;
    }

    public List<Integer> getSet(int x, int y) {
        List<Integer> element = new ArrayList<>();
        int index1 = arraylist.indexOf(x);
        int index2 = arraylist.indexOf(y);
        element.addAll(arraylist.subList(index1, index2));
        return element;
    }
}