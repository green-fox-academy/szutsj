import com.sun.jdi.IntegerValue;

import java.util.*;

public class CandyShop {

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);
        System.out.println(sweets(arrayList));
    }

    public static ArrayList<Object> sweets(ArrayList<Object> arrayList){
        arrayList.remove(Integer.valueOf(2));
        arrayList.remove(false);
        arrayList.add(1, "Croissant");
        arrayList.add("Ice cream");
        return arrayList;
    }
}
