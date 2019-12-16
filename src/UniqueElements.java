import java.util.HashSet;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        int [] arr = {1,4,5,1,1,3};
        Set<Integer> set = new HashSet<>();
        for(int element:arr){
            set.add(element);
        }
        System.out.println("Количесво уникальных элементов в массиве равно "+set.size());
    }
}
