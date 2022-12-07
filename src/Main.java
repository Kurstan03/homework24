import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        System.out.println(symmetricDifference(set1, set2));
    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> remove = new HashSet<>();
        for (Integer i : set1) {
            for (Integer j : set2) {
                if (Objects.equals(i, j)){
                    remove.add(i);
                }
            }
        }
        set3.addAll(set1);
        set3.addAll(set2);
        set3.removeAll(remove);

        return set3;
    }
}