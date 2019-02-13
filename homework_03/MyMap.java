/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework_03;

/**
 *
 * @author Sumaiya
 */
public interface MyMap<K, V> {
    public void clear();
    public boolean containsKey(K key);
     public boolean containsValue(V value);
     
     public java.util.Set<Entry<K, V>> entrySet();
     
     public V get (K key);
     
     public boolean isEmpty();
     
     public java.util.Set<K> keySet();
     
     public V put (K key, V value);
     
     public void remove(K key);
     
     public int size();
     
     public java.util.Set<V> values();
     
     public static class Entry<K, V> {
         K key;
         V value;
         
         public Entry(K key, V value){
             this.key = key;
             this.value = value;
         }
         
         public K getKey(){
             return key;
         }
         
           public V getKValue(){
             return value;
         }

        @Override
        public String toString() {
            return "Entry{" + "key=" + key + ", value=" + value + '}';
        }
           
     }
     
    
    
}


