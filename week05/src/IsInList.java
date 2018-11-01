import java.util.*;

public class IsInList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,4,6,8,10,12,14,16));
        System.out.println(checkNum(list));
    }

    public static boolean checkNum(ArrayList<Integer> list){
        ArrayList<Integer> insideList = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        return list.containsAll(insideList);
    }
}
