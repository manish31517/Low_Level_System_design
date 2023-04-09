package HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> mp = new MyHashMap<>();
        mp.put(1,"hello");
        mp.put(2,"how are you");
        System.out.println(mp.get(1));
        mp.put(1,"rahul");
        System.out.println(mp.get(1));
    }
}
