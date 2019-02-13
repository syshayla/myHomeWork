/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_03;

import java.util.LinkedList;
import java.util.Set;

public class MyHashMap<K, V> implements MyMap<K, V> {
  private static int DEFAULT_INITIAL_CAPACITY = 4;
    
     private static int MAXIMUM_CAPACITY = 1<<30;
     
     private int capacity;
     
     private static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;
     
     private float loadFactorThreshold;
     
     private int size = 0;
     
     LinkedList<MyMap.Entry<K, V>>[] table;
     
     public MyHashMap(){
         this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);
     }
     public MyHashMap(int initialCapacity) { 
    this(initialCapacity, DEFAULT_MAX_LOAD_FACTOR);    
  }
     public MyHashMap(int initialCapacity, float loadFactorThreshold) { 
    if (initialCapacity > MAXIMUM_CAPACITY)
      this.capacity = MAXIMUM_CAPACITY;
    else
      this.capacity = trimToPowerOf2(initialCapacity);
    
    this.loadFactorThreshold = loadFactorThreshold;    
    table = new LinkedList[capacity];
  }
  
     
     
    

    @Override
    public void clear() {
        size = 0;
        removeEntries();
       }

    @Override
    public boolean containsKey(K key) {
        if(get(key)!=null)
            return true;
        else
            return false;
        }

    @Override
    public boolean containsValue(V value) {
        for (int i = 0; i < capacity; i++) {
            if(table[i]!=null){
             LinkedList<Entry<K, V>> bucket = table[i]; 
        for (Entry<K, V> entry: bucket)
          if (entry.getValue().equals(value)) 
            return true;
      
            
        }
       }
        return false;
    }
   @Override
  public java.util.Set<MyMap.Entry<K,V>> entrySet() {
    java.util.Set<MyMap.Entry<K, V>> set = 
      new java.util.HashSet<>();
    
    for (int i = 0; i < capacity; i++) {
      if (table[i] != null) {
        LinkedList<Entry<K, V>> bucket = table[i]; 
        for (Entry<K, V> entry: bucket)
          set.add(entry); 
      }
    }
    
    return set;
  }

    @Override
    public V get(K key) {
        int bucketIndex = hash(key.hashCode());
    if (table[bucketIndex] != null) {
      LinkedList<Entry<K, V>> bucket = table[bucketIndex]; 
      for (Entry<K, V> entry: bucket)
        if (entry.getKey().equals(key)) 
          return entry.getValue();
    }
    
    return null;
  }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<K> keySet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public V put(K key, V value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(K key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<V> values() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
  
}
