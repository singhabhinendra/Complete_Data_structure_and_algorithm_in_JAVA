import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.*;

class MapUsingHash{
    private Entity[] entities;
    public MapUsingHash(){
        entities=new Entity[100];
    }
    public void put(String key,String value){
        int hash=key.hashCode()%entities.length;
        entities[hash]=new Entity(key,value);//overriding

    }
    public String get(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null &&
        entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash=Math.abs(key.hashCode()% entities.length);
        if(entities[hash]!=null&&entities[hash].key.equals(key)){
            entities[hash]=null;
        }
    }
    private class Entity{
        public String key;
        String key1;
        String value;
        public Entity(String key1,String value){
            this.key1=key1;
            this.value=value;
        }

    }
}


public class HashMapImplementation {
    public static void main(String[] args) {
        MapUsingHash map1=new MapUsingHash();
        map1.put("Mango","King of Fruits");
        map1.put("Apple","A Sweet red fruit");
        map1.put("Litchi","A soured red fruit ");
        System.out.println(map1.get("Apple"));


        HashMap<String, Integer> map =new HashMap<>();
        map.put("Kunal",89);
        map.put("Rahul",89);
        map.put("Karan",90);
        map.put("Abhinendra Singh",99);
        System.out.println(map.get("Karan"));
        System.out.println(map.getOrDefault("Karan",99));
        System.out.println(map.containsKey("Karan"));

    HashSet<Integer> set =new HashSet<>();
    set.add(56);
    set.add(45);
    set.add(12);
    set.add(14);
        System.out.println(set);
    }
//    TreeMap<String,Integer> map1 =new TreeMap<>();
//    map1.put("abhinendra",89);
}
