package HashMap;

import java.util.Map;

public class MyHashMap<K,V> {
    private static final int initialSize = 1<<4; //16
    private static final int maxCapacity = 1<<30; // 30 becasue we can implement integer max size in 2 power form

    private   Entry[] hashTable ;
    private class Entry<K,V>{
        K key;
        V value;
        Entry next;

        Entry(K key, V value){
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    public MyHashMap(){
        hashTable = new Entry[initialSize];
    }

    public MyHashMap(int size){
        int capacity = tableSizeFor(size);
        hashTable = new Entry[capacity];
    }

    // following method will return  2 power n format size which is nearest and greater than the given size
    final int tableSizeFor(int size){
        int n = size - 1;
        n |= n>>>1;
        n |= n>>>2;
        n |= n>>>3;
        n |= n>>>8;
        n |= n>>>16;
        return (n<0)?1:(n>=maxCapacity)?maxCapacity:n+1;
    }

    public  void put(K key, V value){
        int hashcode = key.hashCode() & (hashTable.length-1);

        Entry entry = new Entry(key,value);

        if(hashTable[hashcode] == null){
            hashTable[hashcode] = entry;
        }
        else{
            Entry node = hashTable[hashcode];
            Entry previousNode = null;
            while (node!=null){
                if(node.key.equals(key)){
                    node.value=value;
                    return;
                }
                previousNode = node;
                node = node.next;
            }
            previousNode.next = entry;
        }
    }

    public V get(K key){
         int hashcode = key.hashCode() & (hashTable.length-1); // it is equal to %hashtable.length

         if(hashTable[hashcode] == null){
             return null;
         }
         else{
             Entry node = hashTable[hashcode];
             while(node != null) {
                 if(node.key.equals(key)){
                     return (V) node.value;
                 }
             }
         }
         return null;
    }




}
