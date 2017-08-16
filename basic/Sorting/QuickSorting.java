import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by masinogns on 2017. 8. 16..
 */
public class QuickSorting {
    private ArrayList arrayList;

    public void setArrayList(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList getArrayList() {
        return arrayList;
    }

    public void sorting(ArrayList S) {
        if (S.size() < 2) return; // Nothing needs to be done if S has zero or one element)

        // Divide: If S has at least two elements, select a specific element x from S, which is called the pivot.
        ArrayList<Integer> L = new ArrayList<Integer>(); // L, storing the elements in S less than pivot
        ArrayList<Integer> E = new ArrayList<Integer>(); // E, storing the elements in S equal to pivot
        ArrayList<Integer> G = new ArrayList<Integer>(); // G, storing the elements in S greater than pivot

        int pivot = (int)S.get(S.size() - 1);
        E.add(pivot);
        S.remove(S.size() - 1);

        while (S.size() > 0) {
            if ((int)S.get(0) < pivot) {
                L.add((int)S.get(0));
            } else if ((int)S.get(0) == pivot) {
                E.add((int)S.get(0));
            } else {
                G.add((int)S.get(0));
            }
            S.remove(0);
        }

        // Conquer: Recursively sort sequences L and G.
        sorting(L);
        sorting(G);

        showArray(L);
        showArray(E);
        showArray(G);

        // Combine: Put back the element into S in order by first inserting the elements of L, then those of E, and finally those of G.
        for (int i = 0; i < L.size(); i++) {
            S.add((int)L.get(i));
        }
        for (int i = 0; i < E.size(); i++) {
            S.add((int)E.get(i));
        }
        for (int i = 0; i < G.size(); i++) {
            S.add((int)G.get(i));
        }

    }

    private void showArray(ArrayList<Integer> arrayList) {
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) System.out.print(iterator.next());
        System.out.println("");
    }


//    출처: http://woongheelee.com/entry/자바로-구현한-퀵-소트quick-sort-자바-소스-코드 [노트정리]

    public ArrayList sortingResult() {
        return arrayList;
    }
}
