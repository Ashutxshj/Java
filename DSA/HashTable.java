import java.util.HashMap;
import java.util.Hashtable;
public class HashTable{
    public static void main(String[] args){
        HashMap<String,Integer>mp=new HashMap<>();

        mp.put("Apple",10);
        mp.put("Banana",10);
        mp.put("Orange",10);
        mp.put("Grapes",10);

        System.out.println(mp);

        System.out.println(mp.get("Apple"));

        System.out.println(mp.containsKey("Banana"));

        //? Traversing
        for(HashMap.Entry<String,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }

        Hashtable<String,String> tb=new Hashtable<>(10);

        tb.put("100","Spongebob");
        tb.put("123","Patrick");
        tb.put("321","Sandy");
        tb.put("555","Squidward");
        tb.put("777","Gary");

        for(String key:tb.keySet()){
            System.out.println(key.hashCode()%10+"\t"+key+"\t"+tb.get(key));
        }
    }
}