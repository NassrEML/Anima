package model;

import java.util.HashMap;
import java.util.Map;

public class Secundary {
    
    private Map<String,Integer> secundary;

    public Secundary(String name) {
        secundary = FileReadsWrite.readSecundary(name);
    }
    
    public int getValue(String skill){
        for (Map.Entry<String, Integer> entry : secundary.entrySet()) {
            String key = entry.getKey();
            if(key.equals(skill)) return entry.getValue();
        }
        return 0;
    }
    
    public String showSecundarys(){
        String res = "Secundary:\n";
        
        for (Map.Entry<String, Integer> entry : secundary.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            res += key +": " + value + "\n";
        }
        
        return res;
    }

}
