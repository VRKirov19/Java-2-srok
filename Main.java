import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String, Map<String, Integer>> hashMap = new HashMap<>();
        hashMap.put("123", new HashMap<>());
        hashMap.get("123").put("Ivan",20);
        hashMap.put ("456", new HashMap<>());
        hashMap.get("456").put("Gosho", 30);

        for(String key : hashMap.keySet()){
            String mainKey = key;
            Map<String, Integer> innerMap = hashMap.get(key);
            for(String innerKey : innerMap.keySet()){
                String currentInnerKey = innerKey;
                System.out.println(mainKey + " ---- " + innerKey + " ---- " + innerMap.get(innerKey));
            }
        }
    }
}