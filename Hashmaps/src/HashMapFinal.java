import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapFinal<K,V>{
        ArrayList<LinkedList<Entity>> list;
        int size=0;
        float lf=0.5f;
        public HashMapFinal(){
            list=new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(new LinkedList<>());

            }
        }
        public void put(K key,V value){
            int hash=Math.abs(key.hashCode());
            LinkedList<Entity> entities=list.get(hash);
            for(Entity entity:entities){
                if(entity.key.equals(key)){
                    entity.value= (V) value;
                    return;
                }
            }
            if((float)(size)/list.size()>lf){
                reHash();
            }
            entities.add(new Entity((String) key, (String) value));
            size++;
        }
        private void reHash(){
            System.out.println("We are now rehashing.");
            ArrayList<LinkedList<Entity>> old =list;
            list=new ArrayList<>();
            size=0;
            for (int i = 0; i < (old.size()) * 2; i++) {
                list.add(new LinkedList<>());

            }
            for(LinkedList<Entity> entries:old){
                for(Entity entity:entries){
                    put((K) entity.key, (V) entity.value);
                }

            }
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            for(LinkedList<Entity> entries:list){
                for(Entity entity:entries){
                    sb.append(entity.value);
                    sb.append("=");
                    sb.append(entity.value);
                    sb.append( ",");
                }
            }
            sb.append("}");
            return "";
        }
         private class Entity {
            K key;
            V value;

            public Entity( String name, String value) {
                this.value = (V) value;

            }
        }
        public V get(K key){
            int hash=Math.abs(key.hashCode()% list.size());
            LinkedList<Entity> entities=list.get(hash);
            for(Entity entity:entities){
                if(entity.key.equals(key)){
                    return (V) entity.value;
                }
            }
            return null;
        }
        public void remove(K key){
            int hash=Math.abs(key.hashCode() % list.size());
            LinkedList<Entity> entities=list.get(hash);
            Entity target=null;
            for(Entity entity:entities){
                if(entity.key.equals(key)){
                    target=entity;
                    break;
                }
            }
            entities.remove(target);
            size--;
        }
        public boolean containsKey(K key){
            return get(key)!=null;

        }

    public static void main(String[] args) {
        HashMapFinal<String,String> map=new HashMapFinal<>();


    }

}
