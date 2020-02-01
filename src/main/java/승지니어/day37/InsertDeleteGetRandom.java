package 승지니어.day37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {
    //key: element, value: index in the list
    Map<Integer, Integer> map;
    ArrayList<Integer> list;
    //# of valid elements in the list.
    int size;
    Random r = new Random();

    public InsertDeleteGetRandom() {
        map = new HashMap<>();
        list = new ArrayList<>();
        size = 0;
    }

    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        map.put(val, size++);
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int idx = map.get(val);
        map.remove(val);
        if(idx != size-1) {
            int swap = list.get(size-1);
            list.set(idx, swap);
            map.put(swap, idx);
        }
        list.remove(--size);
        return true;
    }

    public int getRandom() {
        int idx = r.nextInt(size);
        return list.get(idx);
    }
}
